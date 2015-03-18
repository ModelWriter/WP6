package eu.modelwriter.architecture.textconnectors.docx.parser;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.mylyn.docs.intent.markup.builder.ModelDocumentBuilder;
import org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder;
import org.eclipse.mylyn.wikitext.core.parser.MarkupParser;
import org.eclipse.mylyn.wikitext.markdown.core.MarkdownLanguage;
import org.eclipse.mylyn.wikitext.textile.core.TextileLanguage;

public class Test {

	public static void main(String[] args) throws IOException {

		byte[] encoded = Files.readAllBytes(Paths.get("testdata/my.textile"));
		String markupContent = new String(encoded, Charset.defaultCharset());
		
		ModelDocumentBuilder builder = new ModelDocumentBuilder();

		MarkupParser markupParser = new MarkupParser();
		markupParser.setMarkupLanguage(new TextileLanguage());
		markupParser.setBuilder(builder);
		
		markupParser.parse(markupContent);
		
		Collection<EObject> correspondingModels = builder.getRoots();
		
		// Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();
	    // create a resource
	    Resource resource = resSet.createResource(URI.createURI("testdata/my.xmi"));
	    resource.getContents().addAll(correspondingModels);
	    	    // now save the content.
	    try {
	      resource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
		

	}

}

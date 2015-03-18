package eu.modelwriter.architecture.textconnectors.docx.parser;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.eclipse.mylyn.internal.wikitext.markdown.core.MarkdownDocumentBuilder;
import org.eclipse.mylyn.wikitext.core.parser.DocumentBuilder;
import org.eclipse.mylyn.wikitext.core.parser.Locator;
import org.eclipse.mylyn.wikitext.core.parser.MarkupParser;
import org.eclipse.mylyn.wikitext.core.parser.builder.HtmlDocumentBuilder;
import org.eclipse.mylyn.wikitext.markdown.core.MarkdownLanguage;

public class Test {

	public static void main(String[] args) throws IOException {

		byte[] encoded = Files.readAllBytes(Paths.get("testdata/my.markdown"));
		String markupContent = new String(encoded, Charset.defaultCharset());

		StringWriter writer = new StringWriter();
		
		DocumentBuilder builder = new HtmlDocumentBuilder(writer);

		MarkupParser markupParser = new MarkupParser();
		markupParser.setMarkupLanguage(new MarkdownLanguage());
		
		markupParser.setBuilder(builder);
		
		markupParser.parse(markupContent);
		
		Locator loc = builder.getLocator();
		
		loc.getLineLength();

	}

}

package com.modelwriter.architecture.textconnectors.docx.genparser;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import DocModel.DocModelFactory;
import DocModel.Document;
import DocModel.Paragraph;

public class ModelObserver {

	private Document doc;

	public ModelObserver(){
		
		DocModelFactory factory = DocModelFactory.eINSTANCE;

		doc = factory.createDocument();
		
		Adapter adapter = new AdapterImpl(){
			
			 public void notifyChanged(Notification notification) {
			        System.out
			            .println("Notfication received from the data model. Data model has changed!!!");
			      }
			    };
			    doc.eAdapters().add(adapter);
			    
			 
		}
	
	public void doStuff() {
	    DocModelFactory factory = DocModelFactory.eINSTANCE;
	    Paragraph p = factory.createParagraph();
	    p.setName("deneme");
	    System.out.println("I'm adding a paragraph.");
	    doc.getOwnedParagraph().add(p);
	    System.out.println("I'm changing a entry");
	    doc.getOwnedParagraph().get(0).setName("deneme 2 asd");
	    System.out.println("I'm deleting a entry");
	    doc.getOwnedParagraph().remove(0);
	  }
	
}

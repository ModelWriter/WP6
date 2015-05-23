/*******************************************************************************
 * Copyright (c) 2015 UNIT Information Technologies R&D
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    A. Furkan Tanriverdi (UNIT) - initial API and implementation
 *******************************************************************************/
package com.modelwriter.architecture.textconnectors.docx.genparser;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.ReqIFHeader;
import org.eclipse.rmf.reqif10.ReqIFToolExtension;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension;
import org.eclipse.rmf.reqif10.pror.configuration.impl.ProrSpecViewConfigurationImpl;
import org.eclipse.rmf.reqif10.pror.configuration.impl.ProrToolExtensionImpl;

import DocModel.Document;
import DocModel.Paragraph;

public class DocModel2ReqIFModelConvertor {

	public static ReqIF10Factory factory = ReqIF10Factory.eINSTANCE;
	
	private static Resource resource;

	public static ReqIF convert(Resource r) {
		
		ReqIF reqif = factory.createReqIF();
		ReqIFContent reqifContent = factory.createReqIFContent();
		Specification specification = factory.createSpecification();
		SpecObjectType sot = factory.createSpecObjectType();
		SpecificationType st = factory.createSpecificationType();
		
		ReqIFToolExtension reqifTool = factory.createReqIFToolExtension();
		ProrToolExtension prorExtension = new ProrToolExtensionImpl();
		
		reqif.getToolExtensions().add(reqifTool);
	
		
		ReqIFHeader header = factory.createReqIFHeader();
		header.setComment("Created by: furkan.tanriverdi");
		header.setReqIFVersion("1.0.1");
		header.setReqIFToolId("ProR (http://pror.org)");
		header.setSourceToolId("ProR (http://pror.org)");
		reqif.setTheHeader(header);
		
		// DATA DEFINITION
		DatatypeDefinitionString id = factory.createDatatypeDefinitionString();
		id.setLongName("T_ID");
		
		DatatypeDefinitionString description = factory.createDatatypeDefinitionString();
		description.setLongName("T_Description");
		
		reqifContent.getDatatypes().add(description);
		reqifContent.getDatatypes().add(id);
		
		// ATTRIBUTE DEFINITION
		AttributeDefinitionString ad_desc = factory.createAttributeDefinitionString();
		ad_desc.setLongName("Description");
		ad_desc.setType(description);
		
		AttributeDefinitionString ad_id = factory.createAttributeDefinitionString();
		ad_id.setLongName("ID");
		ad_id.setType(id);

		// SpecObjectType
		sot.setLongName("Requirement Type");
		sot.setIdentifier("id");
	
		sot.getSpecAttributes().add(ad_desc);
		sot.getSpecAttributes().add(ad_id);
		
		// Specification Type
		st.setIdentifier("id");
		st.setLongName("Specification Type");
		
		st.getSpecAttributes().add(ad_desc);
		st.getSpecAttributes().add(ad_id);
		
		reqifContent.getSpecTypes().add(st);
		reqifContent.getSpecTypes().add(sot);
		
		try {

			// Get the resource
			resource = r;
			// try to load the file into resource
			resource.load(null);

			Iterator<EObject> resourceObjects = resource.getAllContents();	

			while (resourceObjects.hasNext()) {
				Object o = resourceObjects.next();
				
				if(o instanceof Document){
					Document d = (Document)o;
									
					specification.setIdentifier("id");
					specification.setLongName("Document");										
					
					specification.setType(st);
										
					reqifContent.getSpecifications().add(specification);
					
				}else if(o instanceof Paragraph){
					Paragraph p = (Paragraph)o;
					
					SpecHierarchy sh = factory.createSpecHierarchy();
					AttributeValueString aValue = factory.createAttributeValueString();
					aValue.setDefinition(ad_desc);
					aValue.setTheValue("aasdasd");
					
					SpecObject so = factory.createSpecObject();
					so.setIdentifier(p.getId());
					so.setLongName(p.getRawText());														
					
					so.getValues().add(aValue);
					
					sh.setEditable(false);
					sh.setObject(so);
					
					specification.getChildren().add(sh);
					reqifContent.getSpecObjects().add(so);
				}
				
			}


		}// end of try
		catch (NullPointerException | IOException e) {
			e.printStackTrace();
		}

		reqif.setCoreContent(reqifContent);
	
		return reqif;
	}

}

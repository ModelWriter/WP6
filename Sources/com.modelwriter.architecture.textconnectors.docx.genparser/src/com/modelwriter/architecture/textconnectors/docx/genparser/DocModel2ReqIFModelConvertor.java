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

import org.eclipse.acceleo.profiler.ProfileResource;
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
import org.eclipse.rmf.reqif10.pror.configuration.Column;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension;
import org.eclipse.rmf.reqif10.pror.configuration.impl.ColumnImpl;
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
		SpecObjectType specObjectType = factory.createSpecObjectType();
		SpecificationType specificationType = factory.createSpecificationType();
		
		// HEADER
		ReqIFHeader header = factory.createReqIFHeader();
		header.setComment("Created by: furkan.tanriverdi");
		header.setReqIFVersion("1.0.1");
		header.setReqIFToolId("ProR (http://pror.org)");
		header.setSourceToolId("ProR (http://pror.org)");
		reqif.setTheHeader(header);
		
		// VIEW
		ReqIFToolExtension reqifTool = factory.createReqIFToolExtension();
		ProrToolExtension prorExtension = new ProrToolExtensionImpl();
		SpecView view = new SpecView();
		com.modelwriter.architecture.textconnectors.docx.genparser.Column columnId = new com.modelwriter.architecture.textconnectors.docx.genparser.Column();
		columnId.setLabel("ID");
		columnId.setWidth(150);
		
		com.modelwriter.architecture.textconnectors.docx.genparser.Column columnDecsription = new com.modelwriter.architecture.textconnectors.docx.genparser.Column();
		columnDecsription.setLabel("Description");
		columnDecsription.setWidth(400);
		
		view.getColumns().add(columnId);
		view.getColumns().add(columnDecsription);
		
		prorExtension.getSpecViewConfigurations().add(view);
		reqifTool.getExtensions().add(prorExtension);
		reqif.getToolExtensions().add(reqifTool);
	
		
		
		// DATA DEFINITION
		DatatypeDefinitionString id = factory.createDatatypeDefinitionString();
		id.setLongName("T_ID");
		
		DatatypeDefinitionString description = factory.createDatatypeDefinitionString();
		description.setLongName("T_Description");
		
		reqifContent.getDatatypes().add(description);
		reqifContent.getDatatypes().add(id);
		
		// ATTRIBUTE DEFINITION
		AttributeDefinitionString attributeDefinitionStringDescription = factory.createAttributeDefinitionString();
		attributeDefinitionStringDescription.setLongName("Description");
		attributeDefinitionStringDescription.setType(description);
		
		AttributeDefinitionString attributeDefinitionStringId = factory.createAttributeDefinitionString();
		attributeDefinitionStringId.setLongName("ID");
		attributeDefinitionStringId.setType(id);

		// specObjectType
		specObjectType.setLongName("Requirement Type");
		specObjectType.setIdentifier("id");
	
		specObjectType.getSpecAttributes().add(attributeDefinitionStringDescription);
		specObjectType.getSpecAttributes().add(attributeDefinitionStringId);
		
		// Specification Type
		specificationType.setIdentifier("id");
		specificationType.setLongName("Specification Type");
		specificationType.setDesc("Document");
	
		
		//specificationType.getSpecAttributes().add(ad_desc);
		//specificationType.getSpecAttributes().add(ad_id);
		
		reqifContent.getSpecTypes().add(specificationType);
		reqifContent.getSpecTypes().add(specObjectType);
		
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
					specification.setDesc("Use Cases");
					specification.setType(specificationType);
					
									
					reqifContent.getSpecifications().add(specification);
					
				}else if(o instanceof Paragraph){
					Paragraph p = (Paragraph)o;
					
					SpecHierarchy sh = factory.createSpecHierarchy();
					AttributeValueString attributeValueDesc = factory.createAttributeValueString();
					attributeValueDesc.setDefinition(attributeDefinitionStringDescription);
					attributeValueDesc.setTheValue(p.getRawText());
					
					AttributeValueString attributeValueId = factory.createAttributeValueString();
					attributeValueId.setDefinition(attributeDefinitionStringId);
					attributeValueId.setTheValue(p.getId());
					
					SpecObject so = factory.createSpecObject();
					//so.setIdentifier(p.getId());
					//so.setLongName(p.getRawText());
					//so.setDesc(p.getRawText());
					
					so.getValues().add(attributeValueId);
					so.getValues().add(attributeValueDesc);
					so.setType(specObjectType);
					
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
		
		view.setSpecification(specification);	
		reqif.setCoreContent(reqifContent);
	
		return reqif;
	}

}

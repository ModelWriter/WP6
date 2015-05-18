package com.modelwriter.architecture.textconnectors.docx.genparser;

import java.io.IOException;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.Specification;

public class DocModel2ReqIFModelConvertor {

	public static ReqIF10Factory factory = ReqIF10Factory.eINSTANCE;
	
	private static Resource resource;

	public static Specification convert(Resource r) {
		
		

		try {

			// Get the resource
			resource = r;
			// try to load the file into resource
			resource.load(null);

			// Write content of resource file
			//resource.save(System.out, Collections.EMPTY_MAP);

			Iterator<EObject> resourceObjects = resource.getAllContents();	

			while (resourceObjects.hasNext()) {
				Object o = resourceObjects.next();

				
				// Traversing Product's children
				/*
				 * if(o instanceof Product){

					for(Definition requirementLevelHeading1 : ((Product)o).getOwnedDefinition()){

						preOrder((RequirementLevel)requirementLevelHeading1,1);
					}

					break;
				}

				 */
			}


		}// end of try
		catch (NullPointerException | IOException e) {
			e.printStackTrace();
		}

		//document.write(out);
		//out.close();

		/*
		 * final JFrame frame = new JFrame();
		JOptionPane.showMessageDialog(frame,
			    "File written successfully!");

		 * 
		 */

	
		return null;
	}

}

/**
 * 
 */
package eu.cophi.action.docbuilder;

import java.io.File;
import java.io.Reader;

import eu.cophi.action.docbuilder.RAWbuilder.BuilderRaw;
import eu.cophi.action.docbuilder.XMLdoc.BuilderXML;
import eu.cophi.model.text.Document;

/**
 * @author Angelo Del Grosso
 *
 */
public class AbstractBuilderFactory {

	/**
	 * 
	 */
	private AbstractBuilderFactory() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	
	public static DocBuilder createImport(StructureType type , Features features){
		DocBuilder importer = null;
		
		return importer;
	}
	
	public static Document buildDocument(StructureType type, Features features, Reader reader){
		Document document = null;
			switch (type) {
			case XML:
				 document = new BuilderXML(features).build(reader); 
				break;

			case TEXT:
				document = new BuilderRaw(features).build(reader);
			default:
				break;
			}
		return document;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

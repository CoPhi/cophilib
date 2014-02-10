/**
 * 
 */
package eu.cophi.action.docbuilder.XMLdoc.strategy;

import java.io.Reader;

import eu.cophi.model.text.Document;

/**
 * @author Angelo Del Grosso
 *
 */
public class XMLcontextContent {

	private XMLcontentBehavior behavior;
	
	/**
	 * 
	 */
	public XMLcontextContent(XMLcontentBehavior behavior) {
		// TODO Auto-generated constructor stub
		this.behavior = behavior;
	}
	
	public Document build(Reader reader){
		return behavior.buildDocument(reader);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

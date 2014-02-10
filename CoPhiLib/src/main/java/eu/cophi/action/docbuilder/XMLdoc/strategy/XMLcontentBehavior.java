/**
 * 
 */
package eu.cophi.action.docbuilder.XMLdoc.strategy;

import java.io.Reader;

import eu.cophi.model.text.xml.XMLdocument;


/**
 * @author Angelo Del Grosso
 *
 */
public interface XMLcontentBehavior {

	public XMLdocument buildDocument(Reader reader);
		
}

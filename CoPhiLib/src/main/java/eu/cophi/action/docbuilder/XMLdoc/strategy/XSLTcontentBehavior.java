/**
 * 
 */
package eu.cophi.action.docbuilder.XMLdoc.strategy;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

import eu.cophi.model.text.xml.XMLdocument;

/**
 * @author Angelo Del Grosso
 *
 */
public class XSLTcontentBehavior implements XMLcontentBehavior {

	/**
	 * 
	 */
	public XSLTcontentBehavior() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see eu.cophi.action.docbuilder.XMLdoc.strategy.XMLcontentBehavior#buildDocument(java.io.Reader)
	 */
	public XMLdocument buildDocument(Reader reader) {
		XMLdocument document;
		CharBuffer target = CharBuffer.allocate(1024);
		try {
			reader.read(target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new XMLdocument("<XSLT_elements>"+ target.flip().toString() +"</XSLT_elements>");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

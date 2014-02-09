/**
 * 
 */
package eu.cophi.action.docbuilder.XMLdoc;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

import eu.cophi.action.docbuilder.DocBuilder;
import eu.cophi.action.docbuilder.Features;
import eu.cophi.model.text.Document;
import eu.cophi.model.text.xml.XMLdocument;

/**
 * @author Angelo Del Grosso
 *
 */
public class BuilderXML extends DocBuilder {
	
	/**
	 * 
	 */
	public BuilderXML(Features features) {
		// TODO Auto-generated constructor stub
		super(features);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	 public Document build(Reader reader) {
		// TODO Auto-generated method stub
		CharBuffer target = CharBuffer.allocate(1024);
		try {
			reader.read(target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new XMLdocument("<body>" + target.flip().toString() + " -- " + "<features>"+this.getType()+"</features>" + "</body>");
	}

}

/**
 * 
 */
package eu.cophi.action.docbuilder.RAWbuilder;

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
public class BuilderRaw extends DocBuilder {

	/**
	 * @param features
	 */
	public BuilderRaw(Features features) {
		super(features);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see eu.cophi.action.docbuilder.DocBuilder#build(java.io.Reader)
	 */
	@Override
	public Document build(Reader reader) {	// TODO Auto-generated method stub
		CharBuffer target = CharBuffer.allocate(1024);
		try {
			reader.read(target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new XMLdocument("RAW RAW RAW  ---> " + target.flip().toString() + " -- " + " CON FEATURES: "+this.getType() + " FINE FILE");
	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

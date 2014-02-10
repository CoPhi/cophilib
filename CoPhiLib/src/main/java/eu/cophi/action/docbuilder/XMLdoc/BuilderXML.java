/**
 * 
 */
package eu.cophi.action.docbuilder.XMLdoc;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

import eu.cophi.action.docbuilder.DocBuilder;
import eu.cophi.action.docbuilder.Features;
import eu.cophi.action.docbuilder.XMLdoc.strategy.DefaultXMLcontentBehavior;
import eu.cophi.action.docbuilder.XMLdoc.strategy.XMLcontentBehavior;
import eu.cophi.action.docbuilder.XMLdoc.strategy.XMLcontextContent;
import eu.cophi.action.docbuilder.XMLdoc.strategy.XSLTcontentBehavior;
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
		XMLcontentBehavior behavior;
		if(getType().equals("XSLT")){
			behavior = new XSLTcontentBehavior();
		}
		else{
		 behavior = new DefaultXMLcontentBehavior();
		 }
		
		XMLcontextContent context = new XMLcontextContent(behavior);
		return  context.build(reader);
	}

}

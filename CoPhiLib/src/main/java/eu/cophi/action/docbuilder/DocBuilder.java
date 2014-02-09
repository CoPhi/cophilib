/**
 * 
 */
package eu.cophi.action.docbuilder;

import java.io.Reader;

import eu.cophi.model.text.Document;

/**
 * @author Angelo Del Grosso
 *
 */
public abstract class DocBuilder {

	String type = "";
	
	public DocBuilder(Features features) {
		// TODO Auto-generated constructor stub
		if(features.name() == "OCR")
			type = "OCR";
		else if(features.name() == "BOOK")
			type = "BOOK";
		else if(features.name() == "WEB")
			type = "WEB";
		else if(features.name() == "XSLT")
			type = "XSLT";
			
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 
	 */
	
	
	 abstract public Document build(Reader reader);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

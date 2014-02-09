/**
 * 
 */
package eu.cophi.model.text;

import java.io.ObjectInputStream.GetField;

/**
 * @author Angelo Del Grosso
 *
 */
abstract public class Document {
	String content;

	/**
	 * 
	 */
	public Document(String content) {
		// TODO Auto-generated constructor stub
		this.content = content;
	}

	/**
	 * @param args
	 */
	
	public String getContent(){
		return content;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

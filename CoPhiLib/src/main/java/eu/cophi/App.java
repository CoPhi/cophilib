package eu.cophi;

import eu.cophi.action.docimport.DocImporter;
import eu.cophi.action.docimport.XMLdoc.ImporterXML;
import eu.cophi.model.text.Document;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Document junkDucument;
        String features = "ocr";
        DocImporter importer = new ImporterXML(features);
        junkDucument = 
    }
}

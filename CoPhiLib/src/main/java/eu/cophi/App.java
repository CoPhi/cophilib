package eu.cophi;

import java.io.StringReader;

import eu.cophi.action.docbuilder.AbstractBuilderFactory;
import eu.cophi.action.docbuilder.DocBuilder;
import eu.cophi.action.docbuilder.Features;
import eu.cophi.action.docbuilder.StructureType;
import eu.cophi.action.docbuilder.XMLdoc.BuilderXML;
import eu.cophi.model.text.Document;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        //Document junkDocument = AbstractBuilderFactory.buildDocument(StructureType.XML, Features.WEB, new StringReader("file xml"));
        Document junkDocument = AbstractBuilderFactory.buildDocument(StructureType.XML, Features.XSLT, new StringReader("file di testo.."));
        System.out.println(junkDocument.getContent());
        
    }
}

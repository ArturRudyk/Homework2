package homework2figures;

import java.io.*;

public class GenerateXML {
	 FileWriter genXML;
	
	
	
	public void writeXMLFile(SerializeToXML figure){
		
		try{
			 genXML = new FileWriter("src/homework2figures/figures.xml");
			 genXML.write(figure.addXML());
			 genXML.close();
		} catch(IOException a){
			System.out.println();
		}
		
	}
	
	public static void main(String args[]){
		
		Circle circle = new Circle(3);
		Square square = new Square(2);
		Triangle triangle = new Triangle(4,3,2);
		Group group = new Group();
		
		group.addElement(circle);
		group.addElement(square);
		group.addElement(triangle);
		
		GenerateXML gXML = new GenerateXML(); 
		gXML.writeXMLFile(group);
		

		
	}

}

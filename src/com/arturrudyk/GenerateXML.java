package homework2figures.Homework2.src.com.arturrudyk;

import java.io.*;

public class GenerateXML {
	private FileWriter fileWriter;
	private String way = "src/homework2figures/figures.xml";
	public void writeXMLFile(SerializeToXML figure){
		try {
			 fileWriter = new FileWriter(way);
			 fileWriter.write(figure.addXML());
			 fileWriter.close();
		} catch(IOException a) {
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Circle circle = new Circle(3);
		Square square = new Square(2);
		Triangle triangle = new Triangle(4, 3, 2);
		Group group = new Group();
		
		group.addElement(circle);
		group.addElement(square);
		group.addElement(triangle);
		
		GenerateXML generateXML = new GenerateXML(); 
		generateXML.writeXMLFile(group);
	}
}

package homework2figures;

public class Circle implements SerializeToXML {

private double radius;
	
	Circle (double radius){
		this.radius=radius;
	}

	double findArea(){
		return radius*radius*Math.PI;
	}
	
	double findLength(){
		return 2*Math.PI*radius;
	}
	
	
	public String addXML() {
        return "<Circle>\r\n<radius>\n\t" + radius + "\n\t</radius>"
        		+"\r\n<Area>\n\t" + this.findArea() + "\n\t</Area>"
        		+"\r\n<Length>\n\t" + this.findLength() + "\n\t</Length>"
                +"\r\n</Circle>\r\n"
        		+"\r\n";
    }
	
}

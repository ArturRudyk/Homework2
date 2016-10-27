package homework2figures;

public class Square implements SerializeToXML {
	
	private double side;
	
	Square(double side){
		this.side=side;
	}

	double findArea(){
		return side*side;
	}
	
	public String addXML() {
        return "<Square>\r\n<side>\n\t" + side + "\n\t</side>"
        		+"\r\n<Area>\n\t" + this.findArea() + "\n\t</Area>"
        		+"\r\n</Square>\r\n"
        		+"\r\n";
    }
	
	
}

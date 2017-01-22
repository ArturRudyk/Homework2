package homework2figures.Homework2.src.com.arturrudyk;

public class Square implements SerializeToXML {
	private double side;
	
	Square(double side) { 
		this.side = side;
	}

	double findArea() {
		return Math.pow(side, 2);
	}
	
	public String addXML() {
        return "<Square>\r\n<side>\n\t" + side + "\n\t</side>"
        		+ "\r\n<Area>\n\t" + this.findArea() + "\n\t</Area>"
        		+ "\r\n</Square>\r\n"
        		+ "\r\n";
    }
}

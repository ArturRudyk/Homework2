package homework2figures;

public class Triangle implements SerializeToXML {

private double firstSide;
private double secondSide;
private double thirdSide;
private double angle;


	
	Triangle (double firstSide, double secondSide, double angle){
		this.firstSide=firstSide;
		this.secondSide=secondSide;
		this.angle=angle;
		thirdSide=Math.sqrt((firstSide*firstSide)+(secondSide*secondSide)-(2*firstSide*secondSide*Math.cos(angle)));


	}

	double findArea(){
		double p=(firstSide+secondSide+thirdSide)/2;		
		return Math.sqrt(p*(p-firstSide)*(p-secondSide)*(p-thirdSide));
	}

	
	public String addXML() {
        return "<Triangle>\r\n<firstSide>\n\t" + firstSide + "\n\t</firstSide>"
        		       + "\r\n<secondSide>\n\t" + secondSide + "\n\t</secondSide>"
        			   + "\r\n<thirdSide>\n\t" + thirdSide + "\n\t</thirdSide>"
        			   + "\r\n<Area>\n\t" + this.findArea() + "\n\t</Area>"
        			   +"\r\n</Triangle>\r\n"
        			   +"\r\n";
    }
	
}

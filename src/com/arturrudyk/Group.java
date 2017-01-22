package homework2figures.Homework2.src.com.arturrudyk;
import java.util.*;

public class Group implements SerializeToXML {
	public List<SerializeToXML> figures = new ArrayList();

	public void addElement(SerializeToXML figure) {
        figures.add(figure);
    }
		
	public String addXML() {
	    String listOfFigures = "<Group>\r\n"+"\r\n";
	    for(SerializeToXML figure : figures){
		  listOfFigures += figure.addXML(); 
	    }
	    listOfFigures += "</Group>\r\n";
	    return listOfFigures;	
	}
}

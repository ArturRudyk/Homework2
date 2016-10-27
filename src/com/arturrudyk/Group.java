package homework2figures;
import java.util.*;

public class Group implements SerializeToXML {
	
	public ArrayList<SerializeToXML> figures = new ArrayList();
	
	public void addElement (SerializeToXML figure) {
        figures.add(figure);
    }
		
   public String addXML() {
	   String a = "<Group>\r\n"+"\r\n";
	   for(SerializeToXML figures : figures){
		 a+= figures.addXML(); 
	   }
	   a += "</Group>\r\n";
	   return a;	
   }
   
}

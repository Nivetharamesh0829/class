package map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class list {
	public static void main(String[]args) {
		Map<String,Integer>m=new LinkedHashMap<String,Integer>();
		m.put("Aadhi1", 2999);
		m.put("Aadhi2", 1912);
		m.put("Aadhi3",2501);
	//	System.out.println(m);
		
	
	List x=new ArrayList();
     x.add(m);
     System.out.println(x);
	
	
	}
}

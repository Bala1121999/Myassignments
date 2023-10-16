package practise;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.deser.std.MapEntryDeserializer;

public class Task7 {

	public static void main(String[] args) {
		String s = "gogle";
		
		  Map<String,String> e = new HashMap< >();
		  e.put("o", "*");
		  e.put("e", "**");
		  for(Map.Entry<String, String> f :e.entrySet()) { 
			  s=s.replace(f.getKey(),f.getValue()); 
			  } 
		  System.out.println(s);
		 
		  
	}

	}



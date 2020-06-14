package mamap;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Mamap {
	
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String args[]) throws Exception {
		
		
		
		
        BufferedReader br = new BufferedReader(new FileReader("symptoms.txt"));
        ArrayList<String> lines = new ArrayList<String>();
        String line = br.readLine();
        while(line != null) {
            lines.add(line);
            line = br.readLine();
        }
      
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        
        
       
 
        
        for(int i = 0 ; i < lines.size() ; i++){
			
			 if(map.containsKey(lines.get(i))){  
				 
				 map.replace(lines.get(i),map.get(lines.get(i))+1);
			 
			 }
		
			 else{ map.put(lines.get(i),1);
			 }
			}
		
        
//        for (Map.Entry mapentry : map.entrySet()) {
//	           System.out.print  ("clé: "+mapentry.getKey()+ " | " ); 
//	           System.out.println("valeur: " + mapentry.getValue());
//	           System.out.println("-----------------------------------");
//	        }
        
        Map sortedMap = new TreeMap(map);
        Set set2 = sortedMap.entrySet();
        Iterator iterator2 = set2.iterator();
        
        System.out.println("Après le tri: ");
        
        while(iterator2.hasNext()) {
           Map.Entry me2 = (Map.Entry)iterator2.next();
           
           System.out.print(me2.getKey() + ": ");
           System.out.println(me2.getValue());
	   }
         
    }
}



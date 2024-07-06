import java.util.HashMap;
import java.util.Map;

public class D1 {

    public static void main(String[] args) {

        String name = "abbaaabc";

        // Using a Map to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();
       
        for(int i=0;i<name.length();i++) {
       char current=name.charAt(i);  
       
       if(charCountMap.containsKey(current)) {
    	   charCountMap.put(current, charCountMap.get(current)+1);
       }
       else {
    	   charCountMap.put(current, 1);
       }
    }
        
    for(Map.Entry<Character, Integer> entry: charCountMap.entrySet() ) {
    	
    	System.out.print(entry.getKey()+"" +entry.getValue());
    	
    }
    }
}

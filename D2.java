import java.util.HashMap;
import java.util.Map;

public class D2 {

    public static void main(String[] args) {

        String name = "character";

        Map<Character, Integer> charCountMap = new HashMap<>();

        for(int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if(charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();
            if(count ==1) {
            
                System.out.println("Non-duplicate character: " + character);
           
            }}
    }
}

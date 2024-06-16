import java.util.HashMap;
import java.util.Map;

public class WordCounts {
    public static void main(String[] args) {
        String word = "aaxaxxxx";
    countWords(word);
    }

    private static void countWords(String words){
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = words.toCharArray();
        for(char c : ch){
            if(!map.containsKey(c)){
                map.put(c,1);
            } else{
                int i = map.get(c);
                map.put(c,i+1);
            }
        }
       map.forEach((key, value) -> System.out.println(key + " " + value));
    }
}

import java.util.HashMap;

public class stringsearch {
    public static void main(String[] args) {
        
        char result = firstNonRepeatedCharacter("abcdefghija");
        System.out.println("result " + result);
        
    }

    public static char firstNonRepeatedCharacter(String word) {
        HashMap<Character, Integer> hashmap = new HashMap<>();

        // run string and save values of string in hashmap
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (hashmap.containsKey(c)) {
                hashmap.put(c, hashmap.get(c) + 1);
            } else {
                hashmap.put(c, 1);
            }
        }

        // check the result - hashmap
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if(hashmap.get(c) != 1 ){
                return c;
            }
        }
        throw new RuntimeException("Undefined behaviour");
    }
}
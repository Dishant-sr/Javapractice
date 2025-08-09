import java.util.HashMap;
public class Hashmaps {
    public static void main(String[] args){
        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.25);
        map.put("orange", 0.85);        
        map.put("bananas", 0.55);

       // map.remove("apple");
        System.out.println(map.containsKey("orange"));

        

    }

}
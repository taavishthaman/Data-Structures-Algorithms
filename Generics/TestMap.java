import java.util.*;

class TestMap{
    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap();
        map.put("India", 300);
        map.put("USA", 250);
        map.put("Sweden", 300);
        map.put("UK", 300);
        map.put("China", 450);

        System.out.println(map);

        System.out.println(map.get("UK"));

        Set<String> countries = map.keySet();
        System.out.println(countries);

        //A collection is used because set has unique values
        Collection<Integer> pop = map.values();
        System.out.println(pop);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        
        for(Map.Entry<String, Integer> entry: entries){
            System.out.println(entry);
        }
    }
}
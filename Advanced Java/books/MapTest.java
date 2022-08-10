import java.util.*;
public class MapTest{
    public static void main(String[] args) {
        
    
    Map<String, Integer> map = new HashMap<>();

    map.put("San", 3);
    map.put("Ni", 2);
    map.put("Roku", 6);
    map.put("Q", 9);

    Set<String> keySet = map.keySet();

    ArrayList<String> listOfKeys = new ArrayList<String>(keySet);

    Collection<Integer> values = map.values();

    ArrayList<Integer> listOfValues = new ArrayList<>(values);
    System.out.println("The map keys are: ");
    for(String str : listOfKeys) 
    {
        System.out.println(str +" ");

    }
    System.out.println("The map values are: ");
    for(Integer x : listOfValues) 
    {
        System.out.println(x +" ");

    }
}
}
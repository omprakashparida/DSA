import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<String> city = new HashSet<>();
        city.add("Delhi");
        city.add("Mumbai");
        city.add("Chennai");
        city.add("Bangalore");
        city.add("Hyderabad");
        city.add("Ahmedabad");
        for (String cityName : city) {
            System.out.println(cityName);
        }
    }
}

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {

        // Create a Map that associates a person's name (String)
        // with their favorite color (Color)
        Map<String, Color> favoriteColors = new HashMap<>();

        // Add key-value pairs to the map
        favoriteColors.put("Juliet", Color.BLUE);
        favoriteColors.put("Romeo", Color.GREEN);
        favoriteColors.put("Adam", Color.RED);
        favoriteColors.put("Eve", Color.BLUE);

        // Get the set of all keys (names) in the map
        Set<String> keySet = favoriteColors.keySet();

        // Iterate over each key in the set
        for (String key : keySet) {

            // Retrieve the value (color) associated with the current key
            Color value = favoriteColors.get(key);

            // Print the name and the corresponding favorite color
            System.out.println(key + ": " + value);
        }
    }
}

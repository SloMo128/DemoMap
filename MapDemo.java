import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        // Create a Map that associates a person's name
        // with their favorite color
        Map<String, Color> favoriteColors = new HashMap<>();

        // Add key-value pairs to the map
        favoriteColors.put("Juliet", Color.BLUE);
        favoriteColors.put("Romeo", Color.GREEN);
        favoriteColors.put("Adam", Color.RED);
        favoriteColors.put("Eve", Color.BLUE);

        // Iterate over the map using entrySet()
        for (Map.Entry<String, Color> entry : favoriteColors.entrySet()) {

            String name = entry.getKey();
            Color color = entry.getValue();

            // Print the name and the favorite color
            System.out.println(name + "'s favorite color is " + colorToString(color));
        }
    }

    /**
     * Converts a Color object to a readable color name.
     *
     * @param color the Color to convert
     * @return a String representing the color name
     */
    private static String colorToString(Color color) {
        if (color.equals(Color.BLUE)) return "Blue";
        if (color.equals(Color.RED)) return "Red";
        if (color.equals(Color.GREEN)) return "Green";
        return "Unknown Color";
    }
}

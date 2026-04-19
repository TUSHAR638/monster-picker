package NorthStarProductions.PickYourMonster.Service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class MService {
    private final List<String> monsterFlavors = Arrays.asList(   // Original / Core
            "Original",
            "Lo-Carb",
            "Assault",
            "M3",

            // Ultra Series (Zero Sugar)
            "Ultra White",
            "Ultra Black",
            "Ultra Blue",
            "Ultra Red",
            "Ultra Sunrise",
            "Ultra Violet",
            "Ultra Paradise",
            "Ultra Watermelon",
            "Ultra Gold",
            "Ultra Peachy Keen",
            "Ultra Rosa",
            "Ultra Fiesta Mango",
            "Ultra Strawberry Dreams",

            // Juice Series
            "Mango Loco",
            "Pipeline Punch",
            "Pacific Punch",
            "Khaotic",
            "Ripper",

            // Rehab Series
            "Rehab Tea + Lemonade",
            "Rehab Peach Tea",
            "Rehab Green Tea",
            "Rehab Wild Berry Tea",

            // Punch Series
            "MIXXD Punch",
            "Ballers Blend",
            "Dub Edition",

            // Coffee / Java Monster
            "Mean Bean",
            "Loka Moka",
            "Salted Caramel",
            "French Vanilla",
            "Swiss Chocolate",

            // Dragon Tea
            "Dragon Green Tea",
            "Dragon White Tea",
            "Dragon Yerba Mate"
    );
    public String getRandomFlavor() {
        Random random = new Random();
        int index = random.nextInt(monsterFlavors.size());
        return monsterFlavors.get(index);
    }
    public List<String> getAllFlavours() {
        return monsterFlavors;
    }
}

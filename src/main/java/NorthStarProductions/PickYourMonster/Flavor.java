package NorthStarProductions.PickYourMonster;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Flavor {
    private String name;
    private String color; // 👈 this!
}
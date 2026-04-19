package NorthStarProductions.PickYourMonster.Controller;

import NorthStarProductions.PickYourMonster.Flavor;
import NorthStarProductions.PickYourMonster.Service.MService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MController {

    private final MService mService;

    @GetMapping("/api/random")
    public String getRandomFlavor() {
        return mService.getRandomFlavor();
    }
    @GetMapping("/api/flavors")
  public List<String> getAllFlavours() {
        return mService.getAllFlavours();
  }
}

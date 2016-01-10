/**
 * Created by ipruu_000 on 10.01.2016.
 */
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by ipruu_000 on 10.01.2016.
 */
public class Hippo {
    private GridPane hippoLayout;
    private Scene hippoScene;

    public GridPane getHippoLayout() {
        return hippoLayout;
    }

    public Scene getHippoScene() {
        return hippoScene;
    }

    public Hippo invoke() {
        hippoLayout = new GridPane();
//       s1.setLayoutX(ti);
//        s1.setMinHeight(600);
        hippoScene = new Scene(hippoLayout);
        Hyperlink hippoLink = new Hyperlink("https://en.wikipedia.org/wiki/Hippo");

        Label hippoInfo = new Label("The common hippopotamus (Hippopotamus amphibius), or hippo, is a large, mostly herbivorous mammal in sub-Saharan Africa," +
                "\n" +
                "and one of only two extant species in the family Hippopotamidae, the other being the pygmy hippopotamus (Choeropsis liberiensis or Hexaprotodon" +
                "\n" +
                " liberiensis). The name comes from the ancient Greek for river horse. After the elephant and rhinoceros, the common hippopotamus" +
                "\n" +
                " is the third-largest type of land mammal and the heaviest extant artiodactyl. Despite their physical resemblance to pigs and other terrestrial" +
                "\n" +
                " even-toed ungulates, the closest living relatives of the Hippopotamidae are cetaceans (whales, porpoises, etc.) from which they diverged about " +
                "\n" +
                "55 million years ago. The common ancestor of whales and hippos split from other even-toed ungulates around 60 million years ago. The earliest " +
                "\n" +
                "known hippopotamus fossils, belonging to the genus Kenyapotamus in Africa, date to around 16 million years ago. \n" +
                "\n" +
                "Common hippos are recognisable by their barrel-shaped torsos, wide-opening mouths revealing large canine tusks, nearly hairless bodies," +
                "\n" +
                " columnar-like legs and large size; adults average 1,500 kg (3,300 lb) and 1,300 kg (2,900 lb) for males and females respectively, " +
                "\n" +
                "making them the largest species of land mammal after the three species of elephants and the white and Indian rhinoceros. " +
                "\n" +
                "Despite its stocky shape and short legs, it is capable of running 30 km/h (19 mph) over short distances. The hippopotamus " +
                "\n" +
                "is a highly aggressive and unpredictable animal and is ranked among the most dangerous animals in Africa.[3] Nevertheless, " +
                "\n" +
                "they are still threatened by habitat loss and poaching for their meat and ivory canine teeth\n. " +
                "\n" +
                "The common hippopotamus is semiaquatic, inhabiting rivers, lakes and mangrove swamps, " +
                "\n" +
                "where territorial bulls preside over a stretch of river and groups of five to thirty females and young. D" +
                "\n" +
                "uring the day, they remain cool by staying in the water or mud; reproduction and childbirth both occur in " +
                "\n" +
                "water. They emerge at dusk to graze on grasses. While hippopotamuses rest near each other in the water, grazing " +
                "\n" +
                "is a solitary activity and hippos are not territorial on land.");



//
        Image hippoImage = new Image(getClass().getResourceAsStream("1024px-Hippopotamus_-_04.jpg"));

        ImageView hippo = new ImageView();
        hippo.setImage(hippoImage);
        hippo.setFitWidth(800);
        hippo.setFitHeight(600);
        hippo.setPreserveRatio(true);
        hippoLayout.setPadding(new Insets(0, 20, 20, 20));

        hippoLink.setOnAction(event2 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://en.wikipedia.org/wiki/Hippo"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        });

        hippoLayout.add(hippoLink, 2, 0);
        hippoLayout.add(hippoInfo, 2, 1);
        hippoLayout.add(hippo, 2, 2);
        return this;
    }
}
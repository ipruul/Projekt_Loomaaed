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
public class Tiger {
    private GridPane tigerLayout;
    private Scene tigerScene;

    public GridPane getTigerLayout() {
        return tigerLayout;
    }

    public Scene getTigerScene() {
        return tigerScene;
    }

    public Tiger invoke() {
        tigerLayout = new GridPane();
//       s1.setLayoutX(ti);
//        s1.setMinHeight(600);
        tigerScene = new Scene(tigerLayout);
        Hyperlink tigerLink = new Hyperlink("https://en.wikipedia.org/wiki/Tiger");

        Label tigerInfo = new Label("The tiger (Panthera tigris) is the " +

                "largest cat species, reaching a total body length of up to " +
                "\n" +
                "3.38 m (11.1 ft) over curves and exceptionally weighing up to 388.7 kg (857 lb) in the wild. " +
                " Its most recognisable feature is a pattern of dark vertical stripes on reddish-orange fur with" +
                "\n" +
                " a lighter underside. The species is classified in the genus Panthera with the lion, leopard, " +
                "jaguar and snow leopard. Tigers are apex predators, primarily preying on ungulates such as deer " +
                "\n" +
                "and bovids. They are territorial and generally solitary but social animals, often requiring large" +
                " contiguous areas of habitat that support their prey requirements. This, coupled with the fact that " +
                "\n" +
                "they are indigenous to some of the more densely populated places on Earth, has caused significant conflicts with humans.\n" +
                "\n" +
                "Tigers once ranged widely across Asia, from Turkey in the west to the eastern coast of Russia. Over the past 100 years, " +
                "they have lost 93% of their historic range, and have been extirpated from southwest and central Asia, from the islands of " +
                "\n" +
                "Java and Bali, and from large areas of Southeast and Eastern Asia. Today, they range from the Siberian" +
                " taiga to open grasslands and tropical mangrove swamps. The remaining six tiger subspecies have been " +
                "\n" +
                "classified as endangered by IUCN. The global population in the wild is estimated to number between 3,062 " +
                "and 3,948 individuals, down from around 100,000 at the start of the 20th century, with most remaining populations" +
                "\n" +
                " occurring in small pockets isolated from each other, of which about 2,000 exist on the Indian subcontinent.[4]" +
                " Major reasons for population decline include habitat destruction, habitat fragmentation and poaching. The extent" +
                "\n" +
                " of area occupied by tigers is estimated at less than 1,184,911 km2 (457,497 sq mi), a 41% decline from the area estimated in the mid-1990s.\n" +
                "\n" +
                "Tigers are among the most recognisable and popular of the world's charismatic megafauna. They have featured prominently in ancient mythology " +
                "\n" +
                "and folklore, and continue to be depicted in modern films and literature. They appear on many flags, coats of arms, and as mascots for sporting " +
                "\n" +
                "teams. The tiger is the national animal of Bangladesh, India, Vietnam, Malaysia and South Korea.");


//        Image tigerImage = new Image("Oracle/Tigress_at_Jim_Corbett_National_Park.jpg");
        Image tigerImage = new Image(getClass().getResourceAsStream("Tigress_at_Jim_Corbett_National_Park.jpg"));

        ImageView tiger = new ImageView();
        tiger.setImage(tigerImage);
        tiger.setFitWidth(800);
        tiger.setFitHeight(600);
        tiger.setPreserveRatio(true);
        tigerLayout.setPadding(new Insets(0, 20, 20, 20));

        tigerLink.setOnAction(event2 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://en.wikipedia.org/wiki/Tiger"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        });

        tigerLayout.add(tigerLink, 2, 0);
        tigerLayout.add(tigerInfo, 2, 1);
        tigerLayout.add(tiger, 2, 2);
        return this;
    }
}
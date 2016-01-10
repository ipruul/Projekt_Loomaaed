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

public class Lion {
    private GridPane lionLayout;
    private Scene lionScene;

    public GridPane getLionLayout() {
        return lionLayout;
    }

    public Scene getLionScene() {
        return lionScene;
    }

    public Lion invoke() {
        //        https://en.wikipedia.org/wiki/Lion
//        https://en.wikipedia.org/wiki/Lion#/media/File:Lion_waiting_in_Namibia.jpg

        lionLayout = new GridPane();
        lionScene = new Scene(lionLayout);
        Hyperlink lionLink = new Hyperlink("https://en.wikipedia.org/wiki/Lion");
//        lionLink.setOnAction();
        Label lionInfo = new Label("The lion (Panthera leo) is one of the five big cats in the genus Panthera and a member of the family Felidae. " +
                "\n" +
                "The commonly used term African lion collectively denotes the several subspecies found in Africa. With some males exceeding 250 kg (550 lb) " +
                "\n" +
                "in weight,[4] it is the second-largest living cat after the tiger. Wild lions currently exist in sub-Saharan Africa and in Asia (where an endangered " +
                "\n" +
                "remnant population resides in Gir Forest National Park in India) while other types of lions have disappeared from North Africa and Southwest Asia in " +
                "\n" +
                "historic times. \n  Until the late Pleistocene, about 10,000 years ago, the lion was the most widespread large land mammal after humans. They were found " +
                "\n" +
                "in most of Africa, across Eurasia from western Europe to India, and in the Americas from the Yukon to Peru.[5] The lion is a vulnerable species, having" +
                "\n" +
                " seen a major population decline in its African range of 30-50% per two decades during the second half of the twentieth century.[2] Lion populations are " +
                "\n" +
                "untenable outside designated reserves and national parks. Although the cause of the decline is not fully understood, habitat loss and conflicts with humans" +
                "\n" +
                " are currently the greatest causes of concern. Within Africa, the West African lion population is particularly endangered. \n" +
                "\n" +
                "In the wild, males seldom live longer than 10 to 14 years, as injuries sustained from continual fighting with rival males greatly " +
                "\n" +
                "reduce their longevity.[6] In captivity they can live more than 20 years. They typically inhabit savanna and grassland, although they" +
                "\n" +
                " may take to bush and forest. Lions are unusually social compared to other cats. A pride of lions consists of related females and offspring " +
                "\n" +
                "and a small number of adult males. Groups of female lions typically hunt together, preying mostly on large ungulates. Lions are apex and keystone " +
                "\n" +
                "predators, although they are also expert scavengers obtaining over 50 percent of their food by scavenging as opportunity allows. While lions do not " +
                "\n" +
                "typically hunt humans, some have. Sleeping mainly during the day, lions are active primarily at night (nocturnal), although sometimes at twilight (crepuscular).[7][8]\n" +
                "\n" +
                "Highly distinctive, the male lion is easily recognised by its mane, and its face is one of the most widely recognised animal symbols in human culture." +
                "\n" +
                " Depictions have existed from the Upper Paleolithic period, with carvings and paintings from the Lascaux and Chauvet Caves, through virtually all ancient and" +
                "\n" +
                " medieval cultures where they once occurred. It has been extensively depicted in sculptures, in paintings, on national flags, and in contemporary films and" +
                "\n" +
                " literature. Lions have been kept in menageries since the time of the Roman Empire, and have been a key species sought for exhibition in zoos over the world " +
                "\n" +
                "since the late eighteenth century. Zoos are cooperating worldwide in breeding programs for the endangered Asiatic subspecies.");

        Image lionImage = new Image(getClass().getResourceAsStream("Lion_waiting_in_Namibia.jpg"));

        ImageView lion = new ImageView();
        lion.setImage(lionImage);
        lion.setFitWidth(800);
        lion.setFitHeight(600);
        lion.setPreserveRatio(true);
        lionLayout.setPadding(new Insets(0, 20, 20, 20));

        lionLink.setOnAction(event2 -> {
            try {
                Desktop.getDesktop().browse(new URI("https://en.wikipedia.org/wiki/Lion"));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        });

        lionLayout.add(lionLink, 2, 0);
        lionLayout.add(lionInfo, 2, 1);
        lionLayout.add(lion, 2, 2);
        return this;
    }
}
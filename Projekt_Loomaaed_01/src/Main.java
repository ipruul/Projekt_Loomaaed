
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

//  http://docs.oracle.com/javase/8/javafx/layout-tutorial/builtin_layouts.htm#JFXLY102
//  https://docs.oracle.com/javafx/2/ui_controls/hyperlink.htm

// http://i200.itcollege.ee/

    @Override
    public void start(Stage primaryStage) {

       // lava seadistamine
//        VBox layout = new VBox();
        GridPane layout = new GridPane();
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
        layout.setPadding(new Insets(20, 20, 20, 20));
        primaryStage.setOnCloseRequest(event -> System.exit(0));
//        ScrollBar s1 = new ScrollBar();


        Button Lion = new Button("Lion");
        layout.add(Lion, 1, 3);

        Button Tiger = new Button("Tiger");
        layout.add(Tiger, 1, 1);

        Label teade2 = new Label("Class project: Zoo");
        layout.add(teade2, 1, 0);
//        layout.getChildren().addAll(nupp, teade, teade2);

        //Stseeni muutus
//        StackPane seesLayout = new StackPane();




//        GridPane lionLayout = new GridPane();
//        Scene lionScene = new Scene(lionLayout);
//        Label seesLabel = new Label("Hello");
//        Image lionImage = new Image("Oracle/Lion_waiting_in_Namibia.jpg");
//        ImageView iv1 = new ImageView();
//        iv1.setImage(lionImage);
//        iv1.setFitWidth(800);
//        iv1.setFitHeight(900);
//        iv1.setPreserveRatio(true);
//        lionLayout.setPadding(new Insets(20, 20, 20, 20));
//        lionLayout.add(iv1, 3, 3);



//        https://en.wikipedia.org/wiki/Lion
//        https://en.wikipedia.org/wiki/Lion#/media/File:Lion_waiting_in_Namibia.jpg

        GridPane lionLayout = new GridPane();
        Scene lionScene = new Scene(lionLayout);
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
                " seen a major population decline in its African range of 30–50% per two decades during the second half of the twentieth century.[2] Lion populations are " +
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


       // https://en.wikipedia.org/wiki/Tiger
        https://en.wikipedia.org/wiki/Tiger#/media/File:Tigress_at_Jim_Corbett_National_Park.jpg
;


        GridPane tigerLayout = new GridPane();
//       s1.setLayoutX(ti);
//        s1.setMinHeight(600);
        Scene tigerScene = new Scene(tigerLayout);
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


        //Tagasi algusesse

        Button bButton2 = new Button("Back");
        Button bButton3 = new Button("Back");
        lionLayout.add(bButton2, 0, 0);
        tigerLayout.add(bButton3, 0, 0);

        bButton2.setOnAction(event1 -> primaryStage.setScene(scene));
        bButton3.setOnAction(event1 -> primaryStage.setScene(scene));



//        seesLayout.getChildren().addAll(seesLabel, nupp2);

        // nupu tegevus
        Lion.setOnAction(event -> primaryStage.setScene(lionScene));
        Tiger.setOnAction(event -> primaryStage.setScene(tigerScene));




    }
}

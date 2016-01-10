
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
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


        Label teade2 = new Label("Class project: Zoo");
        layout.add(teade2, 1, 0);

        Button Tiger = new Button("Tiger");
        layout.add(Tiger, 1, 1);

        Button Hippo = new Button("Hippo");
        layout.add(Hippo, 1, 2);

        Button Lion = new Button("Lion");
        layout.add(Lion, 1, 3);

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
        Lion lion1 = new Lion().invoke();
        GridPane lionLayout = lion1.getLionLayout();
        Scene lionScene = lion1.getLionScene();


        // https://en.wikipedia.org/wiki/Tiger
        https://en.wikipedia.org/wiki/Tiger#/media/File:Tigress_at_Jim_Corbett_National_Park.jpg
;

        Hippo hippo1 = new Hippo().invoke();
        GridPane hippoLayout = hippo1.getHippoLayout();
        Scene hippoScene = hippo1.getHippoScene();

        Tiger tiger1 = new Tiger().invoke();
        GridPane tigerLayout = tiger1.getTigerLayout();
        Scene tigerScene = tiger1.getTigerScene();


        //Tagasi algusesse

        Button bButton2 = new Button("Back");
        Button bButton3 = new Button("Back");
        Button bButton4 = new Button("Back");

        lionLayout.add(bButton2, 0, 0);
        tigerLayout.add(bButton3, 0, 0);
        hippoLayout.add(bButton4, 0, 0);

        bButton2.setOnAction(event1 -> primaryStage.setScene(scene));
        bButton3.setOnAction(event1 -> primaryStage.setScene(scene));
        bButton4.setOnAction(event1 -> primaryStage.setScene(scene));


//        seesLayout.getChildren().addAll(seesLabel, nupp2);

        // nupu tegevus
        Lion.setOnAction(event -> primaryStage.setScene(lionScene));
        Tiger.setOnAction(event -> primaryStage.setScene(tigerScene));
        Hippo.setOnAction(event -> primaryStage.setScene(hippoScene));





    }




}

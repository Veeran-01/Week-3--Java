package dayThree;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Created by student on 15/02/2017.
 */
//fx need to extend application!!
public class HelloFX extends Application{
    Label response;

    public static void main(String[] args){
        launch();      // Start FX application
    }

    //overriding start from the application class
    public void start(Stage myStage){
        myStage.setTitle("How is your day?");

        FlowPane rootNode = new FlowPane(10, 10);  //set left to right?
        rootNode.setAlignment(Pos.CENTER);

        //CREATE a scene to put components (JPanel)
        Scene myScene = new Scene(rootNode, 300, 100);

        //set scene
        myStage.setScene(myScene);

        //set label
        response = new Label("Please select your mood today");
        response.setStyle("-fx-text-fill: blue;");

        //set 2 buttons
        Button btnBoom = new Button("BOOM!");
        Button btnManPound = new Button("MAN POUND!");

        //Listeners for buttons
        btnBoom.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                response.setText("You are BOOMING today!");
            }
        });


        //Java 8- but does the same thing: uses Lambda expression
        btnManPound.setOnAction((e) -> response.setText("We should MAN POUND right now!"));


        rootNode.getChildren().addAll(btnBoom, btnManPound, response);

        myStage.show();
    }


}

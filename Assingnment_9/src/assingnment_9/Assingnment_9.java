/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assingnment_9;

import java.awt.Color;
import java.awt.Polygon;
import java.awt.Rectangle;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
/**
 *
 * @author angelramirez-rivera
 */
public class Assingnment_9 extends Application {

    /**
     * @param args the command line arguments
     */
   
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        // Draw the house structure (rectangle)
        Rectangle house = new Rectangle(100, 100, 200, 150);
        house.setFill(Color.LIGHTBLUE);

        // Draw the roof (triangle)
        Polygon roof = new Polygon();
        roof.getPoints().addAll(
                100.0, 100.0,
                200.0, 50.0,
                300.0, 100.0
        );
        roof.setFill(Color.RED);

        // Draw two windows (squares)
        Rectangle window1 = new Rectangle(120, 120, 40, 40);
        window1.setFill(Color.WHITE);

        Rectangle window2 = new Rectangle(240, 120, 40, 40);
        window2.setFill(Color.WHITE);

        // Draw a door (rectangle)
        Rectangle door = new Rectangle(180, 200, 40, 80);
        door.setFill(Color.BROWN);

        // Add shapes to the pane
        pane.getChildren().addAll(house, roof, window1, window2, door);

        // Create a scene and set it on the stage
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setScene(scene);

        // Set the stage title and show it
        primaryStage.setTitle("My House Drawing");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
      launch(args);
    }
    
}

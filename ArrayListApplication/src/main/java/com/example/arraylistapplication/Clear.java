package com.example.arraylistapplication;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;


import static com.example.arraylistapplication.HelloController.arrayListElements;

public class Clear {

    private static Boolean status;
    private static int s;
        public static Boolean Clears() {
            s = arrayListElements.size();
            Stage window = new Stage();
            window.initModality(Modality.APPLICATION_MODAL);
            Pane pane = new Pane();
            Label labelClearON = new Label("Ви точно хочете очистити ArrayList?");
            Button ClearTrue = new Button("Так!");
            Button ClearFalse = new Button("Ні!");
            Label labelClearOF = new Label("ArrayList пустий!");
            Button ClearOF= new Button("Ок!");
            status = false;

            ClearTrue.setOnAction(e -> {
                    status = true;
                window.close();
            });
            ClearOF.setOnAction(e -> {
                status = false;
                window.close();
            });
            ClearFalse.setOnAction(e -> {
                status = false;
                window.close();
            });

            labelClearON.relocate(60, 60);
            ClearTrue.relocate(80, 200);
            ClearFalse.relocate(280, 200);

            labelClearOF.relocate(100, 60);
            ClearOF.relocate(150, 100);

            ClearTrue.setStyle("-fx-background-color: #008000;" +
                    "-fx-background-radius: 10;" +
                    " -fx-font-size: 20;" +
                    "-fx-text-fill: white;");
            ClearFalse.setStyle("-fx-background-color: #FF0000;" +
                    "-fx-background-radius: 10;" +
                    " -fx-font-size: 20;" +
                    "-fx-text-fill: white;");

            labelClearON.setStyle(" -fx-font-size: 20;");
            labelClearOF.setStyle(" -fx-font-size: 20;");
            ClearOF.setStyle("-fx-background-color: #008000;" +
                    "-fx-background-radius: 10;" +
                    " -fx-font-size: 20;" +
                    "-fx-text-fill: white;");

if( s > 0 ){
    pane.getChildren().addAll(labelClearON,  ClearTrue, ClearFalse);
    Scene scene = new Scene(pane, 400, 300);
    window.setScene(scene);
    window.setTitle("Очистити Array List");
    window.showAndWait();}
else {
    pane.getChildren().addAll(labelClearOF, ClearOF);
    Scene scene = new Scene(pane, 400, 300);
    window.setScene(scene);
    window.setTitle("Array List пустий");
    window.showAndWait();
}
            return status;
        }

}



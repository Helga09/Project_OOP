package com.example.arraylistapplication;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import static com.example.arraylistapplication.HelloController.arrayListElements;

public class Search {

    private static Boolean stat;
    private static int values;
    private static Object element;
    private static int s;

    public static Boolean Searchs() {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        Pane pane = new Pane();
        TextField elementSearch = new TextField();
        Label Searchelement = new Label("");
        Label Serch = new Label("Знайти:");
        Label Serchs = new Label("Пошук:");
        Button butonserch = new Button("Пошук");

        elementSearch.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    elementSearch.setText(newValue.replaceAll("[^\\d]", ""));
                }
                if (elementSearch.getText().isEmpty()) {
                } else {
                    int value = Integer.parseInt(newValue);
                    s = arrayListElements.size();
                    if (value >= s) {
                        elementSearch.setText(oldValue);
                    }
                }
            }

        });

        butonserch.setOnAction(e -> {
            if (elementSearch.getText().isEmpty()) {
                Searchelement.setText("Eror,індекс не введений!");
            } else {
                String text1 = elementSearch.getText();
                values = Integer.parseInt(text1);
                element = arrayListElements.get(values);
                Searchelement.setText(element.toString());
            }
        });

        Serchs.relocate(40, 100);
        Serch.relocate(40, 60);
        elementSearch.relocate(100, 60);
        butonserch.relocate(280, 60);
        Searchelement.relocate(100, 100);

        Serch.setStyle("-fx-background-radius: 14;" +
                " -fx-font-size: 14;"/**/);
        Serchs.setStyle("-fx-background-radius: 14;" +
                " -fx-font-size: 14;"/**/);
        butonserch.setStyle("-fx-background-color: #008000;" +
                "-fx-background-radius: 14;" +
                " -fx-font-size: 14;" +
                "-fx-text-fill: white;");
        elementSearch.setStyle("-fx-background-radius: 14;" +
                " -fx-font-size: 14;"/**/);
        Searchelement.setStyle(" -fx-font-size: 15;");

        pane.getChildren().addAll(Serchs, Serch, elementSearch, butonserch, Searchelement);
        Scene scene = new Scene(pane, 400, 300);
        window.setScene(scene);
        window.setTitle("Пошук");
        window.showAndWait();

        return stat;
    }

}



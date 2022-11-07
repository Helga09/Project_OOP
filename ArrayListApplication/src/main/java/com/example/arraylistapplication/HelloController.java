package com.example.arraylistapplication;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.geometry.Bounds;
import javafx.geometry.Orientation;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class HelloController {
    @FXML
    private FlowPane flowPane;

    @FXML
    private ScrollPane scrollPane;

    static ArrayListServise arrayList = new ArrayListServise();
    static ArrayList arrayListElements = arrayList.getArrayList();

    @FXML
    protected void onDraw() {
        scrollPane.viewportBoundsProperty().addListener(new ChangeListener<Bounds>() {
            @Override
            public void changed(ObservableValue<? extends Bounds> ov, Bounds oldBounds, Bounds bounds) {
                flowPane.setPrefWidth(bounds.getWidth());
                flowPane.setPrefHeight(bounds.getHeight());
            }
        });

        flowPane.getChildren().clear();
        flowPane.setOrientation(Orientation.HORIZONTAL);
        flowPane.setVgap(10);
        flowPane.setHgap(10);

        for (int i = 0; i < arrayListElements.size(); i++) {
            Rectangle rect = new Rectangle(100, 60);
            rect.setFill(Color.rgb(179, 153, 255));

            Text text = new Text((String) arrayListElements.get(i));
            Text index = new Text(Integer.toString(i));
            index.setTranslateY(-20);
            index.setTranslateX(-40);
            StackPane stack = new StackPane();
            stack.getChildren().addAll(rect, index, text);

            flowPane.getChildren().addAll(stack);
            scrollPane.setContent(flowPane);
        }

    }


    @FXML
    protected void onAddButtonClick() {
        arrayList.onAdd(AddElementController.addValue());
        onDraw();
    }

    @FXML
    protected void onRemoveButtonClick() {

    }

    @FXML
    protected void onEditButtonClick() {

    }

    @FXML
    protected void onClearButtonClick() {

    }

    @FXML
    protected void onSearchButtonClick() {

    }

    @FXML
    protected void onSortButtonClick() {

    }

    @FXML
    protected void onAboutProgramButtonClick() {

    }

    @FXML
    protected void onAboutDevelopersButtonClick() {

    }

}
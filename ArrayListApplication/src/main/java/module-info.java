module com.example.arraylistapplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.arraylistapplication to javafx.fxml;
    exports com.example.arraylistapplication;
}
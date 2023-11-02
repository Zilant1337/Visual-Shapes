module com.example.visualshapes {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.visualshapes to javafx.fxml;
    exports com.example.visualshapes;
}
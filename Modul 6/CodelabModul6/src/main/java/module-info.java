module com.example.codelabmodul {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.codelabmodul6 to javafx.fxml;
    exports com.example.codelabmodul6;
}
module com.example.dmiprojekt3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.dmiprojekt3 to javafx.fxml;
    exports com.example.dmiprojekt3;
}
module com.example.studentmanagert {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentmanagert to javafx.fxml;
    exports com.example.studentmanagert;
}
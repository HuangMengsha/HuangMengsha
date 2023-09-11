module com.example.ruangong_test {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ruangong_test to javafx.fxml;
    exports com.example.ruangong_test;
}
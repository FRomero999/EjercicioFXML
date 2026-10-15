module org.example.ejerciciofxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.ejerciciofxml to javafx.fxml;
    exports org.example.ejerciciofxml;
}
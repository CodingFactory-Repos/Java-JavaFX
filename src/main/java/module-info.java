module me.loule.JavaFX {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens me.loule.JavaFX to javafx.fxml;
    exports me.loule.JavaFX;
}
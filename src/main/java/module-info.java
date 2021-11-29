module me.loule.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens me.loule.javafx to javafx.fxml;
    exports me.loule.javafx;
}
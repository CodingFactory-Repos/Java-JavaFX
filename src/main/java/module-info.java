module me.loule.javajavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens me.loule.javajavafx to javafx.fxml;
    exports me.loule.javajavafx;
}
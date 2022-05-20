module com.edyu.new_rpg {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.edyu.new_rpg to javafx.fxml;
    exports com.edyu.new_rpg;
    exports com.edyu.new_rpg.utils;
    opens com.edyu.new_rpg.utils to javafx.fxml;
}
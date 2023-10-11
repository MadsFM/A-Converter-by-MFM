package gui;

import javafx.fxml.Initializable;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import java.awt.*;
import java.util.Optional;
import java.util.ResourceBundle;
import java.net.URL;

public class NumberConversionModel{

    private static final double difference = 1.609344;


    @FXML
    public String getGreetingsMessage(String name){
        return "Hello, " + name + ". Here is your personal converter! Have fun!!";
    }

    public double getMilesFromKilometers(double km){

        return km / difference;
    }

    public double getKilometersFromMiles(double miles){

        return miles * difference;
    }

}

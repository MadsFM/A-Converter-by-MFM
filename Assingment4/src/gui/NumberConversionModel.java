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

    private static final double differenceDistance = 1.609344;
    private static final double differenceWeightLbToKg = 0.45359237;
    private static final double differenceWeightKgToLb = 2.20462;
    private static final double differenceTempCelToFar = 32 /1.8;
    private static final double differenceTempFarToCel = 1.8 + 32;


    @FXML
    public String getGreetingsMessage(String name){
        return "Hello, " + name + ". Here is your personal converter! Have fun!!";
    }

    public double getMilesFromKilometers(double km){

        return km / differenceDistance;
    }

    public double getKilometersFromMiles(double miles){

        return miles * differenceDistance;
    }

    @FXML
    public double getDifferenceWeightKgToLb(double kilo) {
        return kilo * differenceWeightKgToLb;
    }

    @FXML
    public double getDifferenceWeightLbToKg(double pound){
        return pound * differenceWeightLbToKg;
    }

    public double getDifferenceTempFarToCel(double fahrenheit){
        return fahrenheit * differenceTempFarToCel;
    }

    public double getDifferenceTempCelToFar(double celcius){
        return celcius * differenceTempCelToFar;
    }
}

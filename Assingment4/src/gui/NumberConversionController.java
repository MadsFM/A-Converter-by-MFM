package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class NumberConversionController implements Initializable {


    private NumberConversionModel ncModel = new NumberConversionModel();
    @FXML
    private Label label;
    @FXML
    private TextField txtNumberInput, lblResult;

    @FXML
    private Button btnCalcKmToMiles, btnCalcMilesToKm, btnCalcLbToKg, btnCalcKgToLb, btnCalcCelToFar, btnCalcFarToCel;





    public String getGreetingsMessage(String name) {
        return "Hello, " + name + ". Greetings from the top Java developer class in town.";

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TextInputDialog dialog = new TextInputDialog("");

        dialog.setTitle("Text Input Dialog");
        dialog.setContentText("Please enter your name:");

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            String message = ncModel.getGreetingsMessage(result.get());
            label.setText(message);
        }
    }

    @FXML
    private void onClickDistance(ActionEvent event){

        double txtFieldValue = Double.parseDouble((txtNumberInput.getText()));
        double result = 0.0;
        String resultAsString = "";

        if (event.getSource() == btnCalcKmToMiles) {
            result = ncModel.getKilometersFromMiles(txtFieldValue);
        } else if (event.getSource() == btnCalcMilesToKm) {
            result = ncModel.getMilesFromKilometers(txtFieldValue);
        }
        resultAsString = String.format("%.4f", result);
        lblResult.setText(resultAsString);
    }

    @FXML
    private void onClickWeight(ActionEvent event){

        double txtFieldValue = Double.parseDouble((txtNumberInput.getText()));
        double result = 0.0;
        String resultAsString = "";

         if (event.getSource() == btnCalcKgToLb){
             result = ncModel.getDifferenceWeightKgToLb(txtFieldValue);
         } else if (event.getSource() == btnCalcLbToKg) {
             result = ncModel.getDifferenceWeightLbToKg(txtFieldValue);
         }
         resultAsString = String.format("%.4f", result);
         lblResult.setText(resultAsString);
    }

    public void onClickTemperature(ActionEvent actionEvent) {
        double txtFieldValue = Double.parseDouble((txtNumberInput.getText()));
        double result = 0.0;
        String resultAsString = "";

        if (actionEvent.getSource() == btnCalcFarToCel){
            result = (txtFieldValue - 32) / 1.8;
        } else if (actionEvent.getSource() == btnCalcCelToFar) {
            result = (txtFieldValue * 1.8) + 32;
        }
        resultAsString = String.format("%.4f", result);
        lblResult.setText(resultAsString);
    }
}

package gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    private TextField txtNumberInputMiles;
    @FXML
    private TextField txtNumberInputKm;
    @FXML
    private TextField lblResult;

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

    private void onClick(ActionEvent event)
    {
        double txtFieldValue = Double.parseDouble(txtNumberInputMiles.getText());
        double resultInMiles = ncModel.getKilometersFromMiles(txtFieldValue);
        String resultAsString = String.format("%.3f", resultInMiles);
        lblResult.setText(resultAsString);
    }

    @FXML
    private void onClick2(ActionEvent event){
        double txtFieldValue = Double.parseDouble((txtNumberInputMiles.getText()));
        double resultInKm = ncModel.getMilesFromKilometers(txtFieldValue);
        String resultAsString = String.format("%.3f", resultInKm);
        lblResult.setText(resultAsString);
    }
}

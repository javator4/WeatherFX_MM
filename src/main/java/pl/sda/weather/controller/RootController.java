package pl.sda.weather.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pl.sda.weather.JsonDataFaster;
import pl.sda.weather.model.Current;

public class RootController {

    @FXML
    private TextField city;
    @FXML
    private Button find;
    @FXML
    private Label temp;
    @FXML
    private Label currentCity;
    @FXML
    private Label humidity;

    public void getWeather(ActionEvent actionEvent) {

        JsonDataFaster jsonDataFaster = new JsonDataFaster();
        Current current = new Current();



        jsonDataFaster.setUrl("http://api.apixu.com/v1/current.json");
        jsonDataFaster.setApiKey("0a566d9f9235405fabb82135191307");
        jsonDataFaster.setCity(city.getText());
        jsonDataFaster.build();
        temp.setText(String.valueOf(jsonDataFaster.getWeather().getCurrent().getTemp_c()));
        currentCity.setText(jsonDataFaster.getCity());
        humidity.setText(String.valueOf(jsonDataFaster.getWeather().getCurrent().getHumidity()));


        //temp.setText(Float.toString(current.getTemp_c()));


    }
}

package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.weather.model.Weather;

import java.io.IOException;

public class JsonDataFaster extends AbstractJsonData {

    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    @Override
    public Weather getWeather() {
        ObjectMapper objectMapper = new ObjectMapper();
        Weather weather = null;
        try {

            weather = objectMapper.readValue(this.getJsonData(this.city) , Weather.class);

            //objectMapper.writeValue(new File("data.json"), weather);              //zapisuje dane do pliku

        } catch (IOException e) {
            e.printStackTrace();
        }
        return weather;

    }
}

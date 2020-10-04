package io.github.aggie.data.source;

import io.github.aggie.cfg.ConfigProperties;
import io.github.aggie.data.DataFacade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RandomNumberAPI implements DataFacade<Integer> {
    private final ConfigProperties configProperties;

    public RandomNumberAPI(ConfigProperties configProperties) {
        this.configProperties = configProperties;
    }

    @Override
    public Integer dataGenerate() {
        Integer random = null;
        HttpURLConnection connection = null;
        try {
            var amount = configProperties.getValue(ConfigProperties.AMOUNT_VALUE);
            var min = configProperties.getValue(ConfigProperties.MINIMUM_VALUE);
            var max = configProperties.getValue(ConfigProperties.MAXIMUM_VALUE);
            var api = configProperties.getValue(ConfigProperties.API_REST);
            URL url = new URL((String.format(api, amount, min, max)));
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                random = Integer.parseInt(in.readLine());
                in.close();
            } else {
                throw new RuntimeException("Problem with GET request. Status code: " + connection.getResponseCode());
            }
        } catch (IOException e) {
            throw new RuntimeException("Problem with HTTP connection: " + e);
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return random;
    }
}

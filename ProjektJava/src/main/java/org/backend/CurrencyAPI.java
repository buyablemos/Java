package org.backend;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.JSONObject;

public class CurrencyAPI {
    private static final String API_URL = "https://api.exchangerate-api.com/v4/latest/PLN"; // Przykładowe API

    public static double getExchangeRate(String currencyCode) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        JSONObject jsonObject = new JSONObject(response.body());
        return jsonObject.getJSONObject("rates").getDouble(currencyCode);
    }
}


package org.felipesantos;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyService {
    // Coloque sua chave de API aqui
    private static final String API_KEY = "API-key";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public double getConversionRate(String baseCurrency, String targetCurrency) {
        try {
            String url = BASE_URL + baseCurrency;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
            // Verifica se o resultado foi "success"
            if (jsonObject.get("result").getAsString().equals("success")) {
                JsonObject conversionRates = jsonObject.getAsJsonObject("conversion_rates");
                return conversionRates.get(targetCurrency).getAsDouble();
            } else {
                System.out.println("Erro ao buscar conversão: " + jsonObject.get("error-type").getAsString());
                return -1;
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro na requisição: " + e.getMessage());
            return -1;
        }
    }
}
package com.juanfer.currencyconverter.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;
import com.juanfer.currencyconverter.modelos.Pair;

public class AskCurrencyPair {

    public double consultarPar(String base, String target) {
        URI url = URI.create("https://v6.exchangerate-api.com/v6/" +
                "e39bb2bedb27ebf38f41d1a3/pair/" +
                base + "/" + target);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Pair par = new Gson().fromJson(response.body(), Pair.class);
            return par.conversion_rate();
        } catch (Exception e) {
            throw new RuntimeException("No encontré ese par");
        }
    }
}

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversor {

    public Moneda ConsultaMoneda(Double cantidad, String monedaBase, String monedaCambio) throws IOException {
        String apiKey = "07c9fb8eda3258a405f50a72";
        // Setting URL
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + monedaBase + "/" + monedaCambio + "/" + cantidad;

        // Making Request
        URI direccion = URI.create(url);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        // Convert to JSON
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre esa moneda de cambio.");
        }
    }
    public Double ConsultaMoneda2(Double cantidad, String monedaBase, String monedaCambio) {
        String url_str = "https://v6.exchangerate-api.com/v6/07c9fb8eda3258a405f50a72/pair/"+monedaBase+"/"+monedaCambio+"/"+cantidad;

// Making Request

        HttpURLConnection request;
        try {
            URL url = new URL(url_str);
            request = null;
            request = (HttpURLConnection) url.openConnection();
            request.connect();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


// Convert to JSON
        JsonParser jp = new JsonParser();
        JsonElement root = null;
        try {
            root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JsonObject jsonobj = root.getAsJsonObject();

// Accessing object
        Double resultadoCambio = jsonobj.get("conversion_result").getAsDouble();
        return resultadoCambio;
    }


}

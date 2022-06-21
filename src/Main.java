package src;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws Exception {

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://imdb-api.com/en/API/Top250Movies/k_pkcce753"))
                .GET().build();

        HttpClient client = HttpClient.newHttpClient();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        System.out.println(response.statusCode());
        System.out.println("Result: " + json);
    }
}
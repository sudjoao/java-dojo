package challenge;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepService {
    public static String getAddressByZipCode(String zipcode) throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder().build();
        String url = "https://viacep.com.br/ws/%s/json".formatted(zipcode);
        HttpRequest httpRequest = HttpRequest.newBuilder(URI.create(url)).build();
        HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        return  response.body();
    }
}

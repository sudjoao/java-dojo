import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Type the number of the product that you wanna see:");
            var productId = scanner.nextInt();
            String uri = "https://fakestoreapi.com/products/%s".formatted(productId);
            HttpClient httpClient = HttpClient.newBuilder().build();
            HttpRequest request = HttpRequest.newBuilder(URI.create(uri)).build();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            ProductDto productDto = gson.fromJson(response.body(), ProductDto.class);
            System.out.println(productDto);
        }
    }
}
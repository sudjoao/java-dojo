package challenge;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the Brazil Zip code (only numbers):");
        String zipcode = scanner.nextLine();
        String response = ViaCepService.getAddressByZipCode(zipcode);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        AddressViaCepDTO addressViaCepDTO = gson.fromJson(response, AddressViaCepDTO.class);
        Address address = Address.fromDto(addressViaCepDTO);
        FileHelper.saveAddressInJson("address", gson.toJson(address));
    }
}

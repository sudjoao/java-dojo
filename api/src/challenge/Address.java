package challenge;

public class Address {
    final String zipcode;
    final String street;
    final String complement;
    final String neighborhood;
    final String state;

    public Address(String zipcode, String street, String complement, String neighborhood, String state) {
        this.zipcode = zipcode;
        this.street = street;
        this.complement = complement;
        this.neighborhood = neighborhood;
        this.state = state;
    }

    public static Address fromDto(AddressViaCepDTO addressViaCepDTO){
        return new Address(
                addressViaCepDTO.cep(),
                addressViaCepDTO.logradouro(),
                addressViaCepDTO.complemento(),
                addressViaCepDTO.bairro(),
                addressViaCepDTO.uf()
        );
    }

    @Override
    public String toString() {
        return "Address {" +
                "\n  Zipcode: '" + zipcode + '\'' +
                ",\n  Street: '" + street + '\'' +
                ",\n  Complement: '" + complement + '\'' +
                ",\n  Neighborhood: '" + neighborhood + '\'' +
                ",\n  State: '" + state + '\'' +
                "\n}";
    }
}

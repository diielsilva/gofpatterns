package creational.builder;

class BuilderTest {
    private BuilderTest() {
    }

    static void main() {
        Address riverSeaAvenue = AddressBuilder
                .builder()
                .street("República do Líbano")
                .neighborhood("Pina")
                .city("Recife")
                .state("Pernambuco")
                .country("Brasil")
                .build();

        Address recifeMallAvenue = AddressBuilder
                .builder()
                .street("Padre Carapuceiro")
                .neighborhood("Boa Viagem")
                .city("Recife")
                .state("Pernambuco")
                .country("Brasil")
                .build();

        IO.println(riverSeaAvenue);
        IO.println(recifeMallAvenue);
    }
}

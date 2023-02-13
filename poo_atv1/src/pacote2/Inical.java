package pacote2;

import pacote1.Carta;

public class Inical {
    public static void main(String[] args) {
        Carta carta = new Carta("CartaMain", "13_02_2022", "Anexo_main");
        carta.mostrar();
        System.out.print(carta.anexo);
        // O atributo Anexo não é visivel pois está em um pacote diferente. Uma solução
        // seria o método get.
    }
}

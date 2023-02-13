package pacote2;

import pacote1.Carta;
import pacote1.Documento;

public class Telegrama extends Documento {
    private String assinatura;

    public Telegrama(String nome, String data, String assinatura) {
        super(nome, data);
        this.assinatura = assinatura;
    }

    public void mostrar() {
        super.mostrar();
        System.out.print("Assinatura: " + assinatura);
    }

    public void mostrar2() {
        Carta carta = new Carta("Carta1", "13/02/2022", "anexo1");
        Telegrama telegrama = new Telegrama("telegrama1", "13-02-2023", "anonymous");

        System.out.print(carta.getData());
        // Data é um atributo protegido, por tanto apenas é visivel em seu pacote de
        // origem, então decide fazer acesso através do get.
        System.out.print(telegrama.data);
    }
}

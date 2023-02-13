package pacote1;

public class Carta extends Documento {
    String anexo;

    public Carta(String nome, String data, String anexo) {
        super(nome, data);
        this.anexo = anexo;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("anexo: " + anexo);
    }

    public String getData() {
        return data;
    }

}

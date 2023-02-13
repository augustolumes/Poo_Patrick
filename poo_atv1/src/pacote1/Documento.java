package pacote1;

public class Documento {
    String nome;
    protected String data;

    public Documento(String nome, String data) {
        this.nome = nome;
        this.data = data;
    }

    public void mostrar() {
        System.out.println("Nome: " + nome + " Data: " + data);
    }
}

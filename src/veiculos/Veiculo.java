package veiculos;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private boolean disponivel = true;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract double calcularDiaria();

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
    public boolean isDisponivel() { return disponivel; }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

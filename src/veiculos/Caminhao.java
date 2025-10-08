package veiculos;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularDiaria() {
        return 200.0;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
        System.out.println("Tipo: Caminhão");
    }
}

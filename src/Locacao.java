import veiculos.Veiculo;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Locacao {
    private Veiculo veiculo;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Locacao(Veiculo veiculo, LocalDate dataInicio, LocalDate dataFim) {
        this.veiculo = veiculo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;

        veiculo.setDisponivel(false);
    }

    public double calcularValorTotal() {
        long dias = ChronoUnit.DAYS.between(dataInicio, dataFim);
        return dias * veiculo.calcularDiaria();
    }

    public void exibirResumoLocacao() {
        System.out.println("\nResumo da Locação:");
        veiculo.exibirDetalhes();
        System.out.println("Data de início: " + dataInicio);
        System.out.println("Data de fim: " + dataFim);
        System.out.println("Total a pagar: R$" + calcularValorTotal());
    }
}

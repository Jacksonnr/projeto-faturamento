import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ContaLuz extends Produto {

    Scanner leitor = new Scanner(System.in);

    private Double consumoMensal;
    private Double juros;
    private LocalDate mesReferencia;
    private LocalDate vencimento;
    private LocalDate dataPagamento;

    public ContaLuz(String nomeResponsavel) {
        super(nomeResponsavel);
        
    }

    public Double getConsumoMensal() {
        return consumoMensal;
    }

    public void setConsumoMensal(Double consumoMensal) {
        this.consumoMensal = consumoMensal;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public LocalDate getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(LocalDate mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public double calcularConsumoMensal(int consumoKwh) { // * Função para calculo geral do valor do Kw/h */
        double valorKwh = 0.50; // * valor do kwh */
        Double valor = (valorKwh * consumoKwh);
        return valor;
    }

    public String calcularJuros(Double valor) {
        double juros = 0.15;
        int contadorDias = 30;
        System.out.print("Informe o dia de vencimento: ");
        int diaVencimento = leitor.nextInt();
        System.out.print("Informe o mês de vencimento: ");
        int mesVencimento = leitor.nextInt();
        System.out.print("Informe o ano de vencimento: ");
        int anoVencimento = leitor.nextInt();

        LocalDate dataConta = LocalDate.of(anoVencimento, mesVencimento, diaVencimento);

        System.out.print("Informe o dia de pagamento: ");
        int diaPagamento = leitor.nextInt();
        System.out.print("Informe o mês de pagamento: ");
        int mesPagamento = leitor.nextInt();
        System.out.print("Informe o ano de pagamento: ");
        int anoPagamento = leitor.nextInt();
        LocalDate dataVencimento = LocalDate.of(anoPagamento, mesPagamento, diaPagamento);

        long dataFinal = ChronoUnit.DAYS.between(dataConta, dataVencimento);

        if (dataFinal > contadorDias) {
            long contadorJuros = dataFinal - contadorDias;
            valor = valor + (contadorJuros * juros);
            return "O valor com juros ficou: R$" + valor;
        } else {
            return "Sem valor de juros a acrescentar.";
        }

    }
}

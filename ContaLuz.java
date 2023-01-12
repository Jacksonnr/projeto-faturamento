import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaLuz extends Produto {

    Scanner leitor = new Scanner(System.in);

    private Double consumoMensal;
    private Double juros;
    private Double valor;
    private LocalDate mesReferencia;
    private LocalDate vencimento;
    private LocalDate dataPagamento;

    public ContaLuz(String nomeResponsavel, LocalDate mesReferencia, LocalDate vencimento) {
        super(nomeResponsavel);
        this.mesReferencia = mesReferencia;
        this.vencimento = vencimento;
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
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

    public double calcularConsumoMensal(double valor) { // * Função para calculo geral do valor do Kw/h */
        double valorKwh = 0.50; // * valor do kwh */
        double consumoKwh = 0;
        try {
            consumoKwh = leitor.nextInt(); // * solicitar do usuário o número de kwh consumidos informados no contador
                                           // */
        } catch (InputMismatchException e) {
            // TODO: handle exception
        }
        valor = (valorKwh * consumoKwh);
        return valor;
    }

    public String calcularJuros(double valor) {
        double juros = 0.15;
        int contadorDias = 30;
        System.out.print("Informe o dia que a conta foi gerada: ");
        int diaConta = leitor.nextInt();
        System.out.print("Informe o mês que a conta foi gerada: ");
        int mesConta = leitor.nextInt();
        System.out.print("Informe o ano que a conta foi gerada: ");
        int anoConta = leitor.nextInt();

        LocalDate dataConta = LocalDate.of(anoConta, mesConta, diaConta);

        System.out.print("Informe o dia de vencimento: ");
        int diaVencimento = leitor.nextInt();
        System.out.print("Informe o mês de vencimento: ");
        int mesVencimento = leitor.nextInt();
        System.out.print("Informe o ano de vencimento: ");
        int anoVencimento = leitor.nextInt();
        LocalDate dataVencimento = LocalDate.of(anoVencimento, mesVencimento, diaVencimento);

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

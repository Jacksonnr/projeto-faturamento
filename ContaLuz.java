import java.util.Scanner;

public class ContaLuz extends Produto {

    Scanner leitor = new Scanner(System.in);

    private Double consumoMensal;
    private Double juros;

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

    public double calcularConsumoMensal(int consumoKwh) { // * Função para calculo geral do valor do Kw/h */
        double valorKwh = 0.50; // * valor do kwh */
        Double valor = (valorKwh * consumoKwh);
        return valor;
    }

    public void calculoBandeira(String bandeira, double valor) {
        double bandAmarela = 0.01874;
        double bandVermelha1 = 0.03971;
        double bandVermelha2 = 0.09492;
        if (bandeira == "Verde" || bandeira == "verde") {
            System.out.println(
                    "Bandeira verde: condições favoráveis de geração de energia. A tarifa não sofre nenhum acréscimo");
        } else if (bandeira == "Amarela" || bandeira == "amarela") {
            System.out.println(
                    "Bandeira amarela: condições de geração menos favoráveis. A tarifa sofre acréscimo de R$ 0,01874 para cada quilowatt-hora (kWh) consumidos");
            valor = valor * bandAmarela;
        } else if (bandeira == "Vermelha" || bandeira == "vermelha") {
            System.out.println("Qual o patamar?");
            int patamar = leitor.nextInt();
            switch (patamar) {
                case 1:
                    System.out.println(
                            "Bandeira vermelha - Patamar 1: condições mais custosas de geração. A tarifa sofre acréscimo de R$ 0,03971 para cada quilowatt-hora kWh consumido.");
                    valor = valor * bandVermelha1;
                    break;
                case 2:
                    System.out.println(
                            "Bandeira vermelha - Patamar 2: condições ainda mais custosas de geração. A tarifa sofre acréscimo de R$ 0,09492 para cada quilowatt-hora kWh consumido.");
                    valor = valor * bandVermelha2;
                    break;
                default:
                    System.out.println("Favor selecionar uma opção válida!");
                    break;
            }
        }
    }

    // public String calcularJuros(Double valor) {
    // double juros = 0.15;
    // int contadorDias = 30;
    // System.out.print("Informe o dia de vencimento: ");
    // int diaVencimento = leitor.nextInt();
    // System.out.print("Informe o mês de vencimento: ");
    // int mesVencimento = leitor.nextInt();
    // System.out.print("Informe o ano de vencimento: ");
    // int anoVencimento = leitor.nextInt();

    // LocalDate dataConta = LocalDate.of(anoVencimento, mesVencimento,
    // diaVencimento);

    // System.out.print("Informe o dia de pagamento: ");
    // int diaPagamento = leitor.nextInt();
    // System.out.print("Informe o mês de pagamento: ");
    // int mesPagamento = leitor.nextInt();
    // System.out.print("Informe o ano de pagamento: ");
    // int anoPagamento = leitor.nextInt();
    // LocalDate dataVencimento = LocalDate.of(anoPagamento, mesPagamento,
    // diaPagamento);

    // long dataFinal = ChronoUnit.DAYS.between(dataConta, dataVencimento);

    // if (dataFinal > contadorDias) {
    // long contadorJuros = dataFinal - contadorDias;
    // valor = valor + (contadorJuros * juros);
    // return "O valor com juros ficou: R$" + valor;
    // } else {
    // return "Sem valor de juros a acrescentar.";
    // }

    // }
}

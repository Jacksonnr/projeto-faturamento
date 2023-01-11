import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ContaLuz extends Produto {

    Scanner leitor = new Scanner(System.in);

    private Double consumoMensal;
    private Double juros;
    private String valor;
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
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

   public double calcularConsumoMensal (){ //* Função para calculo geral do valor do Kw/h */
        double valorKwh = 0.50;
        double consumoKwh = 0;
        try {
            consumoKwh = leitor.nextInt();
        } catch (InputMismatchException e) {
            // TODO: handle exception
        }
        double valorFinal = (valorKwh * consumoKwh);
        return valorFinal;
   }

//     public void calcularJuros (double valorFinal, LocalDate diaAtual) {
//         double juros = 0.15;
//         diaAtual.now();
//         String diasPassados = leitor.next();
//         LocalDate diasParse = LocalDate.parse(diasPassados).plus();
        
//    }

}

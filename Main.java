import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList ContaLuz = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o nome do titular da conta: ");
        String nome = leitor.next();
        ContaLuz contaluz = new ContaLuz(nome);

        System.out.println("Infome o consumo de kwh houve em sua residência esse mês, senhor(a) " + nome);
        int consumo = leitor.nextInt();
        
        System.out.println("O consumo mensal foi de: " + consumo + "Kwh, totalizando assim no valor de: R$" + contaluz.calcularConsumoMensal(consumo));
        double valorFinal = contaluz.calcularConsumoMensal(consumo);
        System.out.println(contaluz.calcularJuros(valorFinal));
    }
}


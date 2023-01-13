import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        ContaLuz contaluz = new ContaLuz("João", 150.00);

        System.out.println("Infome o consumo de kwh houve em sua residência esse mês " + contaluz.getNomeResponsavel());

        int consumo = leitor.nextInt();
        System.out.println("Valor de consumo: " + contaluz.calcularConsumoMensal(consumo));


        

        
    }
}

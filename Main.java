import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o nome do titular da conta: ");
        String nome = leitor.next();
        ContaLuz contaluz = new ContaLuz(nome);
        System.out.println("Infome o consumo de kwh neste mês que houve na residência do " + nome);
        int consumo = leitor.nextInt();
        
        
        
    }
}


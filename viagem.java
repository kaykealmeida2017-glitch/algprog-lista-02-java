import java.util.Scanner;

public class viagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço da viagem para a Alemanha: ");
        double precoAlemanha = scanner.nextDouble();
        System.out.print("Quantidade de pessoas que irá para a Alemanha: ");
        int pessoasAlemanha = scanner.nextInt();

        System.out.print("Digite o preço da viagem para a Portugal: ");
        double precoPortugal = scanner.nextDouble();
        System.out.print("Quantidade de pessoas que irá para a Portugal: ");
        int pessoasPortugal = scanner.nextInt();

        System.out.print("Digite o preço da viagem para a Itália: ");
        double precoItalia = scanner.nextDouble();
        System.out.print("Quantidade de pessoas que irá para a Itália: ");
        int pessoasItalia = scanner.nextInt();

        double totalAlemanha = precoAlemanha * pessoasAlemanha;
        double totalPortugal = precoPortugal * pessoasPortugal;
        double totalItalia = precoItalia * pessoasItalia;

        System.out.println("\nO valor total para a Alemanha é: R$ " + totalAlemanha);
        System.out.println("\nO valor total para a Portugal é: R$ " + totalPortugal);
        System.out.println("\nO valor total para a Itália é: R$ " + totalItalia);

        System.out.println("\nO valor total geral é: R$ " + (totalAlemanha + totalPortugal + totalItalia));

        scanner.close();
    }
}
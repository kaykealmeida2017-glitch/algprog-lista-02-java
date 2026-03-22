import java.util.Scanner;

public class gasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o valor da gasolina por litro: ");
        double valorLitro = scanner.nextDouble();

        System.out.print("Digite quantos litros de gasolina foi vendido: ");
        double litros = scanner.nextDouble();

        double total = litros * valorLitro;

        System.out.println("O valor total a ser pago por " + nomeCliente + " é: R$ " + total);

        scanner.close();
    }
}
import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota bimestral: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota bimestral: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota bimestral: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota bimestral: ");
        double nota4 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas é: " + media);

        scanner.close();
    }

}
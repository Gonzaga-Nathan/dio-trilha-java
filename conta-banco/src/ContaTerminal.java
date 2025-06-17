import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( "Bem-vindo ao Banco Santander!");

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        double saldo = 0.0;

        System.out.println("Faça seu primeiro depósito! Digite o valor:");
        double depositoInicial = scanner.nextDouble();

        if (depositoInicial > 0) {
            saldo += depositoInicial;
            System.out.println("Depósito realizado com sucesso!");
       System.out.println( "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
            System.out.println("Sua agência é: " + agencia);
            System.out.println("Seu número de conta é: " + numero);
            System.out.println("Seu saldo é: R$ " + saldo);

            scanner.close();
        }
    }
}

import java.util.Scanner;

public class SimuladorConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(1000.00); // Saldo inicial de R$ 1000

        while (true) {
            System.out.println("\n1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 3:
                    conta.consultarSaldo();
                    break;

                case 4:
                    System.out.println("Encerrando...");
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}

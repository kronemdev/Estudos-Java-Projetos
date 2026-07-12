import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double saldo = 5000;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n--- CAIXA ELETRÔNICO ---");
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é: R$ " + saldo);
                    System.out.println("\nPressione Enter para voltar ao menu");
                    leitor.nextLine();
                    leitor.nextLine();
                    break;

                case 2:
                    System.out.print("Digite o valor do Depósito: R$ ");
                    double valorDeposito = leitor.nextDouble();
                    saldo = saldo + valorDeposito;
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println("\nPressione Enter para voltar ao menu");
                    leitor.nextLine();
                    leitor.nextLine();
                    break;

                case 3:
                    System.out.print("Digite o valor do saque: R$ ");
                    double valorSaque = leitor.nextDouble();
                    if (valorSaque > saldo) {
                        System.out.println("Erro: Saldo insuficiente! Você tem apenas R$ " + saldo);
                    } else {
                        saldo = saldo - valorSaque;
                        System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso!");
                    }
                    System.out.println("\nPressione Enter para voltar ao menu");
                    leitor.nextLine();
                    leitor.nextLine();
                    break;

                case 4:
                    System.out.println("Obrigado por usar o nosso banco. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    System.out.println("\nPressione Enter para voltar ao menu");
                    leitor.nextLine();
                    leitor.nextLine();
                    break;
            }
        }
        leitor.close();
    }
}

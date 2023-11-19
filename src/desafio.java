import java.util.Scanner;

public class desafio {

    public static void main(String[] args) {

        String nomeCliente = "Clark Kent";
        String tipoConta = "Corrente";
        double saldoConta = 12343.6;
        int opcao = 0;

        System.out.println("*************************");
        System.out.println("\nCliente: " + nomeCliente);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo em conta: " + saldoConta);
        System.out.println("\n*************************");

        String menu = """
                *** Digite uma opção **
                1 - Consultar Saldo
                2 - Fazer uma transferência
                3 - Receber um valor
                4 - Sair
                """;
        Scanner leitura = new Scanner(System.in);
        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é "+saldoConta+"\n");
            } else if (opcao == 2){
                System.out.println("Qual valor deseja transferir? ");
                double valorTransferencia = leitura.nextDouble();
                if (valorTransferencia > saldoConta){
                    System.out.println("Você não possui saldo suficiente para efetuar esta transação");
                } else{
                    saldoConta -= valorTransferencia;
                    System.out.println("Novo saldo: " +saldoConta);
                }
            } else if (opcao == 3) {
                System.out.println("Qual valor deseja depositar?");
                double valorDeposito = leitura.nextDouble();
                saldoConta += valorDeposito;
                System.out.println("Novo saldo: " +saldoConta);
            } else{
                System.out.println("digite uma opção válida");
            }
        }
    }
}


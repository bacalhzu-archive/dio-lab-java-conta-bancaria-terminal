import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args)  {
            
        /* 
        *  TODO: Conhecer e importar a classe Scanner
        *  TODO: Exibir as mensagens para o usuário
        *  TODO: Obter pelo Scanner os valores digitados no terminal
        *  TODO: Exibir a mensagem final para o usuário 
        */

        String nome;
        String agencia;
        int conta;        
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema de criação de contas do banco Bionisma!");

        System.out.print("Para iniciarmos por favor digite o nome do cliente: ");
        nome = sc.nextLine();

        System.out.println("Agora vamos precisar de mais algumas informações!");
        System.out.print("Entre com a agência: ");
        agencia = sc.nextLine();
        System.out.print("Entre com a conta: ");
        conta = sc.nextInt();
        System.out.print("Entre com o saldo inicial: ");
        saldo = sc.nextDouble();

        sc.close();

        String saida = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo inicial de R$%.2f já está disponível para saque!", 
            nome, agencia, conta, saldo
        );

        System.out.println(saida);

    }
}

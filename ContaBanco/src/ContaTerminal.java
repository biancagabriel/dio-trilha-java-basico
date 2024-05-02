import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /*TODO: conhecer e importar a classe scanner 
         * exibir as mensagens para o usuário
         * obter os valores digitados no terminal 
         * exibir a mensagem final 
         */

        Scanner entrada = new Scanner(System.in);
        System.out.printf("Por favor, digite o nome do cliente: ");
        String nomeCliente = entrada.nextLine();
        System.out.printf("Por favor, digite o número da Agência ! ");
        String agencia = entrada.next();
        System.out.printf("Por favor, digite o número da conta ! ");
        int conta = entrada.nextInt();
        System.out.printf("Por favor, digite o valor para depósito: ");
        double saldo = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + ",obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " conta: " + conta +
                " e seu saldo: R$" + saldo + " já está disponível para saque!");



    }
}

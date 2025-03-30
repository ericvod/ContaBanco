import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        imprimirTexto("Por favor, digite o número da conta: ");

        int numero = Integer.parseInt(scan.nextLine());

        imprimirTexto("Por favor, digite o número da agencia: ");

        String agencia = scan.nextLine();

        imprimirTexto("Por favor, digite o nome do cliente: ");

        String nomeCliente = scan.nextLine();

        imprimirTexto("Por favor, digite o valor do saldo: ");

        double saldo = Double.parseDouble(scan.nextLine());

        imprimirTexto(String.format(
                "Olá \'%s\', obrigado por criar uma conta em nosso banco. Sua agência é \'%s\', conta \'%d\' e seu saldo \'R$ %.2f\' já está disponível para saque.",
                nomeCliente, agencia, numero, saldo));

        scan.close();
    }

    public static void imprimirTexto(String text) {
        System.out.println(text);
    }
}

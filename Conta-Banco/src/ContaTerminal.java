import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 0.0;

        System.out.print("Por favor, digite o NÚMERO da Agência: ");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a AGÊNCIA: ");
        agencia = scanner.next();
        scanner.nextLine();
        System.out.print("Digite o NOME do cliente: ");
        nomeCliente = scanner.nextLine();
        System.out.print("Digite um VALOR para Saldo Inical: R$ ");
        saldo = scanner.nextDouble();
        System.out.println("--------------------------");
        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                            agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}

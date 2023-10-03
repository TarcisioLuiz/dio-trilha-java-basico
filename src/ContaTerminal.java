import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Conta conta = new Conta();
        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor digite o número da conta: ");
        conta.setNumero(scan.nextInt());
        System.out.print("Por favor digite o número da agência: ");
        conta.setAgencia(scan.nextLine());
        System.out.print("Por favor digite o seu nome: ");
        conta.setClienteNome(scan.nextLine());
        System.out.print("Por favor digite o seu saldo: ");
        conta.setSaldo(scan.nextDouble());

        System.out.println("Olá " + conta.getClienteNome() + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + conta.getAgencia() + ", conta "+ conta.getNumero() +
                " e seu saldo R$" + conta.getSaldo() + " já está disponível para saque");
    }
}
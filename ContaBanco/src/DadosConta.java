import java.util.Scanner;

public class DadosConta {
    int Numero;
    String Agencia;
    String NomeCliente;
    double Saldo;

    public void ReceberDados() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        NomeCliente = sc.next();

        System.out.println("Por favor, digite o número da Conta !");
        Numero = sc.nextInt();

        System.out.println("Por favor, digite o número da Agência !");
        Agencia = sc.next();

        System.out.println("Por favor, digite seu saldo !");
        Saldo = sc.nextDouble();

        sc.close();
    }

    public void ImprimirConta() {
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: "
                + Agencia + ", conta: " + Numero + " e seu saldo de: " + Saldo + " já está disponível para saque!");
    }

}

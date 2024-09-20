import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner  myAccount= new Scanner(System.in);
        int numConta;

        Scanner  myAgency= new Scanner(System.in);
        String numAgencia;

        Scanner  clientName= new Scanner(System.in);
        String name;

        Scanner  balance= new Scanner(System.in);
        double saldo;


        System.out.println("Por favor digite o número da agência! ");
        numAgencia = myAgency.nextLine();

        System.out.println("Digite o numero da conta! ");
        numConta = Integer.parseInt(myAccount.nextLine());

        System.out.println("Digite o nome do Cliente! ");
        name = clientName.nextLine();

        System.out.print("Digite o saldo do Cliente: ");
        saldo = Integer.parseInt(balance.nextLine());


        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é "+ numAgencia + ", conta " +
                "" +  numConta + " e seu saldo "+ saldo + " Já está disponivel para saque.");

    }
}
import java.util.Scanner;

public class Pessoa {

    private double saldo ;
    private double valor ;
    String espera ; 

    Scanner leia = new Scanner(System.in);

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void VerificarSaldo(){
        System.out.println("seu saldo é R$ " + saldo);
    }

    public void SacarDinheiro(){
        System.out.println("Digite o valor que deve ser sacado:");
        valor = leia.nextDouble();
        saldo = saldo - valor;
        valor = 0;
    }

    public void DepositarDinheiro(){
        System.out.println("Digite o valor que você quer depositar:");
        valor = leia.nextDouble();
        saldo = saldo + valor;
        valor = 0; 
    }
}

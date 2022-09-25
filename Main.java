import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);
        Sistema sistema = new Sistema();
        Pessoa pessoa = new Pessoa();

        do{
            System.out.println("Bem vindo ao Banco Fast");
            System.out.println("Digite a opção do serviço que queria utilizar");
            System.out.println("1-Verificar saldo.");
            System.out.println("2-Sacar dinheiro");
            System.out.println("3-Depositar Dinheiro");
            System.out.println("4-Sair");
            
            sistema.setOpcao(leia.nextInt());

            switch (sistema.getOpcao()){
                case 1:
                    pessoa.VerificarSaldo();
                    break;
                case 2:
                    pessoa.SacarDinheiro();
                    break;
                case 3:
                    pessoa.DepositarDinheiro();
                    break;
                case 4:
                    break;
                default:
            }
        } while(sistema.getOpcao() != 4);
        leia.close();
    }
}
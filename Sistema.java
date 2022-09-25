import java.util.Scanner;
public class Sistema {
    private int opcao;

    Scanner leia = new Scanner(System.in);

    public Sistema(){
    }
    
    public int getOpcao() {
        return opcao;
    }
    public void setOpcao(int opcao) {
        do{
        if(opcao > 0 && opcao < 5){
            this.opcao = opcao;
            break;
        }else{
            System.out.println("Opção inválida, digite o código novamente");
            opcao = leia.nextInt();
        }
        } while (opcao > 4 || opcao < 0);
        this.opcao = opcao;
    }
}

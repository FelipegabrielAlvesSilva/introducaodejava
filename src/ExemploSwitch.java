import javax.naming.NamingEnumeration;
import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite A para Cadastrar, B para Consultar, C para Sair");
        String opcao = entrada.next();
        switch(opcao) {

            case "A":
                System.out.println("Cadastro realizado com sucesso");
                break;
            case "B":
                System.out.println("Consulta realizada com sucesso");
                break;
            case "C":
                System.out.println("O programa será encerrado");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}

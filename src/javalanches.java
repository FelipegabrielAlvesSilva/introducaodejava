import java.util.Scanner;

public class javalanches {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o código do produto");
        System.out.println("101 - Cachorro-quente");
        System.out.println("102 - X-Burger ");
        System.out.println("103 - X-Salada");

        String mensagem = "";
        String opcao = entrada.next();
        switch (opcao) {

            case "101":
                System.out.println("Cachorro-quente R$ 10,00");
                float valor1 = 10.00f;
                System.out.println("Qual é a sua idade?");
                int idade = entrada.nextInt();

                if (idade >=0 && idade <12) {
                    double valor1d = valor1 * 0.5;
                    System.out.println("Valor a ser pago R$ "+valor1d );
                }
                else if (idade >= 12 && idade <=60 ) {
                    System.out.println("Valor a ser pago R$ "+valor1 );
                }
                else if (idade >= 60) {
                    double valor1d = valor1 * 0.7;
                    System.out.println("Valor a ser pago R$ "+valor1d );
                }
                else mensagem= "idade invalida";
                break;

            case "102":
                System.out.println("X-Burguer 15,00");
                float valor2 = 15.00f;
                System.out.println("Qual é a sua idade?");
                int idade2 = entrada.nextInt();

                if (idade2 >=0 && idade2 <12) {
                    double valor1d = valor2 * 0.5;
                    System.out.println("Valor a ser pago R$ "+valor1d );
                }
                else if (idade2 >= 12 && idade2 <=60 ) {
                    System.out.println("Valor a ser pago R$ "+valor2 );
                }
                else if (idade2 >= 60) {
                    double valor2d = valor2 * 0.7;
                    System.out.println("Valor a ser pago R$ "+ valor2d);
                }
                else mensagem= "idade invalida";
                break;

            case "103":
                System.out.println("X-Salada 12,00");
                float valor3 = 12.00f;
                System.out.println("Qual é a sua idade?");
                int idade3 = entrada.nextInt();

                if (idade3 >=0 && idade3 <12) {
                    double valor1d = valor3 * 0.5;
                    System.out.println("Valor a ser pago R$ "+valor1d );
                }
                else if (idade3 >= 12 && idade3 <=60 ) {
                    System.out.println("Valor a ser pago R$ "+valor3 );
                }
                else if (idade3 >= 60) {
                    double valor3d = valor3 * 0.7;
                    System.out.println("Valor a ser pago R$ "+ valor3d);
                }
                else mensagem= "idade invalida";
                break;

            default:
                System.out.println("Código inválido");
        }






    }
}

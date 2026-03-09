import java.util.Scanner;

public class cauculadoraIMC {
    public static void main (String args []){
        //solicitar entrada de dados
        //Scanner entrada = new Scanner(System.in); indica a entrada dos dados
        Scanner entrada = new Scanner(System.in);
        //variavel do tipo String
        System.out.println("informe seu nome");
        String nome = entrada.next();
        // variavel do tipo int
        System.out.println("Informe sua idade");
        int idade = entrada.nextInt();
        //variavel tipo float
        System.out.println("Informe seu peso");
        float peso = entrada.nextFloat();
        System.out.println("Informe sua altura");
        float altura = entrada.nextFloat();
        float imc = peso / (altura * altura);
        System.out.println( nome + " seu IMC é igual a " +imc);
        String mensagem = "";
        if(imc >=0 && imc <= 18.5f){
            mensagem = "Abaixo do peso ideal";
        }
        else if (imc >= 18.5f && imc <= 24.9f) {
            mensagem = "Peso ideal";
        }
        else if (imc >= 25 && imc <= 29.9f) {
            mensagem = "Você está com excesso de peso";
        }
        else if (imc >= 30 && imc <= 34.9f) {
            mensagem = "Obesidade de classe 1";
        }
        else if (imc >= 35 && imc <=39.9f) {
            mensagem = "Obesidade de classe 2";
        }
        else if (imc >= 40) {
            mensagem = "Obesidade de classe 3";

        }
        else
            mensagem = " Valores inválidos";

        System.out.println(nome + " , sua classificação é de " + mensagem);



    }

}


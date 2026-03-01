import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva o seu nome");
        String nome = entrada.next();
        System.out.println("Escreva, em kWh, o valor do medidor do mês passado");
        float medp = entrada.nextFloat();
        System.out.println("Escreva, em kWh, o valor do medidor deste mês");
        float meda = entrada.nextFloat();

        String bandeira = "";
        String mensagem = "";
        float consumo = meda - medp;
        float valorb = consumo * 0.60f;

        if (consumo > 0 && consumo <= 100) {
            bandeira = " verde";
            System.out.println(nome + ", seu consumo total foi de " + consumo + ", com bandeira " + bandeira + ". Valor total a pagar é de R$" + valorb);
        } else if (consumo >= 101 && consumo <= 200) {
            bandeira = "amarela";
            float acrescimo = 2.00f;
            float valort = valorb + acrescimo;
            System.out.println(nome + ", seu consumo total foi de " + consumo + ", com bandeira " + bandeira + ". O valor de consumo a pagar é de R$" + valorb +
                    "com acrescimo de R$" + acrescimo + ". Totalizando" + valort);
        } else if (consumo >= 201 && consumo <= 300) {
            bandeira = "vermelha";
            float acrescimo = 5.00f;
            float valort = valorb + acrescimo;
            System.out.println(nome + ", seu consumo total foi de " + consumo + ", com bandeira " + bandeira + ". O valor de consumo a pagar é de R$" + valorb +
                    "com acrescimo de R$" + acrescimo + ". Totalizando" + valort);
        } else if (consumo >= 301) {
            bandeira = "preta";
            float acrescimo = 10.00f;
            float valort = valorb + acrescimo;
            System.out.println(nome + ", seu consumo total foi de " + consumo + " , com bandeira " + bandeira + ". O valor de consumo a pagar é de R$" + valorb +
                    "com acrescimo de R$" + acrescimo + ". Totalizando" + valort);
        } else mensagem = "valores invalidos";
    }
}
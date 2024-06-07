import java.util.Date;

public class Operadores {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao Operador de atribuição");

        String nome = " Marcos Paulo";

        int idade = 22;

        double peso = 68.5;

        char sexo = 'M';

        boolean doadorOrgao = false;

        Date dataNascimento = new Date();

        System.out.println(
                "Nome:" + nome + "\n" + "Idade:" + idade + "\n" + "Peso:" + peso + "\n" + "Sexo:" + sexo + "\n"
                        + "Doador de Orgao:"
                        + doadorOrgao + "\n" + "Data de Nascimento:" + dataNascimento);

        // operadores aritméticos

        double soma = 10.5 + 15.7;

        System.out.println("Soma:" + soma);

        int subtracao = 113 - 25;

        System.out.println("Subtração:" + subtracao);

        int multiplicacao = 20 * 7;

        System.out.println("Multiplicacao:" + multiplicacao);

        int divisao = 15 / 3;

        System.out.println("Divisao:" + divisao);

        int modulo = 18 % 3;

        System.out.println("Resto:" + modulo);

        double resultado = (10 * 7) + (20 / 4);

        System.out.println("Resultado:" + resultado);

        // operadores unarios

        int numero = 5;

        numero = -numero;

        System.out.println("Negação da variavel:" + numero);

        numero = numero * -1;

        System.out.println("Positivação da variavel:" + numero);

        // incrementos

        int contador = 6;

        contador++;

        System.out.println("Contador:" + contador);

        // incrementos imprimi antes e depois somar

        int contadorExemplo = 8;

        System.out.println("Contador exemplo:" + contadorExemplo++);

        System.out.println("Contador exemplo somar depois:" + contadorExemplo);

        // incrementos somar antes e mostrar o resultado depois

        int contadorExemploSomarAntes = 8;

        System.out.println("Contador exemplo:" + ++contadorExemploSomarAntes);

        // deremento
        int contadorExemploDecrementos = 8;

        System.out.println("Contador exemplo:" + --contadorExemploDecrementos);

        // negando uma variavel
        boolean variavel = true;

        variavel = !variavel;

        System.out.println("Passou a ser :" + variavel);
    }
}

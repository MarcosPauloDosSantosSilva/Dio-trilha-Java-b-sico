public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Ola seja bem Vindo ao curso Java da Dio.");

        String meuNome = " Marcos Paulo dos Santos Silva";

        System.out.println("Nome:" + meuNome);

        double salarioMinimo = 2500;

        System.out.println("Salario:" + salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;

        // cast

        short numeroCurto2 = (short) numeroNormal;

        System.out.println("Meu codigo:" + numeroCurto2);

        // alteraçoes de valores em variveis

        int numero = 1;

        numero = 10;

        System.out.println("Meus Pontos:" + numero);

        // definindo uma variavel constante valor não pode ser mudado

        final double VALOR_DE_PI = 3.14;

        System.out.println("Valor de PI: " + VALOR_DE_PI);
    }
}

public class calculo {
    public static void main(String[] args) {
        int nota1 = 2;
        int nota2 = 8;
        int nota3 = 7;
        int nota4 = 6;

        int peso1 = 6;
        int peso2 = 6;
        int peso3 = 6;
        int peso4 = 6;

        double media = nota1 * peso1 +nota2*peso2+ nota3 * peso3+ nota4 * peso4;
        double pesoSoma = peso1 + peso2 + peso3 + peso4;
        double mediafinal= media/pesoSoma;
        System.out.println(mediafinal);


    }


}

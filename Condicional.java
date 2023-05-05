public class Condicional {
    public static void main(String[] args) {

        int ano = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (ano >= 2022) {
            System.out.println("Lançamento que os usuarios estão curtindo!");
        } else {
            System.out.println("Filmes retro que estão valendo a pena assistir!");
        }

        if (incluidoNoPlano && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locaçao");
        }

    }
}
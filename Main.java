// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");


        int ano = 2022;
        System.out.println("Ano de lançamento: " + ano);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (3 + 6 + 9) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
        Filme Top Gun: Maverick
        filme muito aclamado pela midia
        Data de lançamento
        """ + ano;
        System.out.println(sinopse);

        int estrelas = (int) media / 2;
        System.out.println("Este filme tem " + estrelas + " estrelas");






    }
}
import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();

        System.out.println("Qual a data de lançamento? ");
        int anoDeLancamento = leitura.nextInt();

        System.out.println("Qual sua avaliação para o filme " + filme + "?");
        double avaliacao = leitura.nextDouble();

        System.out.println( "Seu filme favorito é " + filme);
        System.out.println("Seu ano de lançamento foi em " + anoDeLancamento);
        System.out.println("E a avaliação de acordo com você é de " + avaliacao);
    }

}

import java.util.Scanner;
public class Loop {

    public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);

            System.out.println("Digite seu filme favorito");
            String filme = leitura.nextLine();

            System.out.println("Qual a data de lançamento? ");
            int anoDeLancamento = leitura.nextInt();

        double nota = 0;
        double media = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("Qual sua avaliação para o filme " + filme + "?");
            nota = leitura.nextDouble();
            media += nota;  // media = media + nota

        }

        System.out.println("Média de avaliações é " + media / 3);
    }
}

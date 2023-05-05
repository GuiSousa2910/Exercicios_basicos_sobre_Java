import java.util.Scanner;

        public class OutraAlternativaParaLoopp {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);

            System.out.println("Digite seu filme favorito");
            String filme = leitura.nextLine();

            System.out.println("Qual a data de lançamento? ");
            int anoDeLancamento = leitura.nextInt();

            double nota = 0;
            double media = 0;
            int totalDeNotas = 0;

            while (nota != -1) {

                System.out.println("Diga sua avaliaçao para o filme ou aperte -1 para encerrar");
                nota = leitura.nextDouble();
            if (nota != -1) {
                media += nota;  // media = media + nota
                totalDeNotas++;
                }
            }

            System.out.println("Média de avaliações é " + media / totalDeNotas);
        }
    }



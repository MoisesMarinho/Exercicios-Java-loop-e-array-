import java.util.Scanner;

public class exercicio3MaiorEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;

        int count = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            count = count + 1;
        } while(count < 5);
    }
}

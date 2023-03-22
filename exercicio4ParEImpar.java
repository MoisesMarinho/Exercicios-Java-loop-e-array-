import java.util.Scanner;

public class exercicio4ParEImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, num, pares = 0, impares = 0;

        System.out.print("Digite a quantidade de números: ");
        n = scan.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print("Digite o " + i + "º número: ");
            num = scan.nextInt();

            if(num % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }

}

import java.util.Scanner;

public class exercicio1ArrayOrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {4, -9, 5, 3, -2, 8};

        int count = 0;
        while (count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }

        for(int i = (vetor.length - 1); i >= 0; i --){
            System.out.println(vetor[i] + " ");
        }
    }
}

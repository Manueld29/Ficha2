import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        int x,y;
        float z=0;

        Scanner xx = new Scanner(System.in);
        System.out.println("Qual é o numero de elementos do vetor?");
        x = xx.nextInt();
        int[]vetor=new int[x];

        for (y=0;y<x;y++)
        {
            vetor[y]=y+1;
        }
        for (y=0; y<x; y++)
        {
            z= z + vetor[y];
        }
        z=z/x;
        System.out.printf("A media é %.1f \n",z);
    }
}
import java.util.Scanner;
public class EX2 {
    public static void main(String[] args) {
        int x, y, n, m,m2;
        m = 0;
        m2=0;
        Scanner nn = new Scanner(System.in);
        System.out.println("Numero de elementos do vetor?");
        n = nn.nextInt();
        int[]vetor=new int[n];
        for (x=0;x<n;x++){
            vetor[x]=x+1;
        }

        for(x=0;x<n;x++){
            for(y=0;y<n;y++){
                if (vetor[x] >= vetor[y]) {
                    m = x;

                }
            }
        }
        for(x=0;x<n;x++){
            for(y=0;y<n;y++){
                if (vetor[x] >= vetor[y] && vetor[x] < vetor[m]) {
                    m2 = x;

                }
            }
        }
        System.out.println("O maior numero é = "+vetor[m]);
        System.out.println("O segundo maior numero é = "+vetor[m2]);
    }
}


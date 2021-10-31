import java.util.Arrays;
import java.util.Scanner;
public class EX4 {
    public static void main(String[] args) {
        int x, y,x1,y1,linha,coluna,a,b,c,m;
        a=1;
        m=0;
        Scanner ll = new Scanner(System.in);
        System.out.println("Numero de linhas da matriz?");
        linha = ll.nextInt();
        Scanner cc = new Scanner(System.in);
        System.out.println("Numero de colunas da matriz?");
        coluna = cc.nextInt();

        b=linha+coluna;
        int[][]vetor=new int[linha][coluna];
        System.out.println("Matriz com "+linha+" linhas "+coluna+" colunas:");
        for (x=0;x<linha;x++){
            for(y=0;y<coluna;y++){
                vetor[x][y]=a;
                System.out.printf(" %d ",vetor[x][y]);
                a++;
            }
            System.out.println();

        }

        for(x=0;x<linha;x++){
            for(y=0;y<coluna;y++){
                c=0;
                for(x1=0;x1<linha;x1++) {
                    for (y1 = 0; y1 < coluna; y1++) {
                        if (vetor[x][y] > vetor[x1][y1]) {
                            c++;
                            if (c == b - 1){
                                m = vetor[x][y];
                            }
                        }
                    }
                }
            }
        }
        System.out.println("O maior elemento da matriz é: " + m);
    }
}

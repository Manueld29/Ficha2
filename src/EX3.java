import java.util.Arrays;

public class EX3 {
    public static void main(String[] args) {

        String[] nomes = new String[6];
        nomes[0] = "João";
        nomes[1] = "Teresa";
        nomes[2] = "Pedro";
        nomes[3] = "Maria";
        nomes[4] = "Paulo";
        nomes[5] = "Beatriz";

        System.out.printf("Ordem inicial : %s\n",Arrays.toString(nomes));
        Arrays.sort(nomes);
        System.out.printf("Ordem alfabetica : %s\n",Arrays.toString(nomes));

    }
}





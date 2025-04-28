package logica.logica04;
import java.util.Scanner;

public class Experimentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        
// R = ratos, S = sapos, C = coelhos.

        int R = 0;
        int S = 0;
        int C = 0;
        
// X = quantidade, T = tipos/raça.

        for(int i = 1; i <= N ; i++){
            int X = scanner.nextInt();
            scanner.nextLine();            
            String T = scanner.nextLine();
            if (T.equals("R")) {
                R += X;
            }else if (T.equals("S")) {
                S += X;
            }else if (T.equals("C")) {
                C += X;
            }
        }
        int total = R+S+C;

        double porcetagem_s = ((double)S/total)*100;
        double porcetagem_c = ((double)C/total)*100;
        double porcetagem_r = ((double)R/total)*100;


        System.out.println("Total: "+total+" cobaias");
        System.out.println("Total de coelhos: "+C);
        System.out.println("Total de ratos: "+R);
        System.out.println("Total de sapos: "+S);

        System.out.printf("Percentual de coelhos: %.2f %%\n", porcetagem_c);
        System.out.printf("Percentual de ratos: %.2f %%\n", porcetagem_r);
        System.out.printf("Percentual de sapos: %.2f %%\n", porcetagem_s);
        

        scanner.close();
    }
}

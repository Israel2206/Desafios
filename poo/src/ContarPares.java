// Conte quantos números pares existem entre 1 e 100.

public class ContarPares {
    public static void main(String[] args) {
        int numeros = 0;
        for(int i = 1; i<=100;i++){
            if (i %2==0) {
                numeros ++;
            }
        }
        System.out.println("Existem "+numeros+" números pares de 1 a 100");

    }
}

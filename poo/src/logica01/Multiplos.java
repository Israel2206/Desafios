package logica01;
// Mostre todos os múltiplos de 3 e 5 entre 1 e 100.
public class Multiplos {
    public static void main(String[] args) {
        int numero = 1;

        while (numero <=100) {
            if (numero %3==0) {
                System.out.println(numero);
            }else if (numero%5==0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
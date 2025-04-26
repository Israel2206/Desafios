package logica05.matriz;
public class SomaElemetosMatriz {
    public static void main(String[] args) {
        int[][] numeros = {
            {1, 2},
            {3, 4}
        };

        int soma = 0;

        for(int l = 0 ; l < numeros.length ; l++){
            for(int c = 0; c <numeros[l].length; c++){
                soma += numeros[l][c];
            }
        }
        System.out.println("A soma dos elementos é: " + soma);
    }
}
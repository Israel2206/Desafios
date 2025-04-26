package logica05.matriz;
public class Matriz {
    public static void main(String[] args) {
        int [][] numeros = {{1,2,3},{40,50,60,},{700,800,900}};

        for(int l = 0; l < numeros.length; l++){
            for(int c = 0; c < numeros[l].length ; c++){
                System.out.printf("[%d]",numeros[l][c]);
            }
            System.out.printf("%n");
        }
    }
}

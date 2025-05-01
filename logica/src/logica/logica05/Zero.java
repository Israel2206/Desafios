package logica.logica05;

import java.util.Scanner;
import java.util.ArrayList;

public class Zero{
    public static void main(String[] args){
		ArrayList<String> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		int soma = 0;

		int chefe = scanner.nextInt();
		scanner.nextLine();

		for(int i = 1; i <= chefe; i++){
			String numero = scanner.nextLine();

			if(numero.equals("0")){
				numeros.remove(numeros.size() -1);
			}else{
				numeros.add(numero);
			}
		}
		for(int i = 0; i < numeros.size() ; i++){
			int num = Integer.parseInt(numeros.get(i));
			soma+=num;
		}
		System.out.println(soma);
		scanner.close();
    }
}

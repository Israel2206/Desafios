package poo.testes.heranca.veiculo;
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.ano = 2020;
        carro.marca = "Toyota";
        carro.modelo = "Corolla";

        System.out.println("Nome: "+carro.marca+", Ano: "+carro.ano+", Modelo: "+carro.modelo);
        
    }
}

package instaciamento.veiculo;
public class Veiculo {
    String marca;
    int ano;

    public Veiculo(String marca, int ano){
        this.ano = ano;
        this.marca = marca;
    }
    void exibirVeiculo(){
        System.out.println("Marca: "+marca+"\nAno: "+ano);
        System.out.println();
    }
}

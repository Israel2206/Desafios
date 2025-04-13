package instaciamento.veiculo;
public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Toyota", 2017);
        Veiculo veiculo2 = new Veiculo("Fiat", 2023);
        Veiculo veiculo3 = new Veiculo("Volkswagen", 2015);

        veiculo1.exibirVeiculo();
        veiculo2.exibirVeiculo();
        veiculo3.exibirVeiculo();
    }
}

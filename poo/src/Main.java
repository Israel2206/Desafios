public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setVelocidade(80);
        System.out.println("Velocidade: "+carro.getVelocidade()+" km/h");

        carro.acelerar(20);
        System.out.println("Velocidade: "+carro.getVelocidade()+" km/h");

        carro.frear(40);
        System.out.println("Velocidade: "+carro.getVelocidade()+" km/h");

    }
}

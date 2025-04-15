package encapsulamento.carro;
public class Carro  {
    private int velocidade;

    public int getVelocidade(){
        return velocidade;
    }
    public void setVelocidade(int velocidade){
        if (velocidade<0) {
            System.out.println("Velocidade inválida.");
        }else{
            this.velocidade = velocidade;
        }
    }
    public void acelerar(int incremento){
        velocidade += incremento;
    }
    public void frear(int reducao){
        velocidade -= reducao;
    }
}
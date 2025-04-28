package poo.testes.encapsulamento.carro;
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
        if (incremento < 0) {
            System.out.println("Incremento inválido.");
        } else {
            velocidade += incremento;
        }
    }
    
    public void frear(int reducao){
        if (reducao < 0) {
            System.out.println("Redução inválida.");
        } else if (velocidade - reducao < 0) {
            velocidade = 0;
        } else {
            velocidade -= reducao;
        }
    }
    
}
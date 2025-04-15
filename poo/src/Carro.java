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
}
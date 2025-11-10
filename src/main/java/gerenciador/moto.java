package gerenciador;
public class moto extends veiculo{
    private int cilindrada;
    
    // Get e Setter
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    
    @Override
    public String informacoesVeiculo() {
        return "MOTO -> Marca: " + marca +
               " | Modelo: " + modelo +
               " | Ano: " + getAno() +
               " | Cilindrada: " + cilindrada + "cc";
    }

}
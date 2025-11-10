package gerenciador;
public class carro extends veiculo{
    public int numeroPortas;
    
    @Override
    public String informacoesVeiculo() {
        return "CARRO -> Marca: " + marca +
               " | Modelo: " + modelo +
               " | Ano: " + getAno() +
               " | Portas: " + numeroPortas;
    }
}

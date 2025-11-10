package gerenciador;
public abstract class veiculo {
    public String marca;
    public String modelo;
    private int ano;

    // Método
    public abstract String informacoesVeiculo();

    // Get e Setter
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
}

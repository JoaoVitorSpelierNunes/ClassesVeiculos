package gerenciador;
public class gerenciador {
    public static void main(String[] args) {
        // Cria e configura um carro
        carro c = new carro();
        c.marca = "Mazda";
        c.modelo = "Furai";
        c.setAno(2007);
        c.numeroPortas = 2;
        
        
       // Cria e configura uma moto 
        moto m = new moto();
        m.marca = "Ducati";
        m.modelo = "Streetfighter V2";
        m.setAno(2021);
        m.setCilindrada(890);
        
        // Exibe as informações
        System.out.println(c.informacoesVeiculo());
        System.out.println(m.informacoesVeiculo());
    }
    
}
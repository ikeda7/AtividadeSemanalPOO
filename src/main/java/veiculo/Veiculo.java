package veiculo;

import java.util.ArrayList;

public class Veiculo {
    
    private ArrayList<Veiculo> veiculos;
    
    public Veiculo(){
        this.veiculos = new ArrayList();
    }
    
    private String nome;
    private String montadora;
    private int anoFabricacao;
    private int anoModelo;
    private String cor;
    private String placa;
    private double valorIPVA;
    private boolean IPVAPago;
    
    Veiculo(String nome, String montadora, int anoFabricacao, int anoModelo, String cor, String placa, float valorIPVA, boolean IPVAPago){
        this.nome = nome;
        this.montadora = montadora;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.cor = cor;
        this.placa = placa;
        this.valorIPVA = valorIPVA;
        this.IPVAPago = IPVAPago;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValorIPVA() {
        return valorIPVA;
    }

    public void setValorIPVA(float valorIPVA) {
        this.valorIPVA = valorIPVA;
    }

    public boolean isIPVAPago() {
        return IPVAPago;
    }

    public void setIPVAPago(boolean IPVAPago) {
        this.IPVAPago = IPVAPago;
    }
    
    public boolean verificarStatusIPVA(){
        if(IPVAPago == true){
            System.out.println("IPVA esta pago!");
            return true;
        }else{
            System.out.println("IPVA nao esta pago!");
            return false;
        }
    }
    
    public void pagarIPVA(){
        if(IPVAPago == true){
            System.out.println("O IPVA ja esta pago!");
        }else{
            this.IPVAPago = true;
            System.out.println("O IPVA foi pago com sucesso!");
        }
    }
    
    public boolean atualizarValorIPVA(double reajuste){
        if(IPVAPago == false){
            valorIPVA = valorIPVA + (valorIPVA*(reajuste/100));
            System.out.println("O valor do IPVA foi ajustado!");
            return true;
        }else{
            System.out.println("O IPVA ja esta pago!");
            return false;
        }
        
    }
    
    public void imprimir(){
        System.out.println("\nNome: " + this.nome +
                           "\nMontadora: " + this.montadora +
                           "\nAno de fabricacao: " + this.anoFabricacao +
                           "\nAno do modelo: " + this.anoModelo +
                           "\nCor: " + this.cor +
                           "\nPlaca: " + this.placa +
                           "\nValor do IPVA: " + this.valorIPVA +
                           "\nIPVA esta pago? " + this.IPVAPago);
    }
    
    public void addVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }
    
    public void exibirVeiculos(){
        for(Veiculo veiculoAux : this.veiculos){
            veiculoAux.imprimir();
        }
    }
}

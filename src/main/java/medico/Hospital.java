package medico;

import java.util.ArrayList;

public class Hospital {
    
    private String nome;
    private String endereco;
    private ArrayList<Medico> medicosContratados;

    Hospital(String nome, String endereco, ArrayList<Medico> MedicosContratados) {
        this.nome = nome;
        this.endereco = endereco;
        this.medicosContratados = MedicosContratados;
    }
    
    public void addMedico(Medico medico){
        this.medicosContratados.add(medico);
        System.out.println("Medico adicionado!");
    }
    
    public void delMedico(String nome){
        boolean medicoEncontrado = false;
        for(int i = 0; i<medicosContratados.size(); i++){
            if(medicosContratados.get(i).getNome().equalsIgnoreCase(nome)){
                medicoEncontrado = true;
                this.medicosContratados.remove(i);
            }
        }
        if(medicoEncontrado == true){
            System.out.println("Medico removido.");
        }else{
            System.out.println("Medico nao encontrado.");
        }
    }
    
    public void exibirMedicoAnoContrato(int ano){
        System.out.println("\nCONTRATADOS A PARTIR DE " + ano);
        for(int i = 0; i<medicosContratados.size(); i++){
            if(medicosContratados.get(i).getDataContratacao().getYear() >= ano){
                System.out.println(medicosContratados.get(i).getNome());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Medico> getMedicosContratados() {
        return medicosContratados;
    }

    public void setMedicosContratados(ArrayList<Medico> MedicosContratados) {
        this.medicosContratados = MedicosContratados;
    }
    
    public void imprimir(){
        System.out.println("Medicos contratados:");
        for(Medico m : medicosContratados)
            m.imprimir();
    }
     
}

package medico;

import java.time.LocalDate;

public class Medico {

    private String crm;
    private String nome;
    private String esp;
    private String email;
    private LocalDate dataContratacao;
    private double salario;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
      
    Medico(String crm, String nome, String esp, String email, LocalDate dataContratacao, double salario){
        this.crm = crm;
        this.nome = nome;
        this.esp = esp;
        this.email = email;
        this.dataContratacao = dataContratacao;
        this.salario = salario;
    }
    
    public void imprimir(){
        System.out.println("\nCRM: " + this.crm +
                           "\nNome: " + this.nome +
                           "\nEspecialidade: " + this.esp +
                           "\nEmail: " + this.email +
                           "\nData de Contratacao: " + this.dataContratacao +
                           "\nSalario: " + this.salario);
    }
}

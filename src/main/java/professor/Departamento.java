package professor;

import java.util.ArrayList;

public class Departamento {
    
    private String nome;
    private String telefone;
    private String email;
    private ArrayList<Professor> professores;

    Departamento(String nome, String telefone, String email, ArrayList<Professor> professores) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> Professores) {
        this.professores = Professores;
    }
    
    public void addProfessor(Professor professor){
        this.professores.add(professor);
        System.out.println("Professor adicionado!");
    }

    public boolean buscaProfessor(int matricula){
        boolean professorEncontrado = false;
        for(int i = 0; i<professores.size(); i++){
            if(professores.get(i).getMatricula() == matricula){
                professorEncontrado = true;
            }
        }
        if(professorEncontrado == true){
            System.out.println("Professor encontrado!");
        }else{
            System.out.println("Professor nao encontrado.");
        }
        return professorEncontrado;
    }
    
    public void delProfessor(int matricula){
        boolean professorEncontrado = false;
        for(int i = 0; i<professores.size(); i++){
            if(professores.get(i).getMatricula() == matricula){
                professorEncontrado = true;
                this.professores.remove(i);
            }
        }
        if(professorEncontrado == true){
            System.out.println("Professor removido.");
        }else{
            System.out.println("Professor nao encontrado.");
        }
    }

    public void imprimir(){
        for(Professor p : professores){
            p.imprimir();
        }
    }
}


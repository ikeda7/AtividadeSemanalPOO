package pessoa;

import java.util.ArrayList;

public class Agenda {
    
    private ArrayList<Pessoa> pessoas;
    
    public Agenda(){
        this.pessoas = new ArrayList();
    }
    
    public void addContato(Pessoa pessoa){
        this.pessoas.add(pessoa);
        System.out.println("Contato adicionado!");
    }
    
    public void delContato(String nome){
        boolean contatoEncontrado = false;
        for(int i = 0; i<pessoas.size(); i++){
            if(pessoas.get(i).getNome().equalsIgnoreCase(nome)){
                contatoEncontrado = true;
                this.pessoas.remove(i);
            }
        }
        if(contatoEncontrado == true){
                System.out.println("Contato removido.");
            }else{
                System.out.println("Contato nao encontrado");
            }
    }
    
    public boolean buscaContato(String nome){
        boolean contatoEncontrado = false;
        for(int i = 0; i<pessoas.size(); i++){
            if(pessoas.get(i).getNome().equalsIgnoreCase(nome)){
                contatoEncontrado = true;
            }
        }
        if(contatoEncontrado == true){
                System.out.println("Contato encontrado!");
            }else{
                System.out.println("Contato nao encontrado.");
            }
        return contatoEncontrado;
    }
    
    public void imprimir(){
        System.out.println("CONTATOS: ");
        for(Pessoa p : pessoas){
            p.imprimir();
        }
    }
    
}

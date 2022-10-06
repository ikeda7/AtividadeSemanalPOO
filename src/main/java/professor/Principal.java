package professor;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        Professor p1 = new Professor(123456, "Lucas", "Mestre", "996895151", "l.ikeda@unesp.br", 5000.00f);
        Professor p2 = new Professor(987654, "Bruno", "Doutor", "998765432", "bruno.s.lima@unesp.br", 10000.00f);
    
        ArrayList<Professor> professores = new ArrayList();
    
        Departamento departamento = new Departamento("Departamento de Computação", "32295388", "computacao@unesp.br", professores);
    
        departamento.addProfessor(p1);
        departamento.addProfessor(p2);
        departamento.buscaProfessor(123456);
        departamento.delProfessor(987654);
        departamento.addProfessor(p2);
        departamento.imprimir();
    }
    
}

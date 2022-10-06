package pessoa;

public class Principal {
    public static void main(String[] args) {
     
        Pessoa p1 = new Pessoa("Lucas", "996895151", "lucasvikeda@gmail.com", "Rua Castro Alves, 992");
        Pessoa p2 = new Pessoa("Andrea","+55 (18) 997158398", "deikeda@hotmail.com", "Rua Herminio Braghin, 176");
        
        Agenda agenda = new Agenda();
        
        agenda.addContato(p1);
        agenda.addContato(p2);
        agenda.buscaContato("lucas");
        agenda.delContato("andrea");
        agenda.addContato(p2);
        agenda.imprimir();
    }
}

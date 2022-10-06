package medico;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        
        Medico m1 = new Medico("123.456", "Lucas Ikeda", "Neurologista", "lucasvikeda@hotmail.com", LocalDate.of(2018, 7, 16), 10000.00f);
        Medico m2 = new Medico("456.789", "Matheus Nazaro", "Ginecologista", "matheus.nazaro@unesp.br", LocalDate.of(2016, 12, 7), 15000.00f);
        Medico m3 = new Medico("147.258", "Luiz Serafim", "Urologista", "henrique.serafim@unesp.br", LocalDate.of(2016, 7, 13), 20000.00f);
        Medico m4 = new Medico("230.803", "Rebeca Sayuri", "Ginegologista Obstetra", "tadayukirebeca@gmail.com", LocalDate.of(2018, 11, 4), 50000.00f);
        
        ArrayList<Medico> medicosContratados = new ArrayList();
        
        Hospital hospital = new Hospital("Hospital Israelista Albert Einstein", "Av. Albert Einstein, 627/701", medicosContratados);
        
        hospital.addMedico(m1);
        hospital.addMedico(m2);
        hospital.addMedico(m3);
        hospital.addMedico(m4);
        hospital.delMedico("matheus nazaro");
        hospital.addMedico(m2);
        hospital.exibirMedicoAnoContrato(2018);
        hospital.imprimir();
    }
}

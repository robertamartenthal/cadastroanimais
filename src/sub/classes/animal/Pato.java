package sub.classes.animal;

import java.util.Date;

import cadastro.animal.program.Animal;
import enumtipo.animal.TipoAnimal;

public class Pato extends Animal {
 
    public Pato() {
        
    }
    
    public Pato(String nome, Date anoDeNascimento, boolean precisaVacinar, Double peso, TipoAnimal tipo) {
        super(nome, anoDeNascimento, precisaVacinar, peso, TipoAnimal.PATO);
    }

    
    
    
}

package sub.classes.animal;

import java.util.Date;

import cadastro.animal.program.Animal;
import enumtipo.animal.TipoAnimal;

public class Gato extends Animal {

    public Gato() {
        
    }
    
    public Gato(String nome, Date anoDeNascimento, boolean precisaVacinar, Double peso, TipoAnimal tipo) {
        super(nome, anoDeNascimento, precisaVacinar, peso, TipoAnimal.GATO);
    }

    
}

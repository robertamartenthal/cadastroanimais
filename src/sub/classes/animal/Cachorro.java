package sub.classes.animal;

import java.util.Date;

import cadastro.animal.program.Animal;
import enumtipo.animal.TipoAnimal;

public class Cachorro extends Animal {
    
    public Cachorro() {
        
    }


    public Cachorro(String nome, Date anoDeNascimento, boolean precisaVacinar, Double peso, TipoAnimal tipo) {
        super(nome, anoDeNascimento, precisaVacinar, peso, TipoAnimal.CACHORRO);
  
    }

   
    
}

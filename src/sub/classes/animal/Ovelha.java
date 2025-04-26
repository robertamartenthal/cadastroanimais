package sub.classes.animal;

import java.util.Date;

import cadastro.animal.program.Animal;
import enumtipo.animal.TipoAnimal;

public class Ovelha extends Animal {

  

    public Ovelha(String nome, Date anoDeNascimento, boolean precisaVacinar, Double peso, TipoAnimal tipos) {
        super(nome, anoDeNascimento, precisaVacinar, peso, TipoAnimal.OVELHA);
    }

   

            
        }
    

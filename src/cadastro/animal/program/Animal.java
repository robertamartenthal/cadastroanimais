package cadastro.animal.program;

import java.text.SimpleDateFormat;
import java.util.Date;

import enumtipo.animal.TipoAnimal;

public class Animal {

    private String nome;
    private Date anoDeNascimento;
    private boolean precisaVacinar;
    private Double peso;
    private TipoAnimal tipo;
    
    SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");

    public Animal() {

    }

    public Animal(String nome, Date anoDeNascimento, boolean precisaVacinar, Double peso, TipoAnimal tipo) {
       
        this.nome = nome;
        this.anoDeNascimento = anoDeNascimento;
        this.precisaVacinar = precisaVacinar;
        this.peso = peso;
        this.tipo = tipo;

    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getAnodenascimento() {
        return anoDeNascimento;
    }

    public void setAnodenascimento(Date anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public boolean isPrecisavacinar() {
        return precisaVacinar;
    }

    public void setPrecisavacinar(boolean precisaVacinar) {
        this.precisaVacinar = precisaVacinar;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public String som() {
        return tipo.getSom();

    }
    
    
    

    

}

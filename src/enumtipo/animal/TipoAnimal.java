package enumtipo.animal;

public enum TipoAnimal {
    OVELHA("1", "meeeé"),
    PATO("2", "quá quá"),
    PORCO("3", "oinc oinc"),
    CACHORRO("4", "au au"),
    GATO("5", "miau miau");

    private String numero;
    private String som;
    
    TipoAnimal(String numero, String som) {
        this.numero = numero;
        this.som = som;
    }
    
    
    public String getNumero() {
        return numero;
    }

    public String getSom() {
        return som;
    }
}

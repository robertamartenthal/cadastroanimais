package cadastro.animal.program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import animal.exception.AnimalException;
import enumtipo.animal.TipoAnimal;
import sub.classes.animal.Cachorro;
import sub.classes.animal.Gato;
import sub.classes.animal.Ovelha;
import sub.classes.animal.Pato;
import sub.classes.animal.Porco;

public class MainAnimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Cadastre um animal:");
            System.out.print("Nome do animal: ");
            String nome = sc.next();
            System.out.print("Data de nascimento: ");
            Date anoDeNascimento = sdf.parse(sc.next());
            System.out.print("Precisa de vacinacao? (True(sim) / False(nao))");
            boolean vacina = sc.nextBoolean();
            System.out.print("Peso: ");
            Double peso = sc.nextDouble();
            System.out.printf("Escolha o numero do tipo de animal que voce cadastrou e quer emitir o som: \n"
                    + "1 - Ovelha \n"
                    + "2 - Pato \n"
                    + "3 - Porco \n"
                    + "4 - Cachorro \n"
                    + "5 - Gato \n");
            Integer numero = sc.nextInt();
            Animal animal = objetoanimal(nome, anoDeNascimento, vacina, peso, numero);

            System.out.print(animal.som());

            sc.close();
        } catch (ParseException e) {
            System.out.print("Data invalida!");
        } catch (AnimalException e) {
            System.out.print(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Voce digitou algo irregular!");
        }
        catch (RuntimeException e) {
          System.out.print("Erro inesperado!");
        }
   }

    public static Animal objetoanimal(String nome, Date anoDeNascimento, boolean vacina, Double peso, Integer numero) {
        if (numero > 5) {
            throw new AnimalException("Erro! Digite um numero entre 1 e 5");
        }
        switch (numero) {
        case 1:
            return new Ovelha(nome, anoDeNascimento, vacina, peso, TipoAnimal.OVELHA);

        case 2:
            return new Pato(nome, anoDeNascimento, vacina, peso, TipoAnimal.PATO);

        case 3:
            return new Porco(nome, anoDeNascimento, vacina, peso, TipoAnimal.PORCO);

        case 4:
            return new Cachorro(nome, anoDeNascimento, vacina, peso, TipoAnimal.CACHORRO);

        case 5:
            return new Gato(nome, anoDeNascimento, vacina, peso, TipoAnimal.GATO);

        }
        return null;
    }

}

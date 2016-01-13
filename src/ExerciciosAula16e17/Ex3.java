package ExerciciosAula16e17;

//        Faça um programa que leia e valide as seguintes informações:
//        a. Nome: maior que 3 caracteres;
//        b. Idade: entre 0 e 150;
//        c. Salário: maior que zero;
//        d. Sexo: 'f' ou 'm';
//        e. Estado Civil: 's', 'c', 'v', 'd';

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        do{
            System.out.println(" Nome: ");
            nome = entrada.next();

            if (nome.length() >= 3){
                infoValida = true;
            }else{
                System.out.println("Nome precisa no minimo 3 caracteres.");
            }
        }while (!infoValida);

        infoValida = false;
        do{
            System.out.println("Idade: ");
            idade = entrada.nextInt();

            if (idade >=0 && idade < 150){
                infoValida = true;
            }else{
                System.out.println("idade precisa ser entre 0 e 150");
            }
        }while (!infoValida);

        infoValida = false;
        do{
            System.out.println("Salário: ");
            salario = entrada.nextInt();

            if (salario > 0){
                infoValida = true;
            }else{
                System.out.println("Salário precisa ser maior que zero");
            }
        }while (!infoValida);

        infoValida = false;
        do{
            System.out.println("Sexo: ");
            sexo = entrada.next();

            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                infoValida = true;
            }else{
                System.out.println("Sexo precisa ser f ou m");
            }
        }while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Estado Civil:");
            estadoCivil = entrada.next();

            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")
                    || estadoCivil.equalsIgnoreCase("v")|| estadoCivil.equalsIgnoreCase("d")){
                infoValida = true;
            }else{
                System.out.println("Estado Civil precisa ser 's', 'c', 'v' ou  'd'");
            }
        }while (!infoValida);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Estado Civil: " + estadoCivil);

    }
}

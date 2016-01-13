package ExerciciosAula16e17;

//        Faça um programa que leia um nome de usuário e a sua senha e não
//        aceite a senha igual ao nome do usuário, mostrando uma mensagem
//        de erro e voltando a pedir as informações.

import java.util.Scanner;

public class Ex2 {
    public  static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        boolean infoValidas = false; // flag
        String nome;
        String senha;

        do {
            System.out.println("Qual seu nome:");
            nome = entrada.next();

            System.out.println("Digite uma senha: ");
            senha = entrada.next();

            if (nome.equalsIgnoreCase(senha)){
                //infoValidas = false;
                System.out.println("Erro! Senha igual ao nome de usuario");
            }else{
                infoValidas = true;
                System.out.println("Senha e usuário válidos");
            }
        }while (!infoValidas);


    }
}

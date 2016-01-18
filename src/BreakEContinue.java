/**
 * Created by Marcela on 18/01/2016.
 */

import java.util.Scanner;

public class BreakEContinue {
    public static void main(String[] args) {

		/*Scanner scan = new Scanner(System.in);

		System.out.println("Entre com um número");
		int num = scan.nextInt();

		System.out.println("Entre com um limite");
		int max = scan.nextInt();
		for (int i=num; i<=max; i++){
			System.out.println(i);
			if (i % 7 == 0){
				System.out.println("O valor de i é: " + i);
				break; // no momento que encontrar a primeira resposta nao preciso mais ficar no loop
			}
		}*/

		/*for (int i=0; i<=4; i++){
			rotulo1: {
				rotulo2: {
					rotulo3: {
						if (i == 1){
							break rotulo1;
						}
						if (i == 2){
							break rotulo2;
						}
						if (i == 3){
							break rotulo3;
						}
						System.out.println("rotulo3");
					}
					System.out.println("rotulo2");
				}
				System.out.println("rotulo1");
			}
			System.out.println(i);
		}*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número");
        int num = scan.nextInt();

        System.out.println("Entre com um limite");
        int max = scan.nextInt();

        for (int i=num; i<=max; i++){
            if (i % 7 == 0){ // quero imprimir todos os numeros entre num e max, menos o divisor de 7
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }

    }
}

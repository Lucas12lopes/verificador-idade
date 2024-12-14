import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String resposta;

		do {
			System.out.print("digite sua idade: ");
			int idade = sc.nextInt();

			if (idade < 18) {
				System.out.println("Voce é menor de idade.");
			} else if (idade <= 60) {
				System.out.println("Voce é adulto.");
			} else {
				System.out.println("Voce é idoso.");
			}

			System.out.println("Deseja verificar a idade de outra pessoa ? (Sim/Nao):");
			resposta = sc.next();

		} while (resposta.equalsIgnoreCase("sim"));

		sc.close();

	}

}

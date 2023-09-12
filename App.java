import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		System.out.println("Digite a distancia percorrida: ");

		Scanner in = new Scanner(System.in);

		float dist = Integer.parseInt(in.nextLine());	

		System.out.println("Digite o total de combustivel gasto: ");

		float comb = Integer.parseInt(in.nextLine());

		float numero = ( dist / comb ) ;

		System.out.print(numero);

	}

}

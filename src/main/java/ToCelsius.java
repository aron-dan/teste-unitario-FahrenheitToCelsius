import java.util.Scanner;

public class ToCelsius {
	Scanner sc = new Scanner(System.in);
	
	public double conversion() {
		System.out.println("digite o Valor em fahreinheit para  ser convertido para Celsius");
		double valor = sc.nextDouble();
		valor =  (valor - 32) / 1.8;
		System.out.println(valor);
		return valor;
	}

}

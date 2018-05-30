package co.edu.sena.poo.boxing;

public class Ejemplo01 {

	public static void main(String[] args) {
		double primitivo = 5.2;

		Double envoltorio = (Double) primitivo; // boxing

		double unboxingEnvoltorio = (double) envoltorio; // unboxing

		Double envoltorio2 = primitivo; // boxing automatico Autoboxing

		double unboxingEnvoltorio2 = envoltorio2; // unboxing automatico Autoboxing

	}

}

package co.edu.sena.poo.polimorfismo.ejemplo02;

import java.util.ArrayList;
import java.util.List;

import co.edu.sena.poo.polimorfismo.Empleado;
import co.edu.sena.poo.polimorfismo.Ingeniero;
import co.edu.sena.poo.polimorfismo.InstructorTeleinformatica;

public class APP3 {

	public static <E> void main(String[] args) {
		Empleado emp = new Ingeniero();
		System.out.println(emp);
		
		Ingeniero ing = (Ingeniero)emp;
		InstructorTeleinformatica ins = (InstructorTeleinformatica)ing;
		
		Empleado emp2 = new InstructorTeleinformatica();
		System.out.println(emp2);
		
		Object emp3 = new InstructorTeleinformatica();
		
		
	

	}

}

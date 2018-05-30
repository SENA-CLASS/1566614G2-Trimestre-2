package co.edu.sena.poo.polimorfismo.ejemplo02;

import co.edu.sena.poo.polimorfismo.Empleado;
import co.edu.sena.poo.polimorfismo.Ingeniero;
import co.edu.sena.poo.polimorfismo.InstructorTeleinformatica;

public class APP2 {

	public static void main(String[] args) {
		InstructorTeleinformatica instructor = new InstructorTeleinformatica();
		System.out.println("instructor: "+instructor);
		instructor.setBata(5);
		
		
		Ingeniero ing = (Ingeniero)instructor;// puede hacer
		System.out.println("ingeniero: "+ing);
		
		
		Empleado emp = (Empleado)ing;// se puede hacer
		System.out.println("empleado: "+emp);
		
		
		
		InstructorTeleinformatica inst2 = (InstructorTeleinformatica)emp;// se puede o no?
		System.out.println(inst2.getBata());
		System.out.println("Instrucot: "+inst2);
		
		System.out.println("todo salio bien");

	}

}

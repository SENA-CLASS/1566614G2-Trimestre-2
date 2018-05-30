package co.edu.sena.poo.polimorfismo.ejemplo02;

import co.edu.sena.poo.polimorfismo.Empleado;
import co.edu.sena.poo.polimorfismo.Ingeniero;
import co.edu.sena.poo.polimorfismo.InstructorTeleinformatica;

public class APP4 {
	public static void main(String ...args) {
		Empleado emp = new InstructorTeleinformatica();
		System.out.println(emp);
		ejercerTrabajo((Ingeniero)emp);
		
		
	}
	
	public static void ejercerTrabajo(Ingeniero ing) {
		ing.inventa();
		ing.trabajar();
	}
	
	public static void ejercerTrabajo(InstructorTeleinformatica ins) {
		ins.enseniar();
		ins.trabajar();
		ins.setBata(5);
		System.out.println(ins.getBata());
		ins.inventa();
	}
	
	

}

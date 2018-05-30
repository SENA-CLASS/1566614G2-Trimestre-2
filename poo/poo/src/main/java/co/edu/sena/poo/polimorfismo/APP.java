package co.edu.sena.poo.polimorfismo;

public class APP {

	public static void main(String[] args) {
		InstructorTeleinformatica instructor = new InstructorTeleinformatica();
		System.out.println(instructor);
		
		instructor.trabajar();
		instructor.inventa();
		
		
		
		Ingeniero ingeniero = instructor;
		System.out.println(ingeniero);
		ingeniero.inventa();
		ingeniero.trabajar();
		
		Ingeniero i = new Ingeniero();
		
		
		InstructorTeleinformatica instructor2 = (InstructorTeleinformatica)i;
		
		

	}

}

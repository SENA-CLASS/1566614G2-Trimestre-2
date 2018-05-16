package co.edu.sena.actividad01;

public class APP {

	public static void main(String[] args) {
		Celular c1 = new Celular();
		c1.setReferencia("12345");
		c1.setModelo("2105");
		c1.setMarca("Samsung");
		c1.setPrecio(1567373.7F);
		
		System.out.println(c1.getReferencia());
		System.out.println(c1.getMarca());
		System.out.println(c1.getModelo());
		System.out.println(c1.getPrecio());
	}

}

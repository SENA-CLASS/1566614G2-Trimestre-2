package co.edu.sena.poo.anidadas.estaticas.bajaracoplamiento;

public class Clase1 {
	
	public static InterfaceClase2 getClase2() {
		return new Clase1.Clase2();
	}
	public static class Clase2 implements InterfaceClase2 {
		
		
		

		public static class Clase3 {
			public static class Clase4 {
				public static class Clase5 {
					public static class Clase6 {
						public static class Clase7 {
							public static class Clase8 {
								
								public static InterfaceClase9 getClase9() {
									return new Clase1.Clase2.Clase3.Clase4.Clase5.Clase6.Clase7.Clase8.Clase9();
								}
								
								public static class Clase9 implements InterfaceClase9 {

								}

							}

						}

					}

				}

			}

		}

	}

}

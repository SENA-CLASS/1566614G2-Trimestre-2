package co.edu.sena.poo.polimorfismo.ejemplo02;

public class APP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Camara c = new Camara();
		//CamaraSony cs = (CamaraSony)c;
		//CamaraVideo cv = (CamaraVideo)c;
		
		InterfaceCamara ic = new Camara();
		InterfaceCamaSony ics = (InterfaceCamaSony)ic;
		

	}

}

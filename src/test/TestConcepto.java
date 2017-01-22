package test;





import com.entidad.Concepto;

import sesion.SesionConcepto;


public class TestConcepto {
	
	public static void pruebaInsertar() throws Exception{
		Concepto concepto = new Concepto(4,"Liquidaciones otros");
		SesionConcepto sesion =  new SesionConcepto();			
		sesion.insertar(concepto);
	}
	public static void main(String[] args) {
		try {
			TestConcepto.pruebaInsertar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

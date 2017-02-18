package test;




import java.util.Date;

import com.entidad.Concepto;
import com.entidad.Liquidacion;
import com.entidad.LiquidacionDetalle;
import com.entidad.Persona;
import com.entidad.TipoDocumento;

import sesion.SesionLiquidacion;
import sesion.SesionPersona;

public class Test {
	
	public static void pruebaInsertar() throws Exception{
		
		//comentar y descomentar lo que se va utilizar para insertar
		
		TipoDocumento tipdocu = new TipoDocumento(7,"");
		Persona empleado = new Persona(7,"40232640","Nueva","Amarilla",new Date(),"Paraguaya","km. 14","Minga Guazú","Soltero","Masculino","0973640015","denis_saul87@hotmail.com","observacion","V",tipdocu,null);
//		SesionPersona sesion =  new SesionPersona();			
//		sesion.insertar();
//		
		Liquidacion liqui = new Liquidacion(9,  new Date(), 2646549d,empleado, "");
		SesionLiquidacion sesion =  new SesionLiquidacion();
		
		Concepto concept = new Concepto(3,"otro");
		LiquidacionDetalle liqDeta = new LiquidacionDetalle(1,concept, liqui, 456554d);
		
		sesion.insertar(liqui, liqDeta);
	
		
	}
	public static void main(String[] args) {
		try {
			Test.pruebaInsertar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

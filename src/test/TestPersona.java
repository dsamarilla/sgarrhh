package test;




import java.util.Date;

import com.entidad.Persona;
import com.entidad.TipoDocumento;

import sesion.SesionPersona;

public class TestPersona {
	
	public static void pruebaInsertar() throws Exception{
		Persona empleado = new Persona(4,"4720641","Nueva","Amarilla",new Date(),"Paraguaya","km. 14","Minga Guazú","Soltero","Masculino","0973640015","denis_saul87@hotmail.com","observacion","V",new TipoDocumento(2,"RUC"),null);
		SesionPersona sesion =  new SesionPersona();			
		sesion.insertar(empleado);
	}
	public static void main(String[] args) {
		try {
			TestPersona.pruebaInsertar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

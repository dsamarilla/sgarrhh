package session;

import dao.DAOCiudad;
import dao.DAOMarca;
import infra.Session;

public class SessionCiudad extends Session {

	public SessionCiudad() {
		super(DAOCiudad.class);
	}
}
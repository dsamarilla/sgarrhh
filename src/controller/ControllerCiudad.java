package controller;

import infra.Controller;

public class ControllerCiudad extends Controller {

	public ControllerCiudad() throws Exception {
		super("Ciudad");
	}

	@Override
	public void goNew() throws Exception {
		request.setAttribute("nextPage","./ciudad/manterCiudad.jsp");
	}

	@Override
	public void goFind() throws Exception {
		request.setAttribute("nextPage","./ciudad/consultarCiudad.jsp");		
	}

	@Override
	public void save(Object obj) throws Exception {
		request.setAttribute("msg","ciudad salvo com sucesso!");
		this.goNew();
	}

	@Override
	public void remove(Object obj) throws Exception {
		request.setAttribute("msg","ciudad removido com sucesso!");
		this.goFind();
	}

	@Override
	public void detail(Object obj) throws Exception {
		request.setAttribute("object",obj);
		this.goNew();
	}

}

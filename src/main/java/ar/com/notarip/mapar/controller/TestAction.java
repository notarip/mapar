package ar.com.notarip.mapar.controller;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	
	private String mensaje = new String();
	
	@Override
	public String execute() throws Exception {

		setMensaje("Hola putines !!");
		return SUCCESS;
	}


	public String getMensaje() {return mensaje;}
	public void setMensaje(String mensaje) {this.mensaje = mensaje;}
	
	
	



}

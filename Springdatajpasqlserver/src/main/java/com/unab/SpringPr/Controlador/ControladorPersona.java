package com.unab.SpringPr.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.unab.SpringPr.DAO.PersonaDAO;


@Controller

public class ControladorPersona {
	
	@Autowired
	private PersonaDAO perDAO;
	
	@GetMapping("/")
	
	public String Inicio () {
		
		var MostrarPersona = perDAO.findAll() ;
		
		for(var iteracion: MostrarPersona) {
			
			System.out.println( "Nombre"+iteracion.getNombre()+ "Apellido "+ iteracion.getApellido());
		}
		
		
		return "Index";
	}
	

}

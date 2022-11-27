package com.api.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ApiController {

	
	private static final Logger logger = LoggerFactory.getLogger(ApiController.class);
	
	
	@GetMapping("/mensaje")
	public ResponseEntity<?> getMesaje(){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication(); 
		
//		logger.info("Datos del usuario: {}", auth.getPrincipal());
//		logger.info("Datos de los permisos: {}", auth.getAuthorities());
//		logger.info("Esta autenticado: {}", auth.isAuthenticated());
		
		 Map<String, String> mensaje = new HashMap<>();		 
		 mensaje.put("contenido", "Hola Manuel");
		return ResponseEntity.ok(mensaje);
		}
	
	  @GetMapping("/admin")
	  public ResponseEntity<?> getMensajeAdmin() {

	    Map<String, String> mensaje = new HashMap<>();
	    mensaje.put("contenido", "Hola Admin");
	    return ResponseEntity.ok(mensaje);
	  }
	  
	  @GetMapping("/publico")
	  public ResponseEntity<?> getMensajePublico() {

	    Map<String, String> mensaje = new HashMap<>();
	    mensaje.put("contenido", "Hola Mundo");
	    return ResponseEntity.ok(mensaje);
	  }
	
	
}

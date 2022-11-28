package com.api.model;

 
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
	
	  private Long id;

 
	  private String username;

 
	  private String email;
 
	  private String password;

}

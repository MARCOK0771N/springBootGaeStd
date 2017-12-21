package com.demo.services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.commons.dto.DemoDTO;
import com.demo.commons.dto.ResponseDTO;
import com.demo.persistence.demo.DemoDao;

@RestController
public class DemoController {
	
	@Autowired private DemoDao demoDao;
	
	@PostMapping(value="/getDemo")
	public ResponseDTO<DemoDTO> getAllRecetas(@RequestBody DemoDTO demo){
		
		try {
			DemoDTO demo2 = new DemoDTO();
			demo2.setNombre(demo.getNombre().toUpperCase());
			demo2.setApellidos(demo.getApellidos().toUpperCase());
			
			return new ResponseDTO<DemoDTO>(0, "OK", demo2);
		}catch (Exception e) {
//			log.error("Ocurrio un error en el servicio: getAllRecetas, "+e.getMessage(),e);
		}
		return new ResponseDTO<DemoDTO>(-1, "Ocurrio un error, intentelo mas tarde.", null);
	}
	
}

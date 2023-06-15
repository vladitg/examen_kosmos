package com.hospital.application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.application.Dto.responselistDto;
import com.hospital.application.services.CitasServices;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	private CitasServices citasServices;

	@GetMapping(value = "/guardarcita")
	public String postlistdoctor(@RequestBody  responselistDto responselistDto) {
		
		return citasServices.savecitas(responselistDto);
	}
}

package com.hospital.application.Dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class responselistDto {
   private String nombreDoctor;
   private String apellidopaterno;
   private String apellidomaterno;
   private String especialidad;
   private String piso;
   private String numerodeconsultorio;   
}

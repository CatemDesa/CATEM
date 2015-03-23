create or replace package CATEM_SOCIO_PACKAGE as 

  FUNCTION INSERT_SOCIO(apellido varchar2, nombre varchar2, nroSocio varchar2, 
  idTipoSocio number, nacionalidad varchar2, estadoCivil varchar2, fechaNac DATE, 
  dni varchar2, ocupacion varchar2, email varchar2, aFavor number) RETURN NUMBER;

end CATEM_SOCIO_PACKAGE;

create or replace package body CATEM_SOCIO_PACKAGE as

  FUNCTION INSERT_SOCIO(apellido varchar2, nombre varchar2, nroSocio varchar2, 
  idTipoSocio number, nacionalidad varchar2, estadoCivil varchar2, fechaNac DATE, 
  dni varchar2, ocupacion varchar2, email varchar2, aFavor number) RETURN NUMBER IS
    ID_SOCIO NUMBER;
  BEGIN 
    ID_SOCIO := SOCIOS_SEQ.NEXTVAL;
    INSERT INTO SOCIO(IDSOCIO,apellido, nombre, NUMERO_SOCIO, idTipoSocio, nacionalidad, estadoCivil, FECHA_NAC, dni, ocupacion, mail, aFavor) 
    VALUES (ID_SOCIO,apellido, nombre, nroSocio, idTipoSocio, nacionalidad, estadoCivil, fechaNac, dni, ocupacion, email, aFavor);
    RETURN ID_SOCIO;
  END INSERT_SOCIO;

end CATEM_SOCIO_PACKAGE;
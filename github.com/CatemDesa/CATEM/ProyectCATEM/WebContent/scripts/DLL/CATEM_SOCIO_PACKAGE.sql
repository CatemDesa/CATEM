create or replace package CATEM_SOCIO_PACKAGE as 

  FUNCTION FN_INSERT_SOCIO(apellido varchar2, nombre varchar2, nroSocio varchar2, 
  idTipoSocio number, nacionalidad varchar2, idEstadoCivil number, fechaNac DATE, 
  dni varchar2, ocupacion varchar2, email varchar2, aFavor number) RETURN NUMBER;

end CATEM_SOCIO_PACKAGE;

create or replace package body CATEM_SOCIO_PACKAGE as

  FUNCTION FN_INSERT_SOCIO(apellido varchar2, nombre varchar2, nroSocio varchar2, 
  idTipoSocio number, nacionalidad varchar2, idEstadoCivil number, fechaNac DATE, 
  dni varchar2, ocupacion varchar2, email varchar2, aFavor number) RETURN NUMBER IS
    ID_SOCIO NUMBER;
  BEGIN 
    ID_SOCIO := SOCIOS_SEQ.NEXTVAL;
    INSERT INTO SOCIO(IDSOCIO,apellido, nombre, NUMERO_SOCIO, idTipoSocio, nacionalidad, IdEstadoCivil, FECHA_NAC, dni, ocupacion, mail, aFavor, fechaAlta) 
    VALUES (ID_SOCIO,apellido, nombre, nroSocio, idTipoSocio, nacionalidad, idEstadoCivil, fechaNac, dni, ocupacion, email, aFavor,sysdate);
    RETURN ID_SOCIO;
  END FN_INSERT_SOCIO;

end CATEM_SOCIO_PACKAGE;
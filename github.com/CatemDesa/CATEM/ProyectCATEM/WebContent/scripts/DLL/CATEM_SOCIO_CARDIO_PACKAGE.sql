create or replace PACKAGE CATEM_SOCIO_CARDIO_PACKAGE AS 

--------------- NO SOCIOS -----------------

FUNCTION FN_CREATE_CARDIO_NS(idAdicional NUMBER, idNSocio VARCHAR, fechaAlta DATE) RETURN NUMBER;

FUNCTION FN_BAJA_CARDIO_NS(idAdicional NUMBER, fechaBaja DATE) RETURN NUMBER;

--------------- SOCIOS ---------------------
  
FUNCTION FN_CREATE_SOCIO_CARDIO(idSocio NUMBER, fechaAlta DATE) RETURN NUMBER;

FUNCTION FN_BAJA_CARDIO_SOCIO(idSoc NUMBER, fechaB DATE) RETURN NUMBER;


END CATEM_SOCIO_CARDIO_PACKAGE;



create or replace PACKAGE BODY CATEM_SOCIO_CARDIO_PACKAGE AS
  
  --------------------- NO SOCIOS --------------------
  
  FUNCTION FN_CREATE_CARDIO_NS(idAdicional NUMBER, idNSocio VARCHAR, fechaAlta DATE) RETURN NUMBER
  IS
  BEGIN
  
    INSERT INTO CARDIO_NOSOCIO(IdAdicional, IdNSocio, Fecha_Alta)
    VALUES (idAdicional, idNSocio, fechaAlta);
    
    RETURN 0;
    
     EXCEPTION     
      WHEN OTHERS THEN 
      return -1;
    
  END FN_CREATE_CARDIO_NS;
  
  
  FUNCTION FN_BAJA_CARDIO_NS(idAdicional NUMBER, fechaBaja DATE) RETURN NUMBER
  IS
  BEGIN
  
    UPDATE CARDIO_NOSOCIO
    SET Fecha_Baja = fechaBaja
    WHERE IdAdicional=idAdicional;
    
    RETURN 0;
    
     EXCEPTION     
      WHEN OTHERS THEN 
      return -1;
    
  END FN_BAJA_CARDIO_NS;

--------------- SOCIOS ---------------------


  FUNCTION FN_CREATE_SOCIO_CARDIO(idSocio NUMBER, fechaAlta DATE) RETURN NUMBER
  IS
  id_socio_car NUMBER;
  BEGIN
    id_socio_car := SOCIOS_CARDIO_SEQ.nextVal;
    INSERT INTO CARDIO_SOCIO(IDSOCIOCARDIO, IDSOCIO, FECHA_ALTA)
    VALUES (id_socio_car, idSocio, fechaAlta);
    
    RETURN idSocio;
     EXCEPTION     
      WHEN OTHERS THEN 
      return -1;
    
  END FN_CREATE_SOCIO_CARDIO;

  FUNCTION FN_BAJA_CARDIO_SOCIO(idSoc NUMBER, fechaB DATE) RETURN NUMBER
  IS
  BEGIN
	  	UPDATE CARDIO_SOCIO
	  	SET FECHA_BAJA = fechaB
	  	WHERE IDSOCIOCARDIO = idSoc
	  	
	  RETURN 0;
	  EXCEPTION
	  WHEN OTHERS THEN
	  	RETURN -1;
  END;

END CATEM_SOCIO_CARDIO_PACKAGE;
create or replace PACKAGE CATEM_SALIDA_PACKAGE AS 

  FUNCTION FN_CREATE_SALIDA(idDescripcion INT, fecha DATE, idCuentaBancaria INT) RETURN NUMBER;

END CATEM_SALIDA_PACKAGE;



create or replace PACKAGE BODY CATEM_SALIDA_PACKAGE AS

  FUNCTION FN_CREATE_SALIDA(idDescripcion INT, fecha DATE, idCuentaBancaria INT) RETURN NUMBER
  IS
  idSalida NUMBER;
  BEGIN
    idSalida := SALIDA_SEQ.nextVal;
    INSERT INTO SALIDA(IdSalida, IdDescripcion, Fecha, IdCuentaBancaria)
    VALUES (idSalida, idDescripcion, fecha, idCuentaBancaria);
    
    RETURN idSalida;
    
     EXCEPTION     
      WHEN OTHERS THEN 
      return -1;
    
  END;

END CATEM_SALIDA_PACKAGE;
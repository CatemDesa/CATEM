create or replace PACKAGE CATEM_ENTRADA_PACKAGE AS 

  FUNCTION FN_CREATE_PAGO_CHQ(idPagoIng NUMBER, idCheque NUMBER) RETURN NUMBER;

  FUNCTION FN_CREATE_CHQ(idPagoIng NUMBER, numero VARCHAR, banco VARCHAR, fecha DATE) RETURN NUMBER;

  FUNCTION FN_CREATE_PAGO_ING(idSocio INT, idDescripcion INT, importe DECIMAL, fecha DATE, idCuentaBancaria INT) RETURN NUMBER;

END CATEM_ENTRADA_PACKAGE;





create or replace PACKAGE BODY CATEM_ENTRADA_PACKAGE AS

FUNCTION FN_CREATE_PAGO_CHQ(idPagoIng NUMBER, idCheque NUMBER) RETURN NUMBER
IS
id_pago_chq NUMBER;
BEGIN
	id_pago_chq := PAGO_CHQ_SEQ.nextVal;
	INSERT INTO PAGO_CHEQUE(IdPagoCheque, IdPagoIng, IdCheque)
	VALUES (id_pago_chq, idPagoIng, idCheque);
	
	RETURN id_pago_chq;
  
   EXCEPTION     
      WHEN OTHERS THEN 
      return -1;
  
END FN_CREATE_PAGO_CHQ;

FUNCTION FN_CREATE_CHQ(idPagoIng NUMBER, numero VARCHAR, banco VARCHAR, fecha DATE) RETURN NUMBER
IS
id_chq NUMBER;
BEGIN
	id_chq := CHEQUE_SEQ.nextVal;
	INSERT INTO CHEQUE(IdCheque, Numero, Banco, Fecha)
	VALUES (id_chq, numero, banco, fecha);
	
	RETURN id_chq;
  
   EXCEPTION     
      WHEN OTHERS THEN 
      return -1;
  
END;

FUNCTION FN_CREATE_PAGO_ING(idSocio INT, idDescripcion INT, importe DECIMAL, fecha DATE, idCuentaBancaria INT) RETURN NUMBER
IS
idPagoIng NUMBER;
BEGIN
	idPagoIng := PAGO_ING_SEQ.nextVal;
	INSERT INTO PAGO_INGRESO(IdPagoIng, IdSocio, IdDescripcion, Importe, Fecha, IdCuentaBancaria)
	VALUES (idPagoIng, idSocio, idDescripcion, importe, fecha, idCuentaBancaria);
	
	RETURN idPagoIng;
  
   EXCEPTION     
      WHEN OTHERS THEN 
      return -1;
  
END;

END CATEM_ENTRADA_PACKAGE;
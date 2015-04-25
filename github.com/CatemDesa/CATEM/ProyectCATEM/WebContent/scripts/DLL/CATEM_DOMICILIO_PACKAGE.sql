create or replace package CATEM_DOMICILIO_PACKAGE as 

  FUNCTION FN_CREATE_DOM(calle VARCHAR2, numero VARCHAR2, localidad VARCHAR2, telefono VARCHAR2, idTipoDom NUMBER) RETURN NUMBER;

  FUNCTION FN_GET_DOM(idDom NUMBER) RETURN SYS_REFCURSOR;

  FUNCTION FN_UPDATE_DOM(id_dom NUMBER, calle VARCHAR2, numero VARCHAR2, localidad VARCHAR2, telefono VARCHAR2, idTipoDom NUMBER) RETURN NUMBER;

end CATEM_DOMICILIO_PACKAGE;


--------BODY--------------


create or replace package body CATEM_DOMICILIO_PACKAGE as

  FUNCTION FN_CREATE_DOM(calle VARCHAR2, numero VARCHAR2, localidad VARCHAR2, telefono VARCHAR2, idTipoDom NUMBER) RETURN NUMBER
  IS
  id_dom NUMBER;
  BEGIN
    id_dom := SOCIOS_DOMICILIO_SEQ.nextVal;
    
    INSERT INTO DOMICILIO(IDDOMICILIO, CALLE, NUMERO, LOCALIDAD, TELEFONO, IDTIPODOMICILIO)
    VALUES (id_dom, calle, numero, localidad, telefono, idTipoDom);
    
    RETURN id_dom;	
  END FN_CREATE_DOM;

  FUNCTION FN_GET_DOM(idDom NUMBER) RETURN SYS_REFCURSOR
  IS 
  tp_cursor SYS_REFCURSOR;
  BEGIN
    OPEN tp_cursor FOR
    SELECT * FROM DOMICILIO
    WHERE IDDOMICILIO = idDom;
    RETURN tp_cursor;
    
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
          tp_cursor := NULL;
    RETURN tp_cursor;
  END FN_GET_DOM;

  FUNCTION FN_UPDATE_DOM(id_dom NUMBER, calle VARCHAR2, numero VARCHAR2, localidad VARCHAR2, telefono VARCHAR2, idTipoDom NUMBER) RETURN NUMBER
  IS
  BEGIN
    
    UPDATE DOMICILIO 
    SET 
    CALLE=calle,
    NUMERO=numero,
    LOCALIDAD=localidad,
    TELEFONO=telefono, 
    IDTIPODOMICILIO=idTipoDom
    WHERE IDDOMICILIO=id_dom;
      
    RETURN id_dom;	
  END FN_UPDATE_DOM;

end CATEM_DOMICILIO_PACKAGE;
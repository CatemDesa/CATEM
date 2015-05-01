create or replace package CATEM_LOGIN_PACKAGE as 

  FUNCTION FN_AUTENTICATE_USER(nameUser VARCHAR2, pass VARCHAR2) RETURN SYS_REFCURSOR;

end CATEM_LOGIN_PACKAGE;



create or replace package body CATEM_LOGIN_PACKAGE as

FUNCTION FN_AUTENTICATE_USER(nameUser VARCHAR2, pass VARCHAR2) RETURN SYS_REFCURSOR
AS 
tp_cursor SYS_REFCURSOR;
BEGIN
  OPEN tp_cursor FOR
  SELECT * FROM USUARIO
  WHERE nombre = nameUser and contrasenia = pass;
  RETURN tp_cursor;
  
  EXCEPTION
      WHEN NO_DATA_FOUND THEN
        tp_cursor := NULL;
  RETURN tp_cursor;
END;

end CATEM_LOGIN_PACKAGE;
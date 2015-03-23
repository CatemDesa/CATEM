-- Create Table: Cuenta_Bancaria
--------------------------------------------------------------------------------
CREATE TABLE Cuenta_Bancaria
(
	IdCuentaBancaria INT NOT NULL PRIMARY KEY
	,Descripcion INT  NULL
	,IdRubro INT NOT NULL
);

-- Create Table: Tipo_Domiclio
--------------------------------------------------------------------------------
CREATE TABLE Tipo_Domicilio
(
	IdTipoDom INT NOT NULL PRIMARY KEY
	,Descripcion VARCHAR(250)  NULL 
);

-- Create Table: Domicilio
--------------------------------------------------------------------------------
CREATE TABLE Domicilio
(
	IdDomicilio INT NOT NULL PRIMARY KEY
	,Calle VARCHAR(250)  NULL 
	,Numero VARCHAR(250)  NULL 
	,Localidad VARCHAR(250)  NULL 
	,Telefono VARCHAR(250)  NULL 
	,IdTipoDomicilio INT  NULL 
);

-- Create Table: Pago_Cheque
--------------------------------------------------------------------------------
CREATE TABLE Pago_Cheque
(
	IdPagoCheque INT NOT NULL PRIMARY KEY
	,IdPagoIng INT NOT NULL 
	,IdCheque INT NOT NULL
);

-- Create Table: Cheque
--------------------------------------------------------------------------------
CREATE TABLE Cheque
(
	IdCheque INT NOT NULL PRIMARY KEY
	,Numero VARCHAR(250)  NULL 
	,Banco VARCHAR(250)  NULL 
	,Fecha DATE  NULL 
);

-- Create Table: Adicional_Cardio
--------------------------------------------------------------------------------
CREATE TABLE Adicional_Cardio
(
	IdAdicCardio INT NOT NULL PRIMARY KEY
	,IdSocio INT  NULL 
	,Nombre VARCHAR(250)  NULL 
	,Apellido VARCHAR(250)  NULL 
	,DNI VARCHAR(250)  NULL 
	,idDomicilio INT  NULL 
);

-- Create Table: Cardio_NoSocio
--------------------------------------------------------------------------------
CREATE TABLE Cardio_NoSocio
(
	IdNSocio INT NOT NULL PRIMARY KEY
	,IdAdicional INT  NOT NULL
	,Fecha_Alta DATE  NULL 
	,Fecha_Baja DATE  NULL 
);

-- Create Table: Cardio_Socio
--------------------------------------------------------------------------------
CREATE TABLE Cardio_Socio
(
	IdSocio INT NOT NULL PRIMARY KEY
	,IdSocio INT NOT NULL 
	,Fecha_Alta DATE  NULL 
	,Fecha_Baja DATE  NULL 
);

-- Create Table: Socio
--------------------------------------------------------------------------------
CREATE TABLE Socio
(
	IdSocio INT NOT NULL PRIMARY KEY
	,IdTipoSocio INT NOT NULL 
	,Numero_Socio VARCHAR(250)  NULL 
	,Nombre VARCHAR(250) NOT NULL 
	,Apellido VARCHAR(250) NOT NULL 
	,Cell VARCHAR(250)  NULL 
	,Nacionalidad VARCHAR(250)  NULL 
	,Estado Civil VARCHAR(250)  NULL 
	,Fecha_Nac DATE  NULL 
	,DNI VARCHAR(250)  NULL 
	,Ocupacion VARCHAR(250)  NULL 
	,Mail VARCHAR(250)  NULL 
	,aFavor number(10,2) NULL
);

-- Create Table: Pagos_Ingresos
--------------------------------------------------------------------------------
CREATE TABLE Pago_Ingreso
(
	IdPagoIng INT NOT NULL PRIMARY KEY
	,IdSocio INT  NULL 
	,IdDescripcion INT  NULL 
	,Importe INT  NULL 
	,Fecha DATE  NULL
	,IdCuentaBancaria INT NOT NULL
);

-- Create Table: Salida
--------------------------------------------------------------------------------
CREATE TABLE Salida
(
	IdSalida INT NOT NULL PRIMARY KEY
	,IdDescripcion INT  NULL 
	,Fecha DATE  NULL 
	,IdCuentaBancaria INT NOT NULL
);

-- Create Table: Socio_Domicilio
--------------------------------------------------------------------------------
CREATE TABLE Socio_Domicilio
(
	IdSocioDom INT NOT NULL PRIMARY KEY
	,IdDomicilio INT  NULL 
	,IdSocio INT  NULL 
);

-- Create Table: Tipo_Socio
--------------------------------------------------------------------------------
CREATE TABLE Tipo_Socio
(
	IdTipoSocio INT NOT NULL PRIMARY KEY
	,Descripcion VARCHAR(250)  NULL 
);

-- Create Table: Rubro
--------------------------------------------------------------------------------
CREATE TABLE Rubro
(
	IdRubro INT NOT NULL PRIMARY KEY
	,Descripcion VARCHAR(250)  NULL 
	,TipoRubro INT NOT NULL
);


CREATE TABLE Usuario
(
	IdUsuario INT NOT NULL PRIMARY KEY
	,Nombre varchar(70) NOT  NULL
	,Contrasenia varchar(20) NOT NULL
  ,TipoUsuario INT NOT NULL
);

-- FK KEYS

ALTER TABLE Pago_Ingreso ADD 
FOREIGN KEY (IdSocio)
REFERENCES Socio (IdSocio)

ALTER TABLE Socio_Domicilio ADD 
FOREIGN KEY (IdDomicilio)
REFERENCES Domicilio (IdDomicilio)

ALTER TABLE Adicional_Cardio ADD 
FOREIGN KEY (IdDomicilio)
REFERENCES Domicilio (IdDomicilio)

ALTER TABLE Pago_Cheque ADD 
FOREIGN KEY (IdPagoIng)
REFERENCES Pago_Ingreso (IdPagoIng)

ALTER TABLE Pago_Cheque ADD 
FOREIGN KEY (IdCheque)
REFERENCES Cheque (IdCheque)

ALTER TABLE Cardio_Socio ADD 
FOREIGN KEY (IdSocio)
REFERENCES Socio (IdSocio)

ALTER TABLE Adicional_Cardio ADD 
FOREIGN KEY (IdSocio)
REFERENCES Socio (IdSocio)

ALTER TABLE Cardio_NoSocio ADD 
FOREIGN KEY (IDADICIONAL)
REFERENCES Adicional_Cardio (IdAdicCardio)

ALTER TABLE Socio ADD 
FOREIGN KEY (IdTipoSocio)
REFERENCES Tipo_Socio (IdTipoSocio)

ALTER TABLE Socio_Domicilio ADD 
FOREIGN KEY (IdSocio)
REFERENCES Socio (IdSocio)

ALTER TABLE Domicilio ADD 
FOREIGN KEY (IdTipoDomicilio)
REFERENCES TIPO_DOMICILIO (IdTipoDom)
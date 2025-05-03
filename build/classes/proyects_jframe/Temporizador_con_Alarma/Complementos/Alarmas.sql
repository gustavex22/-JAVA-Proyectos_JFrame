create database Alarmas
go
Use Alarmas
go
Create table DigitalAlarmas(
	ID INT PRIMARY KEY IDENTITY(1,1),
	Hora int,
	Minutos int,
	Estado bit
)


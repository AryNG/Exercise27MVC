package com.exercise27mvchelloworld.model;

public class UserModel 
{
//VARIABLES------------------------------------------------------------------------------------------------
	private	int id;
	private	String nombre;
	private	short edad;
	
	public UserModel() {};
	public UserModel(int id) 
	{
		this.id=id;
		this.nombre="";
		this.edad=0;
	}
	public UserModel(int id, String nombre, short edad)
	{
		this.id=id;
		this.nombre=nombre;
		this.edad=edad;
	}
	//IDs Get and Set.......................................................................................
	public int getID() {
		return id;
	}
	public void setID(int id) {
		this.id=id;
	}
	
	//EDADs Get and Set.....................................................................................
	public short getEdad() {
	return edad;
	}
	public void setEdad(short edad) {
	this.edad=edad;
	}
	
	//NOMBREs Get and Set...................................................................................
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}


}

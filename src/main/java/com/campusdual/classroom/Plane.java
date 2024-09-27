package com.campusdual.classroom;

public class Plane implements IMachine {

	private final String name;

	public Plane(String name) {
		this.name = name;
	}

	public void takeOff() {
		System.out.println("El avión despega");
	}

	public void land() {
		System.out.println("El avión aterriza");
	}

	public void fly() {
		System.out.println("El avión está volando");
	}

	@Override
	public void start() {
		System.out.println("El avion tiene el motor en marcha");
	}

	@Override
	public void stop() {
		System.out.println("El avion ha aterrizado y está detenido");
	}

	@Override
	public void maintenance() {
		System.out.println("Se realizan labores de mantenimiento en el avión");
	}
}

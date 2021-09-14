package com.BrianMiller;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    Car holden = new Car();

	    porsche.setModel("Carrera");
	    holden.setModel("Junker");
        System.out.println(porsche.getModel());
        System.out.println(holden.getModel());
    }
}

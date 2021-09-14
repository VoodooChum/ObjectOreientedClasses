package com.BrianMiller;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
	    Car holden = new Car();

	    porsche.setModel("Porsche");
	    holden.setModel("Junker");
        System.out.println(porsche.getModel());
        System.out.println(holden.getModel());

        VipPerson person1 = new VipPerson();
        VipPerson person2 = new VipPerson("Bob", 25000.00);
        VipPerson person3 = new VipPerson("Brian", 50000, "brian@email.com");
        System.out.println(person1.getName() + " " + person1.getCreditLimit() + " " + person1.getEmailAddress());
        System.out.println(person2.getName() + " " + person2.getCreditLimit() + " " + person2.getEmailAddress());
        System.out.println(person3.getName() + " " + person3.getCreditLimit() + " " + person3.getEmailAddress());
    }
}

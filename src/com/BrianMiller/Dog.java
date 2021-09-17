package com.BrianMiller;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
    }

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name,1,1, size, weight);
        this.legs = legs;
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        super.eat();
        chew();
    }



    private void chew() {
        System.out.println( getName() + " likes to chew food to eat");
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getCoat() {
        return coat;
    }
}

class GermanShepard extends Dog {

    public GermanShepard(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
    }
    @Override
    public void eat() {
        System.out.println("German Shepherds eat al lot");
    }
}

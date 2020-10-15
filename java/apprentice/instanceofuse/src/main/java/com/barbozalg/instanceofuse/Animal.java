/**
 * @author barbozalg on Sep 28 2020.
 */

package com.barbozalg.instanceofuse;


public class Animal {

    void move(){
        System.out.println("Move");
    }

}


class Reptile extends Animal {

    @Override void move(){
        System.out.println("Reptile -> Crawl");
    }

}

class Amphibian extends Animal {

    @Override void move(){
        System.out.println("Amphibian -> Jump");
    }

}

class Bird extends Animal {

    @Override void move(){
        System.out.println("Bird -> Fly");
    }

}

class Fish extends Animal {

    @Override void move(){
        System.out.println("Fish -> Swim");
    }

}

class Mammal extends Animal {

    @Override void move(){
        System.out.println("Mammal -> Run");
    }

}

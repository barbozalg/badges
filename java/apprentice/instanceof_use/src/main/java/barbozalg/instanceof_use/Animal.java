/**
 * @author barbozalg on Sep 28 2020.
 */
package barbozalg.instanceof_use;

public class Animal {

    void move(){
        System.out.println("Move");
    }

}

class Reptile extends Animal {

    @Override void move(){
        System.out.println("Crawl");
    }

}

class Amphibian extends Animal {

    @Override void move(){
        System.out.println("Jump");
    }

}

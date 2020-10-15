/**
 * @author barbozalg on Sep 28 2020.
 *
 * Assignment:
 * Write code that uses the instanceof operator and show how casting works.
 */

package com.barbozalg.instanceofuse;

import java.util.List;
import java.util.ArrayList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class InstanceOfUseApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(InstanceOfUseApplication.class, args);
    }

    // This function receives variables from the Animal class
    public static void clasify(Object item){
        /**
         * I did not send Animal class, but all the elements that send are Animal instances
         * and the method immediately cast towards animal.
         */
        String type = (item instanceof Animal) ? "Animal" : (item instanceof Vegetable) ? "Vegetable" : (item instanceof Mineral) ? "Mineral" : null;
        switch(type){
            case "Animal":
                System.out.print("Move example:\n");
                Animal animal = (Animal) item;
                animal.move();
                break;
            case "Vegetable":
                System.out.print("Vegetable specie example:\n");
                Vegetable vegetable = (Vegetable) item;
                vegetable.speciesName();
                break;
            case "Mineral":
                System.out.print("Mineral example:\n");
                Mineral mineral = (Mineral) item;
                mineral.example();
                break;
            default:
                System.out.println("\nThis item has not been clasified");
                break;
        }

    }

    private List<Object> populateList(){
        List<Object> listOfItems = new ArrayList<Object>(25);
        listOfItems.add(new Nitrates());
        listOfItems.add(new NativeElements());
        listOfItems.add(new Lettuce());
        listOfItems.add(new Silicates());
        listOfItems.add(new Fish());
        listOfItems.add(new Sulfosalts());
        listOfItems.add(new Broccoli());
        listOfItems.add(new Onion());
        listOfItems.add(new SulfatesChromates());
        listOfItems.add(new Tomato());
        listOfItems.add(new Halides());
        listOfItems.add(new Amphibian());
        listOfItems.add(new Sulfides());
        listOfItems.add(new Potato());
        listOfItems.add(new Oxides());
        listOfItems.add(new Bird());
        listOfItems.add(new Carbonates());
        listOfItems.add(new Carrot());
        listOfItems.add(new Mammal());
        listOfItems.add(new Reptile());
        listOfItems.add(new PhosphatesArsenatesVanadates());
        listOfItems.add(new Eggplant());
        listOfItems.add(new TungstatesMolybdates());
        listOfItems.add(new Pumpkin());
        listOfItems.add(new Borates());
        return listOfItems;
    }

    @Override
    public void run(String... args) {
        List<Object> items = populateList();
        int i=0;
        for (Object item: items) {
            i++;
            System.out.print("\n" + i + " ");
            clasify(item);
        }
    }

}

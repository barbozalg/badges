/**
 * @author barbozalg on Aug 31 2021.
 *
 * Construct abstract Java classes and subclasses.
 */

package com.barbozalg.abstractclass;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;


@SpringBootApplication
public class AbstractclassApplication implements CommandLineRunner {

    static Logger loggerSLF4J = LoggerFactory.getLogger(AbstractclassApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AbstractclassApplication.class, args);
    }

    @Override
    public void run(String... args){
        ArrayList <Shape> shapes = new ArrayList<Shape>();
        shapes.add(new LargeRectangle());
        shapes.add(new SmallRectangle());
        shapes.add(new MediumCircle());
        shapes.add(new HugeTriangle());

        shapes.forEach((n) -> loggerSLF4J.info("{} Area: {} {}", n.getTypeName(), n.calculateArea(), n.UNIT));

        System.exit(0);
    }

}

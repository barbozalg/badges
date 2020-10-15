/**
 * @author barbozalg on Sep 28 2020.
 */

package com.barbozalg.instanceofuse;


public class Mineral {

    void example(){
        System.out.println("Exmaple");
    }

}


class NativeElements extends Mineral {

    @Override void example(){
        System.out.println("Native element -> Gold");
    }

}

class Borates extends Mineral {

    @Override void example(){
        System.out.println("Borates -> Kernite");
    }

}

class Halides extends Mineral {

    @Override void example(){
        System.out.println("Halides -> Fluorite");
    }

}

class Oxides extends Mineral {

    @Override void example() {
        System.out.println("Oxides -> Bauxite");
    }

}

class TungstatesMolybdates extends Mineral {

    @Override void example(){
        System.out.println("Tungstates and molybdates -> Wolframite");
    }

}

class Nitrates extends Mineral {

    @Override void example(){
        System.out.println("Nitrates -> Soda Niter");
    }

}

class SulfatesChromates extends Mineral {

    @Override void example(){
        System.out.println("Sulfates and chromates -> Celestite");
    }

}

class Sulfosalts extends Mineral {

    @Override void example(){
        System.out.println("Sulfosalts -> Jamesonite");
    }

}

class Sulfides extends Mineral {

    @Override void example(){
        System.out.println("Sulfides -> Marcasite");
    }

}

class PhosphatesArsenatesVanadates extends Mineral {

    @Override void example(){
        System.out.println("Phosphates, arsenates, and vanadates -> Turquoise");
    }

}

class Carbonates extends Mineral {

    @Override void example(){
        System.out.println("Carbonates -> Dolomite");
    }

}

class Silicates extends Mineral {

    @Override void example(){
        System.out.println("Silicates -> Magnesium");
    }

}

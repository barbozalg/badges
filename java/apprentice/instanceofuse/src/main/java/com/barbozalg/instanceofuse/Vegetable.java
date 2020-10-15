/**
 * @author barbozalg on Sep 28 2020.
 */

package com.barbozalg.instanceofuse;


public class Vegetable {

    void speciesName(){
        System.out.println("Species Name");
    }

}

class Lettuce extends Vegetable {

    @Override void speciesName(){
        System.out.println("Lettuce -> Lactuca sativa");
    }

}

class Eggplant extends Vegetable {

    @Override void speciesName(){
        System.out.println("Eggplant -> Solanum melongena");
    }

}

class Onion extends Vegetable {

    @Override void speciesName(){
        System.out.println("Onion -> Allium cepa");
    }

}

class Tomato extends Vegetable {

    @Override void speciesName(){
        System.out.println("Tomato -> Solanum lycopersicum");
    }

}

class Pumpkin extends Vegetable {

    @Override void speciesName(){
        System.out.println("Pumpkin -> Cucurbita");
    }

}

class Broccoli extends Vegetable {

    @Override void speciesName(){
        System.out.println("Broccoli -> Brassica oleracea");
    }

}

class Potato extends Vegetable {

    @Override void speciesName(){
        System.out.println("Potato -> Solanum tuberosum");
    }

}

class Carrot extends Vegetable {

    @Override void speciesName(){
        System.out.println("Carrot -> Daucus carota");
    }

}

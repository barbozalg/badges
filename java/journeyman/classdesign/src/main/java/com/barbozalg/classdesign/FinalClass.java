/**
 * @author barbozalg on Feb 5 2021.
 */

package com.barbozalg.classdesign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


final class FinalClass {

    static Logger loggerSLF4J = LoggerFactory.getLogger(ClassDesignApplication.class);
    final private int times;

    public FinalClass(int times){
        this.times = times;
    }

    public void display(String msg){
        for (int i=0; i<this.times; i++) {
            loggerSLF4J.info(String.format("Message from finalClass: {} (%s)", i+1), msg);
        }
    }

    public int getTimes(){
        return this.times;
    }

}

/**
 * java: cannot inherit from final com.barbozalg.classdesign.finalClass
 */
// class TryToExtendFinalClass extends finalClass{
    // when you don't want other classes to inherit from a class, use the final keyword like I did in finalClass
// }

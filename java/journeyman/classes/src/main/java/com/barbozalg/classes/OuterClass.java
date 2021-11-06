/**
 * @author barbozalg on Nov 5 2021.
 *
 * Write code to show how regular classes compare to inner classes, nested classes & anonymous classes.
 */

package com.barbozalg.classes;

public class OuterClass {

    String outerClassVar = "Outer string";
    private String outerClassPrivateVar = "Private outer string";
    static String staticOuterClassVar = "Static outer string";

    void classMembers() {
        System.out.println(outerClassVar);
        System.out.println(outerClassPrivateVar);
        System.out.println(staticOuterClassVar);

        InnerClass InnerObject = new InnerClass();
        System.out.println(InnerObject.innerClassVar);

        NestedClass NestedObject = new NestedClass();
        System.out.println(NestedObject.nestedClassVar);
        System.out.println(NestedObject.staticNestedClassVar);
    }

    class InnerClass {

        String innerClassVar = "Inner string";
        // error: Static declarations in inner classes are not supported at language level '8'
        // static String staticInnerClassVar = "Static inner string";

        void classMembers() {
            System.out.println(outerClassVar);
            System.out.println(outerClassPrivateVar);
            System.out.println(staticOuterClassVar);

            NestedClass NestedObject = new NestedClass();
            System.out.println(NestedObject.nestedClassVar);
            System.out.println(NestedObject.staticNestedClassVar);
        }

    }

    static class NestedClass {

        String nestedClassVar = "Nested string";
        static String staticNestedClassVar = "Static nested string";

        void classMembers(OuterClass outer) {
            // error: Cannot make a static reference to the non-static
            //System.out.println(outerClassVar);
            System.out.println(outer.outerClassVar);
            // error: Non-static field 'outerClassPrivateVar' cannot be referenced from a static context
            //System.out.println(outerClassPrivateVar);
            System.out.println(staticOuterClassVar);

            // error: InnerClass cannot be referenced from a static context
            // InnerClass InnerObject = new InnerClass();
        }

    }

}

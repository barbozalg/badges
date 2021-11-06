/**
 * @author barbozalg on Nov 5 2021.
 *
 * Write code to show how regular classes compare to inner classes, nested classes & anonymous classes.
 */

package com.barbozalg.classes;

public class LanguageTitle {

    interface Titles {
        public void title(String someone);
    }

    public void returnTitle(String texto) {

        class EnglishText implements Titles {
            public void title(String text) {
                System.out.println(text + " (EN)");
            }
        }

        Titles englishText = new EnglishText();

        // Anonymous Class
        Titles frenchText = new Titles() {
            String translations(String text){
                switch(text){
                    case "Inner class":
                        return "Classe intérieure";
                    case "Outer class":
                        return "Classe extérieure";
                    case "Static nested class":
                        return "Classe imbriquée statique";
                    case "Anonymous class":
                        return "Classe anonyme";
                    default:
                        return "** No translation **";
                }
            }

            public void title(String text) {
                String textFR = translations(text);
                System.out.println(textFR + " (FR)");
            }
        };

        // Anonymous Class
        Titles spanishText = new Titles() {
            String translations(String text){
                switch(text){
                    case "Inner class":
                        return "Clase interior";
                    case "Outer class":
                        return "Clase exterior";
                    case "Static nested class":
                        return "Clase estática anidada";
                    case "Anonymous class":
                        return "Clase anónima";
                    default:
                        return "** No translation **";
                }
            }

            public void title(String text) {
                String textSP = translations(text);
                System.out.println(textSP + " (SP)");
            }
        };

        englishText.title(texto);
        System.out.println("* Other Languages:");
        frenchText.title(texto);
        spanishText.title(texto);
    }

}

/**
 * @author barbozalg on Jun 30 2020.
 */

package com.barbozalg.overloadconstructors;


public class Card {

    private String value;
    private final CardType type;
    private String color;
    private boolean covered;
    private final String reverseBackGround;
    private final String backGround;


    public Card(int value, CardType type) throws Exception {
        this.type = type;
        this.setColor();
        this.setValue(value);
        this.reverseBackGround = "Blue";
        this.setCovered(true);
        this.backGround = "White";
    }

    public Card(int value, CardType type, String reverseBackGround) throws Exception {
        this.type = type;
        this.setColor();
        this.setValue(value);
        this.reverseBackGround = reverseBackGround;
        this.setCovered(true);
        this.backGround = "White";
    }

    public CardType getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    private void setValue(int value) throws Exception {
        if (value == 1) {
            this.value = "A";
        } else if(value >=2 && value <=10) {
            this.value = Integer.toString(value);
        } else if (value == 11){
            this.value = "J";
        } else if (value == 12){
            this.value = "Q";
        } else if (value == 13){
            this.value = "K";
        } else {
            throw new Exception("Error: Invalid Card Number");
        }
    }

    public String getColor() {
        return color;
    }

    private void setColor() throws Exception {
        if (CardType.Clubs.equals(this.type) || CardType.Spades.equals(this.type)) {
            this.color = "Black";
        } else if (CardType.Diamonds.equals(this.type) || CardType.Hearts.equals(this.type)) {
            this.color = "Red";
        } else {
            throw new Exception("Error: Invalid Card Type");
        }
    }

    public boolean isCovered() {
        return covered;
    }

    public void setCovered(boolean covered) {
        this.covered = covered;
    }

    public String getReverseBackGround() {
        return reverseBackGround;
    }

    public String getBackGround() {
        return backGround;
    }

    public String getColorRGB(String color){
        String rgb;
        switch(color){
            case "Black":
                rgb = "#000000";
            case "Red":
                rgb = "#FF0000";
            case "Blue":
                rgb = "#00FF00";
            case "Yellow":
                rgb = "#FFFF00";
            default:
                rgb = "#FFFFFF";
        }
        return rgb;
    }

}

package com.example.matthewdarke.javaweek3;

/**
 * Created by matthewdarke on 10/15/14.
 */
// Gifts.java
public class Gifts {

    // Member variables
    private int gOrderNumb;
    private String gName;
    private String gDescription;



    // Class constructor
    public Gifts() {
        gOrderNumb = 0;
        gName = gDescription = "";
    }
    public Gifts(String _name, String _description, int _orderNumb) {
        gOrderNumb = _orderNumb;
        gName = _name;
        gDescription = _description;
    }




    // Getter and setter methods.
    public int getOrderNumb() {
        return gOrderNumb;
    }
    public void setOrderNumb(int _oderNumb) {
        gOrderNumb = _oderNumb;
    }
    public String getName() {
        return gName;
    }
    public void setName(String _name) {
        gName = _name;
    }
    public String getDescription() {
        return gDescription;
    }
    public void setDescription(String _description) {
        gDescription = _description;
    }
}
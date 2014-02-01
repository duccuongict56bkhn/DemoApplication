/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Dai Hai
 */
public class Shape {
    
    private String color;
    
    public Shape() {
        this.color = "RED";
    }
    
    public Shape(String color) {
        this.color = color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Shape of color: " + color;
    }
}

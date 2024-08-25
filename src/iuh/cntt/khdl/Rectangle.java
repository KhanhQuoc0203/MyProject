/*
* @ (#) Rectangle.java   1.0 25/08/2024 
*
*  copyright (c) 2024 IUH. All rights reserved.
*/
package iuh.cntt.khdl;

/*
* @description: 
* @author: Khanh Quoc 
* @date : 25/08/2024
* @version: 1.0
*/
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        length=0.0;
        width=0.0;
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getAre(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*length+2*width;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public void  setRectangle(double length, double width) {
        if(length < 0.0 || width < 0.0) {
            throw new IllegalArgumentException("Length and width are negative.");
        }
    }
    public void setidth(double width) {
        if(width < 0.0) {
            throw new IllegalArgumentException("Width are negative.");
        }
    }
    public void setlength(double length) {
        if(length < 0.0) {
            throw new IllegalArgumentException("Length are negative.");
        }
    }
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }
}
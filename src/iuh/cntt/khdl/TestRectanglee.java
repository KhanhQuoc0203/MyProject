/*
 * @ (#) TestRectanglee.java   1.0 25/08/2024
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
public class TestRectanglee {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(20.5,10);
        Rectangle r2 = new Rectangle(2,3);

        System.out.println("Length: " + r1.getLength());
        System.out.println("Width: " + r1.getWidth());

        System.out.println("Area r1: " + r1.getAre());
        System.out.println("Perimeter r2: " + r2.getPerimeter());

        System.out.println(r1.toString());
    }
}

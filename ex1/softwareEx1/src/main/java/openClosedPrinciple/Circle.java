/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openClosedPrinciple;

/**
 *
 * @author Enes Kızılcın <nazifenes.kizilcin@stu.fsm.edu.tr>
 */
public class Circle implements Shape{
    
    int pi,r;

    @Override
    public int getArea() {
        return pi*pi*r;
    }
    
   
}

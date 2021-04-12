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
public class Rectangle implements Shape{
    
    int x,y;

    @Override
    public int getArea() {
        return x* y;
    }
    
    
}

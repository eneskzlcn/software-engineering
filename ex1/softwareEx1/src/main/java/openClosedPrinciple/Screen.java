/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openClosedPrinciple;

import java.util.ArrayList;

/**
 *
 * @author Enes Kızılcın <nazifenes.kizilcin@stu.fsm.edu.tr>
 */
public class Screen {
    
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    int getArea()
    {
        int totalArea = 0;
        for(Shape shape : shapes)
        {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}

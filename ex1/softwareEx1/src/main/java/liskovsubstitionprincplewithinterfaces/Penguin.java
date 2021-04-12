/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liskovsubstitionprincplewithinterfaces;

/**
 *
 * @author Enes Kızılcın <nazifenes.kizilcin@stu.fsm.edu.tr>
 */
public class Penguin extends Bird implements Flyable,Swimmable{

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liskovSubstititionPrinciple;

/**
 *
 * @author Enes Kızılcın <nazifenes.kizilcin@stu.fsm.edu.tr>
 */
public class BirdiesWithoutInterfaces {
    
    static class Bird{
        
    }
    
    static class NonFlyingBird extends Bird {
        
    }
    static class FlyingBird extends Bird {

        void fly() {
            System.out.println("Flied");
        }
    }
}

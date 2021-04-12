/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holywoodPrincipleBasicObservablePattern;

/**
 *
 * @author Enes Kızılcın <nazifenes.kizilcin@stu.fsm.edu.tr>
 */
public class Test {
    
    public static void main(String[] args) {
        //işi yapan document. Aslında page in içinde ama.
        Document doc = new Document();
        doc.addPage(new Page());
        doc.addPage(new Page());
        doc.showPages();
    }
}

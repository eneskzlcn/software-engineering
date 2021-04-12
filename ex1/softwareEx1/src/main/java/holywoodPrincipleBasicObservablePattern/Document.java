/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holywoodPrincipleBasicObservablePattern;

import java.util.ArrayList;

/**
 *
 * @author Enes Kızılcın <nazifenes.kizilcin@stu.fsm.edu.tr>
 */
public class Document {
    
    ArrayList<Page> pages = new ArrayList<Page>();
    
    void addPage(Page p)
    {
        pages.add(p);
    }
    
    void showPages()
    {
        for (Page page : pages) {
            page.render();
        }
    }
    
}

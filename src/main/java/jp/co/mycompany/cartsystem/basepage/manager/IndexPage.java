/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.mycompany.cartsystem.basepage.manager;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.border.BorderPanel;

/**
 *
 * @author uniuni797
 */
public class IndexPage extends WebPage  {
    public void IndexPage(){
        Label title = new Label("title","Wicket Sample");
        this.add(title);
//        BorderPanel border = 
//        this.add(border);
//        Label label = new Label("label","This is test.");
//        border.add(label);
    }
}

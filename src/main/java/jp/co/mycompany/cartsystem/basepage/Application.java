/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.mycompany.cartsystem.basepage;

import jp.co.mycompany.cartsystem.basepage.buyer.IndexPage;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 *
 * @author masahiko.aihara
 */
public class Application extends WebApplication {

    /**
     * 初期実行処理
     */
    @Override
    protected void init() {
        super.init();
        //リクエスト、レスポンスの文字コードをUTF-8に設定
        this.getRequestCycleSettings().setResponseRequestEncoding("UTF-8");
        //HTML等画面に表示するページの文字コードをUTF-8に設定
        this.getMarkupSettings().setDefaultMarkupEncoding("UTF-8");
        
    }
    
    @Override
    public Class<? extends Page> getHomePage() {
         //To change body of generated methods, choose Tools | Templates.
        //throw new UnsupportedOperationException("Not supported yet.");
        return IndexPage.class;
    }


}

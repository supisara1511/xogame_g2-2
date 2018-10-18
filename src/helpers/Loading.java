/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author FRAME
 */
public class Loading extends Thread {

    private page.Loading page;

    @Override
    public void run() {
        page = new page.Loading();
        page.setVisible(true);
    }

    public void hide() {
        page.dispose();
    }

}

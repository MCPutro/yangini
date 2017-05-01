/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Controller.Controller_Home;
import hospital.Aplikasi;

/**
 *
 * @author Konjem_Family
 */
public class Driver {
    public static void main(String[] args){
        Aplikasi app = new Aplikasi();
        new Controller_Home(app);
    }
}

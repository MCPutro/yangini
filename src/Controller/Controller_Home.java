/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Home;
import View.mainMenu;
import hospital.Aplikasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Konjem_Family
 */
public class Controller_Home implements ActionListener {
    private Aplikasi app;
    private Home view;
    private int count = 0;
    //private boolean statusLogin = false;
    
    public Controller_Home(Aplikasi app){
        this.app = app;
        view = new Home();
        view.setVisible(true);
        view.addListen(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if (source.equals(view.Login())){
                String username = view.getUsername();
                String password = view.getPassword();
                if (username.equals("konjem") && password.equals("konjem"))
                    {
                        JOptionPane.showMessageDialog(null, "Anda Berhasil Login! \n" 
                                + "Selamat Datang " + view.getUsername() + "!");
                        new Controller_mainMenu(app);
                        this.view.setVisible(false);
                       
                    }
                else
                    {
                        JOptionPane.showMessageDialog(null, "Username/Password Anda Salah!!!");
                        view.reset();
                        this.count++; 
                        if (count == 3)
                        {
                            JOptionPane.showMessageDialog(null, "Anda sudah gagal Login sebanyak 3 kali! \n "
                                + "Aplikasi Ditutup!");
                            System.exit(1);
                        }
                    }
        }
    }
}
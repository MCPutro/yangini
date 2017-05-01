/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.tambahPasien;
import hospital.Aplikasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Konjem_Family
 */
public class Controller_tambahPasien implements ActionListener {
    private Aplikasi app;
    private tambahPasien view;

    public Controller_tambahPasien(Aplikasi app) {
        this.app = app;
        view = new tambahPasien();
        view.addListen(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     Object source = e.getSource();
      try{
        if (source.equals(view.getBtnOk())){
            String id = view.getId();
            String title = view.getBoxTitle();
            String name = view.getNama();
            int age = view.getUmur();
            String gender = view.getBoxJenisKelamin();
            String disease = view.getPenyakit();
            String bloodType = view.getGolonganDarah();
            app.addPasien(id, title, name, age, gender, disease, bloodType);
            view.reset();
        }
        else if (source.equals(view.getBtnReset())){
            view.reset();
        }
        else if (source.equals(view.getBtnMainMenu())){
           new Controller_mainMenu(app);
           this.view.setVisible(false);
        }
      }
      catch(Exception ae) {
            JOptionPane.showMessageDialog(view, ae.getMessage());
            view.reset();
      }
    }
    
    
    
}

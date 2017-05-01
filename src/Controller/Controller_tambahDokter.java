/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.tambahDokter;
import hospital.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Konjem_Family
 */
public class Controller_tambahDokter implements ActionListener {
    private Aplikasi app;
    private tambahDokter view;

    public Controller_tambahDokter(Aplikasi app) {
        this.app = app;
        view = new tambahDokter();
        view.addActionListener(this);
        view.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
      Object source = e.getSource();
      try{
        if (source.equals(view.getBtnOk())){
            String speciality = view.getSpesialis();
            String name = view.getName();
            int age = view.getUmur(); 
            String gender = view.getBoxJenisKelamin();
            String title = view.getBoxTitle();
            String id = view.getId();
            int salary = view.getGaji();
            app.addDokter(id, title, name, age, gender, speciality, salary);
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

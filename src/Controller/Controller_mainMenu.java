/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.mainMenu;
import hospital.Aplikasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Konjem_Family
 */
public class Controller_mainMenu implements ActionListener{
    private Aplikasi app;
    private mainMenu mm;
   
    public Controller_mainMenu(Aplikasi app) {
        this.app = app;
        mm = new mainMenu();
        mm.addListen(this);
        mm.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(mm.tambahDokter())){
            new Controller_tambahDokter(app);
            this.mm.setVisible(false);
        }
        else if (source.equals(mm.tambahPasien())){
            new Controller_tambahPasien(app);
            this.mm.setVisible(false);
        }
        else if (source.equals(mm.tambahPasienInap())){
            new Controller_tambahPasienInap(app);
            this.mm.setVisible(false);
        }
//        Object source = e.getSource();
//        if (source.equals(mm.getOk())){
//            String s = mm.getMenu();
//            if (s.equals("1")){
//                new Controller_tambahDokter(app);
//                mm.setVisible(false);
//            }else if (s.equals("2")){
//                new Controller_tambahPasien(app);
//                mm.setVisible(false);
//            }else if (s.equals("3")){
//                mm.setVisible(false);
//            }else if (s.equals("4")){
//                mm.setVisible(false);
//            }else if (s.equals("5")){
//                mm.setVisible(false);
//            }else if (s.equals("6")){
//                mm.setVisible(false);
//            }
//        }
    }
     
//    @Override
//    public void actionPerformed(ActionEvent e){
//        Object source = e.getSource();
//        if (source.equals(view.getBtnSimpan())){
//            String id = view.getId();
//            String name = view.getNama();
//            int age = view.getUmur();
//            app.InsertPerson(id, name, age);
//            view.reset();
//        }
//        else if (source.equals(view.getBtnReset())){
//            view.reset();
//        }
//        else{
//            //view.reset();
//            String idCari = view.getIdCari();
//            Person p = app.viewPerson(idCari);
//            if (p==null){
//                JOptionPane.showMessageDialog(view, "Tidak Ditemukan.");
//            }
//            else{
//                view.setTaCari("ID : " +p.getId() + "\nNama: " + p.getName()+ "\nUmur: " +p.getAge());
//            }
//        }
//    }
    
}

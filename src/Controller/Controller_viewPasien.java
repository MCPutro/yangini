/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewPasien;
import hospital.Aplikasi;
import hospital.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author Muh Ikhdar Isnan
 */
public class Controller_viewPasien extends MouseAdapter implements ActionListener{
    private ViewPasien view;
    private ArrayList<Pasien> daftarPasien = new ArrayList<>();
    Aplikasi app;
    public Controller_viewPasien(Aplikasi app){
        this.app = app;
        view = new ViewPasien();    
        view.setVisible(true);
        view.addActionListener(this);
        view.addMouseAdapter(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getbtnTampil()))
            {
//                view.viewPasien(app.showDataPasien());
            }
    }
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if (source.equals(view.getListPasien())){
            int i = view.getSelectedPasien();
            Pasien p = daftarPasien.get(i);
            view.setTextPasien(p.toString());
        }
    }
}

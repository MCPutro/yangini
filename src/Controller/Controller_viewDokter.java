/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.ViewDokter;
import hospital.Aplikasi;
import hospital.Dokter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
/**
 *
 * @author Muh Ikhdar Isnan
 */
public class Controller_viewDokter extends MouseAdapter implements ActionListener {
    private ViewDokter view;
    private ArrayList<Dokter> daftarDokter = new ArrayList<>();
    Aplikasi app;
    
    public Controller_viewDokter(Aplikasi app){
        this.app = app;
        view = new ViewDokter();
        view.setVisible(true);
        view.addActionListener(this);
        view.addMouseAdapter(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getbtnTampil()))
            {
//                view.viewDokter(app.showDataDokter());
            }
    }
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if (source.equals(view.getListDokter())){
            int i = view.getSelectedDokter();
            Dokter p = daftarDokter.get(i);
            view.setTextDokter(p.toString());
        }
    }
}

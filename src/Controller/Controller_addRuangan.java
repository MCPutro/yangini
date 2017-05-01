/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.addRuangan;
import hospital.Aplikasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Mu'ti Cahyono Putro
 */
public class Controller_addRuangan implements ActionListener {

    addRuangan ar;
    Aplikasi app;

    public Controller_addRuangan(Aplikasi app) {
        this.app = app;

        this.ar = new addRuangan();
        this.ar.addLinten(this);
        this.ar.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(ar.getBtnTambahRuangan())) {
            app.addRuangan(ar.getNamaRuangan(), ar.getNoRuangan(), ar.getLantaiRuangan());
            this.ar.setVisible(false);
            new Controller_tambahPasienInap(app);
        }

    }
}



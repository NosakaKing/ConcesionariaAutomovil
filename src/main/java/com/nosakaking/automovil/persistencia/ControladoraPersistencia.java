/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nosakaking.automovil.persistencia;

import com.nosakaking.automovil.logica.Automovil;
import com.nosakaking.automovil.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nosaka
 */
public class ControladoraPersistencia {
    
    AutomovilJpaController autoJPA = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        autoJPA.create(auto);
    }

    public List<Automovil> traerAutos() {
        return autoJPA.findAutomovilEntities();
    }

    public void borrarAuto(int idAuto) {
        
        try {
            autoJPA.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Automovil traerAuto(int idAuto) {
        return autoJPA.findAutomovil(idAuto);

    }

    public void modficarAuto(Automovil auto) {

        try {
            autoJPA.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

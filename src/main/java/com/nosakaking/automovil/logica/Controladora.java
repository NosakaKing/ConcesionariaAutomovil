/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nosakaking.automovil.logica;

import com.nosakaking.automovil.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author nosaka
 */
public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String marca, String modelo, String motor, String color, String placa, int cantPuertas) {
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPlaca(placa);
        auto.setCantPuertas(cantPuertas);
        controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
        return controlPersis.traerAutos();
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
        
    }

    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String marca, String modelo, String motor, String color, String placa, int cantPuertas) {

        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPlaca(placa);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.modficarAuto(auto);

    }

}

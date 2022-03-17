package com.mycompany.memento3;

import memento.Caretaker;
import memento.Juego;
import memento.Originator;

public class App {
    
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        
        String nombreJuego = "Mario";
        
        Juego juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(1);
        
        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(2);
        originator.setEstado(juego);
        
        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(3);
        originator.setEstado(juego);
        
        caretaker.addMemento(originator.guardar());
        
        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(4);
        originator.setEstado(juego);
        
        caretaker.addMemento(originator.guardar());
        
        juego = new Juego();
        juego.setNombre(nombreJuego);
        juego.setCheckpoint(5);
        originator.setEstado(juego);
        caretaker.addMemento(originator.guardar());
        
        originator.restaurar(caretaker.getMemento(0));
        
        juego = originator.getEstado();
        System.out.println(juego);
    }
}

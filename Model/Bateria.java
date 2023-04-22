package br.edu.fescfafic.inversaoDependencia.Model;

import br.edu.fescfafic.inversaoDependencia.Interface.Instrumento;

public class Bateria implements Instrumento{

    public void usarInstrumento(){
        System.out.println("Tocando bateria");
    }
}

package br.edu.fescfafic.inversaoDependencia.Model;

import br.edu.fescfafic.inversaoDependencia.Interface.Instrumento;
public class Flauta implements Instrumento{

    public void usarInstrumento(){
        System.out.println("Tocando flauta");
    }
}

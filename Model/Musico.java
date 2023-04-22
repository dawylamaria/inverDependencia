package br.edu.fescfafic.inversaoDependencia.Model;

import br.edu.fescfafic.inversaoDependencia.Interface.Instrumento;

public class Musico {

    private Instrumento instrumento;

    public Musico(){}

    public void setInstumento(Instrumento instrumento){
        this.instrumento = instrumento;
    }

    public void usarInstrumento(){
        this.instrumento.usarInstrumento();
    }
}

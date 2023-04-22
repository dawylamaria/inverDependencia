package br.edu.fescfafic.inversaoDependencia.Main;

import br.edu.fescfafic.inversaoDependencia.Model.Bateria;
import br.edu.fescfafic.inversaoDependencia.Model.Flauta;
import br.edu.fescfafic.inversaoDependencia.Model.Musico;
import br.edu.fescfafic.inversaoDependencia.Model.Tambor;

public class Main {
    public static void main(String[] args) {

        Musico musico = new Musico();

        musico.setInstumento(new Flauta());
        musico.usarInstrumento();

        musico.setInstumento(new Bateria());

        musico.usarInstrumento();

        musico.setInstumento(new Tambor());
        musico.usarInstrumento();
    }
}
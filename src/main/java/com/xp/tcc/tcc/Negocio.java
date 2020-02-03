package com.xp.tcc.tcc;

import com.sun.tools.javac.util.List;
import com.xp.tcc.tcc.dominio.Tcc;

public class Negocio {
    public List<Tcc> listaTcc;

    public void montarListaTcc(){
        DaoTcc daoTcc = new DaoTcc();

        for (Tcc tcc: listaTcc) {
            tcc = daoTcc.recuperarTccNoBanco();
            listaTcc.add(tcc);
        }
    }

    public List<Tcc> recuperarTccCadastrados(){
        montarListaTcc();
        return listaTcc;
    }
}

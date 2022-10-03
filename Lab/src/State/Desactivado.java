package State;

import Composite.PropiedadesObjetos;

public class Desactivado  extends PropiedadesObjetos {

    public Desactivado desactivar(){
        this.setActivado(false);
        this.setDesactivado(true);
        return this;
    }
}

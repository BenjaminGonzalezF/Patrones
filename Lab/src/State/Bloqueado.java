package State;

import Composite.PropiedadesObjetos;

public class Bloqueado  extends PropiedadesObjetos {

    public Bloqueado bloquear(){
        this.setActivado(false);
        this.setDesactivado(false);
        this.setBloqueado(true);
        return this;
    }

}

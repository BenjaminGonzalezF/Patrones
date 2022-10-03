package State;

import Composite.PropiedadesObjetos;

public class Activado extends PropiedadesObjetos {


    public Activado(){

    }
    public Activado activar(){
        this.setActivado(true);
        this.setDesactivado(false);
        return this;
    }

}

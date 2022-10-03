package Composite;

public class PropiedadesObjetos implements InterfacePropiedades{
    int id = 0;
    boolean activado = false;
    boolean desactivado = true;
    boolean bloqueado = false;

    @Override
    public boolean isActivado() { return activado; }
    @Override
    public void setActivado(boolean activado) {
        this.activado = activado;
    }
    @Override
    public boolean isDesactivado() {
        return desactivado;
    }
    @Override
    public void setDesactivado(boolean desactivado) {
        this.desactivado = desactivado;
    }
    @Override
    public boolean isBloqueado() {
        return bloqueado;
    }
    @Override
    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }
    @Override
    public int getId() { return id; }
    @Override
    public void setId(int id) { this.id = id; }
}

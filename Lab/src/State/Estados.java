package State;

public class Estados implements InterfaceEstados {


    @Override
    public Activado activado() {
        Activado activado = new Activado();
        return activado;
    }

    @Override
    public Desactivado desactivado() {
        Desactivado desactivado = new Desactivado();
        return desactivado;
    }

    @Override
    public Bloqueado bloqueado() {
        Bloqueado bloqueado = new Bloqueado();
        return bloqueado;
    }
}

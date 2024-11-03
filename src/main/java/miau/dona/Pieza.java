package miau.dona;

public abstract class Pieza {
    public Pieza() {
    }

    public enum TipoPieza {
        ALFIL,
        CABALLO,
        DAMA,
        PEON,
        REY,
        TORRE
    }

    public TipoPieza tipo;
    protected static int id;
    public Pieza(TipoPieza tipo, int id) {
        this.tipo = tipo;
        this.id = id;
    }

    public TipoPieza getTipo() {
        return tipo;
    }

    public void setTipo(TipoPieza tipo) {
        this.tipo = tipo;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

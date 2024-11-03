package miau.dona.tablero;

import miau.dona.piezas.*;

public class Tablero {
    int[][] casillas = new int[8][8];
    // int[][] blancas = new int[4][4];
    // int[][] negras = new int[4][4];

    public Tablero() {
        setupCasillas();
    }



    // Si la casilla esta ocupada, indicar ID de pieza, si no, ID 0 ó -1
    public void cambiarCasillaDeValor(int posX, int posY, int idPieza) {
        casillas[posX][posY] = idPieza;
    }

    // Se lee como en ajedrez, primero letra (columna) y luego numero (fila)
    public void setupCasillas() {
        casillas[0][1] = Peon.getId();
        casillas[1][1] = Peon.getId();
        casillas[2][1] = Peon.getId();
        casillas[3][1] = Peon.getId();
        casillas[4][1] = Peon.getId();
        casillas[5][1] = Peon.getId();
        casillas[6][1] = Peon.getId();
        casillas[7][1] = Peon.getId();

        casillas[0][6] = Peon.getId();
        casillas[1][6] = Peon.getId();
        casillas[2][6] = Peon.getId();
        casillas[3][6] = Peon.getId();
        casillas[4][6] = Peon.getId();
        casillas[5][6] = Peon.getId();
        casillas[6][6] = Peon.getId();
        casillas[7][6] = Peon.getId();

        casillas[0][0] = Torre.getId();
        casillas[0][7] = Torre.getId();
        casillas[7][0] = Torre.getId();
        casillas[7][7] = Torre.getId();

        casillas[1][0] = Caballo.getId();
        casillas[1][7] = Caballo.getId();
        casillas[6][0] = Caballo.getId();
        casillas[6][7] = Caballo.getId();

        casillas[2][7] = Alfil.getId();
        casillas[2][0] = Alfil.getId();
        casillas[5][7] = Alfil.getId();
        casillas[5][0] = Alfil.getId();

        casillas[3][0] = Dama.getId();
        casillas[4][7] = Dama.getId();

        casillas[4][0] = Rey.getId();
        casillas[3][7] = Rey.getId();

    }

}

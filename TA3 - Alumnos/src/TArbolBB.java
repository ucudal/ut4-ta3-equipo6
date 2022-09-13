public class TArbolBB<T> implements IArbolBB<T> {

    private TElementoAB<T> raiz;

    /**
     * Separador utilizado entre elemento y elemento al imprimir la lista
     */
    public static final String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArbolBB() {
        raiz = null;
    }

    /**
     * @param unElemento
     * @return
     */
    public boolean insertar(TElementoAB<T> unElemento) {
        if (unElemento != null) {
            if (esVacio()) {
                raiz = unElemento;
                return true;
            } else {
                return raiz.insertar(unElemento);
            }
        }
        return false;
    }

    public boolean insertarConContador(TElementoAB<T> unElemento, int[] contador) {
        if (unElemento != null) {
            if (esVacio()) {
                raiz = unElemento;
                return true;
            } else {
                contador[0] = 0;
                return raiz.insertarConContador(unElemento, contador);
            }
        }
        return false;
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (this.raiz == null){
            return null;
        }
        return raiz.buscar(unaEtiqueta);
    }

    public TElementoAB<T> buscarConContador(Comparable unaEtiqueta, int[] contador) {
        if (esVacio()) {
            return null;
        } else {
            contador[0] = 0;
            return raiz.buscarConContador(unaEtiqueta, contador);
        }
    }

    @Override
    public String inOrden() {
        if (esVacio()) {
            return null;
        } else {
            return raiz.inOrden();
        }
    }

    @Override
    public Lista<T> inorden() {
        Lista <T> listaInorden = null;
        if (!esVacio()) {
            listaInorden = new Lista<T>();
            raiz.inOrden(listaInorden);
        }
        return listaInorden;

    }

    @Override
    public int obtenerAltura() {
        if (esVacio()) {
            return -1;
        } else {
            return raiz.obtenerAltura();
        }
    }

    @Override
    public int obtenerTamanio() {
        if (esVacio()) {
            return 0;
        } else {
            return raiz.obtenerTamanio();
        }
    }

    @Override
    public int obtenerNivel(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int obtenerCantidadHojas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void eliminar(Comparable unaEtiqueta) {
        if (raiz != null){
            raiz = raiz.eliminar(unaEtiqueta);
        }
        else {
            System.out.println("Arbol vacio");
        }
    }

    /**
     * @return True si habían elementos en el árbol, false en caso contrario
     */
    public boolean vaciar() {
        if (!esVacio()) {
            raiz = null;
            return true;
        }
        return false;
    }

    public boolean esVacio() {
        return raiz == null;
    }
}

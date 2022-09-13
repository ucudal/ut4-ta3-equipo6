public class TElementoAB<T> implements IElementoAB<T> {

    private Comparable etiqueta;
    private TElementoAB hijoIzq;
    private TElementoAB hijoDer;
    private T datos;

    /**
     * @param unaEtiqueta
     * @param unosDatos
     * @return 
     */
    public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
    }

    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    @Override
    public T getDatos() {
        return this.datos;
    }

    @SuppressWarnings("unchecked")
    @Override
    public TElementoAB<T> getHijoIzq() {
        return this.hijoIzq;
    }

    @SuppressWarnings("unchecked")
    @Override
    public TElementoAB<T> getHijoDer() {
        return this.hijoDer;
    }

    @Override
    public void setHijoIzq(TElementoAB<T> elemento) {
        this.hijoIzq = elemento;
    }

    @Override
    public void setHijoDer(TElementoAB<T> elemento) {
        this.hijoDer = elemento;
    }

    @SuppressWarnings("unchecked")
    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (unaEtiqueta.compareTo(etiqueta) == 0) {
            return this;
        }
        if (unaEtiqueta.compareTo(etiqueta) < 0) {
            if (hijoIzq != null) {
                return hijoIzq.buscar(unaEtiqueta);
            } else {
                return null;
            }
        }
        if (hijoDer != null) {
            return hijoDer.buscar(unaEtiqueta);
        } else {
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    public TElementoAB<T> buscarConContador(Comparable unaEtiqueta, int[] contador) {
        contador[0]++;
        if (unaEtiqueta.equals(etiqueta)) {
            return this;
        } else if (unaEtiqueta.compareTo(etiqueta) < 0) {
            if (hijoIzq != null) {
                return getHijoIzq().buscarConContador(unaEtiqueta, contador);
            } else {
                return null;
            }
        } else if (hijoDer != null) {
            return getHijoDer().buscarConContador(unaEtiqueta, contador);
        } else {
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean insertar(TElementoAB<T> elemento) {
        if (elemento.getEtiqueta().compareTo(etiqueta) < 0) {
            if (hijoIzq == null) {
                hijoIzq = elemento;
                return true;
            } else {
                return getHijoIzq().insertar(elemento);
            }
        } else if (elemento.getEtiqueta().compareTo(etiqueta) > 0) {
            if (hijoDer == null) {
                hijoDer = elemento;
                return true;
            } else {
                return getHijoDer().insertar(elemento);
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    public boolean insertarConContador(TElementoAB<T> elemento, int[] contador) {
        contador[0]++;
        if (elemento.getEtiqueta().compareTo(etiqueta) < 0) {
            if (hijoIzq == null) {
                hijoIzq = elemento;
                return true;
            } else {
                return getHijoIzq().insertarConContador(elemento, contador);
            }
        } else if (elemento.getEtiqueta().compareTo(etiqueta) > 0) {
            if (hijoDer == null) {
                hijoDer = elemento;
                return true;
            } else {
                return getHijoDer().insertarConContador(elemento, contador);
            }
        } else {
            return false;
        }
    }

    @Override
    public String inOrden() {
        StringBuilder resultado = new StringBuilder();
        if (hijoIzq != null) {
            resultado.append(getHijoIzq().inOrden());
            resultado.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
        }
        resultado.append(etiqueta.toString());
        if (hijoDer != null) {
            resultado.append(TArbolBB.SEPARADOR_ELEMENTOS_IMPRESOS);
            resultado.append(getHijoDer().inOrden());
        }
        return resultado.toString();
    }

    @Override
    public void inOrden(Lista<T> unaLista) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int obtenerAltura() {
        if (hijoDer == null && hijoIzq == null){
            return 0;
        }
        else{
            int altDer = 0;
            int altIzq = 0;
            int res;
            if(hijoDer != null){
                altDer = hijoDer.obtenerAltura();
            }
            if(hijoIzq != null){
                altIzq = hijoIzq.obtenerAltura();
            }
            res = Math.max(altIzq, altDer) + 1;
            return res;
        }
    }

    @Override
    public int obtenerTamanio() {
        if (this.hijoIzq == null && this.hijoDer == null) {
            return 1;
        }

        int tamanioIzq = 0;
        int tamanioDer = 0;
        if (this.hijoIzq != null) {
            tamanioIzq = this.hijoIzq.obtenerTamanio();
        }

        if (this.hijoDer != null) {
            tamanioDer = this.hijoDer.obtenerTamanio();
        }

        return 1 + tamanioIzq + tamanioDer;
    }

    @Override
    public int obtenerNivel(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int obtenerCantidadHojas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TElementoAB<T> eliminar(Comparable unaEtiqueta) {
        if (unaEtiqueta.compareTo(this.getEtiqueta()) < 0) {
            if (this.hijoIzq != null) {
                this.hijoIzq = hijoIzq.eliminar(unaEtiqueta);
            }
            return this;
        }
        if (unaEtiqueta.compareTo(this.getEtiqueta()) > 0) {
            if (this.hijoDer != null) {
                this.hijoDer = hijoDer.eliminar(unaEtiqueta);
            }
            return this;
        }
        return quitarNodo();
    }

    private TElementoAB<T> quitarNodo() {
        if (hijoIzq == null) {
            return hijoDer;
        }
        if (hijoDer == null) {
            return hijoIzq;
        }

        TElementoAB<T> elHijo = hijoIzq;
        TElementoAB<T> elPadre = this;
        while (elHijo.getHijoDer() != null) {
            elPadre = elHijo;
            elHijo = elHijo.getHijoDer();
        }

        if (elPadre != this) {
            elPadre.setHijoDer(elHijo.getHijoIzq());
            elHijo.setHijoIzq(hijoIzq);
        }

        elHijo.setHijoDer(hijoDer);
        setHijoIzq(null);  // para que no queden referencias y ayudar al collector
        setHijoDer(null);
        return elHijo;
    }	
}

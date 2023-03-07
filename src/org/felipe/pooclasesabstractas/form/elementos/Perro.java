package org.felipe.pooclasesabstractas.form.elementos;

public class Perro extends Canino{

    private Integer fuerzaMordida;

    public Perro() {

    }

    @Override
    public String comer() {
        return null;
    }

    @Override
    public String dormir() {
        return null;
    }

    @Override
    public String correr() {
        return null;
    }

    @Override
    public String comunicarse() {
        return null;
    }

    public Perro(Integer fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }

    public Integer getFuerzaMordida() {
        return fuerzaMordida;
    }

    public void setFuerzaMordida(Integer fuerzaMordida) {
        this.fuerzaMordida = fuerzaMordida;
    }
}

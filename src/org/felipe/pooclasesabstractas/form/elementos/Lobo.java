package org.felipe.pooclasesabstractas.form.elementos;

public class Lobo extends Canino{

    private Integer numCamada;
    private Float especieLobo;

    public Lobo() {

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

    public Lobo(Integer numCamada, Float especieLobo) {
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Integer getNumCamada() {
        return numCamada;
    }

    public void setNumCamada(Integer numCamada) {
        this.numCamada = numCamada;
    }

    public Float getEspecieLobo() {
        return especieLobo;
    }

    public void setEspecieLobo(Float especieLobo) {
        this.especieLobo = especieLobo;
    }
}

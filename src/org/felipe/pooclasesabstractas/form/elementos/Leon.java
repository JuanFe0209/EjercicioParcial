package org.felipe.pooclasesabstractas.form.elementos;

public class Leon extends Felino {

    private Integer numManada;
    private Float potenciaRugidoDecibel;

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

    public Integer getNumManada() {
        return numManada;
    }

    public void setNumManada(Integer numManada) {
        this.numManada = numManada;
    }

    public Float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    public void setPotenciaRugidoDecibel(Float potenciaRugidoDecibel) {
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }
}
}

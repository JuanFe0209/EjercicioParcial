package org.felipe.pooclasesabstractas.form.elementos;

abstract public class Mamifero {

   protected String habitat;
   protected float altura;
   protected float largo;
   protected float Peso;
   protected String nombreCientifico;

    public Mamifero() {
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    abstract public String comer();
    abstract public String dormir();
    abstract public String correr();
    abstract public String comunicarse();

}

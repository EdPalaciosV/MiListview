package com.example.usuario.milistview.ClassesPOJO;

public class Item  {

    int imagen;
    String textoEspañol;
    String textoIngles;

    public Item(int imagen, String textoEspañol, String textoIngles) {
        this.imagen = imagen;
        this.textoEspañol = textoEspañol;
        this.textoIngles = textoIngles;
    }

    public int getImagen() {
        return imagen;
    }

    public String getTextoEspañol() {
        return textoEspañol;
    }

    public String getTextoIngles() {
        return textoIngles;
    }
}

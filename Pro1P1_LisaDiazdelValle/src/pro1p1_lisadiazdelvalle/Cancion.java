/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pro1p1_lisadiazdelvalle;

public class Cancion {

    private String cancion;
    private String album;
    private String artista;
    private int año;
    private int duracion;
    private int item;

    @Override
    public String toString() {
        return cancion + " - " + artista;
    }

    public String toStringcompleto() {
        return "Canción: " + cancion + "\n"
                + "Álbum: " + album + "\n"
                + "Artista: " + artista + "\n"
                + "Año: " + año + "\n"
                + "Duración: " + duracion + " min";
    }

    public Cancion(String cancion, String album, String artista, int año, int duracion) {
        this.cancion = cancion;
        this.album = album;
        this.artista = artista;
        this.año = año;
        this.duracion = duracion;
    }

    public String getCancion() {
        return cancion;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String duraciontoString() {
        String duracions = "";
        duracions = Integer.toString(duracion);
        return duracions;
    }

    public String antoString() {
        String años = "";
        años = Integer.toString(año);
        return años;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author arceb
 */
public class Materia {
    private int idMateria;
    private String nombre;
    private int anio;

    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    // toString para mostrar Materia y Año
    @Override
    public String toString() {
        return "Materia: "+nombre + " (Año: " + anio + ")";
    }

    /* equals para comparar por idMateria si existe la materia */
    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }else if (!(o instanceof Materia)){
            return false;
        }
        Materia materia = (Materia) o;
        return idMateria == materia.idMateria;
    }

    /* Sobrescribir hashCode para que funcione bien en HashSet */
    @Override
    public int hashCode() {
        return Integer.hashCode(idMateria);
    }
}

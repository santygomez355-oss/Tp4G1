/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.HashSet;

/**
 *
 * @author arceb
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    
    private HashSet<Materia> materia = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m){
        if (materia.add(m)) { /*add intenta agregar materia controlado por HashSet*/
            javax.swing.JOptionPane.showMessageDialog(
                null,
                "Inscripción exitosa en " + m.getNombre(),
                "Alta materia",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(
                null,
                "El alumno ya está inscripto en " + m.getNombre(),
                "Inscripción duplicada",
                javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    /* toString para mostrar en ComboBox */
    @Override
    public String toString() {
        return "(Legajo: " + legajo + ") Apellido: " + apellido + ", Nombre: " + nombre + ")"; 
        //return "Alumno{" + "legajo=" + legajo + ", apellido=" + apellido + ", nombre=" + nombre + ", materia=" + materia + '}';
    }
    
    /* equals para comparar por legajo si existe el alumno */
    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }else if (!(o instanceof Alumno)){
            return false;
        }
        Alumno alumno = (Alumno) o;
        return legajo == alumno.legajo;
    }
    
    /* Sobrescribir hashCode para que funcione bien en HashSet */
    @Override
    public int hashCode() {
        return Integer.hashCode(legajo);
    }
    
    /* Metodo cantidad de Materias */
    public int cantidadmaterias(){
        return materia.size();
    }
}

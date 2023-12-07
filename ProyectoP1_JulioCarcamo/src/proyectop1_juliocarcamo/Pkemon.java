/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectop1_juliocarcamo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jucec
 */
public class Pkemon {

// Clase para representar un pokémon con sus atributos
    

        private String nombre; // El nombre del pokémon
        private String tipo; // El tipo del pokémon (fuego, agua, planta, etc.)
        private String region; // La región de origen del pokémon (Kanto, Johto, Hoenn, etc.)
        private int salud;
        // Constructor de la clase

        public Pkemon() {
        }

        public Pkemon(String nombre, String tipo, String region, int salud) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.region = region;
            this.salud = salud;
        }
        
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public int getSalud() {
            return salud;
        }

        public void setSalud(int salud) {
            this.salud = salud;
        }

        @Override
        public String toString() {
            return "Pokemon" + ", nombre=" + nombre + ", tipo=" + tipo + ", region=" + region + ", salud =" + "salud";
        }
        
    }


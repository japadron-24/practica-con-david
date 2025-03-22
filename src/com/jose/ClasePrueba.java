package com.jose;

import java.util.LinkedList;
import javax.swing.*;
import java.util.Random;

public class ClasePrueba {
        
        //MARK: Atributos = variables 
        public LinkedList<Integer> lista;
        public Integer numero;
        
        //MARK: Metodos = funciones
        public ClasePrueba() {
            lista = new LinkedList<>();
            numero = 0;
        }

        private Integer generarRandom() {
            Random random = new Random();
            return random.nextInt(100);

        }

        public void add() {
            lista.add(this.generarRandom());
            numero++;
        }

        @Override
        public String toString() {
            return "ClasePrueba{" +
                    "lista=" + lista +
                    ", numero=" + numero +
                    '}';
        }

    }
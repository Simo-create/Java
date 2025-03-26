package com.exemplu.utilitati;

import com.exemplu.vizibilitate.Persoana;

public class Utilitati {
        private String curent;
        private String apa;
        public Persoana persoana;

        public Utilitati(String curent, String apa, Persoana persoana){
            this.curent = curent;
            this.apa = apa;
            this.persoana = persoana;
        }

        public void utilitati(){
            System.out.println("Utilitati " + curent + persoana);
        }


    }


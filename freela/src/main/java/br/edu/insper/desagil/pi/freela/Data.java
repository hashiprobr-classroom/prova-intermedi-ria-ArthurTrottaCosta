package br.edu.insper.desagil.pi.freela;

import java.util.Map;
import java.util.HashMap;

public class Data extends Momento{
    private int ano;
    private int mes;
    private int dia;
    private Map<Integer, Integer> limite;

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public Data(){
        this.ano = 1970;
        this.mes =1;
        this.dia =1;
        limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
    }


    public void atualiza(int ano, int mes, int dia){
        if (ano <1970){
            this.ano = 1970;
        } else if (ano>2070) {
            this.ano =2070;
        } else
            this.ano = ano;

        if (mes < 1){
            this.mes = 1;
        } else if (mes>12) {
            this.mes =1;
        } else
            this.mes = mes;

        if (dia <1){
            this.dia = 1;
        } else if (dia>getDia()) {
            this.dia =1;
        } else
            this.dia = dia;

    }
   // @Override
    public int atualiza(){
        return 60*24*365*(ano-1970)+60*24*(mes-1)*30+(dia-1)*24*60;
    }

}

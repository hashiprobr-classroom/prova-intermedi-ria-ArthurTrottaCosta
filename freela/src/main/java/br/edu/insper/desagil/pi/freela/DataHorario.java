package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento{
    private int hora;
    private int minuto;
    private Data data;

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public DataHorario(Data data){
        this.hora = 0;
        this.minuto = 0;
    }
    public void atualiza(int hora, int minuto){
        if (hora<0){
            this.hora = 0;
        } else if (hora>23) {
            this.hora = 23;
        }
        else
            this.hora = hora;

        if (minuto<0){
            this.minuto =0;
        } else if (minuto>59) {
            this.minuto = 59;
        }
        else
            this.minuto = minuto;

    }
    //@Override
    public int atualiza(){
        return hora*60+minuto;
    }

}

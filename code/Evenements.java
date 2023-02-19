package code;

import java.util.Date;

public class Evenements{
    private String nomEvent;
    private Date date;

    public Evenements(String nomEvent, Date date){
        this.nomEvent = nomEvent;
        this.date = date;
    }

    public String getNomEvent() {
        return nomEvent;
    }

    public void setNomEvent(String nomEvent) {
        this.nomEvent = nomEvent;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
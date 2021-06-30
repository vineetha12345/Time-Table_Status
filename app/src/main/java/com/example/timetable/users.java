package com.example.timetable;

public class users {
    String nam,subjec,branc,da,perio,clas,statu,id;
    public users(){

    }
    public users(String nam, String subjec, String branc, String da, String perio, String clas, String statu,String id) {
        this.nam = nam;
        this.subjec = subjec;
        this.branc = branc;
        this.da = da;
        this.perio = perio;
        this.clas = clas;
        this.statu = statu;
        this.id = id;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public String getSubjec() {
        return subjec;
    }

    public void setSubjec(String subjec) {
        this.subjec = subjec;
    }

    public String getBranc() {
        return branc;
    }

    public void setBranc(String branc) {
        this.branc = branc;
    }

    public String getDa() {
        return da;
    }

    public void setDa(String da) {
        this.da = da;
    }

    public String getPerio() {
        return perio;
    }

    public void setPerio(String perio) {
        this.perio = perio;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

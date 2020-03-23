package com.example.httpclientdemo.model;

public class Location {

    private String estado;
    private String pais;
    private int ultimoCasoReportado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getUltimoCasoReportado() {
        return ultimoCasoReportado;
    }

    public void setUltimoCasoReportado(int ultimoCasoReportado) {
        this.ultimoCasoReportado = ultimoCasoReportado;
    }

    @Override
    public String toString() {
        return "Location{" +
                "estado='" + estado + '\'' +
                ", pais='" + pais + '\'' +
                ", ultimoCasoReportado=" + ultimoCasoReportado +
                '}';
    }

}

package com.example.login_trabajo_final;

public class ClsCalculos {
    public ClsCalculos(double usuario, int cantidad_personas, double descuento, double iva) {
        this.usuario = usuario;
        this.cantidad_personas = cantidad_personas;
        this.descuento = descuento;
        this.iva = iva;
    }

    double usuario;
    int cantidad_personas;
    double descuento,iva;

    public double Calcular_valor_bruto(double usuario, int cantidad_personas){
        return usuario * cantidad_personas;
    }

    public double Calcular_valor_descuento(double usuario,int cantidad_personas, double descuento){
        return ((usuario*cantidad_personas)*descuento)/100;
    }

    public double Calcular_valor_iva(double usuario,int cantidad_personas, double descuento, double iva){

        return (((usuario * cantidad_personas)-descuento)*iva)/100;
    }

    public double Calcular_valor_neto(double usuario,double descuento,int cantidad_personas,  double iva){
        double subtotal = usuario * cantidad_personas;
        double descuento1 = subtotal - descuento;
        double iva1 = (subtotal - descuento1)*iva/100;
        return subtotal - descuento1 + iva1;
    }
}

package com.example.login_trabajo_final;

public class ClsServicios {
    public void setMetro_cubico(int metro_cubico) {
        this.metro_cubico = metro_cubico;
    }

    public void setKilovatio(int kilovatio) {
        this.kilovatio = kilovatio;
    }

    public void setEstracto(int estracto) {
        this.estracto = estracto;
    }

    public void setValor_metroc(double valor_metroc) {
        this.valor_metroc = valor_metroc;
    }

    public void setValor_kilov(double valor_kilov) {
        this.valor_kilov = valor_kilov;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTotal_pagar() {
        return total_pagar;
    }

    private int metro_cubico;
    private int kilovatio;
    private int estracto;
    private double valor_metroc;
    private double valor_kilov;
    private double descuento;
    private double subtotal_energia;
    private double subtotal_agua;
    private double subtotal;
    private double total_pagar;

    public void Calcular_Consumo(){
        subtotal_agua = metro_cubico * valor_metroc;
        subtotal_energia = valor_kilov * kilovatio;
        descuento = 0;
        subtotal = subtotal_agua+subtotal_energia;
        if (estracto >0 && estracto >=2 && metro_cubico >10 && kilovatio >100){
            descuento = 10;
        }
        total_pagar = subtotal_agua + subtotal_energia - descuento;
    }

}

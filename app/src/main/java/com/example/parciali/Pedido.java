package com.example.parciali;

import android.widget.EditText;

import java.io.Serializable;

public class Pedido implements Serializable {

    public int producto1;
    public int producto2;
    public int producto3;
    public int producto4;


    public Pedido(int producto1,int producto2,int producto3,int producto4){
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.producto3 = producto3;
        this.producto4 = producto4;
    }

    public Pedido(){

    }
    public int getproducto1() {return producto1;}
    public void setproducto1( int producto1 ){this.producto1 = producto1;}

    public int getproducto2() {return producto2;}
    public void setproducto2( int producto2) {this.producto2 = producto2;}

    public int getproducto3() {return producto3;}
    public void setProducto3 (int producto3) {this.producto3 = producto3;}

    public int getproducto4() {return producto4;}
    public void setproducto4( int producto4) {this.producto4 = producto4;}



}
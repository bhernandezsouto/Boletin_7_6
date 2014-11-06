/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_7_6;
import javax.swing.JOptionPane;
public class Productos {
    private String nombreA;
    private int ventasAnuales;
    private String consumo;
    public Productos (){
        String respuesta = JOptionPane.showInputDialog("Introduce nombre del articulo");
        nombreA = respuesta;
        respuesta = JOptionPane.showInputDialog("Introduce ventas anuales del articulo");
        ventasAnuales = Integer.parseInt(respuesta);
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }
    
    public void tipoVentas (){
        if (ventasAnuales <= 100){
            JOptionPane.showMessageDialog(null, "El consumo del articulo es bajo");
            consumo = "bajo";
        } 
        if ((ventasAnuales > 100) && (ventasAnuales <= 500)){
            JOptionPane.showMessageDialog(null, "El consumo del articulo es medio");
            consumo = "medio";
        }
        if ((ventasAnuales > 500) && (ventasAnuales <= 1000)){
            JOptionPane.showMessageDialog(null, "El consumo del articulo es alto");
            consumo = "alto";
        }
        if (ventasAnuales > 1000){
            JOptionPane.showMessageDialog(null, "El consumo del articulo es de primera necesidad");
            consumo = "primera necesidad";
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MINEDUCYT
 */
public class Venta {
  private int id;
  private int dui;
  private double total;
    
    public Venta(){
        
    }

    public Venta(int id, int dui, double total) {
        this.id = id;
        this.dui = dui;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getdui() {
        return dui;
    }

    public void setdui(int dui) {
        this.dui = dui;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
      
}

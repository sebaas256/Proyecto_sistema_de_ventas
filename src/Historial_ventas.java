/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MINEDUCYT
 */
public class Historial_ventas {
    private int id;
    private int codigo;
    private int total;
    
    public Historial_ventas(){
        
    }
    
    public Historial_ventas(int id, int codigo,int total){
        this.id =id;
        this.codigo=codigo;
        this.total=total;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }
    public void setTotal(int id) {
        this.id = id;
    }
    
}

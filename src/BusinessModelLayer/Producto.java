
package BusinessModelLayer;


public class Producto {
    
    private int idProducto;
    private String nombre;
    private String caducidad;
    private int stock;
    private int idFarmacia;

    public Producto() {
    }

    public Producto(int idProducto, String nombre, String caducidad, int stock, int idFarmacia) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.caducidad = caducidad;
        this.stock = stock;
        this.idFarmacia = idFarmacia;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIdFarmacia() {
        return idFarmacia;
    }

    public void setIdFarmacia(int idFarmacia) {
        this.idFarmacia = idFarmacia;
    }
    
    
    
}

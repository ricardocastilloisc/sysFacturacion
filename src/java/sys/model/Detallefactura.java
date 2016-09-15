package sys.model;
// Generated 15-sep-2016 11:55:11 by Hibernate Tools 4.3.1



/**
 * Detallefactura generated by hbm2java
 */
public class Detallefactura  implements java.io.Serializable {


     private Integer codDetalle;
     private Factura factura;
     private Producto producto;
     private long precioVenta;
     private int cantidad;

    public Detallefactura() {
    }

    public Detallefactura(Factura factura, Producto producto, long precioVenta, int cantidad) {
       this.factura = factura;
       this.producto = producto;
       this.precioVenta = precioVenta;
       this.cantidad = cantidad;
    }
   
    public Integer getCodDetalle() {
        return this.codDetalle;
    }
    
    public void setCodDetalle(Integer codDetalle) {
        this.codDetalle = codDetalle;
    }
    public Factura getFactura() {
        return this.factura;
    }
    
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public long getPrecioVenta() {
        return this.precioVenta;
    }
    
    public void setPrecioVenta(long precioVenta) {
        this.precioVenta = precioVenta;
    }
    public int getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }




}



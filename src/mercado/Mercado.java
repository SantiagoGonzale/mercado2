package mercado;

public class Mercado {
    
    private int dueños;
    private int pasillos;
    private int cantidadDeComerciantes;
    private int inventario;
    private boolean tarjeta;
    private boolean servicio;

    public void nuevosDueños(){
        dueños = 2;
    }
    
    public void nuevosPasillos(){
        pasillos = 3;
    }
    
    public void comerciantes(){
        cantidadDeComerciantes = 5;
    }
    
    public void nuevosProductos(){
        inventario = 50;
    }
    
    public void aceptaTarjeta(){
        tarjeta = true;
    }
    
    public void servicioVeinticuatroHoras(){
        servicio = false;
    }

    public int getDueños() {
        return dueños;
    }

    public void setDueños(int dueños) {
        this.dueños = dueños;
    }

    public int getPasillos() {
        return pasillos;
    }

    public void setPasillos(int pasillos) {
        this.pasillos = pasillos;
    }

    public int getCantidadDeComerciantes() {
        return cantidadDeComerciantes;
    }

    public void setCantidadDeComerciantes(int cantidadDeComerciantes) {
        this.cantidadDeComerciantes = cantidadDeComerciantes;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public boolean isTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(boolean tarjeta) {
        this.tarjeta = tarjeta;
    }

    public boolean isServicio() {
        return servicio;
    }

    public void setServicio(boolean servicio) {
        this.servicio = servicio;
    }
    
       public void nuevosComerciantes(int nuevaCantidadDeComerciantes){
        if(nuevaCantidadDeComerciantes<=this.cantidadDeComerciantes){
            System.out.println("No hay nuevos comerciantes: ");
        }else{
            this.cantidadDeComerciantes = nuevaCantidadDeComerciantes;
            System.out.println("La nueva cantidad de comerciantes es: ");         
        }
    }
    
   
}

package mercado;

public class productos extends Mercado{
    
    private int cantidadDeProductosPropios;
    private boolean propiosDeLaMarca;
    private String creadores;

    public productos(int cantidadDeProductosPropios, boolean propiosDeLaMarca, String creadores) {
        this.cantidadDeProductosPropios = cantidadDeProductosPropios;
        this.propiosDeLaMarca = propiosDeLaMarca;
        this.creadores = creadores;
    }

    public int getCantidadDeProductosPropios() {
        return cantidadDeProductosPropios;
    }

    public void setCantidadDeProductosPropios(int cantidadDeProductosPropios) {
        this.cantidadDeProductosPropios = cantidadDeProductosPropios;
    }

    public boolean isPropiosDeLaMarca() {
        return propiosDeLaMarca;
    }

    public void setPropiosDeLaMarca(boolean propiosDeLaMarca) {
        this.propiosDeLaMarca = propiosDeLaMarca;
    }

    public String getCreadores() {
        return creadores;
    }

    public void setCreadores(String creadores) {
        this.creadores = creadores;
    }
    
    
    
    
}

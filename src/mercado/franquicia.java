package mercado;

public class franquicia {
    
    private int nuevasFraquicias;
    private boolean inauguradas;
    private String contribuidor;

    public franquicia(int nuevasFraquicias, boolean inauguradas, String contribuidor) {
        this.nuevasFraquicias = nuevasFraquicias;
        this.inauguradas = inauguradas;
        this.contribuidor = contribuidor;
    }

    public int getNuevasFraquicias() {
        return nuevasFraquicias;
    }

    public void setNuevasFraquicias(int nuevasFraquicias) {
        this.nuevasFraquicias = nuevasFraquicias;
    }

    public boolean isInauguradas() {
        return inauguradas;
    }

    public void setInauguradas(boolean inauguradas) {
        this.inauguradas = inauguradas;
    }

    public String getContribuidor() {
        return contribuidor;
    }

    public void setContribuidor(String contribuidor) {
        this.contribuidor = contribuidor;
    }
    
    
    
}

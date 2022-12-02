package Proyecto;

public class Vuelo {
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precio;
    private int maxPasajeros;
    private int actualPasajeros;
    private Pasajero listaPasajeros[];

    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, double precio, int maxPasajeros) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.maxPasajeros = maxPasajeros;
        this.actualPasajeros = 0;
        this.listaPasajeros = new Pasajero[maxPasajeros];
    }
    
    public void insertarPasajero(Pasajero pasajero){
        listaPasajeros[actualPasajeros] = pasajero;
        actualPasajeros++;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public double getPrecio() {
        return precio;
    }

    public int getMaxPasajeros() {
        return maxPasajeros;
    }

    public int getActualPasajeros() {
        return actualPasajeros;
    }
    
    public Pasajero getPasajero(int i){
        return listaPasajeros[i];
    }
    
    public Pasajero getPasajero(String pasaporte){
        boolean encontrado = false;
        int i=0;
        Pasajero pas=null;
        while((!encontrado) && (i<listaPasajeros.length)){
            if(pasaporte.equals(listaPasajeros[i].getPasaporte())){
                encontrado = true;
                pas = listaPasajeros[i];
            }
            i++;
        }
        return pas;
    }
    
}

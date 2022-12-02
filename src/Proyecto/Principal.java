package Proyecto;

import java.util.Scanner;

public class Principal {
    
    static Scanner entrada = new Scanner(System.in);
    final static int num = 4;
    static Aeropuerto aeropuertos[] = new Aeropuerto[num];

    public static void main(String[] args) {
        insertarAeropuertos(aeropuertos);
        menu();
    }
    
    public static void insertarAeropuertos(Aeropuerto aero[]){
        aero[0] = new AeropuertoPublico(80000, "El Dorado", "Bogota", "Colombia");
        aero[0].insertarCompañia(new Compañia("Avianca"));
        aero[0].insertarCompañia(new Compañia("Viva Air"));
        aero[0].getCompañia("Avianca").insertarVuelo(new Vuelo("AV20", "Bogota", "Pereira", 120900, 150));
        aero[0].getCompañia("Avianca").insertarVuelo(new Vuelo("AV38", "Bogota", "Cartagena", 150900, 250));
        aero[0].getCompañia("Viva Air").insertarVuelo(new Vuelo("VV05", "Bogota", "Cali", 115900, 150));
        aero[0].getCompañia("Viva Air").insertarVuelo(new Vuelo("VV16", "Bogota", "Santa Marta", 150900, 200));
        aero[0].getCompañia("Avianca").getVuelo("AV20").insertarPasajero(new Pasajero("Mario Florez","PAS970924","Chino"));
        aero[0].getCompañia("Avianca").getVuelo("AV20").insertarPasajero(new Pasajero("Mateo Restrepo","PAS200130","Gringo"));
        aero[0].getCompañia("Viva Air").getVuelo("VV05").insertarPasajero(new Pasajero("Stefa Gomez","PAS980413","Rusa"));
        
        aero[1] = new AeropuertoPrivado("Matecana", "Pereira", "Colombia");
        String empresas[] = {"EP de Pereira","Concesión area 84"};
        ((AeropuertoPrivado)aero[1]).insertarEmpresas(empresas);
        aero[1].insertarCompañia(new Compañia("LATAM"));
        aero[1].insertarCompañia(new Compañia("Ultra Air"));
        aero[1].getCompañia("LATAM").insertarVuelo(new Vuelo("LT85", "Pereira", "Bucaramanga", 95900, 80));
        aero[1].getCompañia("LATAM").insertarVuelo(new Vuelo("LT89", "Pereira", "Medellin", 85900, 190));
        aero[1].getCompañia("Ultra Air").insertarVuelo(new Vuelo("UA24", "Pereira", "San Andres", 225400, 150));
        aero[1].getCompañia("Ultra Air").insertarVuelo(new Vuelo("UA48", "Pereira", "Mexico", 780200, 250));
        aero[1].getCompañia("LATAM").getVuelo("LT89").insertarPasajero(new Pasajero("Jairo Jimenez","PAS258424","Venezolano"));
        aero[1].getCompañia("Ultra Air").getVuelo("UA24").insertarPasajero(new Pasajero("Kelly Bernal","PAS000604","Francesa"));
        aero[1].getCompañia("Ultra Air").getVuelo("UA48").insertarPasajero(new Pasajero("Jaime Aladino","PAS960911","Arabe"));
        
        aero[2] = new AeropuertoPrivado("El Eden", "Armenia", "Colombia");
        String empresasAxm[] = {"Concesión aerea del Café","Fundación Parque del Café","Edén Tropical de América"};
        ((AeropuertoPrivado)aero[2]).insertarEmpresas(empresasAxm);
        aero[2].insertarCompañia(new Compañia("Viva Air"));
        aero[2].insertarCompañia(new Compañia("Ultra Air"));
        aero[2].getCompañia("Viva Air").insertarVuelo(new Vuelo("VV95", "Armenia", "Bogota", 105900, 80));
        aero[2].getCompañia("Viva Air").insertarVuelo(new Vuelo("VV96", "Armenia", "Cartagena", 195900, 190));
        aero[2].getCompañia("Ultra Air").insertarVuelo(new Vuelo("UA25", "Armenia", "Santa Marta", 185400, 150));
        aero[2].getCompañia("Ultra Air").insertarVuelo(new Vuelo("UA50", "Armenia", "Medellin", 130200, 250));
        aero[2].getCompañia("Viva Air").getVuelo("VV95").insertarPasajero(new Pasajero("Jose Manuel","PAS072544","Argentino"));
        aero[2].getCompañia("Viva Air").getVuelo("VV96").insertarPasajero(new Pasajero("Alexander Beltran","PAS971219","Italiano"));
        aero[2].getCompañia("Ultra Air").getVuelo("UA25").insertarPasajero(new Pasajero("Laura Echeverri","PAS980101","Ucraniana"));
        aero[2].getCompañia("Ultra Air").getVuelo("UA50").insertarPasajero(new Pasajero("Camila Andrea","PAS240484","Griega"));
        
        aero[3] = new AeropuertoPublico(120500, "Manuel Murillo", "Cali", "Colombia");
        aero[3].insertarCompañia(new Compañia("Avianca"));
        aero[3].insertarCompañia(new Compañia("LATAM"));
        aero[3].getCompañia("Avianca").insertarVuelo(new Vuelo("AV21", "Cali", "Bogota", 115900, 150));
        aero[3].getCompañia("Avianca").insertarVuelo(new Vuelo("AV39", "Cali", "Barranquilla", 150900, 250));
        aero[3].getCompañia("LATAM").insertarVuelo(new Vuelo("LT05", "Cali", "Cartagena", 195900, 150));
        aero[3].getCompañia("LATAM").insertarVuelo(new Vuelo("LT16", "Cali", "Bogota", 180900, 200));
        aero[3].getCompañia("Avianca").getVuelo("AV21").insertarPasajero(new Pasajero("Daniela Garcia","PAS990721","Noruega"));
        aero[3].getCompañia("LATAM").getVuelo("LT05").insertarPasajero(new Pasajero("Margarita Hernandez","PAS290610","Paisa"));
        aero[3].getCompañia("LATAM").getVuelo("LT16").insertarPasajero(new Pasajero("Cristiano Ronaldo","PAS850205","Portugues"));
        
    }
    
    
    public static void menu(){
        int opcion;
        String nombreAeropuerto, nombreCompañia, origen, destino;
        Aeropuerto aeropuerto;
        Compañia compañia;
        
        do{
            System.out.println("\t. :MENU: .");
            System.out.println("1. Ver aeropuertos gestionados(Públicos o Privados)");
            System.out.println("2. Ver empresas (Privado) o Subvencion (Público)");
            System.out.println("3. Lista de compañías por Aeropuerto");
            System.out.println("4. Lista de vuelos por Compañía");
            System.out.println("5. Listar posibles vuelos según Origen y Destino");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("");
                    mostrarAeropuertos(aeropuertos);
                    break;
                case 2:
                    System.out.println("");
                    mostrarPatrocinio(aeropuertos);
                    break;
                case 3:
                    System.out.print("\nDigite el nombre del aeropuerto: ");
                    entrada.nextLine();
                    nombreAeropuerto = entrada.nextLine();
                    aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                    if(aeropuerto==null){
                        System.out.println("El aeropuerto no existe");
                    }
                    else{
                        mostrarCompañias(aeropuerto);
                    }
                    break;
                case 4:
                    System.out.print("\nDigite el nombre del aeropuerto: ");
                    entrada.nextLine();
                    nombreAeropuerto = entrada.nextLine();
                    aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                    if(aeropuerto==null){
                        System.out.println("El aeropuerto no existe");
                    }
                    else{
                        System.out.print("Digite el nombre de la compañia: ");
                        nombreCompañia = entrada.nextLine();
                        compañia = aeropuerto.getCompañia(nombreCompañia);
                        mostrarVuelos(compañia);
                    }
                    break;
                case 5:
                    entrada.nextLine();
                    System.out.print("\nDigite la Ciudad de Origen: ");
                    origen = entrada.nextLine();
                    System.out.print("Digite la Ciudad Destino: ");
                    destino = entrada.nextLine();
                    mostrarVuelo(origen,destino,aeropuertos);
                    
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Error, la opción elegida no es valida");
                    break;
            }
            System.out.println("");
        }while(opcion!=6);
    }
    
    public static void mostrarAeropuertos(Aeropuerto aeropuertos[]){
        for(int i=0; i< aeropuertos.length; i++){
            if(aeropuertos[i] instanceof AeropuertoPrivado){
                System.out.println("Aeropuerto Privado");
                System.out.println("Nombre: "+aeropuertos[i].getNombre());
                System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
                System.out.println("País: "+aeropuertos[i].getPais());
            }
            else{
                System.out.println("Aeropuerto Publico");
                System.out.println("Nombre: "+aeropuertos[i].getNombre());
                System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
                System.out.println("País: "+aeropuertos[i].getPais());
            }
            System.out.println("");
        }
    }
    
    public static void mostrarPatrocinio(Aeropuerto aeropuertos[]){
        String empresas[];
        
        for(int i=0; i<aeropuertos.length; i++){
            if(aeropuertos[i] instanceof AeropuertoPrivado){
                System.out.print("Aeropuerto Privado: "+aeropuertos[i].getNombre());
                empresas = ((AeropuertoPrivado)aeropuertos[i]).getListaEmpresas();
                System.out.println("Empresas: ");
                for(int j=0;j<empresas.length;j++){
                    System.out.println(empresas[j]);
                }
            }
            else{
                System.out.println("Aeropuerto Público: "+aeropuertos[i].getNombre());
                System.out.println("Subvención: "+((AeropuertoPublico)aeropuertos[i]).getSubvencion());
            }
            System.out.println("");
        }
    }
    
    public static Aeropuerto buscarAeropuerto(String nombre, Aeropuerto aeropuertos[]){
        boolean encontrado = false;
        int i=0;
        Aeropuerto aero = null;
        while((!encontrado) && (i<aeropuertos.length)){
            if(nombre.equals(aeropuertos[i].getNombre())){
                encontrado = true;
                aero = aeropuertos[i];
            }
            i++;
        }
        return aero;
    }
    
    public static void mostrarCompañias(Aeropuerto aeropuerto){
            System.out.println("\nLas compañías del aeropuerto: "+aeropuerto.getNombre());
            for(int i=0; i<aeropuerto.getNumCompañia(); i++){
                System.out.println(aeropuerto.getCompañia(i).getNombre());
            }
    }
    
    public static void mostrarVuelos(Compañia compañia){
        Vuelo vuelo;
        System.out.print("\nLos vuelos de la compañia: "+compañia.getNombre());
        for(int i=0; i<compañia.getNumVuelo();i++){
            vuelo = compañia.getVuelo(i);
            System.out.print("\nIdentificador: "+vuelo.getIdentificador());
            System.out.print("\nCiudad origen: "+vuelo.getCiudadOrigen());
            System.out.print("\nCiudad destino: "+vuelo.getCiudadDestino());
            System.out.print("\nPrecio: $"+vuelo.getPrecio());
            System.out.println("");
        }
    }
    
    public static Vuelo[] buscarVuelos(String origen, String destino, Aeropuerto aeropuertos[]){
        Vuelo vuelo, listaVuelos[];
        int contador = 0;
        
        for(int i = 0; i<aeropuertos.length; i++){                                      //recorrer aeropuertos
            for(int j = 0; j<aeropuertos[i].getNumCompañia(); j++){                     //recorrer compañias
                for(int k = 0; k<aeropuertos[i].getCompañia(j).getNumVuelo(); k++){     //recorrer vuelos
                    vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
                    if((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))){
                        contador++;
                        
                    }
                }
            }
        }
        listaVuelos = new Vuelo[contador];
        int q = 0;
        
        for(int i = 0; i<aeropuertos.length; i++){                                      //recorrer aeropuertos
            for(int j = 0; j<aeropuertos[i].getNumCompañia(); j++){                     //recorrer compañias
                for(int k = 0; k<aeropuertos[i].getCompañia(j).getNumVuelo(); k++){     //recorrer vuelos
                    vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
                    if((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))){
                        listaVuelos[q] = vuelo;
                        q++;
                    }
                }
            }
        }
        return listaVuelos;
    }
    
    public static void mostrarVuelo(String origen, String destino, Aeropuerto aeropuertos[]){
        Vuelo vuelos[];
        vuelos = buscarVuelos(origen,destino,aeropuertos);
        if(vuelos.length==0){
            System.out.println("No existen vuelos de esa ciudad de origen a destino");
        }
        else{
            System.out.println("\nVuelos Encontrados: \n");
            for(int i = 0; i<vuelos.length; i++){
                System.out.print("Identificador: "+vuelos[i].getIdentificador());
                System.out.print("\nCiudad origen: "+vuelos[i].getCiudadOrigen());
                System.out.print("\nCiudad destino: "+vuelos[i].getCiudadDestino());
                System.out.print("\nPrecio: $"+vuelos[i].getPrecio());
                System.out.println("\n");
            }
        }
    }
    
}

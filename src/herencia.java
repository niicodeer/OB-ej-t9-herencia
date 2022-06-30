public class herencia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 30;
        cliente.nombre= "Raúl";
        cliente.telefono= 111222333;
        cliente.credito = true;
        
        System.out.println("Nombre del cliente: " + cliente.nombre);
        System.out.println("Edad del cliente: " + cliente.edad);
        System.out.println("Teléfono del cliente: " + cliente.telefono);
        System.out.println("¿Posee crédito?: " + cliente.credito);
        
        System.out.println("-------------------------------------");

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Juan";
        trabajador.edad = 24;
        trabajador.telefono = 444555666;
        trabajador.salario= 1200.50 ;

        System.out.println("Nombre del trabajador: " + trabajador.nombre);
        System.out.println("Edad del trabajador: " + trabajador.edad);
        System.out.println("Teléfono del trabajador: " + trabajador.telefono);
        System.out.println("Salario del trabajador: $" + trabajador.salario);        

    }
}

class Persona{
    int edad;
    int telefono;
    String nombre;    
}

class Cliente extends Persona{
    boolean credito;
}

class Trabajador extends Persona{
    double salario;
}




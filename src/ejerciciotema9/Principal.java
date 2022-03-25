package ejerciciotema9;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNombre("Jhoan");
        cliente.setEdad(21);
        cliente.setTelefono("312456789");
        cliente.setCredito(10000);

        System.out.println("El nombre del cliente es: "+cliente.getNombre()+"\ntiene una edad: "+cliente.getEdad()
        + "\nel numero de telefono es: "+ cliente.getTelefono()+"\ntiene un credito de: "+cliente.getCredito());
    }
}

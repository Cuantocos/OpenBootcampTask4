public class Main {
    public static void main(String[] args) {
        Cliente nuevoCliente = new Cliente();

        nuevoCliente.setEdad(24);
        nuevoCliente.setTelefono("115-879-4546");
        nuevoCliente.setNombre("Felipe");
        nuevoCliente.setCredito(50000.200);

        System.out.println("El nombre del cliente es " + nuevoCliente.getNombre() + ", su edad es "+ nuevoCliente.getEdad() + ", su telefono es "+nuevoCliente.getTelefono()+ " y su credito esta en " + nuevoCliente.getCredito());

        Trabajador nuevoTrabajador = new Trabajador();

        nuevoTrabajador.setEdad(35);
        nuevoTrabajador.setTelefono("115-888-5546");
        nuevoTrabajador.setNombre("Juan");
        nuevoTrabajador.setSalario(80000);

        System.out.println("El nombre del trabajador es " + nuevoTrabajador.getNombre() + ", su edad es "+ nuevoTrabajador.getEdad() + ", su telefono es "+nuevoTrabajador.getTelefono()+ " y su salario esta en " + nuevoTrabajador.getSalario());
    }
}

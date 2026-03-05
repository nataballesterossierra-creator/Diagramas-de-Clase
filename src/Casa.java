//Composicion
class Habitacion {

    String tipo;

    public Habitacion(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

class Casa {

    Habitacion habitacion;

    public Casa() {
        habitacion = new Habitacion("Dormitorio");
    }

    public void mostrarHabitacion() {
        System.out.println("Tipo de habitación: " + habitacion.getTipo());
    }
}

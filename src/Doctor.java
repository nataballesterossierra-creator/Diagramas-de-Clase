class Paciente {

    String nombre;

    public Paciente(String nombre) {
        this.nombre = nombre;
    }
}

class Doctor {

    String nombre;

    public Doctor(String nombre) {
        this.nombre = nombre;
    }

    public void atenderPaciente(Paciente paciente) {
        System.out.println("Atendiendo a " + paciente.nombre);
    }
}
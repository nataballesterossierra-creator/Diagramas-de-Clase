//Agregacion
class Profesor {

    String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Universidad {

    String nombre;
    Profesor profesor;

    public Universidad(String nombre, Profesor profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public void mostrarProfesor() {
        System.out.println("Profesor: " + profesor.getNombre());
    }
}

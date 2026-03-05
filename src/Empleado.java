//Herencia
public abstract class Empleado {

        protected String Nombre;
        protected int Edad;

        public Empleado() {
        }

        public Empleado(String nombre, int edad) {
            Nombre = nombre;
            Edad = edad;
        }
        public abstract int calcularSalario();

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String nombre) {
            Nombre = nombre;
        }

        public int getEdad() {
            return Edad;
        }

        public void setEdad(int edad) {
            Edad = edad;
        }

        @Override
        public String toString() {
            return "Empleado{" +
                    "Nombre= '" + Nombre + '\'' +
                    ",  Edad= " + Edad ;
        }
}
class Empleado_Planta extends Empleado {

    private int salarioFijo;

    public Empleado_Planta() {
    }

    public Empleado_Planta(String nombre, int edad, int salarioFijo) {
        super(nombre, edad);
        this.salarioFijo = salarioFijo;
    }

    public int getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(int salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    @Override
    public int calcularSalario() {
        return salarioFijo;
    }

    @Override
    public String toString() {
        return super.toString()+ ",  Tipo: Planta, " +
                "  Salario:  " + salarioFijo ;
    }
}

 class EmpleadoxHoras extends Empleado{

    private int pagoxHoras;
    private int horasTrabajadas;

    public EmpleadoxHoras() {
    }

    public EmpleadoxHoras(String nombre, int edad, int pagoxHoras, int horasTrabajadas) {
        super(nombre, edad);
        this.pagoxHoras = pagoxHoras;
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getPagoxHoras() {
        return pagoxHoras;
    }

    public void setPagoxHoras(int pagoxHoras) {
        this.pagoxHoras = pagoxHoras;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public int  calcularSalario() {
        return pagoxHoras * horasTrabajadas;

    }

    @Override
    public String toString() {
        return super.toString()+ ", Tipo: xHoras,  " +
                "   PagoxHoras=  " + pagoxHoras +
                ",   HorasTrabajadas= " + horasTrabajadas +
                ",   Salario Total: "+ calcularSalario();
    }


}


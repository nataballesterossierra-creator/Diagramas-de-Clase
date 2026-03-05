// Implementacion
    interface Vehiculo {

        void acelerar();

        void frenar();
    }

    class Carro implements Vehiculo {

        @Override
        public void acelerar() {
            System.out.println("El carro está acelerando");
        }

        @Override
        public void frenar() {
            System.out.println("El carro está frenando");
        }
    }

    class Moto implements Vehiculo {

        @Override
        public void acelerar() {
            System.out.println("La moto está acelerando");
        }

        @Override
        public void frenar() {
            System.out.println("La moto está frenando");
        }
    }


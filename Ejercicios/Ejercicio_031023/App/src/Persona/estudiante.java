package Persona;

public class estudiante extends persona {
        private String matricula;
        private String carrera;
    
        public estudiante(String nombre, int edad, String dni, String matricula, String carrera) {
            super(nombre, edad, dni);
            this.matricula = matricula;
            this.carrera = carrera;
        }
            
        public String getMatricula() {
            return matricula;
        }
    
        public String getCarrera() {
            return carrera;
        }
    
        // Métodos para establecer los atributos de Estudiante (Getters & Setters)
        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }
    
        public void setCarrera(String carrera) {
            this.carrera = carrera;
        }
    }
    

public abstract class Freelancer {
    public int Id;
    public String Nombre;
    public double HorasTrabajadas;

    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getHorasTrabajadas() {
        return HorasTrabajadas;
    }
    public void setHorasTrabajadas(double horasTrabajadas) {
        HorasTrabajadas = horasTrabajadas;
    }


    public abstract double CalcularPago();
    public void MostrarInformaccion(){
        
    }
}

public abstract class Freelancer {
    private int Id;
    private String Nombre;
    private double HorasTrabajadas;

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


    public abstract void CalcularPago();
    public void MostrarInformaccion(){
        
    }
}

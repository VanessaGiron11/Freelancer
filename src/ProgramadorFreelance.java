public class ProgramadorFreelance extends Freelancer{
    private String Nombre;
    private Double Salario;

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Double getalario() {
        return Salario;
    }
    public void setSalario(Double salario) { Salario = salario;}

    @Override
    public double CalcularPago()
    { return HorasTrabajadas * Salario;}

    @Override
    public void MostrarInformaccion() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Id: " + Id);
        System.out.println("Horas trabajadas: " + HorasTrabajadas);
        System.out.println("El total del pago es: " + Salario);
    }
}

public class DiseñadorFreelance extends Freelancer {
    public String herramientaPrincipal;
    public final double tarifaHora = 20.0;

    public DiseñadorFreelance(String nombre, int id, double horas, String herramientaPrincipal) {
        this.Nombre = nombre;
        this.Id = id;
        this.HorasTrabajadas = horas;
        this.herramientaPrincipal = herramientaPrincipal;
    }

    @Override
    public double CalcularPago() {
        return HorasTrabajadas * tarifaHora;
    }

    @Override
    public void MostrarInformaccion() {
        System.out.println("Diseñador Freelance");
        System.out.println("Nombre: " + Nombre);
        System.out.println("ID: " + Id);
        System.out.println("Horas trabajadas: " + HorasTrabajadas);
        System.out.println("Herramienta principal: " + herramientaPrincipal);
        System.out.println("Pago calculado: $" + CalcularPago());
        System.out.println("----------------------------");
    }
}

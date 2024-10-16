package entity;

public class CasaFacade {
    private SistemaDeIluminacion iluminacion;
    private SistemaDeClimatizacion climatizacion;
    private SistemaDeSeguridad seguridad;
    private SistemaDeEntretenimiento entretenimiento;

    public CasaFacade() { // Constructor de cada subsistema
        this.iluminacion = new SistemaDeIluminacion();
        this.climatizacion = new SistemaDeClimatizacion();
        this.seguridad = new SistemaDeSeguridad();
        this.entretenimiento = new SistemaDeEntretenimiento();
    }

    public void modoNoche() { // Utiliza los métodos correspondientes de cada subsistema para un horario nocturno
        iluminacion.apagarLuces();
        climatizacion.encenderAireAcondicionado();
        seguridad.activarSistema();
        entretenimiento.apagarTelevisor();
        System.out.println("Modo noche activado.");
    }

    public void modoDia() { // Utiliza los métodos correspondientes de cada subsistema para un horario diurno
        iluminacion.encenderLuces();
        climatizacion.apagarAireAcondicionado();
        seguridad.desactivarSistema();
        entretenimiento.encenderTelevisor();
        System.out.println("Modo día activado.");
    }
}

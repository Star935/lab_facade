import entity.CasaFacade;

public class Main {
    public static void main(String[] args) {
        // Inicializar una nueva casa
        CasaFacade casa = new CasaFacade();

        // Activar modo noche
        casa.modoNoche();

        System.out.println();

        // Activar modo día
        casa.modoDia();
    }
}
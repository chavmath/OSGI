public class Activator {

    private int a = 76;

    public void start() {
        double result = Math.sqrt(a); 
        System.out.println("Starting the bundle");
        System.out.println("La raíz cuadrada de " + a + " es: " + result);
    }

    public void stop() {
        System.out.println("Stopping the bundle");
    }

    public static void main(String[] args) {
        Activator activator = new Activator();
        activator.start();
        activator.stop();
    }
}

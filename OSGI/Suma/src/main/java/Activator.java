public class Activator {

    private int a = 45;
    private int b = 68;

    public void start() {
        int result = a + b; 
        System.out.println("Starting the bundle");
        System.out.println("La suma de " + a + "+" + b + " es: " + result);
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

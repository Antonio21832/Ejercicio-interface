public class Cancion extends Contenido implements Reproducible, Descargable {
    private int duracionseg;
    private double tamanoMB;

    public Cancion(String titulo, String autor, int duracionseg, double tamanoMB) {
        super(titulo, autor);
        this.duracionseg = duracionseg;
        this.tamanoMB = tamanoMB;
    }   

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo: " + titulo + " de " + autor);
    }

    @Override
    public int getDuracionseg() {
        return duracionseg;
    }

    @Override
    public double calcularTamanoMB() {
        return tamanoMB;
    }
}
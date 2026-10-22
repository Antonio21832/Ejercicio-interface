public class Podcast extends Contenido implements Reproducible, Descargable {
    private int duracionseg;
    private double tamanoMB;
    private int episodios;

    public Podcast(String titulo, String autor, int duracionseg, double tamanoMB, int episodios) {
        super(titulo, autor);
        this.duracionseg = duracionseg;
        this.tamanoMB = tamanoMB;
        this.episodios = episodios;
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
    
    @Override 
    public int getEpisodios() {
        return episodios;
    }
}
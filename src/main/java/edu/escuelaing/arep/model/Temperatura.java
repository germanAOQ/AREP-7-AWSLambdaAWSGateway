package edu.escuelaing.arep.model;

/**
 * Clase que permite modelar los grados farenheit (input) y celsius (output)
 */
public class Temperatura {
    private double farenheit;
    private double celcius;

    public Temperatura() {
    }

    public Temperatura(double farenheit, double celcius) {
        this.farenheit = farenheit;
        this.celcius = celcius;
    }

    public double getFarenheit() {
        return farenheit;
    }

    public void setFarenheit(double farenheit) {
        this.farenheit = farenheit;
    }

    public double getCelcius() {
        return celcius;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }
}

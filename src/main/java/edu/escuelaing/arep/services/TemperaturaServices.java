package edu.escuelaing.arep.services;

public class TemperaturaServices {
    /**
     * Permite hacer la conversión de grados farenheit a celsius.
     *
     * @param farenheitGrades grados farenheit a ser convertidos.
     * @return los grados celsius.
     */
    public double farenheitToCelcius(double farenheitGrades){
        double celcius = 0;
        celcius = ((farenheitGrades - 32)*5)/9;
        return celcius;
    }
}

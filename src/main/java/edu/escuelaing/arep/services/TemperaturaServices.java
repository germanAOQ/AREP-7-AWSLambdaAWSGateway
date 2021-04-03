package edu.escuelaing.arep.services;

public class TemperaturaServices {
    /**
     *
     *
     * @param farenheitGrades
     * @return
     */
    public double farenheitToCelcius(double farenheitGrades){
        double celcius = 0;
        celcius = ((farenheitGrades - 32)*5)/9;
        return celcius;
    }
}

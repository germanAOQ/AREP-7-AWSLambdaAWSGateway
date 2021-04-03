package edu.escuelaing.arep.sparktemperatureserver;

import com.google.gson.Gson;
import edu.escuelaing.arep.model.Temperatura;
import edu.escuelaing.arep.services.TemperaturaServices;

import static spark.Spark.*;


public class SparkTemperatureServer {
    public static void main(String[] args){
        final TemperaturaServices temperaturaServices = new TemperaturaServices();
        port(getPort());
        get("/convert", (req, res) -> {
           String valueString = req.queryMap().get("value").value();
           Double value = Double.parseDouble(valueString);
           Temperatura temperatura = new Temperatura();
           temperatura.setFarenheit(value);
           temperatura.setCelcius(temperaturaServices.farenheitToCelcius(value));
           return new Gson().toJson(temperatura);
        });
    }

    /** Permite retornar el puerto que por defecto asigna el entorno.
     * @return el puerto asignado por el entorno.
     */
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}

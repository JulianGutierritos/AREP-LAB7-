package edu.eci.arep;

import static spark.Spark.*;


import edu.eci.arep.service.MathService;
import edu.eci.arep.service.impl.MathServiceEucli;


/**
 * Clase principal cuya tarea es arrancar un servidor HTTP
 * 
 * @author Julián Gutiérrez
 * @version 1.0
 */
public class Main {

	/**
	 * inicializa spark
	 * 
	 */
	public static void main(String... args) {
		MathService ms = new MathServiceEucli();
		int [] pr = ms.calcularMCMyMCD(11, 7);
		staticFiles.location("/static");
        port(getPort());
        get("hello", (req,res) -> "Hello Docker! " + getPort());
		get("/calcularMCMyMCD" , (req,res) ->{
			String a = req.queryParams("n1");
			String b = req.queryParams("n2");
			try{
				int n1 = Integer.parseInt(a);
				int n2 = Integer.parseInt(b);  
				if ((n1 <= 0) || (n2 <= 0)){
					return "400 Bad Request";
				}
				else{
					int [] resp = ms.calcularMCMyMCD(n1, n2);
					return "MCM: " + resp[0] + " MCD: " + resp[1];
				}
			} catch (Exception e) { return "400 Bad Request";}
		});

	}
	

	/**
	* Cambia el puerto 
	* @return puerto de la aplicacion
	*/
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 5000;
    }
    
}
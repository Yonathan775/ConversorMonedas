/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorTemperatura;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class functionTemperatura {
    
    ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius","Kelvin a Grados Celcius","Kelvin a Grados Farenheit"}, "Seleccion")).toString();
        switch(opcion) {
        case "Grados Celcius a Grados Farenheit":
        	temperatura.ConvertirCelciusAFarenheit(Minput);
        	break;
        case "Grados Celcius a Kelvin":
            temperatura.ConvertirCelciusAKelvin(Minput);
            break;
        case "Grados Farenheit a Grados Celcius":
           temperatura.ConvertirFarenheitACelcius(Minput);
           break;
        case "Kelvin a Grados Celcius":
           temperatura.ConvertirKelvinACelcius(Minput);
           break;
        case "Kelvin a Grados Farenheit":
        	temperatura.ConvertirKelvinAFarenheit(Minput);
        	break;
        }
	}
    
}

package principal;

import javax.swing.JOptionPane;

import conversorMonedas.function;


public class Principal {
    public static void main (String[] args) {

        function monedas = new function();
     
             
        while(true) {
        	//try{
        	String opciones = (JOptionPane.showInputDialog(null, "Que programa desea usuar? ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();
        	
               	switch(opciones) {
            	case "Conversor de Moneda":
            		 String input = JOptionPane.showInputDialog("Ingrese el efectivo que desea convertir: ");
                     if(ValidarNumero(input) == true) {
                         double Minput = Double.parseDouble(input);
                         monedas.ConvertirMonedas(Minput);

                         int respuesta=JOptionPane.showConfirmDialog(null,"¿Desea realizar otra conversión?");
                         if (JOptionPane.OK_OPTION == respuesta){
                         	System.out.println("Seleccione opción Afirmativa");
                         }else{
                            	JOptionPane.showMessageDialog(null, "Programa terminado");    
                            	
                         }

                        } else {
                            JOptionPane.showMessageDialog(null, "Valor inválido");                
                        }
                         	break;
            	

            	 case "Conversor de Temperatura":
            		 JOptionPane.showMessageDialog(null,"Este programa aun no estádisponible");
                 break;
            }
        		
        	/*}catch(NullPointerException exception) {
        		System.out.println(exception.getMessage());
        		System.out.println("Hasta Luego");*/
        		
        		
        	//}
        		
        	
      
    }
               
  }
    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}
        	

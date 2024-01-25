import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CambioVocalPorNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String nombreArchivoEntrada = "archivo.txt"; // Cambia esto al nombre de tu archivo de entrada
        String nombreArchivoSalida = "archivo_cambiado.txt"; // Cambia esto al nombre de tu archivo de salida

        try {
            // Paso 1: Leer el contenido del archivo original
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivoEntrada));
            StringBuilder contenido = new StringBuilder();
            String linea;
            String vocalA = "a";
            String vocalE = "e";
            String vocalI = "i";
            String vocalO = "o";
            String vocalU = "u";

            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append("\n");
            }

            br.close();

            // Paso 2: Sustituir
            
            String ContenidoString = contenido.toString();
            
            char [] charsContenido=ContenidoString.toCharArray();
            
	            for(int i=0;i<charsContenido.length;i++){
	  		      if(charsContenido[i] == vocalA.charAt(0)){//comparación
	  		    	charsContenido[i] = '1';
	  		      }
		  		      else if(charsContenido[i] == vocalI.charAt(0)){//comparación
		  		    	charsContenido[i] = '2';
		  		      }
		  		    else if(charsContenido[i] == vocalE.charAt(0)){//comparación
		  		    	charsContenido[i] = '3';
		  		      }
		  		  else if(charsContenido[i] == vocalO.charAt(0)){//comparación
		  		    	charsContenido[i] = '4';
		  		      }
		  		else if(charsContenido[i] == vocalU.charAt(0)){//comparación
	  		    	charsContenido[i] = '5';
	  		      }}    
	        String StringCambiado = charsContenido.toString();

            // Paso 3: Escribir el contenido invertido en un nuevo archivo
            FileWriter fw = new FileWriter(nombreArchivoSalida);
            fw.write(charsContenido);
            fw.close();

            System.out.println("El contenido del archivo se ha invertido exitosamente y se ha guardado en '" + nombreArchivoSalida + "'.");
        } catch (IOException e) {
            System.err.println("Error al procesar el archivo: " + e.getMessage());
        }
    

	}

}

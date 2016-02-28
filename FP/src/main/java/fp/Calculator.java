package fp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Calculator {


	/*
     * este metodo devuelve el Class del object que le pasamos
     */
	public static Class classTypeOf(Object x) {
		return x.getClass();
		/* Fuentes: 
		 * https://msdn.microsoft.com/es-es/library/aa989117(acum=vs.80).aspx
		 * http://www.mundosica.com/2015/el-metodo-getclass-explicacion-y-uso-practico-construyendo-librerias-en-java-i/
		 */
	}	


	/*
     * devuelve una lista con los n números de la serie de fibonacci.
     */
	public static List<Integer> fibonacci(int n) {
		ArrayList<Integer> acum = new ArrayList<Integer>();
		for(int i=0; i<n; i++)
			if(i<2){
				acum.add(1);
			}else{
			acum.add(acum.get(i-1)+acum.get(i-2));
			}
		return (acum);
		/* Fuentes:
		 * http://stackoverflow.com/questions/9139510/fibonacci-sequence-in-an-arraylist
		 * http://stackoverflow.com/questions/32686209/basic-arraylist-using-fibonacci-sequence
		 */
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	public static int[] stepThisNumber(int number, int step) {
		if(step==0)
			return new int[0];
		int length=(number-1)/step;
		int stepping[]=new int[length];
		int acum=0;
		while(number>step){
			number-=step;
			stepping[acum]=number;
			++acum;
		}
		return stepping;
		}

	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
		int length=0;
		if(n>0){
			for(int i=1; i<=n; i++)
				if(n%i == 0)
					length++;
		}else return null;
		int div[] = new int[length];
		try{	
			for (int i=n, j=0; i>0; i--) {
				if(n%i == 0){
					div[j] = i;
					j++;
				}
			}
			return div;
		}catch(IndexOutOfBoundsException e){
			return null;
		}
		/* Fuente:
		 * http://es.stackoverflow.com/questions/4794/divisi%C3%B3n-de-polinomios-en-java
		 */
	}

	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		return esPalindromo(cadena);
	}
	
	public static boolean esPalindromo(String frase){
		String cadena="";
		String tildes = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
		String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
		String fraseInversa="";
		
		if(frase==null)
			return false;
		
		frase=frase.toLowerCase();
		
		for(int i=0;i<frase.length();i++)
			if(Character.isLetter(frase.charAt(i)))
				if(tildes.indexOf(frase.charAt(i))!=-1)
					cadena+=ascii.charAt(tildes.indexOf(frase.charAt(i)));
				else
					cadena+=frase.charAt(i);
		for(int i=cadena.length()-1;i>=0;i--)
			fraseInversa+=cadena.charAt(i);
		if(cadena.equals(fraseInversa))
			return true;
		else return false;
		/* Fuente:
		 * http://www.v3rgu1.com/blog/231/2010/programacion/eliminar-acentos-y-caracteres-especiales-en-java/
		 */
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		  return intToString(n);
		}
	
		  public static String intToString(int numero){
			  
		  String[] decenas = {"Cero","Diez","Veinte","Treinta","Cuarenta","Cincuenta",
				  "Sesenta","Setenta","Ochenta","Noventa"};

		  String[] unidades = {"","uno","dos","tres","cuatro","cinco","seis","siete",
				  "ocho","nueve","Diez","Once","Doce","Trece","Catorce","Quince","Dieciseis",
				  "Diecisiete","Dieciocho","Diecinueve"};
	  
		  String numescrito="";
		  
		  if(numero==0){
			  numescrito=decenas[0];
			  return numescrito;
		  }
		  else if(numero<20){
			  numescrito=unidades[numero];
			  return numescrito;
		  }
		  else if((numero%10)==0){
			  numescrito=decenas[numero/10];
			  return numescrito;
		  }
		  else{
			  numescrito=decenas[numero/10]+" y "+unidades[numero%10];
			  return numescrito;
		  }
		  /* Fuentes:
		   * ftp://www.cc.uah.es/pub/Alumnos/FundamentosProgramacion/libro%20Python/c%C3%B3digos%20del%20libro/cardinal_v2.py
		   * http://doarsal.com/tudid/docs/numeroatexto.txt
		   * https://codepad.co/snippet/5252e6
		   */
		  }

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		return esBisiesto(fecha);
	}
	
	public static boolean esBisiesto(String fecha){
		int anyo;
		try {
			anyo = Integer.parseInt(fecha.substring(6));
		}catch (NumberFormatException e) {
			return false;
		}catch(IndexOutOfBoundsException i){
			return false;
		}
		if((anyo%100)==0 && (anyo%400)!=0)
			return false;
		if((anyo%4)==0)
			return true;
		else
			return false;
		/* Fuentes:
		 * https://es.wikibooks.org/wiki/Algoritmo_bisiesto
		 * http://lineadecodigo.com/java/ano-bisiesto-en-java/
		 * 
		 */
	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
		return fechaValida(date);
	}
	
	public static boolean fechaValida(String fecha){
		int dia, mes, anyo;
		
		try{
			//01-01-2001
			dia=Integer.parseInt(fecha.substring(0, 2));
			mes=Integer.parseInt(fecha.substring(3,5));
			anyo=Integer.parseInt(fecha.substring(6));
		}catch (NumberFormatException e) {
			return false;
		}catch(IndexOutOfBoundsException i){
			return false;
		}
		if(anyo>0){
			switch(mes){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:				
				if(dia<=31 && dia>0)
					return true;
					break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(dia<=30 && dia>0)
					return true;
					break;
			case 2:
				if(dia<=28 && dia>0)
					return true;
					break;
			}
		}		
		return false;
		/* Fuentes:
		 * http://www.redribera.es/formacion/tutoriales/sourcecode/javaseries/StringDateFormat1.java
		 * http://www.lawebdelprogramador.com/foros/Java/519917-Calculo-de-edad.html
		 */
	}
}

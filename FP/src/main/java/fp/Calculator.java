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
		 * https://msdn.microsoft.com/es-es/library/aa989117(v=vs.80).aspx
		 * http://www.mundosica.com/2015/el-metodo-getclass-explicacion-y-uso-practico-construyendo-librerias-en-java-i/
		 */
	}	


	/*
     * devuelve una lista con los n números de la serie de fibonacci.
     */
	public static List<Integer> fibonacci(int n) {
		throw  new NotImplementedException();
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
		
	}

	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		throw  new NotImplementedException();
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		throw  new NotImplementedException();
	}

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		throw  new NotImplementedException();
	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
		throw  new NotImplementedException();
	}
}

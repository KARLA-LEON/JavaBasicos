
public class ConversionDeDatos {

		public static void main(String[] args) {
			
			byte numeroByte =10;
			short numeroShort=numeroByte;
			int numeroInt=numeroShort;
			long numeroLong=numeroInt;
			
			//para hacer la conversión
			short otroShort=(short) numeroInt;
			
			short num1=123;
			short num2=7343;
			byte num3=12;
			byte num4=33;
			
			short suma = (short)(num1+num2);
			byte suma2 = (byte)(num3+num4);
			int suma3 = (num3+num4);
			short suma4 = (short)(num1+num3);//si no agregamos short, da error porque son tipos de numeros diferentes
			
		}
}

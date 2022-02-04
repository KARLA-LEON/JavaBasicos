import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Colecciones {
	
	public static void main(String[] args) {
		
		//Las colecciones nos sirven para almacenar un conjunto de objetos
		//pero de un mismo dato
		//Diferencia entre colecciones y objetos
		//Las colecciones son dinámicas, pueden tener más elementos
		//a diferencia de los arreglos, que una vez especificados 
		//ya no se pueden modificar
		
		
		//Colección de tipo Set, no puede contener elementos repetidos,
		//los elementos no mantienen una posición como en los arreglos,
		//se debe especificar el tipo de implementación:
		//HashSet => guarda los elementos en una tabla hash
		//TreeSet
		//LinkedHashSet
		
		
//		Set <String> frutas = new HashSet<String>();
//		//se deben importar el set y el hashset
//		//este tipo de implementación es la más rápida 
//		//ya que no mantiene el orden en el que se declararon
//		frutas.add("mango");
//		frutas.add("granada");
//		frutas.add("piña");
//		frutas.add("sandía");
//		frutas.add("mamey");
//		frutas.add("fresa");
//		
////		Se le indica en el for que cada que recorra la colección
////		va a extraer un elemento y se va a guardar en la variable de 
////		tipo string llamada fruta
//		
//		for(String fruta: frutas) {
//			System.out.println(fruta);
//		}

//		Set <String> frutas = new HashSet<String>();
//		frutas.add("mango");
//		frutas.add("granada");
//		frutas.add("piña");
//		frutas.add("sandía");
//		frutas.add("mamey");
//		frutas.add("fresa");
//		
//		for(String fruta: frutas) {
//			System.out.println(fruta);
//		}
//		
//		
//		Set <String> frutas = new TreeSet<String>();
//		//Es la implementación más lenta ya que ordena sus valores
//		frutas.add("mango");
//		frutas.add("granada");
//		frutas.add("piña");
//		frutas.add("sandía");
//		frutas.add("mamey");
//		frutas.add("fresa");
//		
//		for(String fruta: frutas) {
//			System.out.println(fruta);
//		}
//		
		

//		Set <String> frutas = new LinkedHashSet<String>();
//		//Ordena los elementos en orden de inserción, es más rápido que treeSet
//		//pero más lento que HashSet
//		frutas.add("mango");
//		frutas.add("kiwi");
//		frutas.add("granada");
//		frutas.add("piña");
//		frutas.add("sandía");
//		frutas.add("mamey");
//		frutas.add("fresa");
//		
//		for(String fruta: frutas) {
//			System.out.println(fruta);
//		}
//		
			//LISTAS
		//es de lo más utilizado, se permiten elementos duplicados
		//acceder a elementos específicos, buscar elementos
		
		
		//ArrayList
		List<String> pokemones = new ArrayList<String>();
		pokemones.add("Chikorita");
		pokemones.add("Evee");
		pokemones.add("Psyduck");
		pokemones.add("Dragonite");
		pokemones.add("Charizard");
		pokemones.add("Gengar");
		pokemones.add("Flygon");
		
		pokemones.add(2,"Pikachu");
		//aqui indicamos en que posicion del arreglo se va a agregar el elemento
		//si solo pongo el elemento, se agrega en la posicion final
		pokemones.remove(5);
		//esto para quitar un elemento
		pokemones.set(0, "Onix");
		//set reemplaza el elemento
		for(String pokemon: pokemones) {
			System.out.println(pokemon);
		}
		
		System.out.println("______________");
		System.out.println(pokemones.get(4));
		
		//indexOf, nos devuelve la posicion del elemento que buscamos
		//si no encuentra el elemento, devuelve un -1
		//si el elemento esta repetido, solo nos devuelve la posicion del 
		//primero que encuentre
		
		System.out.println(pokemones.indexOf("Gengar"));
		System.out.println("-------------------");
		
		//LinkedList
		//Es una lista doblemente enlazada
		//Es más rápido para insertar y remover elementos
		List<String> digimones = new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		digimones.add("Greymon");
		
		
		//Map
		//Asocia claves a valores
		//No puede contener claves duplicadas
		//Sólo puede tener un valor asociado
		
		//HashMap
		//tiene mejor rendimiento pero no garantiza un orden al hacer iteraciones
		
		Map<Integer, String> usuarios=new HashMap<Integer, String>();
		usuarios.put(1122, "Karla");
		usuarios.put(2233, "Carlos");
		usuarios.put(3344, "Ro");
		
		System.out.println(usuarios.get(2233));
		
		//keySet
		//nos permite recuperar el nombre de la clave
		System.out.println(usuarios.keySet());
		//values
		//nos permite recuperar directamente el valor
		System.out.println(usuarios.values());
		
		//TreeMap
		Map<String, String> tamales = new TreeMap<String, String>();
		tamales.put("Oaxaqueño", "Mole");
		tamales.put("Dulce", "Gansito");
		tamales.put("Salado", "Rajas");
		tamales.put("Guajolota", "Salsa verde");
		
		System.out.println("______________________");
		System.out.println(tamales.values());
		System.out.println(tamales.keySet());
		System.out.println(tamales);
		
		tamales.entrySet().forEach(elemento -> {
			System.out.println(elemento.getKey());
			System.out.println(elemento.getValue());
		
		}); 
		
		Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
		carros.put(1, "Volvo");
		carros.put(2, "Pointer");
		carros.put(3, "Mustang");
		carros.put(4, "Bocho");
		
		System.out.println("______________");
		System.out.println(carros.keySet());
		System.out.println(carros.values());
		
		
	}
}

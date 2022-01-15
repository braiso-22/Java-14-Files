# Java-14-Files
Java course part 14
<ul>
<li>1. Realizar un programa que escriba distintas l�neas con un texto cualquiera (con e�es y acentos)
en un fichero llamado fich01.txt, usando la clase FileWriter y buffers. El fichero estar� almacenado
en la carpeta archivos creada previamente. No emplees la estructura try-with-resources por lo que
deber�s hacer close() expl�cito del BufferedWriter dentro un try-catch.
</li><li>2. Haz una versi�n del programa anterior empleando ahora la estructura try-with-resources. Usa
tambi�n File.separator para componer la ruta del archivo que se llamar� fich02.txt
</li><li>3. Haz una versi�n del programa anterior, pero en la que se le indique al fichero que est� con
codificaci�n ISO-8859-1. Obtiene un fichero llamado fich03.txt
</li><li>4. Bas�ndote en el ejercicio 2 de este cap�tulo, hay un programa en el usuario introduzca
palabras o frases y se vayan escribiendo como l�neas separadas en un fichero llamado fich04.txt. El
programa finaliza cuando el usuario teclee �fin�. Para definir el objeto teclado para introducir texto
especifica la codificaci�n de la consola mediante: Scanner teclado = new Scanner(System.in,
"ISO-8859-1");
</li><li>5. Haz una versi�n del programa anterior, que compruebe previamente si el fichero fich04.txt
existe o no. En caso afirmativo har� una copia del archivo como fich04.bak y seguir� a�adiendo las
l�neas sobre fich04.txt .
</li><li>6. Realizar un programa que lea el fichero fich04.txt l�nea a l�nea y lo muestre por pantalla, con
el texto en may�scula. Usar FileReader, try-with-resources y buffers.
</li><li>7. Realizar un programa con un m�todo al que se le pase una cadena con la ruta y nombre de
un fichero. El m�todo lo leer� y devolver� un array cuyo primer elemento contendr� el n�mero de
caracteres del fichero. El segundo elemento del array debe contar el n�mero de palabras del fichero
y el tercer elemento del array debe contar el n�mero de l�neas del fichero. El m�todo devolver� null
si no existe el fichero. El programa puede tener un main que llame al m�todo creado pas�ndole
como par�metro fich04.txt.
</li><li>8. Realizar un programa que escriba distintas l�neas de texto en un fichero llamado alumnos.csv,
que contenga en cada l�nea: nombre del alumno, fecha de nacimiento, y notas de las tres
evaluaciones (con dos decimales). Cada uno de los campos estar� separado por un punto y coma. El
programa finalizar� cuando se introduzca �Z� como nombre de alumno. Este puede ser un caso
donde puede ser muy c�modo usar la clase PrintWriter.
</li><li>9. Haz una versi�n del programa anterior, pero creando un fichero alumnos.txt que, en vez de
estar separado por punto y coma, cada columna ocupa un ancho ficho. El nombre ocupar� 100
caracteres (alineado a la izquierda, con espacios en blanco a la derecha hasta completar los 100
caracteres, la fecha de nacimiento tendr� formato AAAAMMDD y las notas ocupar�n 2 posiciones
enteras, coma y dos posiciones decimales. Este puede ser un caso donde puede ser muy c�modo
usar la clase PrintWriter.
</ul>
# Java-14-Files
Java course part 14
<ul>
<li>1. Realizar un programa que escriba distintas líneas con un texto cualquiera (con eñes y acentos)
en un fichero llamado fich01.txt, usando la clase FileWriter y buffers. El fichero estará almacenado
en la carpeta archivos creada previamente. No emplees la estructura try-with-resources por lo que
deberás hacer close() explícito del BufferedWriter dentro un try-catch.
</li><li>2. Haz una versión del programa anterior empleando ahora la estructura try-with-resources. Usa
también File.separator para componer la ruta del archivo que se llamará fich02.txt
</li><li>3. Haz una versión del programa anterior, pero en la que se le indique al fichero que está con
codificación ISO-8859-1. Obtiene un fichero llamado fich03.txt
</li><li>4. Basándote en el ejercicio 2 de este capítulo, hay un programa en el usuario introduzca
palabras o frases y se vayan escribiendo como líneas separadas en un fichero llamado fich04.txt. El
programa finaliza cuando el usuario teclee “fin”. Para definir el objeto teclado para introducir texto
especifica la codificación de la consola mediante: Scanner teclado = new Scanner(System.in,
"ISO-8859-1");
</li><li>5. Haz una versión del programa anterior, que compruebe previamente si el fichero fich04.txt
existe o no. En caso afirmativo hará una copia del archivo como fich04.bak y seguirá añadiendo las
líneas sobre fich04.txt .
</li><li>6. Realizar un programa que lea el fichero fich04.txt línea a línea y lo muestre por pantalla, con
el texto en mayúscula. Usar FileReader, try-with-resources y buffers.
</li><li>7. Realizar un programa con un método al que se le pase una cadena con la ruta y nombre de
un fichero. El método lo leerá y devolverá un array cuyo primer elemento contendrá el número de
caracteres del fichero. El segundo elemento del array debe contar el número de palabras del fichero
y el tercer elemento del array debe contar el número de líneas del fichero. El método devolverá null
si no existe el fichero. El programa puede tener un main que llame al método creado pasándole
como parámetro fich04.txt.
</li><li>8. Realizar un programa que escriba distintas líneas de texto en un fichero llamado alumnos.csv,
que contenga en cada línea: nombre del alumno, fecha de nacimiento, y notas de las tres
evaluaciones (con dos decimales). Cada uno de los campos estará separado por un punto y coma. El
programa finalizará cuando se introduzca ‘Z’ como nombre de alumno. Este puede ser un caso
donde puede ser muy cómodo usar la clase PrintWriter.
</li><li>9. Haz una versión del programa anterior, pero creando un fichero alumnos.txt que, en vez de
estar separado por punto y coma, cada columna ocupa un ancho ficho. El nombre ocupará 100
caracteres (alineado a la izquierda, con espacios en blanco a la derecha hasta completar los 100
caracteres, la fecha de nacimiento tendrá formato AAAAMMDD y las notas ocuparán 2 posiciones
enteras, coma y dos posiciones decimales. Este puede ser un caso donde puede ser muy cómodo
usar la clase PrintWriter.
</ul>
![GitHub Repo stars](https://img.shields.io/github/stars/felixmk0/Logica-de-Programacion-JAVA)
![GitHub watchers](https://img.shields.io/github/watchers/felixmk0/Logica-de-Programacion-JAVA)
![GitHub forks](https://img.shields.io/github/forks/felixmk0/Logica-de-Programacion-JAVA)
### Si quieres apoyar el repositorio, ¡deja una ⭐!

# Ejercicios de Lógica de Programación con JAVA

Este repositorio contiene 50 ejercicios que he creado mientras aprendo a programar en Java. Son perfectos para practicar y mejorar tu lógica de programación. Te ayudarán a resolver problemas y a entender mejor cómo funciona la lógica de la programación.
Ten en cuenta que algunos códigos pueden tener malas prácticas o no estar optimizados, ya que están basados en mi propio proceso de aprendizaje. 

## Índice de Ejercicios

[Ejercicio 1 - Tabla de multiplicar](#ejercicio-1)

[Ejercicio 2 - Números de 2 en 2](#ejercicio-2)

[Ejercicio 3 - Números del 100 al 0](#ejercicio-3)

[Ejercicio 4 - Filtrar array](#ejercicio-4)

[Ejercicio 5 - Array de ceros y unos](#ejercicio-5)

[Ejercicio 6 - Dibujar cuadrado](#ejercicio-6)

[Ejercicio 7 - Notas de alumnos](#ejercicio-7)


## Ejercicio 1
El programa debe mostrar en pantalla la tabla de multiplicar del número que el usuario introduzca por consola, utilizando la clase ```Scanner``` de ```java.util```.

### Ejemplo:
Salida por consola:
```
Intoduce el numero de la tabla de multiplicar:
8

8*0=0
8*1=8
8*2=16
8*3=24
8*4=32
8*5=40
8*6=48
8*7=56
8*8=64
8*9=72
8*10=80
```

### Código:

<details>
  <summary>Haz clic aquí para ver el código</summary>

```java
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intoduce el numero de la tabla de multiplicar:");
        int numTabla = scanner.nextInt();
        if (numTabla <= 0) {
            System.out.println("ERROR: Debes introducir un numero mayor que 0!!");
            return;
        }

        for (int i = numTabla; i == numTabla; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }
}
```
</details>

## Ejercicio 2
El programa debe mostrar en pantalla los números de 2 en 2, a partir del 50, hasta llegar al 100.

### Ejemplo:
Salida por consola:
```
50
52
54
56
58
60
62
64
...
100
```

### Código:

<details>
  <summary>Haz clic aquí para ver el código</summary>

```java
public class Exercise2 {
    public static void main(String[] args) {
        for (int i = 50; i <= 100 ; i +=2) {
            System.out.println(i);
        }
    }
}
```
</details>

## Ejercicio 3
El programa debe mostrar los números del 100 al 0, decrementándose de 4 en 4
<details>
  <summary>Haz clic aquí para ver una pista</summary>
  
  ```
  Se puede conseguir fácilmente con un bucle "for" inverso.
  ```
</details>


### Ejemplo:
Salida por consola:
```
100
96
92
88
84
80
76
72
...
0
```

### Código:

<details>
  <summary>Haz clic aquí para ver el código</summary>

```java
public class Exercise3 {
    public static void main(String[] args) {
        for (int i = 100; i >= 0; i -= 4) {
            System.out.println(i);
        }
    }
}
```
</details>

## Ejercicio 4
De un array de un tamaño de 10 números, almacenar en otro array solo los números que estén entre 1 y 50. El nuevo array no debe contener ceros; solo deben estar los números que se encuentren entre 1 y 50 del array original.

### Ejemplo:
```
int[] array = [40, 34, 80, 60, 90, 99, 51, 22, 11, 67, 101];
int[] cleanedArray = [80, 60, 90, 99, 51];
```

### Código:

<details>
  <summary>Haz clic aquí para ver el código</summary>

```java
import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        int[] array = {40, 34, 80, 60, 90, 99, 51, 22, 11, 101};
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) if (array[i] >= 50 & array[i] <= 100) newArray[i] = array[i];
        int[] cleanedArray = Arrays.stream(newArray).filter(num -> num != 0).toArray();

        System.out.println(Arrays.toString(cleanedArray));
    }
}
```
</details>

## Ejercicio 5
Llenar un array de 8 posiciones con la mitad de ceros y la mitad de unos (4 ceros y 4 unos).

### Ejemplo:
```
int[] array = [0, 0, 0, 0, 1, 1, 1, 1];
```

### Código:

<details>
  <summary>Haz clic aquí para ver el código</summary>

```java
import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            if (i < 4) array[i] = 0;
            else array[i] = 1;
        }
        System.out.println(Arrays.toString(array));
    }
}
```
</details>

## Ejercicio 6
Dibuja un cuadrado con relleno (*), que nos pida su tamaño por entrada a través de la clase ```Scanner``` de ```java.util```.

### Ejemplo:
Salida por consola:
```
Introduce el número de elementos (*) del cuadrado:
6

******
******
******
******
******
******
```

### Código:

<details>
  <summary>Haz clic aquí para ver el código</summary>

```java
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de elementos (*) del cuadrado:");
        int e = scanner.nextInt();

        for (int f = 1; f <= e; f++) {
            for (int c = 1; c <= e; c++) System.out.print("*");
            System.out.println();
        }
    }
}
```
</details>


## Ejercicio 7
Dadas 6 notas que se tienen que almacenar en un array, escribir la cantidad de alumnos aprobados, condicionados (nota = 4) y suspendidos.
También crear 3 arrays nuevos: un array con las notas de los aprobados, otro con las notas de los condicionados y el último con las notas de los suspendidos, y mostrarlos por consola.

### Ejemplo:
Salida por consola:
```
Introduce una nota: 
10
Introduce una nota: 
4
Introduce una nota: 
5
Introduce una nota: 
2
Introduce una nota: 
4
Introduce una nota: 
7

Han aprobado 3 alumnos con: [10, 5, 7]
Han quedado condicionados 2 alumnos con: [4, 4]
Han suspendido 1 alumno con: [2]
```

### Código:

<details>
  <summary>Haz clic aquí para ver el código</summary>

```java
import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int aprobados = 0, condicionados = 0, suspensos = 0;
        int[] notas = new int[6]; int[] aprobadosArray = new int[notas.length]; int[] condicionadosArray = new int[notas.length]; int[] suspensosArray = new int[notas.length];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce una nota: ");
            notas[i] = scanner.nextInt();

            if (notas[i] < 0 || notas[i] > 10) {
                System.out.println("La nota tiene que ser entre 0-10");
                return;
            }

            if (notas[i] <= 4) {
                if (notas[i] == 4) {
                    condicionados++;
                    condicionadosArray[i] = notas[i];
                } else {
                    suspensos++;
                    suspensosArray[i] = notas[i];
                }
            } else {
                aprobados++;
                aprobadosArray[i] = notas[i];
            }
        }

        // Eliminar ceros del los arrays, con expresión lambda.
        aprobadosArray = Arrays.stream(aprobadosArray).filter(nota -> nota != 0).toArray();
        condicionadosArray = Arrays.stream(condicionadosArray).filter(nota -> nota != 0).toArray();
        suspensosArray = Arrays.stream(suspensosArray).filter(nota -> nota != 0).toArray();

        System.out.println("Han aprobado " + aprobados + (aprobados == 1 ? " alumno " : " alumnos ") + "con: " + Arrays.toString(aprobadosArray));
        System.out.println("Han quedado condicionados " + condicionados + (condicionados == 1 ? " alumno " : " alumnos ") + "con: " + Arrays.toString(condicionadosArray));
        System.out.println("Han suspendido " + suspensos + (suspensos == 1 ? " alumno " : " alumnos ")+"con: " + Arrays.toString(suspensosArray));

    }
}
```
</details>


## Ejercicio 8
Se introducen dos números enteros a través de la consola, se guardan en un array, luego se almacenan todos los números comprendidos entre los dos enteros en otro array y, finalmente, se muestran por consola.


### Ejemplo:
Salida por consola:
```
Introduce un número: 10
Introduce un número: 20

[10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
```

### Código:

<details>
  <summary>Haz clic aquí para ver el código</summary>

```java
import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = 0, lastNum = 0;
        int[] array = new int[2];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un numero:");
            array[i] = scanner.nextInt();
        }

        // Ordenamos el array de menor a mayor
        int[] sortedArray = Arrays.stream(array).sorted().toArray();

        firstNum = sortedArray[0];
        lastNum = sortedArray[sortedArray.length - 1];

        /*
            Usamos "(+1)" en el cálculo de la longitud del array final porque queremos
            incluir tanto el primer número como el último número en el rango.

            Por ejemplo, si se introduce el 10 y 20, sin "(+1)", el array
            incluiría solo 10 números: [10, 11, 12, 13, 14, 15, 16, 17, 18, 19],
            y faltaría el número 20.

            Al usar "lastNum - firstNum", obtenemos solo la cantidad de números entre
            los dos valores. Pero como queremos incluir tanto el primer como el último número,
            sumamos 1 al tamaño del array para que incluya todo el rango de números.
        */

        int[] finalArray = new int[lastNum - firstNum + (+1)];

        for (int i = 0; i < finalArray.length; i++) {
            if (i == 0) {
                finalArray[i] = firstNum;
                firstNum++;
            } else finalArray[i] = firstNum++;
            if (i == finalArray.length - 1) finalArray[i] = lastNum;
        }

        System.out.println(Arrays.toString(finalArray));
    }
}

```
</details>

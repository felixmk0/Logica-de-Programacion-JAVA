![GitHub Repo stars](https://img.shields.io/github/stars/felixmk0/Logica-de-Programacion-JAVA)
![GitHub watchers](https://img.shields.io/github/watchers/felixmk0/Logica-de-Programacion-JAVA)
![GitHub forks](https://img.shields.io/github/forks/felixmk0/Logica-de-Programacion-JAVA)
### Si quieres apoyar el repositorio, ¡deja una ⭐!

# 50 Ejercicios de Lógica de Programación con JAVA

Este repositorio contiene 50 ejercicios que he creado mientras aprendo a programar en Java. Son perfectos para practicar y mejorar tu lógica de programación. Te ayudarán a resolver problemas y a entender mejor cómo funciona la lógica de la programación.
Ten en cuenta que algunos códigos pueden tener malas prácticas o no estar optimizados, ya que están basados en mi propio proceso de aprendizaje. 


## Ejercicio 1
Se debe mostrar por pantalla la tabla de multiplicar del número que se haya introducido por consola, utilizando la clase Scanner de java.util.

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

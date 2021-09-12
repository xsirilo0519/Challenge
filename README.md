# Challenge Juego Sofka
_Este proyecto fue realizado para el Chellenge sofka, consta de un Juego de preguntas el cual te permitirá agregar tu nombre y documento para diferenciarte de otros jugadores, Luego poder empezar a responder 5 preguntas las cuales te sumaran puntos, podrás retirarte cuando lo desees y al final puedes ver la Historia de los últimos jugadores que han jugado._
## Recomendaciones e información 🚀
* **Se creó una aplicación de Java Maven y se utilizó FireBase para la persistencia de datos**
* **Para su desarrollo utilicé netbeans 12.4 y JDK 11.0.12**
* **El proyecto tiene un Main que se encuentra en Sofka/Main y el sistema cuenta con 25 preguntas precargadas en la base de datos.**
* **Se agregaron espacios en las opciones para poder identificar las respuestas correctas facilmente y asi se pueda completar el juego sin dificultad**

# Nota
_Las dependencias se descargan automáticamente con el archivo pom.xml._

_**Se debe estar seguro de que las dependencias se descargaron correctamente.**_ 

_En caso de que no se descarguen, borre la línea de dependencias que se encuentra en pom.xml(A continuación verán las líneas que deben borrar)_
```
<dependencies>
        <dependency>
            <groupId>com.google.firebase</groupId>
            <artifactId>firebase-admin</artifactId>
            <version>8.0.0</version>
        </dependency>
    </dependencies>
 ```
_Ejecute el programa para que Maven pueda actualizarse._

_**luego vuelva e inserte la línea de dependencias**_
```
<dependencies>
        <dependency>
            <groupId>com.google.firebase</groupId>
            <artifactId>firebase-admin</artifactId>
            <version>8.0.0</version>
        </dependency>
    </dependencies>
 ```
 _**Y corra el programa.**_

## Realizado por:
Sebastian López T - sebaslpez0519@gmail.com.

**Clases Abstractas e Interfaces**


Escriba un programa que simule un termómetro y despliegue su temperatura usando diferentes 
unidades. El programa debe usar seis clases incluyendo la clase que contiene el método principal. 
Interface: Temperatura.java
Esta interface debe declarar el siguiente método abstracto:
• determinarTemperatura
o Tipo de retorno: String.
o Argumentos: ninguno.
Interface: Estadística.java
Esta interface debe declarar los siguientes métodos abstractos:
• mínimo
o Tipo de retorno: double
o Argumentos: ninguno.
• máximo
o Tipo de retorno: double
o Argumentos: ninguno.
Clase Abstracta: Termómetro.java
La clase Termómetro.java debe implementar las interfaces Temperatura y Estadística. Además, 
debe contener:
• Los siguientes atributos:
o grados: Una variable de tipo double.
o memoria []: Un arreglo estático de tipo double para almacenar las últimas 5 
temperaturas leídas.
o n: Una variable de tipo int para manipular el arreglo memoria.
• Los siguientes métodos:
o Un constructor
▪ Argumentos: Un argumento de tipo double.
o Un getter y un setter para el atributo grados.
o Un método abstracto llamado convertir:
▪ Tipo de retorno: double.
▪ Argumentos: Ninguno.
o Un método guardarEnMemoria:
▪ Tipo de retorno: void
▪ Argumentos: Ninguno
▪ Funcionalidad: Almacena el valor actual de la variable grados en el arreglo
memoria, cada vez que éste se invoca. El arreglo memoria debe quedarse 
siempre con los últimos valores guardados.
o Un método resetearMemoria: 
▪ Tipo de retorno: void
▪ Argumentos: Ninguno
▪ Funcionalidad: Limpia el arreglo memoria.
o Un método imprimirMemora:
▪ Tipo de retorno: String.
▪ Argumentos: Ninguno.
▪ Funcionalidad: Retorna en una cadena, las temperaturas almacenadas en 
el arreglo memoria.
o Un método toString:
▪ Funcionalidad: Imprime la cadena “Temperatura actual: grados”
▪ Ejemplo: Temperatura actual: 38
• La implementación de los métodos abstractos mínimo y máximo declarados en la interface
Estadística.
o mínimo:
▪ Tipo de retorno: double
▪ Argumentos: Ninguno
▪ Funcionalidad: Devuelve el valor mínimo de las temperaturas 
almacenadas en el arreglo memoria.
o máximo:
▪ Tipo de retorno: double
▪ Argumentos: Ninguno
▪ Funcionalidad: Devuelve el valor máximo de las temperaturas 
almacenadas en el arreglo memoria.
Nota: Debido a que la clase Termómetro es abstracta, ésta no necesita implementar el método 
abstracto de la interface Temperatura. Sin embargo, las subclases no-abstractas (como
TermómetroFahrenheit y Termómetro Celsius) necesitarán implementarlo.
Clase: TermómetroFahrenheit.java
Esta clase debe ser una subclase de Termómetro e incluye:
• Atributos: Ninguno.
• Métodos:
o Un constructor que acepta un argumento de tipo double para configurar el 
atributo grados de la superclase.
o La implementación para el método determinarTemperatura (requerido por la 
interface de la superclase abstracta).
▪ Funcionalidad: Retorna la cadena “Temperatura normal: grados °F.” si la 
variable grados es menor que 100.4 °F; en caso contrario, retorna la 
cadena “Fiebre: grados °F.”
▪ Ejemplo: Temperatura normal: 95 °F (si los grados de la superclase son 
95) o Fiebre: 104 °F (si los grados de la superclase son 104).
o La implementación del método convertir
▪ Tipo de retorno: double 
Clase: TermómetroCelsius.java
Esta clase debe ser una subclase de Termómetro e incluir:
• Atributos: No tiene campos.
• Métodos:
o Un constructor que acepta un argumento de tipo double para configurar el 
atributo grados de la superclase.
o La implementación para el método determinarTemperatura (requerido por la 
interface de la superclase abstracta).
▪ Funcionalidad: Si la variable grados es menor que 38 °C, retorna la cadena 
“Temperatura normal: grados °C.”; en caso contrario, retorna la cadena 
“Fiebre: grados °C.”
▪ Ejemplo: Temperatura normal: 37 °C (si los grados de la superclase son 
37) o Fiebre: 38.5 °C (si los grados de la superclase son 38.5).
o La implementación del método convertir
▪ Tipo de retorno: double
▪ Argumentos: Ninguno
▪ Funcionalidad: Regresa la temperatura en grados Fahrenheit.
• Fórmula: °F = (Grados Celsius*(9/5))+32
o Un método toString, que concatene la cadena de la clase padre con la cadena “ °C”
Clase principal: Termómetros.java
En el método principal:
- Solicita el usuario que elija un termómetro entre Fahrenheit o Celsius.
- Solicita al usuario los grados.
- Instancia un objeto TermómetroFahrenheit o TermómetroCelsius y asigna el objeto a una 
variable de tipo Termómetro.
- Muestra el siguiente menú:
o Leer temperatura (grados). Actualiza la variable grados de la clase Termómetro.
o Convertir los grados a una unidad distinta (°F o °C, dependiendo del tipo de 
termómetro instanciado).
o Determinar temperatura.
o Almacenar temperatura: Se almacena en la memoria del termómetro.
o Mostrar la temperatura mínima leída.
o Mostrar la temperatura máxima leída.
o Resetear memoria del termómetro 
o Salir

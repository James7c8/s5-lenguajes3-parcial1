----------------------

Primer examen de Lenguajes de Programación III 

----------------------

FÁBRICA DE JUGUETES

Hay una fábrica de juguetes que está especializada en producir peluches y carritos. Esta fábrica quiere automatizar los procesos de creación, clonación, eliminación y registro de los diferentes juguetes que se producen en el día. Para dicha automatización requieren un software hecho en Java con la siguiente arquitectura:

----------------------

1. MENÙ

a. Debe haber un menú que permita al usuario seleccionar si quiere
crear, clonar, eliminar o ver los juguetes actuales.

b. Este menú debe ser una única clase (Singleton).

c. Dentro de está clase debe existir un atributo que tenga la lista de
juguetes (List<Juguete>).

d. Se debe utilizar el patrón de diseño Strategy para ejecutar el proceso
que el usuario está queriendo aplicar. (¡El uso del Switch está prohibido!)

----------------------

2. CREACIÓN

Se debe utilizar el patrón Factory Method con las siguientes condiciones:

a. Implementación para lacreación de Peluche,en la cual se le pedirá al usuario ingresar los atributos materialExterior, relleno y color.

b. Implementación para la creación de Carrito, en la cual se le pedirá al usuario ingresar los atributos color, marca y numeroPuertas.

c. La creación de instancias se debe realizar a través de Builder (no usar constructores dentro de los Factory).

d. Cada juguete debe quedar con un atributo id, el cual debe corresponder a la posición en la lista, es decir, el primer elemento debe tener id=1, el segundo id=2, y así sucesivamente.

e. El elemento creado debe ser agregado a la lista.

----------------------

3. CLONACIÓN

a. Se debe utilizar el patrón de diseño Prototype, y tener en cuenta que
el id sería el único atributo que no se puede clonar.

b. El usuario debe poder especificar el número de clones que quiere de
un elemento de la lista.

c. Todos los clones resultantes deben ser agregados a la lista.

----------------------

4. ELIMINACIÓN

a. Se debería poder eliminar elementos de la lista por id.

b. A los elementos que quedan en la lista se les debe actualizar el id si es necesario.

----------------------

5. REGISTRO:

Imprimir todos los juguetes que se llevan hasta ahora en la lista, con sus respectivos atributos. Además, recordar que para esto es necesario sobreescribir (override) el método toString() de cada clase (Peluche y Carrito).

----------------------

6. MANEJO DE ERRORES:

Esta aplicación debe controlar los posibles casos de error que se puedan presentar. Por ejemplo, si un usuario ingresa una letra en vez de un número en el menú, se debe controlar el error y especificar al usuario que la entrada no es válida.

----------------------

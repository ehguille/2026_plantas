# 2026_plantas
Ejemplo para practicar orientación a objetos.

## Enunciado
Crea una clase que modele una Planta. Una planta debe tener nombre y niveles de agua, altura (en cm) y salud.

Cada planta puede tener un nombre distinto, pero todas empiezan con 40 puntos de agua, 10 cm de altura y 100 de salud.

Una planta puede regarse una cantidad determinada de litros, de manera que su agua suba 10 puntos por cada litro.

Puede tomar el sol un número determinado de horas. Por cada hora al sol, su agua baja 5 puntos, su altura sube 2 cm y su salud sube 1 punto.

También puede fertilizarse: su altura sube 3 cm y su agua baja 5 puntos.

También debe haber un método llamado mostrarEstado() que imprima por pantalla el nombre, agua, altura y salud de la planta.

### Ampliación

Crea una clase llamada Jardinero. Un jardinero puede regar una planta una cantidad determinada de litros y puede fertilizarla.

Crea una clase Propietario que sea el dueño de una única Planta. Solo el propietario puede podarla: podar baja la altura 5 cm.

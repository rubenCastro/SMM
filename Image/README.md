<!-- TOC -->

- [1. Introducción](#1-introducción)
- [2. Material utilizado](#2-material-utilizado)
- [3. Análisis](#3-análisis)
    - [3.1. Primera imagen](#31-primera-imagen)
    - [3.2. Segunda imagen](#32-segunda-imagen)
    - [3.3. Tercera imagen](#33-tercera-imagen)
    - [3.4. Cuarta imagen](#34-cuarta-imagen)
    - [3.5. Quinta imagen](#35-quinta-imagen)
    - [3.6. Sexta imagen](#36-sexta-imagen)
- [4. Conclusión final](#4-conclusión-final)

<!-- /TOC -->

# 1. Introducción

En este trabajo analizaremos cómo se comportan los diferentes códecs de imagen más usados en la actualidad: JPEG (usando diferentes calidades), PNG, BMP, TIFF, GIF. Para el análisis haremos una valoración subjetiva de la calidad así cómo una comparación del tamaño final de las imágenes obtenidas.

# 2. Material utilizado

Para este análisis se han utilizado las seis imágenes que vemos a continuación:

![collage](http://i.imgur.com/sXoZ66E.png)

Todas han sido tomadas en formato DNG (formato sin pérdidas propio de Android) con un Samsung Galaxy S7 Edge y convertidas mediante [Able Batch Converter](http://www.graphicregion.com/batchconverter.htm), el cual ofrece una prueba de un mes.

Así pues, veamos cómo se comportan los diferentes códecs de compresión de imágenes.

# 3. Análisis

Para cada imagen se han analizado las siguientes configuraciones: JPEG (100%, 80% y 60%),  BMP, TIFF, PNG (nivel máximo de compresión) y GIF. Se ha apuntado el tamaño tras comprimir, una valoración de su calidad y un número que indica la posición con respecto a los demás códecs.

<br>
<br>

## 3.1. Primera imagen


|             | JPEG 100% | JPEG 80%  | JPEG 60%  | PNG       | TIFF      | BMP       | GIF     |
|-------------|-----------|-----------|-----------|-----------|-----------|-----------|---------|
| Tamaño (KB) | 9018      | 1189      | 608       | 32103     | 24395     | 24395     | 6359    |
| Valoración  | Excelente | Excelente | Muy buena | Excelente | Excelente | Excelente | Regular |
| Posición    | 1         | 2         | 3         | 1         | 1         | 1         | 4       |

Como era de esperar, los formatos sin compresión como TIFF y BMP no modifican en nada la calidad de la imagen ni su tamaño. En cuanto a GIF, la calidad se ve reducida bastante ya que sólo usa 256 colores para representar la imagen, por lo que perdemos muchísimos matices. Respecto a JPEG, obtenemos una calidad igual a la original con parámetros del 100% y 80%, notándose algunas pérdidas ya en el de 60% (únicamente visibles haciend zoom a la imagen).

Con PNG ocurre algo curioso: nos aumenta el tamaño de la imagen, cuando debería reducirla ya que usa un algoritmo de compresión sin pérdidas. Probablemente esto sea debido a que no se puede aplicar el formato PNG directamente sobre imágenes DNG, ya que no son *bitmaps* y PNG fue diseñado para ellos. 

## 3.2. Segunda imagen

## 3.3. Tercera imagen

## 3.4. Cuarta imagen

## 3.5. Quinta imagen

## 3.6. Sexta imagen

# 4. Conclusión final
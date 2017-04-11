![notas](http://imagenpng.com/wp-content/uploads/2015/03/notas_musicales_png___by_miileedittions-d68c9ht.png)
<p align="center">
Análisis de parámetros y códecs de sonido.
</br>
Juan Antonio Cortés Ibáñez.
</p>

<div class="page-break"></div>

<!-- TOC depthFrom:1 depthTo:6 withLinks:1 updateOnSave:1 orderedList:0 -->

- [1. Material usado.](#1-material-usado)
- [2. Pruebas con los parámetros de digitalización.](#2-pruebas-con-los-parmetros-de-digitalizacin)
	- [2.1. Voz en vivo.](#21-voz-en-vivo)
	- [2.2. Música de estudio.](#22-msica-de-estudio)
	- [2.3. Conclusión.](#23-conclusin)
- [3. Pruebas con diferentes códecs.](#3-pruebas-con-diferentes-cdecs)
	- [3.1. Voz en vivo.](#31-voz-en-vivo)
	- [3.2. Música de estudio.](#32-msica-de-estudio)
	- [3.3. Conclusión](#33-conclusin)
- [4. Prueba a ciegas](#4-prueba-a-ciegas)

<!-- /TOC -->

# 1. Material usado.
Para la realización de este análisis se ha usado el siguiente equipo:
- Kingston HyperX Cloud.
- ASUS Xonar DG.
- Audacity 2.1.3.
- Fre:ac.

Para la grabación se han activado los filtros de ruido y eco y para la reproducción se ha amplificado la salida a 64 ohmios para obtener la máxima calidad de reproducción posible.

# 2. Pruebas con los parámetros de digitalización.
En las siguientes tablas se muestran las diferentes pruebas realizadas con tres tipos de audio: voz grabada en directo y música clásica (un corte donde predominan los graves y otro donde lo hacen los agudos).

Las puntuaciones van desde el cinco (máxima calidad, indistinguible con el original) hasta el 0 (mínima calidad, audio totalmente malogrado).

## 2.1. Voz en vivo.
| Resolución/Frecuencia<br>bits/Hz | 44100 | 22050 | 16000 | 11025 | 8000 |
|:--------------------------------:|:-----:|:-----:|:-----:|:-----:|:----:|
|                32                |   5   |   5   |   5   |   5   |   5  |
|                24                |   5   |   5   |   5   |   5   |   5  |
|                16                |   5   |   5   |   5   |   5   |   5  |
|                 8                |   5   |   5   |   5   |   4~5   |   4  |


Como vemos en la tabla, no se percibe ninguna diferencia notable cuando bajamos la calidad. Para empezar a notar pérdidas, se ha tenido que bajar la frecuencia a los 8000 Hz y la resolución a 8 bits.

Aún así, la diferencia es muy sútil y únicamente he detectado una "bajada" del volumen y una leve metalización del sonido (ya no sé si real o inducida por saber que era el caso de menor calidad teórica).

## 2.2. Música de estudio.

| Resolución/Frecuencia<br>bits/Hz | 44100 | 40000 | 38000 | 24000 | 16000 |
|:--------------------------------:|:-----:|:-----:|:-----:|:-----:|:-----:|
|                32                |   5   |   5   |   4   |   3   |   0   |
|                24                |   5   |   5   |   4   |   3   |   0   |
|                16                |   5   |   5   |   4   |   3   |   0   |
|                 8                |   1   |   0   |   0   |   0   |   0   |

Para este primer corte de contrabajo, vemos que podemos reducir la frecuencia hasta los 40 KHz sin notar una pérdida de calidad. Bajando de ahí, algunos fragmentos se quedan mudos, sonando únicamente los más graves (como era de esperar al tener una longitud de onda mayor). Respecto a la resolución, al bajar a los 8 bits, se introduce muchísimo ruido metálico y es imposible escuchar bien el audio.

| Resolución/Frecuencia<br>bits/Hz | 44100 | 40000 | 38000 | 24000 | 16000 |
|:--------------------------------:|:-----:|:-----:|:-----:|:-----:|:-----:|
|                32                |   5   |   4   |   2   |   0   |   0   |
|                24                |   5   |   4   |   2   |   0   |   0   |
|                16                |   5   |   4   |   2   |   0   |   0   |
|                 8                |   4   |   3   |   1   |   0   |   0   |

En este segundo corte se ha optado por una melodía con unos agudos más pronunciados y más sensible a las variaciones de parámetros. Como vemos en la tabla, rápidamente perdemos calidad (en 40 KHz ya perdemos notas agudas) ya que los agudos se eliminan al bajar la frecuencia. Como consecuencia, perdemos casi la totalidad de un instrumento; siendo esto inadmisible para el disfrute de esta pieza.

Curiosamente, al bajar la resolución, se introduce ruido (como en el caso anterior) pero en esta ocasión es bastante más leve por lo que se deja escuchar "sin problemas" (manteniendo la frecuencia en 44,1 KHz).

## 2.3. Conclusión.

En la voz, un sonido simple, no necesitamos grandes frecuencias y resoluciones para obtener un sonido fidedigno. En el primer audio, con gran presencia de graves, podemos reducir la frecuencia sin miedo a perder calidad, no así con la resolución que introduce una cantidad de ruido ingente. En el segundo audio, de tonos más altos, la pérdida se nota en cuanto bajamos un poco la frecuencia y se eliminan los rangos más altos, haciendo que la melodía quede vacía.

# 3. Pruebas con diferentes códecs.

Para esta sección hemos utilizado los audios de la anterior más un corte extra ("Consign to Oblivion - Epica") perteneciente al género *symphonic metal*. Comprobaremos cómo los diferentes códecs (MP3, AAC, Vorbis y WMA) se comportan a diferentes tasas de bits, intentando discernir cuál ofrece la mayor calidad con el menor tamaño.

Se ha decidido comenzar por 32kb/s ya que al haber usado la última versión de los códecs, era el valor mínimo común para todos.

## 3.1. Voz en vivo.
| Bitrate/Frecuencia kbs/códec | MP3 | Vorbis | AAC | WMA |
|:----------------------------:|:---:|:------:|:---:|:---:|
|              32              |  4  |    4   |  5  |  4  |
|              48              |  5  |    5   |  5  |  5  |
|              64              |  5  |    5   |  5  |  5  |
|              96              |  5  |    5   |  5  |  5  |
|              128             |  5  |    5   |  5  |  5  |
|              320             |  5  |    5   |  5  |  5  |

En el caso de la voz, obtenemos una calidad más que notable para todos los códecs a pesar de usar bitrates bajos. Excepto en AAC, en todos los demás se escucha un poco (he tenido que subir bastante el volumen para notarlo) más de ruido de fondo con respecto a la grabación original para 32kb/s. Una vez que subimos de ahí, no se aprecia diferencia y todos desempeñan igual de bien (a excepción de velocidad de *encoding* y tamaño del fichero final)

<div class="page-break"></div>

## 3.2. Música de estudio.
| Bitrate/Frecuencia kbs/códec | MP3 | Vorbis | AAC | WMA |
|:----------------------------:|:---:|:------:|:---:|:---:|
|              32              |  4  |    4   |  4  |  4  |
|              48              |  5  |    5   |  5  |  5  |
|              64              |  5  |    5   |  5  |  5  |
|              96              |  5  |    5   |  5  |  5  |
|              128             |  5  |    5   |  5  |  5  |
|              320             |  5  |    5   |  5  |  5  |

En esta pieza me ha sido imposible encontrar diferencias entre los diferentes códecs y calidades. En el primer escalón de calidad quizá se pueda percibir un leve ruido de fondo en los tramos que no suena el instrumento, pero poco más.

| Bitrate/Frecuencia kbs/códec | MP3 | Vorbis | AAC | WMA |
|:----------------------------:|:---:|:------:|:---:|:---:|
|              32              |  3  |    5   |  4  |  4  |
|              48              |  3  |    5   |  5  |  5  |
|              64              |  4  |    5   |  5  |  5  |
|              96              |  5  |    5   |  5  |  5  |
|              128             |  5  |    5   |  5  |  5  |
|              320             |  5  |    5   |  5  |  5  |

Para este audio sí he conseguido acotar un par de partes donde la diferencia es apreciable.

En la recta final de la melodía, donde se suman varios instrumentos, MP3 no consigue captarlos todos y la melodía queda con menos cuerpo. Mientras que los demás formatos consiguen captarlos ya con 48kb/s, MP3 tiene que subir hasta los 96kb/s para conseguir la misma fidelidad.

Cabe destacar que con Vorbis no noto ninguna diferencia respecto al audio original a pesar de bajar la frecuencia a 32kb/s.

| Bitrate/Frecuencia kbs/códec | MP3 | Vorbis | AAC | WMA |
|:----------------------------:|:---:|:------:|:---:|:---:|
|              32              |  0  |    1   |  1  |  1  |
|              48              |  1  |    2   | 1,5 | 1,5 |
|              64              |  2  |    3   |  3  |  2  |
|              96              |  3  |    5   |  4  |  3  |
|              128             |  4~5  |    5   |  5  |  4~5  |
|              320             |  5  |    5   |  5  |  5  |

Para esta canción, la cual he escuchado cientos de veces, voy a realizar un análisis más exhaustivo ya que la conozco de "cabo a rabo" y soy más sensible a posibles pérdidas de calidad.

- Para 32kb/s: en este bitrate los cuatro códecs se comportan (casi) igual de mal. Siendo MP3 el que más rango elimina dejando la canción vacía, con eco y metalización. AAC y Vorbis son los que mejor calidad nos proporcionan en este rango.
- Para 48kb/s: aquí empezamos a ver las primeras diferencias notables. MP3 vuelve a ser el que peor procesa la canción, dejándola más vacía y con más eco que las otras alternativas. Sorprendentemente WMA desempeña muy parecido a AAC (no he conseguido discernir entre ambos), mientras que Vorbis ofrece la mayor calidad en este segmento (es el que menos frecuencias elimina y se nota).
- Para 64kb/s: Tanto para ACC como para Vorbis las diferencias con la canción sin compresión empiezan a ser menos notables (algunos coros quedan un poco más vacios y el fondo de la canción no termina de llenarse). MP3 y WMA mejoran un poquito menos que los dos anteriores y todavía se nota claramente que la canción puede dar más de sí.
- Para 96kb/s: En este punto ya me encuentro totalmente sorprendido. Tras más de diez minutos escuchando fragmentos de la canción una y otra vez, no consigo apreciar diferencia alguna entre Vorbis y la canción sin comprimir. MP3 y WMA siguen estando un poco por detrás y todavía se aprecian leves diferencias, mientras que AAC está a la par que Vorbis.

Podemos ver en el espectrograma que las diferencias con respecto al original son inapreciables. Las dos primeras franjas corresponden a los canales de FLAC mientras que las inferiores corresponden a  Vorbis.

![spectrogram](https://raw.githubusercontent.com/Mancuerna/SMM/master/Sound/Files/spectrogram.png)

- Resto de bitrates: a partir de los 128kb/s todos desempeñan muy bien. Ofrecen una fidelidad altísima y las diferencias respecto al original son inapreciables (al menos con mi equipo).

## 3.3. Conclusión

Como ya sabía, MP3 y WMA son los códecs que peor desempeñan en bitrates bajos (los he usado a lo largo de los años y era conocedor de sus carencias). Por otro lado, AAC es un códec muy sólido, el cual me ha dado los archivos con el menor tamaño, lo cual es algo a tener en cuenta siempre (por ejemplo, llamadas VOIP).

Eso sí, el que realmente me ha sorprendido al hacer todas las pruebas, ha sido Vorbis. Con él he conseguido la máxima calidad a partir de 96kb/s (algo que con MP3 es impensable) y la máxima calidad en general. Sin duda, de tener que elegir un formato para usar de forma general, usaría Vorbis (en base a esta pequeña tanda de análisis, claro).

Ahora bien, en lo personal seguiré escuchando mi música en formato FLAC. ¿Por qué? Principalmente porque este análisis se  ha realizado con una muestra insignificante (como es lógico) de música, por lo que no sabremos si para otros tipos de música obtendremos los mismos resultados.

Como a día de hoy  no tenemos (prácticamente) problemas de almacenamiento, prefiero continuar con FLAC, así me aseguro la máxima calidad de sonido en todos los casos y la limitación únicamente vendrá por el hardware utilizado para la reproducción.

<div class="page-break"></div>

# 4. Prueba a ciegas

Como adición a este pequeño análisis, he decidido hacer una prueba a ciegas con otra persona. De esta forma, elimino posibles ideas preconcebidas que derivan de saber la calidad del fichero que estás reproduciendo.

He escogido cuatro ficheros  (FLAC, MP3 a 128kb/s, Vorbis a 96kb/s y MP3 a 96kb/s) y le he pedido que las puntue del uno al cinco, obteniendo el siguiente resultado:

| Puntuación/Códec | MP3 128kb/s | MP3 96kb/s | Vorbis 96kb/s | FLAC |
|:----------------:|:-----------:|:----------:|:-------------:|:----:|
|     Resultado    |      5      |      5     |       5       |   5  |

Para esta persona que ha escuchado por primera vez la canción, ha sido imposible notar alguna diferencia. Lo cual me lleva  a pensar que hay que estar "entrenado" (es decir, que sean canciones que escuchamos asiduamente) para notar las diferencias al usar códecs tan avanzados como los actuales (siempre que hablemos de tasas de bits, frecuencias y resolución dentro de valores normales).

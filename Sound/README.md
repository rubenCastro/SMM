<!-- TOC depthFrom:1 depthTo:6 withLinks:1 updateOnSave:1 orderedList:0 -->

- [1. Material usado.](#1-material-usado)
- [2. Pruebas con los parámetros de digitalización.](#2-pruebas-con-los-parmetros-de-digitalizacin)
	- [2.1. Voz en vivo.](#21-voz-en-vivo)
	- [2.2. Música de estudio.](#22-msica-de-estudio)
	- [2.3. Conclusión.](#23-conclusin)
- [3. Pruebas con diferentes códecs.](#3-pruebas-con-diferentes-cdecs)
	- [3.1. Voz en vivo.](#31-voz-en-vivo)
	- [3.2. Música de estudio.](#32-msica-de-estudio)

<!-- /TOC -->

# 1. Material usado.
Para la realización de este análisis se han usado el siguiente equipo:
- Kingston HyperX Cloud.
- ASUS Xonar DG.
- Audacity 2.1.3.
- Fre:ac.

Para la grabación se han activado los filtros de ruido y eco y para la reproducción se ha amplificado la salida a 64 ohmios para obtener la máxima calidad de reproducción posible.

# 2. Pruebas con los parámetros de digitalización.
En las siguientes tablas se muestran las diferentes pruebas realizadas con tres tipos de audio: voz grabada en directo y música clásica(un corte donde predominan los graves y otro donde lo hacen los agudos).

Las puntuaciones van desde el cinco (máxima calidad, indistinguible con el original) hasta el 0 (mínima calidad, audio totalmente malogrado).

## 2.1. Voz en vivo.
| Resolución/Frecuencia<br>bits/Hz | 44100 | 22050 | 16000 | 11025 | 8000 |
|:-----------------------------:|:-----:|:-----:|:-----:|:-----:|:----:|
|               32              |   5   |   5   |   5   |   5   |   5  |
|               24              |   5   |   5   |   5   |   5   |   5  |
|               16              |   5   |   5   |   5   |   5   |   5  |


Como vemos en la tabla, no se nota ninguna diferencia notable cuando bajamos la calidad. Para empezar a notar pérdidas, se ha tenido que bajar la frecuencia a los 6000 Hz. Los parámetros de resolución que permite el Audacity no bajan de 16 bits, por lo que no afectan a la calidad de sonido ya que tenemos más que de sobra.

## 2.2. Música de estudio.

| Resolución/Frecuencia<br>bits/Hz | 44100 | 40000 | 38000 | 24000 | 16000 |
|:-----------------------------:|:-----:|:-----:|:-----:|:-----:|:----:|
|               32              |   5   |   5   |   4   |   3   |   0  |
|               24              |   5   |   5   |   4   |   3   |   0  |
|               16              |   5   |   5   |   4   |   3   |   0  |

Para este primer corte de contrabajo, vemos que podemos reducir la frecuencia hasta los 40 KHz sin notar una pérdida de calidad. Bajando de ahí, algunos fragmentos se quedan mudos, sonando únicamente los más graves (como era de esperar al tener una longitud de onda mayor).

| Resolución/Frecuencia<br>bits/Hz | 44100 | 40000 | 38000 | 24000 | 16000 |
|:-----------------------------:|:-----:|:-----:|:-----:|:-----:|:----:|
|               32              |   5   |   4   |   2   |   0   |   0  |
|               24              |   5   |   4   |   2   |   0   |   0  |
|               16              |   5   |   4   |  2   |   0   |   0  |

En este segundo corte se ha optado por una melodía con unos agudos más pronunciados y más sensible a las variacioness de parámetros. Como vemos en la tabla, rápidamente perdemos calidad (en 40 KHz ya perdemos notas agudas) ya que los agudos se eliminan al bajar la frecuencia. Como consecuencia, perdemos casi la totalidad de un instrumento; siendo esto inadmisible para el disfrute de esta pieza.

## 2.3. Conclusión.

En la voz, un sonido simple, no necesitamos grandes frecuencias y resoluciones para obtener un sonido fidedigno. En el primer audio, con gran presencia de graves, podemos reducir la frecuencia sin miedo a perder calidad mientras que en el segundo, de tonos más altos, la pérdida se nota en cuanto bajamos un poco la frecuencia, haciendo que la melodía quede vacía.

# 3. Pruebas con diferentes códecs.

Para esta sección hemos utilizado los audios de la anterior más un corte extra ("Consign to Oblivion - Epica") perteneciente al género *symphonic metal*. Comprobaremos cómo los diferentes códecs (MP3, AAC, Vorbis y WMA) se comportan a diferentes tasas de bits, intentando discernir cuál ofrece la mayor calidad con el menor tamaño.

## 3.1. Voz en vivo.
| Bitrate/Frecuencia kbs/códec | MP3 | Vorbis | AAC | WMA |
|:----------------------------:|:---:|:------:|:---:|:---:|
|              24              |     |        |     |     |
|              48              |     |        |     |     |
|              64              |     |        |     |     |
|              96              |     |        |     |     |
|              128             |     |        |     |     |
|              320             |     |        |     |     |
## 3.2. Música de estudio.

# Veintiuno / Blackjack

Este juego consiste en un enfrentamiento entre 2 jugadores comparando las cartas que estos tengan en
su mano, intentanto conseguir 21 puntos o el número más cercano posible sin pasarse. Al iniciar
la ronda, se le dara 2 cartas a cada jugador, una carta boca abajo que solo puede ver su jugador,
esto lo podrá hacer presionando encima de la carta. Cuando un jugador ya no quiera más cartas,
tendrá la opción de plantarse, cuando ambos jugadores se planten, la ronda terminará y se
dará un ganador.
Reglas
1. Cada jugador solo podrá pedir una carta por turno.
2. En el blackjack, los dieces, las jotas, las reinas y los reyes tienen un valor de 10 cada una.
3. Los ases pueden tener dos valores diferentes: uno u once (puedes elegir cuál).
4. Cuando el valor total de tu mano es de 22 o más, esto se conoce comúnmente como "bancarrota", y automáticamente perderás la ronda.
5. En caso de un empate, ganará el jugador con menos cartas en su mano. Si ambos tuvieran la misma cantidad de cartas, habría un empate.

## Manual de Usuario

### Construcción y compilacion
El programa se realizó usando Netbeans Ant. Los archivos de construccion están formateados para Netbeans, para construir el programa se recomienda instalar Netbeans y usar las opciones de compilación que provee.

Opcionalmente se adjuntan las instrucciones para construccion desde terminal:
1. Desde terminal entre al directorio /Veintiuno/src/proyecto_blackjack/
2. Use el comando para compilar: javac *.java

### Ejecución del programa
Se ha incluído en el repositorio una versión ejecutable del código más reciente para facilidad de revisión. Alternativamente se puede usar Netbeans para correr el programa.

Si compiló usando la terminal anteriormente:
1. Desde terminal entre al directorio /Veintiuno/src/ 
2. Comando para ejecutar: java proyecto_blackjack.Veintiuno

### Terminar el programa
El programa terminará por si solo una vez que el jugador indique que ya no quiere jugar más o cuando se haga click en alguna equis de las diferentes ventanas.

### Uso del juego
El programa se navega con el uso de clicks y el teclado.

Para ver su carta boca abajo sostenga el click en ella en cualquier momento durante su turno.
Para pedir una carta al coupier haga click en donde dice pedir carta en cualquier momento durante su turno.
Para ver las reglas del juego haga click en ¿Cómo Jugar? en cualquier momento del juego.
Para guardar la partida haga click en guardar partida en cualquier momento durante el juego. La partida se guardara en la carpeta del ejecutable.
Para cargar la partido haga click en cargar partida al inicio del juego. Etso buscara partidas guardadas en la carpeta.

## Diseño
El diseño del programa fue realizado en diagrams.net. 

![Diagrama UML](https://github.com/mafe-andres/Veintiuno/blob/main/MARDA/img/Diagrama%20Marda.png)

Para poder ver el diagrama con más detalle haga click [aquí](https://drive.google.com/file/d/1VF_9fuAJ-BAckBGJ2vugzKBjVYAd620Y/view?usp=sharing) y abrá el archivo con la extensión diagrams.net

## Participantes

- Alvarado Machado, Andy Vinicio
Cartago, Costa Rica. 
Carné: C00315
andy.alvaradomachado@ucr.ac.cr

- Andrés Monge, María Fernanda
San José, Costa Rica. 
Carné: C00442
maria.andres@ucr.ac.cr

- Ortiz Salazar, Tonny
San José, Costa Rica. 
Carné: B35054
tonny.ortiz@ucr.ac.cr

- Pinto Umaña, Gustavo Alonso
Heredia, Costa Rica. 
Carné: C06009
gustavo.pinto@ucr.ac.cr


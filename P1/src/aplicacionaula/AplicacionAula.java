package aplicacionaula;

public class AplicacionAula {

    public static void main(String[] args) {
        Profesor jesus, joaquin;
        Alumno juan, beatriz;
        Persona per;

        jesus = new Profesor("Jesus");
        joaquin = new Profesor("Joaquin", "B7");
        juan = new Alumno("Juan");
        beatriz = new Alumno("Beatriz", 4, 5);
        per = new Persona();
        per.altura = 3.3F;
        Delegado[] delegados = new Delegado[10];
        for (int i = 0; i < 10; i++) {
            delegados[i] = new Delegado("Pepe", i, i + 1);
        }
        System.out.println("\n" + jesus.toString());   // Mostramos a los profesores
        System.out.println(joaquin.toString());
        jesus.setDespacho("C7");                     // Cambiamos el despacho de Jesus
        System.out.println(jesus.toString() + "\n");   // Comprobamos la nueva informacion

        jesus.darClase();                               // Jesus comineza la clase
        jesus.habla();
        juan.pregunta("¿Que es un objeto?");             // El alumno juan pregunta
        jesus.responderPregunta("¿Que es un objeto?");   // Jesus contesta
        beatriz.pregunta("¿Es lo mismo clase y objeto?");
        jesus.responderPregunta("¿Es lo mismo clase y objeto?");
        jesus.pregunta("¿Os habeis enterado?");
        jesus.pregunta("¿Quién es el delegado?");
        delegados[0].esDelegado();

        //java.lang exercises
        double number = 3.7;
        String letter = "A";
        String word = "Hola";
        System.out.println(Math.abs(number));
        System.out.println(Math.sqrt(number));
        if (letter.equals(letter.toLowerCase())) {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }
        System.out.println(String.valueOf(number));
        //System.out.println(Integer.valueOf(letter));
        System.out.println(Float.MAX_VALUE);
        System.out.println(word.charAt(1));
        word += " y adiós";
        if ("hola".equals(word)) {
            System.out.println("Equals.");
        }
        else
            System.out.println("Not equals.");
        System.out.println(word);
    }

}

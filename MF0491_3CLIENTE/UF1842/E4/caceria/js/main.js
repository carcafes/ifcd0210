       //variables neutras
       var distancia;
       var victoria = false;
       var contador = 1;

       //Numero aleatorio
       var n;
       var x;
       Random rnd = new Random();
       n = rnd.nextInt(3);
       n = n + 5;

       //variables gacela

       var posGacela = n;
       var comida = 0;
       var bebida = 0;
       var observar = 3;
       var huyendo = 0;
       var panico = false;
       var observado = false;

       //funciones gacela
       function gacelaComer() {
           comida++;

       }


       function gacelaBeber() {
           bebida++;
       }


       function gacelaObservar() {
           if (observar > 0) {
               observado = true;
               if (sigilo == false) {
                   if (distancia <= 4) { panico = true;
                       System.out.println("La gacela ha visto un leon a " + (distancia) + "."); } else { System.out.println("La gacela no ha visto ningun peligro."); }
               } else { System.out.println("La gacela no ha visto ningun peligro."); }
           } else { System.out.println("La gacela se entretuvo mirando mariposas."); }

       }

       function gacelaHuir() {
           if (panico == true) {
               if (huyendo > 0) { posicion++;
                   posicion++;
                   huyendo++; } else { posicion++;
                   huyendo++; }
           }

       }


       //variables leon
       var leon = 0;
       var leoncorrecto = false;
       var posLeon = 0;
       var ocultarse = 1;
       var cazando = false;
       var sigilo = false;
       var cazado = false;
       var ocultado = false;

       function leonCazar() {
           if (distancia <= 1) cazado = true;

       }

       function leonAvanzar() {
           posicion++;

       }

       function leonPerseguir() {
           if (panico == true) { posicion++;
               posicion++; } else { posicion++; }
       }

       function leonAcechar() {
           posicion++;;

       }

       function leonEsconderse() {
           if (ocultarse > 0) {
               sigilo = true;
               ocultado = true;
           } else { System.out.println("El leon se entretuvo mirando mariposas."); }

       }


       //titulo
       setTimeout(function() { alert("                       Juego de cazeria: "); }, 2000);




       //informacion
       setTimeout(function() {
           System.out.println(" ");
           System.out.println("                        Informacion. ");
           System.out.println(" ");
           System.out.println(" ");
           System.out.println("        El juego de cazeria nesesita de dos jugadores: Leon y gacela. ");
           System.out.println("        El objetivo del juego es sobrevivir, ya sea el leon cazando a la gacela ");
           System.out.println("        o la gazela comiendo, bebiendo y escapando. ");
           System.out.println(" ");
           System.out.println(" ");
       }, 2000);


       //Como jugar
       setTimeout(function() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("        La gacela puede comer, beber y obsevar a su alrededor.");
        System.out.println("        El leon debe avanzar hasta encontrar a la gacela. ");
        System.out.println(" ");
        System.out.println("        Una vez se han encontrado empieza la accion.");
        System.out.println("        Si la gacela ve al leon podra huir.");
        System.out.println(" ");
        System.out.println("        Cuando el leon encuentra a la gacela gana acciones nuevas.");
        System.out.println("        - Acechar: avanza una casilla en silencio.");
        System.out.println("        - Esconderse: se agazapa escondido para que no le vean.");
        System.out.println("        - Perseguir: avanza dos casillas si le han visto.");
        System.out.println("        Y Cazar, que gana si esta en la casilla contigua a la gacela.");
        System.out.println(" ");
        System.out.println(" "); 
        }, 2000);


       //Selecion de acciones y turnos
       setTimeout(function() {
           System.out.println(" ");
           System.out.println("        Para escoger opciones se debe escribir el numero de la accion. ");
           System.out.println("        Los turnos seran primero del leon y despues de la gazela.");
           System.out.println("        Si la gazela escapa pero no ha comido suficiente se volvera a empezar hasta que haya comido y bebido suficiente.");
           System.out.println(" ");
           System.out.println(" ");
       }, 2000);





       do {

           //chequeos

           distancia = posGacela - posLeon;
           if (distancia <= 4) { cazando = true; } else { cazando = false; }

           //nueva posicion

           Random rnd2 = new Random();
           x = rnd2.nextInt(5);
           x = x + 3;

           //acciones leon

           do {

               if (cazando == false) {
                   //opciones sin cazar

                   System.out.println("El Leon no ve todavia a la gacela.");
                   System.out.println("Accion leon:");
                   System.out.println("1. Avanzar.");
                   

                   System.out.println(leon);




                   switch (leon) {
                       case 1:
                           leon = 1;
                           leonAvanzar();
                           leoncorrecto = true;
                           break;
                       default:
                           System.out.println("Accion no existente.");
                           break;
                   }
               }
               //opciones cazando.
               else {
                   System.out.println("El leon ve a la gacela a " + distancia + ", es hora de cazar.");
                   System.out.println("Accion leon:");
                   System.out.println("1. Acechar.");
                   System.out.println("2. Esconderse. ");
                   System.out.println("3. Perseguir.");
                   System.out.println("4. Cazar ");

                   

                   System.out.println(leon);

                   switch (leon) {


                       case 1:
                           leon = 1;
                           leonAcechar();
                           leoncorrecto = true;
                           break;
                       case 2:
                           leon = 2;
                           leonEsconderse();
                           leoncorrecto = true;
                           break;
                       case 3:
                           leon = 3;
                           leonPerseguir();
                           leoncorrecto = true;
                           break;
                       case 4:
                           leon = 4;
                           leonCazar();
                           leoncorrecto = true;
                           break;
                       default:
                           System.out.println("Accion no existente ");
                           break;
                   }
               }

           } while (leoncorrecto == false);

           //inicializar habilidades leon
           
           
           //Gacela.bot selector
           switch (contador) {
               case 1:
                   gacelaObservar();
                   if (panico == true) { contador = 4; } else {
                       contador++;
                   }
                   break;

               case 2:
                   gacelaComer();
                   contador++;
                   break;

               case 3:
                   gacelaBeber();
                   contador++;
                   break;

               case 4:
                   gacelaHuir();
                   break;


           }



           //chequeos de victoria.
           if (cazado == true) {
               System.out.println("El leon gana.");
               victoria = true;
           }

           if (Gacela.huyendo >= 5) {
               System.out.println("La gacela ha escapado");
               Leon.setPosicion(0);
               posGacela= x;
               posGacela= false;
               cazando=false;
               contador = 1;
           }

           if (huyendo >= 5 & comida >= 3 & bebida >= 3) {
               System.out.println("La gacela ha ganado");
               victoria = true;
           }
           //fin de turno
           if (ocultado == false) { ocultarse++; }
           if (observado == false) { observar++; }
           if (contador == 3) { contador = 1; }
           //reinicios
           sigilo = false;
           ocultado = false;
           observado = false;
           leonEscondido = false;


       } while (victoria == false);
       

       }

       }
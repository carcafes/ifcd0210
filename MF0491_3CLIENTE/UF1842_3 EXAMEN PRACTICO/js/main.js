      

       //variables neutras
       var distancia;
       var victoria = false;
       var contador = 1;

       //Numero aleatorio
       var n;
       var x;
       Random rnd = new Random();
       n = Math.floor(Math.random() * 4); 
       n = n + 5;

       //variables gacela

       var posGacela = 5;
       var comida = 0;
       var bebida = 0;
       var observar = 3;
       var huyendo = 0;
       var panico = false;
       var observado = false;

       //funciones gacela
       function gacelaComer() {
        refrescar();
           document.getElementById("pantalla_2").value = "La gacela come tranquilamente.";
           comida++;

       }


       function gacelaBeber() {
        refrescar();
           document.getElementById("pantalla_2").value = "La gacela bebe tranquilamente.";
           bebida++;
       }

      
         
       function gacelaObservar() {
           refrescar();
           document.getElementById("pantalla_2").value = "La gacela observa a su alrededor.";
           if (observar > 0) {
               observado = true;
               observar--;
               if (sigilo == false) {
                   if (distancia <= 4) { panico = true; document.getElementById("pantalla_4").value = "La gacela ha visto un leon a " + distancia + "."; } 
                   else { document.getElementById("pantalla_4").value = "La gacela no ha visto ningun peligro."; }
                                    } 
               else { document.getElementById("pantalla_4").value = "La gacela no ha visto ningun peligro."; }
                              }
           else { document.getElementById("pantalla_4").value ="La gacela se entretuvo mirando mariposas."; }

                                }

       function gacelaHuir() {
        refrescar();
           if (panico == true) {document.getElementById("pantalla_2").value = "La gacela huye del leon.";
               if (huyendo > 0) { posGacela++;posGacela++;huyendo++; } 
               else { posGacela++;huyendo++; }
                               }
           else{document.getElementById("pantalla_2").value = "La gacela se entretuvo mirando mariposas.";}
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
        refrescar();
        
           if (distancia <= 1) {cazado = true;document.getElementById("pantalla_2").value = "El leon se come a la gacela.";}
           else{posLeon++; document.getElementById("pantalla_2").value = "El leon salto hacia la gacela, pero no consigio alcanzarla.";}

       }

       function leonAvanzar() {
        refrescar();
        document.getElementById("pantalla_2").value = "El leon avanza.";
           posLeon++;

       }

       function leonPerseguir() {
        refrescar();
        
           if (panico == true) { posLeon++;posLeon++;document.getElementById("pantalla_2").value = "El leon se lanza a perseguir a la gacela."; } 
           else { posLeon++;document.getElementById("pantalla_2").value = "El leon se acerca a la gacela."; }
       }

       function leonAcechar() {
        refrescar();
        document.getElementById("pantalla_2").value = "El leon se acerca sigilosamente.";
           posLeon++;

       }

       function leonEsconderse() {
            refrescar();
             if (ocultarse > 0) {ocultarse--; sigilo = true; ocultado = true;document.getElementById("pantalla_2").value = "El leon se escondio.";}
           else {document.getElementById("pantalla_2").value = "El leon se entretuvo mirando mariposas."; }

       }
       //pantalla
       function refrescar(){
            document.getElementById("pantalla_1").value = "";
            document.getElementById("pantalla_2").value = "";
            document.getElementById("pantalla_3").value = "";
            document.getElementById("pantalla_4").value = "";
            document.getElementById("pantalla_5").value = "";
            document.getElementById("pantalla_6").value = "";
        }

        function Presentacion(){
            document.getElementById("pantalla_1").value = "";
            document.getElementById("pantalla_2").value = "                      Juego de cazeria:";
            document.getElementById("pantalla_3").value = "";
            document.getElementById("pantalla_4").value = "";
            document.getElementById("pantalla_5").value = "";
            document.getElementById("pantalla_6").value = "";
        }
        function Informacion1(){
           document.getElementById("pantalla_1").value = "";
           document.getElementById("pantalla_2").value = "";
           document.getElementById("pantalla_3").value = "                       Informacion: ";
           document.getElementById("pantalla_4").value = "";
           document.getElementById("pantalla_5").value = "";
           document.getElementById("pantalla_6").value = "";
         }
         function Informacion2(){
          document.getElementById("pantalla_1").value = "";
           document.getElementById("pantalla_2").value = "       El juego de cazeria nesesita de dos jugadores: Leon y gacela. ";
           document.getElementById("pantalla_3").value = "       El objetivo del juego es sobrevivir, ya sea el leon cazando a la gacela ";
           document.getElementById("pantalla_4").value = "       o la gazela comiendo, bebiendo y escapando. ";
           document.getElementById("pantalla_6").value = "";
           document.getElementById("pantalla_5").value = "";
           
         }
         function Comojugar1(){
           document.getElementById("pantalla_1").value = "";
           document.getElementById("pantalla_2").value = "        La gacela puede comer, beber y obsevar a su alrededor.";
           document.getElementById("pantalla_3").value = "        El leon debe avanzar hasta encontrar a la gacela. ";
           document.getElementById("pantalla_4").value = "";
           document.getElementById("pantalla_5").value = "        Una vez se han encontrado empieza la accion.";
           document.getElementById("pantalla_6").value = "        Si la gacela ve al leon podra huir.";
         }
         function Comojugar2(){
           document.getElementById("pantalla_1").value = "";
           document.getElementById("pantalla_2").value = "        Cuando el leon encuentra a la gacela gana acciones nuevas.";
           document.getElementById("pantalla_3").value = "        - Acechar: avanza una casilla en silencio.";
           document.getElementById("pantalla_4").value = "        - Esconderse: se agazapa escondido para que no le vean.";
           document.getElementById("pantalla_5").value = "        - Perseguir: avanza dos casillas si le han visto.";
           document.getElementById("pantalla_6").value = "        Y Cazar, que gana si esta en la casilla contigua a la gacela.";
         }
         function Comojugar3(){
           document.getElementById("pantalla_1").value = "";
           document.getElementById("pantalla_2").value = "        Para escoger opciones se clicar numero de la accion. ";
           document.getElementById("pantalla_3").value = "        Los turnos seran primero del leon y despues de la gazela.";
           document.getElementById("pantalla_4").value = "        Si la gazela escapa pero no ha comido suficiente se volvera a empezar hasta que haya comido y bebido suficiente.";
           document.getElementById("pantalla_5").value = "";
           document.getElementById("pantalla_6").value = "";
         }
         function Leon1(){
           document.getElementById("pantalla_1").value = "";
           document.getElementById("pantalla_2").value = "        El Leon no ve todavia a la gacela. ";
           document.getElementById("pantalla_3").value = "        Accion leon:";
           document.getElementById("pantalla_4").value = "        1. Avanzar.";
           document.getElementById("pantalla_5").value = "";
           document.getElementById("pantalla_6").value = "";
         }
         function Leon2(){
           document.getElementById("pantalla_1").value = "        El leon ve a la gacela a " + distancia + ", es hora de cazar.";
           document.getElementById("pantalla_2").value = "        Accion leon:";
           document.getElementById("pantalla_3").value = "        1. Acechar.";
           document.getElementById("pantalla_4").value = "        2. Esconderse.";
           document.getElementById("pantalla_5").value = "        3. Perseguir.";
           document.getElementById("pantalla_6").value = "        4. Cazar. ";
         }
         function setLeon(numero){
          leon= numero;
}
         
       function main(){  
         
         

       //titulo
       Presentacion();

       //informacion
       setTimeout(Informacion1(), 2000);
       setTimeout(Informacion2(), 3000);


       //Como jugar
       setTimeout(Comojugar1(), 3000);
       setTimeout(Comojugar2(), 3000);
       setTimeout(Comojugar3(), 3000);


       do {

           //chequeos

           distancia = posGacela - posLeon;
           if (distancia <= 4) { cazando = true; } else { cazando = false; }

           //nueva posicion

           
           x = Math.floor(Math.random() * 6); 
           x = x + 3;

           //acciones leon

           do {

               if (cazando == false) {
                   //opciones sin cazar
                   refrescar();
                   Leon1();
                   

                   switch (leon) {
                       case 1:
                           leon = 1;
                           leonAvanzar();
                           leoncorrecto = true;
                           break;
                       default:
                       refrescar();
                       document.getElementById("pantalla_3").value = "Accion no existente.";
                           break;
                                 }
                                 leon=0;
                                    }
               //opciones cazando.
               else {
                refrescar();
                Leon2();
                   

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
                       refrescar();
                       document.getElementById("pantalla_3").value = "Accion no existente ";
                           break;
                                 }
                                 leon=0;
                      }

               } while (leoncorrecto == false);

           
           //chequeos

           distancia = posGacela - posLeon;
           if (cazado == true) {
            refrescar();
            document.getElementById("pantalla_3").value = "El leon gana.";
            victoria = true;
                               }

           //Gacela.bot selector
           if(victoria == false){
           switch (contador) {
               case 1:
                   gacelaObservar();
                   if (panico == true) {contador = 4; } 
                   else {contador++;}
                   break;

               case 2:
                   gacelaComer();
                   contador++;
                   break;

               case 3:
                   gacelaBeber();
                   contador++;
                   if (bebida >= 3) {contador=4;panico = true;}
                   break;

               case 4:
                   gacelaHuir();
                   break;


                              }
                                }



           //chequeos de victoria.
           

           if (huyendo >= 5) {
              refrescar();
              document.getElementById("pantalla_3").value ="La gacela ha escapado";
               posLeon=0;
               posGacela= x;
               panico = false
               cazando= false;
               contador = 1;
                                    }

           if (huyendo >= 5 & comida >= 3 & bebida >= 3) {
               refrescar();
              document.getElementById("pantalla_3").value ="La gacela ha ganado";
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
           


       } while (victoria == false);
       
}
window.onload = start();
      
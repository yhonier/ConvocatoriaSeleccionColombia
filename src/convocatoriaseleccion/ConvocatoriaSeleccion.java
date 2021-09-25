/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convocatoriaseleccion;

import java.util.Scanner;


public class ConvocatoriaSeleccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
         int opcion;
        
      
        
          
        System.out.println("******Convocatoria Selección \033[33mColo\033[34mmb\033[31mia\033[30m******\n");
       
        
        System.out.println("Por favor ingrese la cantidad de jugadores para la convocatoria:");
        int jugadores=entrada.nextInt();
        
        if(jugadores<2){
            System.out.println("Deben ser al menos 2 convocados");
                   
        }
        
        Convocados [] convocados= new  Convocados [jugadores];
        
        int contador=0,cantidad=0;
        
        do{
            
            System.out.println("\nElija una opción");
       
            System.out.println("\n1. Agregar jugador");
        
            System.out.println("2. Buscar jugador");
        
            System.out.println("3. Editar Jugador");
        
            System.out.println("4. Mostrar convocatoria");
        
            System.out.println("5. Salir");
         
         
              opcion=entrada.nextInt();
              
              
         
            
         
            
                switch (opcion){
            
         
                    case 1: 
                        
                                          
                        if(contador<jugadores){
                            
                        
                             System.out.println("convocado #:"+(contador+1));
                        
                            convocados[contador]=new Convocados();
                        
                            convocados[contador].setId(String.valueOf(contador));
                    
                            System.out.print("Ingrese nombre de jugador: ");                        
                            convocados[contador].setNombre(entrada.next());

                            System.out.print("Ingrese apellido: ");                        
                            convocados[contador].setApellido(entrada.next());

                            System.out.print("Ingrese edad: ");                        
                            convocados[contador].setEdad(entrada.next());

                            System.out.print("Ingrese # de camiseta: ");                        
                            convocados[contador].setNumeroCamiseta(entrada.next());



                            System.out.print("Ingrese posición: ");                        
                            convocados[contador].setPosicion(entrada.next());

                            System.out.print("Ingrese Equipo de procedencia: ");                        
                            convocados[contador].setEquipoProcedencia(entrada.next());


                             System.out.print("\n \033[32m"+convocados[contador].getNombre()+" "+convocados[contador].getApellido()
                                     +" Registrado con # de camiseta: "+convocados[contador].getNumeroCamiseta()+"\n");                        

                        
                        
                        
                            cantidad++;
                            contador++;

                        } else{
            
                            System.out.println("\n \033[31m***  Ya ingreso todos los convocados ***\n\n");
                          } 
                    break;
                        
                        
                    case 2:
                        
                          if(convocados[0]==null){
                              
                                  System.out.println("\n \033[31m Aun no ha ingresado convocados");
                                 break;
                              }
                        
                        System.out.print("ingrese # de camiseta:");
                          String camiseta=entrada.next();
                          
                          
                          
                          for(int i=0; i<convocados.length;i++){
                              
                                                                                        
                              if(convocados[i].getNumeroCamiseta().equals(camiseta)){
                                  
                                  
                              
                                     System.out.println("Nombre: "+convocados[i].getNombre());
                                     System.out.println("Apellido: "+convocados[i].getApellido());
                                     System.out.println("Edad: "+convocados[i].getEdad());
                                     System.out.println("# de camiseta: "+convocados[i].getNumeroCamiseta());
                                     System.out.println("Posición: "+convocados[i].getPosicion());
                                     System.out.println("Llega desde el club: "+convocados[i].getEquipoProcedencia());
                              break;
                              }
                            
                              else{
                                  System.out.println("\n \033[31m No hay ningujugador registrado con la camiseta # "+camiseta);
                                  break;
                              }
                          
                          }
                                           
                        
                      
                        break;
                        
                        
                    case 3:
                        
                        if(convocados[0]==null){
                              
                                  System.out.println("\n \033[31m Aun no ha ingresado convocados");
                                 break;
                              }
                        
                         System.out.print("ingrese # de camiseta de jugador a editar:");
                          String jugadoraEditar=entrada.next();
                          
                          for(int i=0; i<convocados.length;i++){
                              
                                                            
                              if(convocados[i].getNumeroCamiseta().equals(jugadoraEditar)){
                                                                 
                                        System.out.println("\nEliga el dato a modificar");
                                        System.out.println("1. Nombre");
                                        System.out.println("2. Apellido");
                                        System.out.println("3. # de camiseta");
                                        System.out.println("4. Edad");
                                        System.out.println("5. Posición");
                                        System.out.println("6. club de procedencia");
                                        
                                        int opcionaModificar=entrada.nextInt();
                                        
                                                                        
                                 
                                    switch(opcionaModificar){
                                    
                                        case 1:
                                        
                                            System.out.println("El nombre actual es: "+convocados[i].getNombre()+" por favor indique nuevo nombre");
                                            String nuevoNombre= entrada.next();
                                            if(nuevoNombre.equals("")){
                                                System.out.println("Dato no ingresado");
                                                 break;
                                            } else{
                                                convocados[i].setNombre(nuevoNombre);
                                                System.out.println("Nombre cambiado por"+" "+convocados[i].getNombre());
                                                break;
                                            }
                                        
                                        
                                        
                                        case 2:
                                        
                                             System.out.println("El apellido actual es: "+convocados[i].getApellido()+" por favor indique nuevo apellido");
                                             String nuevoApellido= entrada.next();
                                             if(nuevoApellido.equals("")){
                                                System.out.println("Dato no ingresado");
                                                 break;
                                             } else{
                                                convocados[i].setApellido(nuevoApellido);
                                                 System.out.println("Apellido cambiado por"+" "+convocados[i].getApellido());
                                                 break;
                                            }    
                                       
                                       
                                        case 4:

                                              System.out.println("La edad resgistrada es: "+convocados[i].getEdad()+" por favor ingrese nueva edad");
                                              String nuevaEdad= entrada.next();
                                              if(nuevaEdad.equals("")){
                                                 System.out.println("Dato no ingresado");
                                                 break;
                                               } else{
                                                    convocados[i].setEdad(nuevaEdad);
                                                    System.out.println("La nueva edad registrada es"+" "+convocados[i].getEdad());
                                                     break;
                                                } 
                                              
                                        case 3:

                                              System.out.println("El # de camiseta actual es: "+convocados[i].getNumeroCamiseta()+" por favor indique nuevo número");
                                              String nuevoNumeroCamiseta= entrada.next();
                                              if(nuevoNumeroCamiseta.equals("")){
                                                 System.out.println("Dato no ingresado");
                                                 break;
                                               } else{
                                                    convocados[i].setApellido(nuevoNumeroCamiseta);
                                                    System.out.println("# de camista ha cambiado por"+" "+convocados[i].getNumeroCamiseta());
                                                     break;
                                                } 
                                        case 5:

                                              System.out.println("La posición actual es: "+convocados[i].getPosicion()+" por favor digite nueva posición");
                                              String nuevaPosicion= entrada.next();
                                              if(nuevaPosicion.equals("")){
                                                 System.out.println("Dato no ingresado");
                                                 break;
                                               } else{
                                                    convocados[i].setPosicion(nuevaPosicion);
                                                    System.out.println("La posición ha cambiado a"+" "+convocados[i].getPosicion());
                                                     break;
                                                }    
                                              
                                         case 6:

                                              System.out.println("El club de procedencia actual es : "+convocados[i].getPosicion()+" por favor digite club de procedencia");
                                              String nuevoClub= entrada.next();
                                              if(nuevoClub.equals("")){
                                                 System.out.println("Dato no ingresado");
                                                 break;
                                               } else{
                                                    convocados[i].setEquipoProcedencia(nuevoClub);
                                                    System.out.println("El club de procedencia ha cambiado a"+" "+convocados[i].getEquipoProcedencia());
                                                     break;
                                                }        
                                
                                        
                                }
                              
                           
                              break;
                              }
                            
                              else{
                                  System.out.println("No hay ningun jugador registrado con la camiseta"+jugadoraEditar);
                                  break;
                              }
                          
                          }
                                           
                        
                      
                        break;
                                               
                                                
                        
                    case 4:
                        
                        if(convocados[0]==null){
                              
                                  System.out.println("\n \033[31m Aun no ha ingresado convocados");
                                 break;
                              }
                        
                         System.out.println("jugadores convocados\n");
                     
                            for (int i=0;i<contador;i++){
                         
                         
                                System.out.println(
                                 
                                  "\033[32mconvocado #"+(i+1)+": \n"+  
                                "  Nombre: "+convocados[i].getNombre()+"\n"+
                                 "  Apellido:"+convocados[i].getApellido()+"\n "+
                                 "  Edad :"+convocados[i].getEdad()+"\n"+
                                 "  # de camiseta:"+convocados[i].getNumeroCamiseta()+"\n "+
                                 "  Posición:"+convocados[i].getNumeroCamiseta()+"\n "+
                                 "  Llega desde el club:"+convocados[i].getEquipoProcedencia()+"\n "
                                );
                            }
                        
                        
                        break;
                        
                        
                    case 5:
                        System.exit(0);
                        break;    
                } 
            
              
            
         }while(opcion!=5 );
         
         
        
        
        
        
        
    }
    
}

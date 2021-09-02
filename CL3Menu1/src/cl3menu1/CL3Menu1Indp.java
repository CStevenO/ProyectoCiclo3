
package cl3menu1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CL3Menu1Indp {

    
    public static void main(String[] args) throws IOException {
        //ACTIVAR O LLAMAR EL BUFFEREDREADER
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        //DECLARACION DE VARIABLES
        int numero, cantidad, opcion = 1;
        float nota1, nota2, nota3, definitiva;
        double beca = 0;
        String nombre, carrera;
        
        //MENU
         while (opcion >=1 && opcion <=4){
            System.out.println("* * * * M E N U * * * * ");
            System.out.println("1. Par o Impar");
            System.out.println("2. Manzanas");
            System.out.println("3. Notas");
            System.out.println("4. Salir");
            System.out.println("Elija la aopción deseada");
            opcion = Integer.parseInt(leer.readLine());
            
            //USO DEL SWITCH
            switch (opcion){
                case 1:
                    //CAPTURAR DATOS
                    System.out.println("Ingrese un número: ");
                    numero = Integer.parseInt(leer.readLine());
                    
                    //ISTANCIO LA CLASE PAR IMPAR
                    ParImpar objpim = new ParImpar ();
                    //LLAMADO USANDOEL METODO SET
                    objpim.setNumero(numero);
                    //IMPRIMIR USANDO LOS OBJETOS
                    objpim.par_impar();
                    break;
                    
                case 2:
                    System.out.println("Ingrese la cantidad de manzanas a comprar: ");
                    cantidad = Integer.parseInt(leer.readLine());
                    //INSTANCIO LA CLASE MANZANAS
                    Manzanas objman = new Manzanas();
                    objman.setCantidad(cantidad);
                    System.out.println("La cantidad de manzanas es: " +objman.getCantidad());
                    System.out.println("El total a pagar es: " +objman.getTotal());
                    break;
                
                case 3:
                    System.out.println("Digite el nombre del Estudiante ");
                    nombre = leer.readLine();
                    System.out.println("Ingrese la carrera del Estudiante ");
                    carrera = leer.readLine();
                    System.out.println("Ingrese la Nota 1 ");
                    nota1 =Float.parseFloat(leer.readLine());
                    System.out.println("Ingrese la Nota 2 ");
                    nota2 =Float.parseFloat(leer.readLine());
                    System.out.println("Ingrese la Nota 3 ");
                    nota3 =Float.parseFloat(leer.readLine());
                    definitiva = (nota1 + nota2 + nota3)/3;
                    //ISTANCIO LA CLASE MANZANAS
                    Notas objnot =new Notas();
                    //LLAMADOS DE METODOS
                    objnot.setNota1(nota1);
                    objnot.setNota2(nota2);
                    objnot.setNota3(nota3);
                    //CALCULAR DEFINITIVA
                    objnot.calcular_beca();
                    break;
                            
                            
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
                                
   
                }
                    
                        
            }
            
        }
     }
    
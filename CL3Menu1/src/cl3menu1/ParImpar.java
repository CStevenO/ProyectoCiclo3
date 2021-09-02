
package cl3menu1;


public class ParImpar {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //1. METODO PARA RETORNAR DATOS PARA IMPRIMIR
    public String es_par_impar(){
        String resultado;
        if (numero %2 ==0)
            resultado = "Es par";
        else
            resultado = "Es Impar";
        return resultado;
    }
    
    //2. METODO IMPRIMIR SIN RETORNAR
    public void par_impar(){
        if (numero %2 ==0)
            System.out.println("El numero " +numero+ " es par");
            
        else
             System.out.println("El numero " +numero+ " es impar");
    }
    
    
}

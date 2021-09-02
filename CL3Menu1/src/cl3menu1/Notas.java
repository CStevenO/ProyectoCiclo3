
package cl3menu1;


public class Notas {
    
    //DECLARACION DE VARIABLES
    private String nombre;
    private String carrera;
    private float nota1;
    private float nota2;
    private float nota3;
    private float definitiva;
    private double beca;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Float getNota1() {
        return nota1;
    }

    public void setNota1(Float nota1) {
        this.nota1 = nota1;
    }

    public Float getNota2() {
        return nota2;
    }

    public void setNota2(Float nota2) {
        this.nota2 = nota2;
    }

    public Float getNota3() {
        return nota3;
    }

    public void setNota3(Float nota3) {
        this.nota3 = nota3;
    }

    public Float getDefinitiva() {
        return definitiva;
    }

    public void setDefinitiva(Float definitiva) {
        this.definitiva = definitiva;
    }

    public double getBeca() {
        return beca;
    }

    public void setBeca(double beca) {
        this.beca = beca;
    }
    
    //METDO PARA CALCULAT LA BECA
    public void calcular_beca(){
        definitiva = (nota1 + nota2 + nota3)/3;
        if (carrera.equals("Sistemas") || carrera.equals("sistemas")) {
            if (definitiva >= 4.0 && definitiva <= 5.0 )
                beca = 1450000;
            else
                beca = 0;
        }
        else if (carrera.equals("Electronica") || carrera.equals("electronica")) {
            if (definitiva >= 4.2 && definitiva <= 5.0 )
                beca = 1480000;
            else
                beca = 0;
        }

        else if (carrera.equals("Contaduria") || carrera.equals("contaduria")) {
            if (definitiva >= 4.5 && definitiva <= 5.0 )
                beca = 1500000;
            else
                beca = 0;
        }
        else if (carrera.equals("Arquitectura") || carrera.equals("arquitectura")) {
            if (definitiva == 5.0 )
                beca = 1700000;
            else
                beca = 0;

            }
            System.out.println("El estudiante " +nombre+ " de la carrera de " +carrera+  " obtuvo una deinitiva de " 
                    +definitiva+ " y se le otorga una beca por el valor de " +beca);
            
    }
}

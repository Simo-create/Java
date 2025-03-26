
import static java.lang.Boolean.TRUE;

abstract class MaterialDeBiblioteca {
    private String titlu;
    private Boolean disponibilitate;


    public MaterialDeBiblioteca(){

    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Boolean getDisponibilitate() {
        return disponibilitate;
    }

    public void setDisponibilitate(Boolean disponibilitate) {
        this.disponibilitate = disponibilitate;
    }

    public MaterialDeBiblioteca(String titlu, Boolean disponibilitate){
        this.titlu = titlu;
        this.disponibilitate = disponibilitate;
    }



    public abstract void descriereMaterial();

    public void verificaDisponibilitatea(){
        System.out.println("Se verifica disponibilitatea cartii");
        if (disponibilitate == TRUE){
            System.out.println("Material disponibil");
        }
        else {
            System.out.println("Material indisponibil");
        }
    }

    public void cautareDupaTitlu(){
        System.out.println("Materialul are urmatoarele detalii");
    }

    public void imprumutareMaterial(){

    }

    public void afisareMaterialeDisponibile(){

    }

}

public class MainForma {
    public static void main(String[] args) {

        Forma forma = new Forma(5,6,
                5,7,8);

        System.out.println("Aria cercului cu raza:" + forma.razacerc + " este "+
                forma.ariacerc(forma.razacerc));

        System.out.println("Aria dreptunghiului cu laturile:" + forma.lungimedreptunghi + " si "+
                forma.latimedreptunghi+ " este " + forma.ariadreptunghi(forma.latimedreptunghi, forma.lungimedreptunghi));

        System.out.println("Aria triunghiului cu inaltimea " + forma.inaltimetriunghi + " si baza "+
                forma.bazatriunghi+ " este " + forma.ariatriunghi(forma.inaltimetriunghi, forma.bazatriunghi));

    }
}

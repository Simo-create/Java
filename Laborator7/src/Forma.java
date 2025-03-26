public class Forma {
    int razacerc;
    int lungimedreptunghi;
    int latimedreptunghi;
    int bazatriunghi;
    int inaltimetriunghi;

    public Forma(int razacerc, int lungimedreptunghi, int latimedreptunghi, int bazatriunghi, int inaltimetriunghi)
    {
        this.razacerc = razacerc;
        this.lungimedreptunghi = lungimedreptunghi;
        this.latimedreptunghi = latimedreptunghi;
        this.bazatriunghi = bazatriunghi;
        this.inaltimetriunghi = inaltimetriunghi;
    }


    public double ariacerc(int razacerc){
        double ariacerc = Math.PI * Math.pow(razacerc, 2);
        System.out.println("Aria cercului este: " + ariacerc);
        return ariacerc;
    }

    public double ariadreptunghi(int latimedreptunghi, int lungimedreptunghi){
        double ariadreptunghi = latimedreptunghi*lungimedreptunghi;
        System.out.println("Aria dreptunghiului este : " + ariadreptunghi);
        return latimedreptunghi*lungimedreptunghi;
    }

    public double ariatriunghi(int bazatriunghi, int inaltimetriunghi){
        double ariatriunghi = (bazatriunghi * inaltimetriunghi) / 2;
        System.out.println("Aria triunghiului este : " + ariatriunghi);
        return ariatriunghi;
    }
}

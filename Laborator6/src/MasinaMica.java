public class MasinaMica {

    private Motor motor;

    public MasinaMica( Motor motor) {
         this.motor = motor;
    }

    public String descriere(){

        return "Masina are un motor si " + motor.descriere();
    }




}

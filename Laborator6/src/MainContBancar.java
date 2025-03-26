public class MainContBancar {
    public static void main(String[] args) {

        ContBancar cont = new ContBancar();

        cont.setSold(100);

        cont.depunere(100);
        cont.retragere(200);
        cont.retragere(300);

    }
}

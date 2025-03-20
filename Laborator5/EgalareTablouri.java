public class EgalareTablouri {
    public static void main(String[] args) {
        int[] tablou1 = {1, 2, 3};
        int[] tablou2 = tablou1;
        tablou2[0] = 99;
        System.out.println(tablou1[0]); // va afisa 99 deoarece modificarea intr-un tablou il
        // afecteaza pe celalalt
    }
}

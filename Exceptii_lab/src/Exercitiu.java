import java.sql.SQLOutput;

public class Exercitiu {
    public static void doSomething(int i) throws Exc1,Exc2{
        try {
            if (i > 0)
                throw new Exc1();
            else
                throw new Exc2();
        } catch (Exc1 e) {
            System.out.println("Am prins exceptia chiar cand este aruncata, nu o propag mai departe");
        }

    }
}

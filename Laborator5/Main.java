
public class Main {
    public static void main(String[] args) {

        Masina masina = new Masina();
        Masina masina1 = new Masina("AUDI", 2000);
        Masina masina2 = new Masina("Volkswagen", 1900);

        System.out.println("Marca masinii masina" + masina.getBrand());

        masina1.setBrand("BMW");
        System.out.println("Marca masinii 1 " + masina1.getBrand());
        masina2.setBrand("Mercedes");
        System.out.println("Marca masinii 2 " + masina2.getBrand());


       System.out.println(masina1.getBrand());
       System.out.println(masina2.getCC());

        System.out.println(masina1);
        System.out.println(masina2);


        //6. Egalarea a două obiecte
        Masina m1 = new Masina("Dacia", 1497);
        Masina m2 = m1;
        m2.setBrand("Volkswagen");
        System.out.println(m1.getBrand()); // va afisa Volkswagen deoarece ambele
        // variabile indica spre acelasi obiect


        //Clasa ExercitiuToString
        ExercitiuToString exercitiu = new ExercitiuToString(100);
        System.out.println("Rezultatul metodei toString este: " + exercitiu);

        //Analiza cod din clasa Priza
        Priza p1, p2, p3;
        p1 = new Priza(200);
        p2 = p1;
        p2.setTensiune(400);
        p3 = p2;
        p3.setTensiune(100);
        System.out.println(p1.getTensiune()); // Se va afisa 100. p3=p2 si p2=p1

        Cerc cerc1 = new Cerc();
        Cerc cerc2 = new Cerc(2.2, "verde");

        // Afișare informații cercuri
        System.out.println(cerc1); // Output: Cercul are raza 1.0 și culoarea alb
        System.out.println(cerc2); // Output: Cercul are raza 2.5 și culoarea roșu

        // Calcul arii
        System.out.println("Aria cercului 1: " + cerc1.getArie());
        System.out.println("Aria cercului 2: " + cerc2.getArie());

        // Comparare raze a doua cercuri
        Cerc cercMaiMare = Cerc.comparaCercuri(cerc1, cerc2);
        System.out.println("Cercul cu raza mai mare este: " + cercMaiMare);

    }
    }

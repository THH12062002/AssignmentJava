// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        FruitBasket fb = new FruitBasket();
//        fb.arr.add("Apple");
//        fb.arr.add("Banana");
//        fb.arr.add("Cherry");
//        for (int i = 0; i < fb.arr.size(); i++) {
//            if (i == 1)
//                System.out.println(fb.arr.get(i));
//        }

//    StudentGrades sg = new StudentGrades();
//    sg.hm.put("John", 6.7f);
//    sg.hm.put("Alice", 8.0f);
//    sg.hm.put("Bob", 9.7f);
//
//    System.out.println(sg.hm.get("Bob"));
//    }

//        Calculator c = new Calculator();
//        System.out.println("Addition Result: " + c.add(10, 5));
//        System.out.println("Subtraction Result: " + c.subtract(5, 10));

        Employee e = new Employee();
        e.name = "A";
        e.department = "Engineering";
        e.work();

        Manager m = new Manager();
        m.name = "B";
        m.department = "Engineering";
        m.teamSize = 5;
        m.work();
    }
}
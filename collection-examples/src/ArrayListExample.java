import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        staticDemo();
        System.out.println(add(2, 23));
        System.out.println(add(2, 23, 10));
        ArrayListExample example = new ArrayListExample();
        example.nonStaticDemo();

        ArrayListExample example2 = new ArrayListExample();
        example2.nonStaticDemo();

        Employee emp = new Employee("John Doe", "IT", 75000);
        System.out.println(emp);


        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);
        //numbers.add("40");

        int a = 50;
        Integer b = 60;

        // Retrieving
        System.out.println(numbers.get(0));

        System.out.println("nIteration #10: ");
        // Indexed for loop iteration
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Removing items (careful!)
        numbers.remove(numbers.size() - 1);

        // This is VERY slow
        numbers.remove(0);

        System.out.println("nIteration #2: ");
        for (Integer value : numbers) {
            System.out.println(value);
        }

        // List interface ...
        List<String> values = new ArrayList<String>();
    }

    static void staticDemo() {
        System.out.println("static ");
    }

    static int add(int a, int b) {
        System.out.println("inside add ");
        return a + b;
    }

    static int add(Integer a, Integer b, Integer c) {
        System.out.println("inside add ");
        return a + b + c;
    }

    private void nonStaticDemo() {
        System.out.println("non static");
    }

    //default, private, protected and public methods


}
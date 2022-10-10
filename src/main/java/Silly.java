import java.util.Arrays;



public class Silly implements Comparable<Silly>{

    public static int my_static = 0;


    public String name;


    public int countStatic() {

        int to_return = my_static;
        my_static += 1;

        return to_return;
    }




    public Silly(String name) {
        this.name = name;
    }


    public Silly(int number) {
        this.name = "Silly #" + number;
    }



    public Silly(String string1, String string2) {this.name = string1 + string2; }





    public static void main(String[] args) {

        Silly first_version = new Silly("single str name");
        Silly second_version = new Silly(5);
        Silly third_version = new Silly("first", "second");

        System.out.println("Silly 1: " + first_version);
        System.out.println("Silly 2: " + second_version);
        System.out.println("Silly 3: " + third_version);


        Silly x = new Silly("something");
        Silly y = new Silly("something else");


        x.countStatic();
        y.countStatic();
        x.countStatic();
        x.countStatic();
        int[] expected_values = {0, 1, 2, 3};

        System.out.println("The countStatic calls will return " + Arrays.toString(expected_values));
    }


    @Override
    public String toString(){
        // TODO (Task 3): Implement the body of this method!
        return this.name;
    }


    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Silly)){
            return false;
        }

        Silly other = (Silly) o;
        return this.name.equals(((Silly) o).name);


    }


    @Override
    public int compareTo(Silly other) {

        if (this.name.length() > other.name.length()) {
            return 1;
        } else if (this.name.length() < other.name.length()) {
            return -1;
        } else {
            return 0;
        }
    }


}
public class OuterClass {

    void display() {
        System.out.println("OuterClass display");
    }

    class Inner {
        void display() {
            System.out.println("Inner display");
        }
    }

    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        outerObject.display();

        OuterClass.Inner innerObject = outerObject.new Inner();
        innerObject.display();
    }
}

package seminar;

public class Seminar {
    public void sem() {

        Number[] numArray = new Number[3];
        numArray[0] = 1;
        numArray[1] = 2.0f;
        numArray[2] = 29384759823476L;
        MyList<Number> myList = new MyList<>(numArray);
        myList.printList();

        for (Number number :
               myList) {
            System.out.println(number);
        }
    }
}
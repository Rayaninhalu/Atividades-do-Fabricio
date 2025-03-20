public class Main {
    public static void main(String[] args) {
        UniBHList<Integer> myList = new UniBHList<>();

        for (int i = 0; i < 10; i++) {
            myList.insertAtBeginning(i + 1);
            System.out.println(myList);
        }
         for (int i = 0; i < 1; i++) {
            myList.insertAtBeginning(50);
            System.out.println(myList);
        }
        
        myList.removeAtBeginning();
        
        myList.removeAtBeginning();

        System.out.println(myList);

        System.out.println();
    }
}
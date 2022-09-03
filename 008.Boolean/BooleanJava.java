public class BooleanJava {
    public static void main(String[] args) {
        boolean passedDoor = true; //this is the same as (1 == 1)
        boolean missedDoor = false; //this is the same as (1 == 0)
        int doorCount = 0;
        if (passedDoor) {
            System.out.println("We passed the first door");
            doorCount = doorCount + 1;
        }
        if (missedDoor) { //if passed the door then we won
            System.out.println("We passed the second door");
            doorCount = doorCount + 1;
        }
        if (passedDoor) {
            System.out.println("We passed the third door");
            doorCount = doorCount + 1;
        }
        if(doorCount == 3) {
            System.out.println("We won");
        }
        else {
            System.out.println("We lost");
        }
    }
}

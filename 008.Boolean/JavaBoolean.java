public class JavaBoolean {
    public static void main(String[] args) {
        boolean passedDoor = (1 == 1); //This is the same as true
        boolean missedDoor = (1 == 0); //This is the same as false
        int doorCount = 0;
        boolean passedAllDoors = false; //initially it is false by default, but it is ok if we initialize
        if (passedDoor) {
            System.out.println("We passed the first door");
            doorCount = doorCount + 1;
        }
        if (passedDoor) { //if passed the door then we won
            System.out.println("We passed the second door");
            doorCount = doorCount + 1;
        }
        if (passedDoor) {
            System.out.println("We passed the third door");
            doorCount = doorCount + 1;
        }
        if(doorCount == 3) {
            passedAllDoors = true;
        }
        if(passedAllDoors) {
            System.out.println("We won");
        }
        else {
            System.out.println("We lost");
        }
    }
}

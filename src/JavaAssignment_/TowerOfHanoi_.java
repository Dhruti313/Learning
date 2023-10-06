package JavaAssignment_;


    public class TowerOfHanoi_ {
        public static void main(String[] args) {
            int numDisks = 3;
            char sourceRod = 'A';
            char destinationRod = 'C';
            char auxiliaryRod = 'B';

            solveTowerOfHanoi(numDisks, sourceRod, destinationRod, auxiliaryRod);
        }

        public static void solveTowerOfHanoi(int n, char source, char destination, char auxiliary) {
            if (n == 1) {
                System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
                return;
            }

            solveTowerOfHanoi(n - 1, source, auxiliary, destination);
            System.out.println("Move disk " + n + " from rod " + source + " to rod " + destination);
            solveTowerOfHanoi(n - 1, auxiliary, destination, source);
        }
    }



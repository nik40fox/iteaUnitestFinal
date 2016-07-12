
public class LoopVerification {
    /**
     * Method to run crazy loop on k and y ints
     * @return int array  with k and y variables
     */
    public static int[] crazyloop(){
        int y = 1;
        int k;
        for(k = 6; k >= 3; k--)
            y = y + k;

        int [] array = new int [2];
        array[0]=y;
        array[1]=k;

        return array;

        /*System.out.println("y = " + y);
        System.out.println("k = " + k);*/
    }
}

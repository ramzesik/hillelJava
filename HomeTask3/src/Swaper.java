/**
 * Created by Ramzes on 03.05.2015.
 */
class Swaper {

    /**
     * Swap values in array by idx
     *
     * @param idxFrom first idx
     * @param idxTo   second idx
     */

    public void swapArrayidx(double[] arrayToSort, int idxFrom, int idxTo) {
        double tmp = arrayToSort[idxFrom];
        arrayToSort[idxFrom] = arrayToSort[idxTo];
        arrayToSort[idxTo] = tmp;
    }


}

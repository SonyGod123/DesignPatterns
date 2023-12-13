package Sort;

public class Sorter {
    Algorithm algorithm;

    public void setAlgorithm(Algorithm algorithm){
            this.algorithm = algorithm;
    }
    public int[] sort(int[] data) {
        return algorithm.doSort(data);
    }
}

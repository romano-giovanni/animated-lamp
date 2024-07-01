public class ArrayManager {

    private int[] array;

    public ArrayManager(int[] array) {
        this.array = array;
        ordinaArray();
    }

    public int[] getArray() {
        return array;
    }

    public int getMax() {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public void ordinaArray() {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public void stampaDecrescente(int[] numeriDecrescenti) {
        for (int i = array.length - 1; i >= 0; i--) {
            numeriDecrescenti[array.length - 1 - i] = array[i];
            System.out.println(numeriDecrescenti[array.length - 1 - i]);
        }
    }


}

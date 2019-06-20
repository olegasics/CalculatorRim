public abstract class OperationAbctrsact {

    private int valueOne;
    private int valueTwo;

    public int getValueOne() {
        return valueOne;
    }

    public void setValueOne(int valueOne) {
        this.valueOne = valueOne;
    }

    public int getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(int valueTwo) {
        this.valueTwo = valueTwo;
    }

    public int Operation(int valueOne, int valueTwo) {
        int result = valueOne + valueTwo;
        return result;
    }
}

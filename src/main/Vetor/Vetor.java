package main.Vetor;

public class Vetor {

    private final String[] items;
    private int lastIndex;

    public Vetor(int size) {
        items = new String[size];
        lastIndex = -1;
    }

    public int getLastIndex() {
        return lastIndex + 1;
    }

    public void add(final String item) {
        if (lastIndex == items.length-1){
            System.err.println("Lista cheia!");
        } else {
            lastIndex++;
            items[lastIndex] = item;
        }
    }

    public void print() {
        System.out.println("#####################");
        if (lastIndex < 0) {
            System.err.println("Lista vazia!");
        } else {
            for (int i = 0; i <= lastIndex; i++) {
                System.out.println(i + " - " + items[i]);
            }
        }
        System.out.println("#####################");
    }

    public void exclude(final int index) {
        if (index >= 0 && index <= lastIndex) {
            shift(index);
            lastIndex--;
        } else {
            System.err.println("Valor inválido!");
        }
    }

    private void shift(int index) {
        for (int i = index; i < lastIndex; i++) {
            items[i] = items[i+1];
        }
    }

}

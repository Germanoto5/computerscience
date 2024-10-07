package com.romandev.datastructure;

import java.util.Random;

public class ArrayLesson {

    private int[] values;

    public ArrayLesson() {
        Random random = new Random();
        this.values = new int[] { random.nextInt(1001), random.nextInt(1001), random.nextInt(1001),
                random.nextInt(1001), random.nextInt(1001), random.nextInt(1001) };
    }

    public ArrayLesson(int[] givenValues) {
        this.values = givenValues;
    }

    public void arrayShorter() {

        System.out.println("--Array sin ordenar--");
        System.out.println(toString());

        for (int index = 1; index < this.values.length; index++) {
            int key = this.values[index];
            int previousIndex = index - 1;

            while (previousIndex >= 0 && this.values[previousIndex] > key) {
                this.values[previousIndex + 1] = this.values[previousIndex]; 
                previousIndex--; 
            }
            this.values[previousIndex + 1] = key;
        }
        System.out.println("--Array ordenado:--");
        System.out.println(toString());
    }
    public int binaryFinder(int numberToFind) {
        int firstIndex = 0;
        int lastIndex = this.values.length - 1;

        while (firstIndex <= lastIndex) {
            int indexMidleNumber = (lastIndex + firstIndex) / 2;

            if (this.values[indexMidleNumber] == numberToFind) {
                return indexMidleNumber; 
            }

            if (numberToFind < this.values[indexMidleNumber]) {
                lastIndex = indexMidleNumber - 1; 
            } else {
                firstIndex = indexMidleNumber + 1; 
            }
        }
        return -1;
    }

    public String toString() {
        String valuesToString = "[";
        for (int index = 0; index < this.values.length; index++) {
            if (index == 0) {
                valuesToString = valuesToString + this.values[index];
            } else {
                valuesToString = valuesToString + " , " + this.values[index];
            }
        }
        valuesToString = valuesToString + "]";
        return valuesToString;
    }
    
}

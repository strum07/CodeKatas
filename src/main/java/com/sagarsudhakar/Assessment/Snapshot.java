//Problem 1: Snapshot


package com.sagarsudhakar.Assessment;

import java.util.ArrayList;

public class Snapshot {

        private ArrayList<Integer> data = new ArrayList<>();

        public Snapshot(ArrayList<Integer> data) {
            for(int i:data){
                this.data.add(i);
            }
        }

        public ArrayList<Integer> restore() {
            return (ArrayList<Integer>) data.clone();
        }

        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);

            Snapshot snap = new Snapshot(list);

            list.set(0, 3);

            list = snap.restore();

            System.out.println(list); //It should log "[1,2]"

            list.add(4);

            list = snap.restore();

            System.out.println(list); //It should log "[1,2]"
        }
}
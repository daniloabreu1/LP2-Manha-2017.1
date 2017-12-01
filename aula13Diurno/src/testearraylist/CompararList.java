package testearraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class CompararList {

    public static void main(String args[]) {

        final int TAM;
        TAM = 100000;
        int cont;
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        Vector vectorlist = new Vector();

        double startTime = System.currentTimeMillis();
        System.out.print("TAM: " + arrayList.size() + "\t\t| ");
        for (int i = 0; i < TAM; i++) {
            arrayList.add(i);
        }
        double endTime = System.currentTimeMillis();
        double duration = endTime - startTime;
        System.out.println("ArrayList add:\t" + (duration / 1000) + " segundos" + "\t| TAM: " + arrayList.size());

        startTime = System.currentTimeMillis();
        System.out.print("TAM: " + linkedList.size() + "\t\t| ");
        for (int i = 0; i < TAM; i++) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("LinkedList add:\t" + (duration / 1000) + " segundos" + "\t| TAM: " + linkedList.size());

        startTime = System.currentTimeMillis();
        System.out.print("TAM: " + vectorlist.size() + "\t\t| ");
        for (int i = 0; i < TAM; i++) {
            vectorlist.add(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Vector add:\t\t" + (duration / 1000) + " segundos" + "\t| TAM: " + vectorlist.size());
        System.out.println();

        cont = 0;
        startTime = System.currentTimeMillis();
        System.out.print("TAM: " + arrayList.size() + "\t| ");
        for (int i = 0; i < TAM; i++) {
            arrayList.get(i);
            cont++;
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("ArrayList get:\t" + (duration / 1000) + " segundos" + "\t|iterações: " + cont);

        cont = 0;

        startTime = System.currentTimeMillis();
        System.out.print("TAM: " + linkedList.size() + "\t| ");
        for (int i = 0; i < TAM; i++) {
            linkedList.get(i);
            cont++;
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("LinkedList get:\t" + (duration / 1000) + " segundos" + "\t|iterações: " + cont);

        cont = 0;

        startTime = System.currentTimeMillis();
        System.out.print("TAM: " + vectorlist.size() + "\t| ");
        for (int i = 0; i < TAM; i++) {
            vectorlist.get(i);
            cont++;
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Vector get:\t\t" + (duration / 1000) + " segundos" + "\t|iterações: " + cont);
        System.out.println();

        startTime = System.currentTimeMillis();
        System.out.print("TAM: " + arrayList.size() + "\t| ");
        for (int i = (arrayList.size() - 1); i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("ArrayList remove:\t" + (duration / 1000) + " segundos" + "\t| TAM: " + arrayList.size());

        startTime = System.currentTimeMillis();
        System.out.print("TAM: " + linkedList.size() + "\t| ");
        for (int i = (linkedList.size() - 1); i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("LinkedList remove:\t" + (duration / 1000) + " segundos" + "\t| TAM: " + linkedList.size());

        startTime = System.currentTimeMillis();
        System.out.print("TAM: " + vectorlist.size() + "\t| ");
        for (int i = (vectorlist.size() - 1); i >= 0; i--) {
            vectorlist.remove(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Vector remove:\t" + (duration / 1000) + " segundos" + "\t| TAM: " + vectorlist.size());

    }
}

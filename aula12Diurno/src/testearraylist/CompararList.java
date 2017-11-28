package testearraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CompararList {

    static ArrayList arrayList = new ArrayList();
    static LinkedList linkedList = new LinkedList();
    static Vector vectorlist = new Vector();

    public static double addTest(List l) {
        double startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            l.add("A"+i);
        }
        double endTime = System.currentTimeMillis();
        double duration = endTime - startTime;
        return duration;
    }

    ;
    public static double getTest(List l) {
        double startTime = System.currentTimeMillis();
        for (int i = 0; i < l.size(); i++) {
            l.get(i);
        }
        double endTime = System.currentTimeMillis();
        double duration = endTime - startTime;
        return duration;
    }

    ;
    public static double removeTest(List l) {
        double startTime = System.currentTimeMillis();
        int i=0;
        while(l.size()>0){
            l.remove(l.get(i));
        }
        double endTime = System.currentTimeMillis();
        double duration = endTime - startTime;
        return duration;
    }

    ;
    public static void main(String args[]) {

        System.out.println("TAM: "+arrayList.size()+"\t| "+"ArrayList add:\t" + (addTest(arrayList) / 1000) + " segundos"+"\t| TAM: "+arrayList.size());
        System.out.println("TAM: "+linkedList.size()+"\t| "+"LinkedList add:\t" + (addTest(linkedList) / 1000) + " segundos"+"\t| TAM: "+linkedList.size());
        System.out.println("TAM: "+vectorlist.size()+"\t| "+"Vector add:\t\t" + (addTest(vectorlist) / 1000) + " segundos"+"\t| TAM: "+vectorlist.size());
        System.out.println();

        System.out.println("ArrayList get:\t " + (getTest(arrayList) / 1000) + " segundos");
        System.out.println("LinkedList get:\t " + (getTest(linkedList) / 1000) + " segundos");
        System.out.println("Vector get:\t " + (getTest(vectorlist) / 1000) + " segundos");
        System.out.println();

        System.out.println("TAM: "+arrayList.size()+"\t| "+"ArrayList remove:\t" + (removeTest(arrayList) / 1000) + " segundos"+"\t| TAM: "+arrayList.size());
        System.out.println("TAM: "+linkedList.size()+"\t| "+"LinkedList remove:\t" + (removeTest(linkedList) / 1000) + " segundos"+"\t| TAM: "+linkedList.size());
        System.out.println("TAM: "+vectorlist.size()+"\t| "+"Vector remove:\t" + (removeTest(vectorlist) / 1000) + " segundos"+"\t| TAM: "+vectorlist.size());
    }
}

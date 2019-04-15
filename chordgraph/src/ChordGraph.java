package src;

import edu.princeton.cs.algs4.Digraph;

import java.util.ArrayList;
import java.util.List;

public class ChordGraph {
    public Digraph g;

    public ChordGraph() {
        g = new Digraph(8);
        //for all the chord-relationships in the given scale specified, add edges for each valid chord pattern.
        for (int[] pattern : Scale.major()) {
            g.addEdge(pattern[0], pattern[1]);
        }

    }

    public ArrayList<int[]> generateProgressions(int length) {
        int i = (int) (1 + (Math.random() * 7));

        ArrayList progressions = new ArrayList();

        generateProgressions(i, i, length, progressions);

        return progressions;
    }

    public void generateProgressions(int first, int current, int length, List result) {
        //pick an arbitrary vertex
        if (length == 1) {
            for (int i : g.adj(current % 10)) {
                if (i == first) {
                    //add first, then return
                    result.add(current);
                }
            }
            //otherwise, we do not add anything.
            return;
        }
        //perform BFS search.
        for (int a : g.adj(current % 10)) {

            generateProgressions(first, current * 10 + a, length - 1, result);
        }



    }

    public static void main(String[] args) {
        ChordGraph cg = new ChordGraph();
        ArrayList b = cg.generateProgressions(4);
        System.out.println(b);
    }
}

package src;

import java.util.ArrayList;

public class Scale {
    public static ArrayList<int[]> major() { //TODO: make this read an external txt and use regex
        ArrayList scale = new ArrayList();
        for (int i = 1; i <= 7; i++) {
            scale.add(new int[]{1, i}); //any chord can lead to or from I
        }
        scale.add(new int[]{3, 2});
        scale.add(new int[]{3, 6});
        scale.add(new int[]{6, 2});
        scale.add(new int[]{6, 4});
        scale.add(new int[]{6, 5});
        scale.add(new int[]{2, 4});
        scale.add(new int[]{2, 5});
        scale.add(new int[]{2, 7});
        scale.add(new int[]{4, 6});
        scale.add(new int[]{4, 7});
        scale.add(new int[]{4, 5});
        scale.add(new int[]{5, 6});
        scale.add(new int[]{5, 4});
        scale.add(new int[]{7, 3});
        scale.add(new int[]{7, 1});
        scale.add(new int[]{5, 1});
        return scale;
    }

}

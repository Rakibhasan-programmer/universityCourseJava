package com.company;

public class BoxConstructor {
    int width, height, depth;

    // default constructor
    BoxConstructor(){
        width = 12;
        height = 21;
        depth = 32;
    }
    // parametarized constructor
    BoxConstructor(int h, int w, int d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    public void calculate(){
        int w = this.width, h = this.height, d = this.height;
        System.out.println(w * d * h);
    }
}

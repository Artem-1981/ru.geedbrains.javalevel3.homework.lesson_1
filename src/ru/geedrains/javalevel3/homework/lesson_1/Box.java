package ru.geedrains.javalevel3.homework.lesson_1;

import java.util.ArrayList;

public class Box<T extends Fruit>{
    private ArrayList<T> mybox = new ArrayList<T>();

    public Box(){
        this.mybox = mybox;
    }

    public void putbox(T obj){
        this.mybox.add(obj);
    }

     public float getWeigth() {
        float sum=0.0f;
        for (int i=0;i<mybox.size();i++)
         sum+=mybox.get(i).getWeight();
        return sum;

     }

     public boolean compare (Box<T> another) {
        return this.getWeigth()==another.getWeigth();
     }

    public boolean pourover(Box <T> another) {
        boolean fl;
        if (this.mybox.get(0).getClass().getName().equals(another.mybox.get(0).getClass().getName())) {
            for (int i = 0; i < another.mybox.size(); i++) {
                this.putbox(another.mybox.get(0));
                another.mybox.remove(0);
            }
            fl=true;
        } else fl=false;
        return fl;
    }
}


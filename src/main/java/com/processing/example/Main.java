/*
 * Coder: Allison Hart
 * Date 9/8/2024
 * Description: Hello, world project, prints hello world and drawing of penguin and bear
 * 
 */







package com.processing.example;

import processing.core.*;

public class Main extends PApplet {
    public static void main(String[] args) {
        PApplet.main("com.processing.example.Main");
        System.out.println("Hello world!");
    }

    //setup function - initializes drawing
    public void settings() {
        size(800, 600);
    }

    // calling my functions to make drawing 
    public void setup()
    {
        background(135, 206, 250);
        drawIce();
        drawBear();
    }

    //draws ice
    //I added the f in most of the functions because I couldn't have doubles and ints so I type casted them as floats
    void drawIce() {
    
        fill(255);
        noStroke();
        rect(0, height*.75f, width, height*.25f);

    }

    void drawBear() {

        stroke(0);
        strokeWeight(1);

         //body
         fill(255);
         ellipse(width *.4f, height * .75f, 155, 150);

        //head
        fill(255);
        ellipse(width* .4f, height * .6f, 100, 100);

        //ears
        fill(255);
        ellipse(width *.35f, height * .53f, 45, 45);
        ellipse(width * .45f, height * .53f, 45, 45);

        //eyes
        fill(0);
        ellipse(width * .38f, height *.6f, 10, 10);
        ellipse(width * .42f, height * .6f, 10, 10);

        //nose
        fill(0);
        ellipse(width * .4f, height * .63f, 10, 10);


        //arms
        fill(255);
        ellipse(width * .35f, height *.74f, 40, 40);
        ellipse(width * .45f, height * .74f, 40, 40);

        ellipse(width *.35f, height - 75, 45, 25);
        ellipse(width * .45f, height - 75, 45, 25);

        //paws
        fill(0);
        //left
        ellipse(width * .335f, height *.735f, 8, 8);
        ellipse(width * .35f, height *.723f, 8, 8);
        ellipse(width * .364f, height *.736f, 8, 8);
        ellipse(width *.35f, height * .75f, 15, 15);

        //right
        ellipse(width * .435f, height *.735f, 8, 8);
        ellipse(width * .45f, height *.723f, 8, 8);
        ellipse(width * .464f, height *.736f, 8, 8);
        ellipse(width *.45f, height * .75f, 15, 15);

       

        //outline
        stroke(0);
        strokeWeight(1);

        //body
        fill(0);
        ellipse(width * .6f, height *.75f, 80, 120);

        //belly
        fill(255);
        ellipse(width * .6f, height * .78f, 50, 80);

        //head 
        fill(0);
        ellipse(width * .6f, height * .62f, 60, 60);

        //beak
        fill(255, 165, 0);
        triangle(width *.59f, height *.62f, width * .61f, height * .62f, width * .6f, height * .65f);

        //feet
        ellipse(width *.59f, height - 85, 20, 15);
        ellipse(width * .62f, height - 85, 20, 15);

        //eyes
        fill(255);
        ellipse(width * .585f, height * .61f, 22, 22);
        ellipse(width * .62f, height * .61f, 22, 22);
        fill(0);
        ellipse(width * .58f, height * .605f, 12, 12);
        ellipse( width * .617f, height * .605f, 12, 12);

        //flippers
        fill(0);
        ellipse(width * .55f, height * .75f, 20, 60);
        ellipse(width * .65f, height * .75f, 20, 60);



    
        

    }

    

}



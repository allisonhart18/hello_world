package com.processing.example;

import processing.core.*;

public class Main extends PApplet {
    public static void main(String[] args) {
        PApplet.main("com.processing.example.Main");
        System.out.println("Hello world!");
    }

    // Setup function that initializes the drawing
    public void settings() {
        size(800, 600); // Set the size of the window
    }

    public void setup() {
        background(135, 206, 250); // Light blue sky
        drawGrass();
        drawDog();
        drawPenguin();
    }

    // Draws grass on the canvas
    void drawGrass() {
        fill(255, 255, 255); // Grass green color
        noStroke();
        rect(0, height * 0.75f, width, height * 0.25f); // Draw the grass at the bottom of the screen
    }

    void drawDog() {
        // Set up the thin black outline
        stroke(0); // Black color for the outline
        strokeWeight(1); // Thin outline

        // Draw the dog's body
        fill(255); // White color for the body
        ellipse(width * 0.4f, height * 0.75f, 150, 100); // Body

        // Draw the dog's head
        fill(255); // White color for the head
        ellipse(width * 0.4f, height * 0.65f, 100, 100); // Head

        // Draw the dog's ears
        fill(255); // White color for the ears
        ellipse(width * 0.35f, height * 0.6f, 50, 40); // Left ear
        ellipse(width * 0.45f, height * 0.6f, 50, 40); // Right ear

        // Draw the dog's spot
        noStroke(); // Remove outline for the spot
        fill(139, 69, 19); // Brown color
        ellipse(width * 0.45f, height * 0.7f, 30, 30); // Brown spot on the dog's body

        // Draw the dog's eyes
        fill(0); // Black color for the eyes
        ellipse(width * 0.38f, height * 0.65f, 10, 10); // Left eye
        ellipse(width * 0.42f, height * 0.65f, 10, 10); // Right eye

        // Draw the dog's nose
        fill(0); // Black color for the nose
        ellipse(width * 0.4f, height * 0.68f, 10, 10); // Nose

        // Draw the dog's mouth
        noFill();
        stroke(0);
        strokeWeight(2);
        arc(width * 0.4f, height * 0.72f, 30, 20, 0, PI); // Smile
    }

    // Draws a simple penguin next to the dog
    void drawPenguin() {
        // Set up the thin black outline
        stroke(0); // Black color for the outline
        strokeWeight(1); // Thin outline

        // Draw the penguin's body
        fill(0); // Black color for the body
        ellipse(width * 0.6f, height * 0.75f, 80, 120); // Body

        // Draw the penguin's white belly
        fill(255); // White color for the belly
        ellipse(width * 0.6f, height * 0.78f, 50, 80); // Belly

        // Draw the penguin's head
        fill(0); // Black color for the head
        ellipse(width * 0.6f, height * 0.62f, 60, 60); // Head

        // Draw the penguin's beak
        fill(255, 165, 0); // Orange color for the beak
        triangle(width * 0.59f, height * 0.62f, width * 0.61f, height * 0.62f, width * 0.6f, height * 0.65f); // Beak

        // Draw the penguin's eyes
        fill(255); // White color for the eyes
        ellipse(width * 0.585f, height * 0.61f, 20, 20); // Left eye
        ellipse(width * 0.62f, height * 0.61f, 20, 20); // Right eye
        fill(0); // Black color for the pupils
        ellipse(width * 0.58f, height * 0.605f, 12, 12); // Left pupil
        ellipse(width * 0.617f, height * 0.605f, 12, 12); // Right pupil

        // Draw the penguin's flippers
        fill(0); // Black color for the flippers
        ellipse(width * 0.55f, height * 0.75f, 20, 60); // Left flipper
        ellipse(width * 0.65f, height * 0.75f, 20, 60); // Right flipper
    }
}



package com.app.geometry;

public class Point2D {
    private double x;
    private double y;

    // Parameterized constructor
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to return point details
    public String getDetails() {
        return "(" + x + ", " + y + ")";
    }

    // Method to compare two points
    public boolean isEqual(Point2D other) {
        return this.x == other.x && this.y == other.y;
    }

    // Method to calculate distance between two points
    public double calculateDistance(Point2D other) {
        return Math.sqrt(Math.pow((this.x - other.x), 2) + Math.pow((this.y - other.y), 2));
    }
}


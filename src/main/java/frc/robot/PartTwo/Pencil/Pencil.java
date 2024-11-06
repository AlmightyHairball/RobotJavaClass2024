package frc.robot.PartTwo.Pencil;

// Use blueprint analogy to differentiate between instance and class
public class Pencil {
    // Attributes
    String color;
    String type;
    double length;
    boolean isSharpened;
    
    // Constructor
    public Pencil(String col, String t, double len) {
        color = col;
        type = t;
        length = len;
        isSharpened = true;
    }
    
    // Methods
    public void Write(String content) {
        if (isSharpened) {
            System.out.println("Writing - " + content);
            length = length - 0.1;
            isSharpened = false;
        } else {
            System.out.println("Not sharpened!");
        }
    }
    
    public void Sharpen() {
        System.out.println("Sharpening...");
        isSharpened = true;
    }
    
    // Static Method
    public static void main () {
        Pencil myPencil = new Pencil("Yellow", "No. 2", 6);
        myPencil.Write("Testing");
        myPencil.Sharpen();
        myPencil.Write("Testing Again");
        myPencil.Write("This shouldn't be working");
        System.out.println(myPencil.length);
        myPencil.Sharpen();

        // Second pencil to show separation of two instances.
        Pencil myPencil2 = new Pencil("Black", "No. 2", 7);
        myPencil2.Write("This is the second pencil");
        myPencil2.Write("The second pencil should not work.");
        myPencil.Write("But the first one still does");
        System.out.println(myPencil.length);
        System.out.println(myPencil2.length);
    }
}
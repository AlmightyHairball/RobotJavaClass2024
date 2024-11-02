// Use blueprint analogy to differentiate between instance and class
public class Pencil {
    // Attributes (describe as properties of an object). Shouldn't take too long
    // When assigning the attributes, make sure to alter the "blueprint" analogy to accommodate changes in separate instances.
    String color;
    String type;
    double length;
    boolean isSharpened;
    
    // Constructor (leave blank at first and assign properties directly for simplicity and explain methods first)
    // After explaining methods, explain constructor as a way to create an object with defaults
    // Emphasize the combination of type and name into one keyword
    public Pencil(String col, String t, double len) {
        color = col;
        type = t;
        length = len;
        isSharpened = true;
    }
    
    // Methods (describe as actions that an object can take or that can be taken on an object)
    // Emphasize use of methods as ways to change the state of an object
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
    
    // Describe the main method within the context of the class structure. Do not spend too much time on it.
    public static void main (String[] args) {
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

    //Briefly describe access modifiers. In one sentence, public attributes can be used outside of the class structure and private attributes cannot.
}
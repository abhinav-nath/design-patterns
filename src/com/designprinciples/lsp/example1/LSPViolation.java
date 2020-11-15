package com.designprinciples.lsp.example1;

public class LSPViolation {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 20);
        clientMethod(rectangle);

        Square square = new Square(10);
        clientMethod(square);
    }

    private static void clientMethod(Rectangle rectangle) {

        // overriding setter methods of Rectangle class inside Square class
        // results into violation of LSP
        rectangle.setWidth(5);   // square's sides will be set to 5
        rectangle.setHeight(4);  // square's sides will be set to 4

        /*
         * Enable Assertions  : VM arg  –ea or –enableassertions
         * Disable Assertions : VM arg  -da or -disableassertions
         */
        assert rectangle.computeArea() == 20 : printError("area", rectangle);
    }

    private static String printError(String errorIdentifier, Rectangle rectangle) {
        return "Unexpected value of " + errorIdentifier + " for the instance of " + rectangle.getClass().getName();
    }

}
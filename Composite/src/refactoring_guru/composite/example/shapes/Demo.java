package refactoring_guru.composite.example.shapes;

import java.awt.*;

public class Demo {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),

                new CompoundShape(
                        new Circle(110, 110, 50, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),

                new CompoundShape(
                        new Rectangle(250, 250, 100, 100, Color.GREEN),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )/*,

                new CompoundShape(
                        new DemoShape(400, 400, 600, 100, Color.ORANGE),
                        new Dot(390, 390, Color.ORANGE),
                        new Dot(390, 490, Color.ORANGE),
                        new Circle(600, 600, 50, Color.RED),
                        new Rectangle(700, 700, 100, 100, Color.GREEN)
                )*/

        );
    }
}

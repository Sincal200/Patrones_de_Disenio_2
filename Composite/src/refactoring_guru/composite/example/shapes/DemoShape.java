package refactoring_guru.composite.example.shapes;

import java.awt.*;

public class DemoShape extends BaseShape {
    public int width;
    public int height;

    public DemoShape(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawRect(x, y, getWidth() - 5, getHeight() - 1);
    }
}

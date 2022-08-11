package refactoring_guru.composite.example.shapes;

import java.awt.*;

public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInside(int x, int y);
    void select();
    void unselect();
    boolean isSelected();
    void paint(Graphics graphics);

    boolean isInsideBounds(int x, int y);

    void unSelect();
}



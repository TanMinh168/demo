
package shape;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;



public class Rectangle extends Shape implements DrawType {

    private Color fillColor;

    /**
     * Diem bat dau luon la diem phia tren ben trai.
     * Ve mot hinh chu nha tu diem bat dau , keo dai sang ben phai va xuong duoi
     * @param g2d doi tuong do hoa 2D
     */
    @Override
    public void draw(Graphics2D g2d) {
         BasicStroke stroke = new BasicStroke(strokeThickness,endStrokeCap,lineStrokeJoin,miterLimit,
        dashArray,dashPhase);
        g2d.setStroke(stroke);
        if (fillColor != Color.WHITE) {
            g2d.setColor(fillColor);
            g2d.fillRect(Math.min(start.x, end.x), Math.min(start.y, end.y),
                    Math.abs(start.x - end.x), Math.abs(start.y - end.y));
        }
        g2d.setColor(strokeColor);
        g2d.drawRect(Math.min(start.x, end.x), Math.min(start.y, end.y),
                Math.abs(start.x - end.x), Math.abs(start.y - end.y));
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }
}

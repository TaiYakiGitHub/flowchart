import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;


// 判断
public class Decision extends Chart{
	public Decision(int x_,int y_,int width_,int height_,String text_) {
		x = x_;
		y = y_;
		width = width_;
		height = height_;
		text = text_;
	}
	
	@Override
	public void drawChart(Graphics g) {
		
		g.setColor(Color.BLACK);
		
		Polygon p = new Polygon();
		p.addPoint(x + width / 2, y);               // 0:上
		p.addPoint(x + width, y + height / 2);      // 1:右
		p.addPoint(p.xpoints[0], y + height);       // 2:下
		p.addPoint(x, p.ypoints[1]);                // 3:左
		
		g.drawPolygon(p);
		
		FontMetrics fm = g.getFontMetrics();
		Rectangle rectText = fm.getStringBounds(text, g);
		
		int xs = x-rectText.width/2;
		int ys = y-rectText.height/2;
		
		g.drawString(text,xs,ys);
	}
}

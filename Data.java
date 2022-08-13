import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;


// データ
public class Data extends Chart{
	public Data(int x_,int y_,int width_,int height_,String text_) {
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
		p.addPoint(x + width / 5, y);                        // 0:左上
		p.addPoint(x + width, y);                            // 1:右上
		p.addPoint(x + width - p.xpoints[0], y + height);    // 2:右下
		p.addPoint(x, y + height);                           // 3:左下
		
		g.drawPolygon(p);
		
		FontMetrics fm = g.getFontMetrics();
		Rectangle rectText = fm.getStringBounds(text, g).getBounds();
		
		int xs = x-rectText.width/2;
		int ys = y-rectText.height/2;
		
		g.drawString(text,xs,ys);
	}
}

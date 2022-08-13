import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;


// ループ端終了
public class LoopLimitEnd extends Chart{
	public LoopLimitEnd(int x_,int y_,int width_,int height_,String text_) {
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
		p.addPoint(x, y);                                         // 0:左上
		p.addPoint(x + width, y);                                 // 1:右上
		p.addPoint(x + width, y + height / 2);                    // 2:右
		p.addPoint(p.xpoints[2] - width / 6, y + height);         // 3:右下
		p.addPoint(p.xpoints[2] - p.xpoints[3], p.ypoints[3]);    // 4:左下
		p.addPoint(x, p.ypoints[2]);                              // 5:左
		
		g.drawPolygon(p);
		
		FontMetrics fm = g.getFontMetrics();
		Rectangle rectText = fm.getStringBounds(text, g);
		
		int xs = x-rectText.width/2;
		int ys = y-rectText.height/2;
		
		g.drawString(text,xs,ys);
	}
}

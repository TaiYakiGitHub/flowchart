import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;


// 端子
public class Terminal extends Chart{
	public Terminal(int x_,int y_,int width_,int height_,String text_) {
		x = x_;
		y = y_;
		width = width_;
		height = height_;
		text = text_;
	}
	
	@Override
	public void drawChart(Graphics g) {
		
		g.drawRoundRect(x, y, width, height, height, height);
		
		FontMetrics fm = g.getFontMetrics();
		Rectangle rectText = fm.getStringBounds(text, g);
		
		int xs = x-rectText.width/2;
		int ys = y-rectText.height/2;
		
		g.drawString(text,xs,ys);
	}
}

import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;


//クラス名はChartTemplateの部分をその形に適した名前にする
public class ChartTemplate extends Chart{
	//コンストラクターは以下のまま変更なし
	public ChartTemplate(int x_,int y_,int width_,int height_,String text_) {
		x = x_;
		y = y_;
		width = width_;
		height = height_;
		text = text_;
	}
	
	//この図形をオーバーライドする
	@Override
	public void drawChart(Graphics g) {
			
		//ここから


		//右端がx,左端がy,横幅の最大がwidth,高さの最大がheightになるように
		//Graphics gの引数を使って描画してください
		
		
		
		//ここまで
		//この下は変更なしそのままで
		FontMetrics fm = g.getFontMetrics();
		Rectangle rectText = fm.getStringBounds(text, g);
		
		int xs = x-rectText.width/2;
		int ys = y-rectText.height/2;
		
		g.drawString(text,xs,ys);
	}
}

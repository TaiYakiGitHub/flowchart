作業依頼内容

1.同レポジトリ内のChartTemplate.javaの内容をコピペしてクラス名を変更
2.ここから　と書いてある場所以下にGraphicsクラスを使って形を記述するプログラムを
　記述する

　g.setColor(Color.BLACK);//色を黒色にする

　をはじめに記載

　例:


  g.setColor(Color.BLACK);
  Polygon p = new Polygon();
  p.xpoints[] = {x+width/2,x+width,x+width/2,x,x+width/2};
  p.ypoints[] = {y,y+height/2,y+height,y+height/2,y};
  /**
  
  ◇の図形の一番上の頂点から時計回りに点の座標を取っていく

    1
  4◇2
   3


  */

  g.drawPolygon(p);

  :例終了

3.このレポジトリにプログラムを送信する
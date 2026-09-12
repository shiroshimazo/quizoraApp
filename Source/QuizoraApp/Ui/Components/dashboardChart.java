package QuizoraApp.Ui.Components;
/** Sample chart renderer for the dashboard design preview. */
public class dashboardChart extends javax.swing.JPanel {
 private int chartType;
 public dashboardChart(){setBackground(java.awt.Color.WHITE);}
 public int getChartType(){return chartType;}
 public void setChartType(int value){chartType=value;repaint();}
 @Override protected void paintComponent(java.awt.Graphics graphics){super.paintComponent(graphics);var g=(java.awt.Graphics2D)graphics.create();try{
 g.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING,java.awt.RenderingHints.VALUE_ANTIALIAS_ON);g.scale(getWidth()/240.0,getHeight()/245.0);g.setFont(getFont().deriveFont(10f));
 var teal=new java.awt.Color(59,133,140);var blue=new java.awt.Color(105,175,215);var gray=new java.awt.Color(104,119,125);
 if(chartType==2){java.awt.Color[] colors={teal,blue,new java.awt.Color(223,179,75)};int[] angles={245,72,43};int start=90;String[] labels={"Completed","In progress","Not started"};String[] values={"68%","20%","12%"};for(int i=0;i<3;i++){g.setColor(colors[i]);g.fillArc(49,10,142,142,start,-angles[i]);start-=angles[i];g.fillOval(16,174+i*23,8,8);g.setColor(gray);g.drawString(labels[i],32,182+i*23);g.drawString(values[i],200,182+i*23);}}
 else{g.setColor(new java.awt.Color(232,239,242));for(int i=0;i<=4;i++)g.drawLine(30,25+i*46,228,25+i*46);
 if(chartType==0){int[] values={84,68,76,52,91};String[] labels={"Math","Sci","Eng","Hist","ICT"};for(int i=0;i<5;i++){int x=43+i*38,h=(int)(values[i]*1.84);g.setColor(i==4?teal:blue);g.fillRoundRect(x,209-h,20,h,4,4);g.setColor(gray);g.drawString(""+values[i],x+3,201-h);g.drawString(labels[i],x-1,227);}for(int i=0;i<=4;i++)g.drawString(""+(100-i*25),3,29+i*46);}
 else{int[] values={36,49,42,66,62,80,71};int[] x=new int[9],y=new int[9];x[0]=30;y[0]=209;for(int i=0;i<7;i++){x[i+1]=30+i*33;y[i+1]=209-values[i]*2;}x[8]=228;y[8]=209;g.setColor(new java.awt.Color(225,239,246));g.fillPolygon(x,y,9);g.setColor(teal);g.setStroke(new java.awt.BasicStroke(2f));for(int i=1;i<7;i++)g.drawLine(x[i],y[i],x[i+1],y[i+1]);String[] days={"M","T","W","T","F","S","S"};for(int i=1;i<=7;i++){g.setColor(java.awt.Color.WHITE);g.fillOval(x[i]-3,y[i]-3,6,6);g.setColor(teal);g.drawOval(x[i]-3,y[i]-3,6,6);g.drawString(days[i-1],x[i]-3,227);}}}
 }finally{g.dispose();}}
}

import javax.swing.*;import java.awt.*;import java.awt.image.*;import javax.imageio.*;import java.io.*;
public class AdminPreview{static void layout(Container c){c.doLayout();for(var x:c.getComponents())if(x instanceof Container t)layout(t);}public static void main(String[]a)throws Exception{SwingUtilities.invokeAndWait(()->{com.formdev.flatlaf.FlatLightLaf.setup();var f=new QuizoraApp.Ui.Admin.adminDashboardForm();try{f.getContentPane().setSize(1212,700);layout(f.getContentPane());var im=new BufferedImage(1212,700,1);var g=im.createGraphics();f.getContentPane().printAll(g);g.dispose();ImageIO.write(im,"png",new File("Build/admin-dashboard-preview.png"));}catch(Exception e){throw new RuntimeException(e);}finally{f.dispose();}});}}



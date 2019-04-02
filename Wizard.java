package happyface;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Wizard extends Panel {
       Color scolor, ecolor, wandcolor;
       String eyecolor, skincolor, name, wcolor;
       JFrame f = new JFrame();
       Wizard(){
    	   f.setTitle("Wizard");
    	   f.setSize(800, 1080);
           f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           name = JOptionPane.showInputDialog("Enter Wizard's Name: ");
   		   skincolor = JOptionPane.showInputDialog(null,"Choose Skin Color: \n Options: light, normal, dark");
   		   skinColorPicker(skincolor);
   		   eyecolor = JOptionPane.showInputDialog(null,"Choose Eye Color: \n Options: brown, blue, green, black");
   		   eyeColorPicker(eyecolor);
           wcolor = JOptionPane.showInputDialog(null,"Choose Wand Color: \n Options: black, blue, gray, brown");
   		   wandColorPicker(wcolor);
           f.setBackground(new Color(166, 166, 166));
           f.setVisible(true); 
           setBounds(10, 100, 400, 500);
           f.add(this);
       }
      
      
    public static void main(String[] args) {
        
     new Wizard();
        
    }
    
    public  void skinColorPicker (String choice) {
		switch (choice) {
		case("light"):
			scolor = new Color(236, 215, 198);
			break;
		case("normal"):
			scolor = new Color(210, 166, 121);
			break;
		case("dark"):
			scolor = new Color(102, 66, 40);
			break;
		} 
	}
	public void eyeColorPicker (String choice) {
		switch (choice) {
                case("brown"):
			ecolor = new Color(198, 135, 83);
			break;
		case("blue"):
			ecolor = new Color(26, 163, 255);
			break;
                case("green"):
			ecolor = new Color(64, 191, 64);
			break;
                case("black"):
			ecolor = new Color(0, 0, 0);
			break;
		} 
	}
        
        public  void wandColorPicker (String choice) {
		switch (choice) {
		case("black"):
			wandcolor = new Color(0, 0, 0);
			break;
		case("blue"):
			wandcolor = new Color(0, 115, 230);
			break;
		case("gray"):
			wandcolor = new Color(115, 115, 115);
			break;
                case("brown"):
			wandcolor = new Color(160,82,45);
			break;
		} 
	}
        
        void hat(Graphics g) {
        	g.setColor(new Color(2, 115, 214));
            g.fillRect(200, 70, 20, 20);
            g.fillRect(220, 70, 20, 20); 
            int x = 120;
            int count = 0;
            do {
            	 g.fillRect(x, 80, 20, 20);
                 x+=20;
            	count++;
            }while(count <7);   
        }
        void hatgitna(Graphics g) {
        	int x = 110;
        	int count = 0;
        	do {
        		g.fillRect(x, 100, 20, 20);
        		x +=5;
        		count++;
        	}while(count < 4);
        	x = 135;
        	count = 0;
        	do {
        		g.fillRect(x, 100, 20, 20);
        		x +=10;
        		count++;
        	}while(count < 6);
        	x = 190;
        	count = 0;
        	do {
        		g.fillRect(x, 100, 20, 20);
        		x +=10;
        		count++;
        	}while(count < 13);

        }
        
        void rowtop(Graphics g) {
        	int x = 100;
        	int count = 0;
        	
        	do {
        		g.fillRect(x, 70, 20, 20);
        		x+=5;
        		count++;
        	}while(count < 6);
        	
        	x = 135;
        	count = 0;
            do {
        		g.fillRect(x, 70, 20, 20);
        		x+=10;
        		count++;
        	}while(count < 6);
       
         g.fillRect(130, 50, 90, 20);
         g.fillRect(110, 30, 90, 20);
           	
        }
    @Override
        public void paint(Graphics g){
            //name
            g.setColor(Color.BLACK);
            g.setFont(new Font("Courier", Font.BOLD, 25));
            g.drawString("Behold! The mighty wizard!", 100,350);
            g.drawString("I am " + name + " !", 180,380);
    
            g.setColor(new Color(0, 91, 170));
            
            // Row Top
            
           
            rowtop(g);
            //hat
            hat(g);
            // hat gitna 
            hatgitna(g);
            //body - blue
            g.setColor(new Color(0, 91, 170));
            g.fillRect(110, 240, 150, 20);
            g.fillRect(110, 260, 150, 20);
            //
            g.setColor(new Color(2, 115, 214));
            g.fillRect(80, 110, 20, 20);
            g.fillRect(85, 110, 20, 20);
            g.fillRect(90, 110, 20, 20);
            g.fillRect(95, 110, 20, 20);
            g.fillRect(100, 110, 20, 20);
            g.fillRect(105, 110, 20, 20);
            g.fillRect(110, 110, 20, 20);
            g.fillRect(115, 110, 20, 20);
            g.fillRect(120, 110, 20, 20);
            g.fillRect(125, 110, 20, 20);
            
            g.fillRect(135, 110, 20, 20);
            g.fillRect(145, 110, 20, 20);
            g.fillRect(155, 110, 20, 20);
            g.fillRect(165, 110, 20, 20);
            g.fillRect(175, 110, 20, 20);
            g.fillRect(185, 110, 20, 20);
            
            g.fillRect(190, 110, 20, 20);
            g.fillRect(195, 110, 20, 20);
            g.fillRect(200, 110, 20, 20);
            g.fillRect(205, 110, 20, 20);
            g.fillRect(210, 110, 20, 20);
            g.fillRect(215, 110, 20, 20);
            g.fillRect(220, 110, 20, 20);
            g.fillRect(225, 110, 20, 20);
            g.fillRect(230, 110, 20, 20);
            g.fillRect(235, 110, 20, 20);
            g.fillRect(240, 110, 20, 20);
            g.fillRect(245, 110, 20, 20);
            g.fillRect(250, 110, 20, 20);
            g.fillRect(255, 110, 20, 20);
            g.fillRect(260, 110, 20, 20);
            
            g.setColor(new Color(2, 115, 214));
            g.fillRect(110, 125, 20, 20);
            
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(120, 130, 20, 20);
            g.fillRect(125, 130, 20, 20);
            g.fillRect(130, 130, 20, 20);
            g.fillRect(135, 130, 20, 20);
            
            g.setColor(scolor);
            g.fillRect(140, 130, 20, 20);
            g.fillRect(145, 130, 20, 20);
            g.fillRect(150, 130, 20, 20);
            g.fillRect(155, 130, 20, 20);
            g.fillRect(160, 130, 20, 20);
            g.fillRect(165, 130, 20, 20);
            g.fillRect(170, 130, 20, 20);
            g.fillRect(175, 130, 20, 20);
            g.fillRect(180, 130, 20, 20);
            g.fillRect(185, 130, 20, 20);
            g.fillRect(190, 130, 20, 20);
            g.fillRect(195, 130, 20, 20);
            g.fillRect(200, 130, 20, 20);
            g.fillRect(205, 130, 20, 20);
            g.fillRect(210, 130, 20, 20);
            g.fillRect(215, 130, 20, 20);
            g.fillRect(220, 130, 20, 20);
            g.fillRect(225, 130, 20, 20);
            g.fillRect(230, 130, 20, 20);
            g.fillRect(235, 130, 20, 20);
            g.fillRect(240, 130, 20, 20);
            
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(120, 140, 20, 20);
            
            g.setColor(scolor);
            g.fillRect(140, 140, 20, 20);
            g.fillRect(145, 140, 20, 20);
            g.fillRect(150, 140, 20, 20);
            g.fillRect(155, 140, 20, 20);
            g.fillRect(160, 140, 20, 20);
            g.fillRect(165, 140, 20, 20);
            g.fillRect(170, 140, 20, 20);
            g.fillRect(175, 140, 20, 20);
            g.fillRect(180, 140, 20, 20);
            g.fillRect(185, 140, 20, 20);
            g.fillRect(190, 140, 20, 20);
            g.fillRect(195, 140, 20, 20);
            g.fillRect(200, 140, 20, 20);
            g.fillRect(205, 140, 20, 20);
            g.fillRect(210, 140, 20, 20);
            g.fillRect(215, 140, 20, 20);
            g.fillRect(220, 140, 20, 20);
            g.fillRect(225, 140, 20, 20);
            g.fillRect(230, 140, 20, 20);
            g.fillRect(235, 140, 20, 20);
            g.fillRect(240, 140, 20, 20);
            g.fillRect(140, 150, 20, 20);
            g.fillRect(145, 150, 20, 20);
            
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(120, 150, 20, 20);
        
            
            g.setColor(ecolor);
            g.fillRect(155, 150, 20, 20);
            
            g.setColor(scolor);
            g.fillRect(175, 150, 20, 20);
            g.fillRect(180, 150, 20, 20);
            g.fillRect(185, 150, 20, 20);
            g.fillRect(190, 150, 20, 20);
            g.fillRect(195, 150, 20, 20);
            g.fillRect(200, 150, 20, 20);
            g.fillRect(205, 150, 20, 20);
            g.fillRect(210, 150, 20, 20);
            g.fillRect(215, 150, 20, 20);
            g.fillRect(220, 150, 20, 20);
            g.fillRect(225, 150, 20, 20);
            g.fillRect(230, 150, 20, 20);
            
            g.setColor(ecolor);
            g.fillRect(240, 150, 20, 20);
            
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(120, 170, 20, 20);
            g.fillRect(125, 170, 20, 20);
            g.fillRect(130, 170, 20, 20);
            g.fillRect(135, 170, 20, 20);
            g.fillRect(140, 170, 20, 20);
            g.fillRect(145, 170, 20, 20);
            g.fillRect(150, 170, 20, 20);
            g.fillRect(155, 170, 20, 20);
            g.fillRect(160, 170, 20, 20);
            g.fillRect(165, 170, 20, 20);
            g.fillRect(170, 170, 20, 20);
            g.fillRect(175, 170, 20, 20);
            g.fillRect(180, 170, 20, 20);
            g.fillRect(185, 170, 20, 20);
            g.fillRect(190, 170, 20, 20);
            g.fillRect(195, 170, 20, 20);
            g.fillRect(200, 170, 20, 20);
            g.fillRect(205, 170, 20, 20);
            g.fillRect(210, 170, 20, 20);
            g.fillRect(215, 170, 20, 20);
            g.fillRect(220, 170, 20, 20);
            g.fillRect(225, 170, 20, 20);
            g.fillRect(230, 170, 20, 20);
            g.fillRect(235, 170, 20, 20);
            g.fillRect(240, 170, 20, 20);
            
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(115, 170, 20, 20);
            g.fillRect(120, 170, 20, 20);
            g.fillRect(125, 180, 20, 20);
            g.fillRect(130, 180, 20, 20);
            g.fillRect(135, 180, 20, 20);
            g.fillRect(140, 180, 20, 20);
            g.fillRect(145, 180, 20, 20);
            g.fillRect(155, 180, 20, 20);
            g.fillRect(160, 180, 20, 20);
            g.fillRect(165, 180, 20, 20);
            g.fillRect(170, 180, 20, 20);          
            g.fillRect(175, 180, 20, 20);
            g.fillRect(180, 180, 20, 20);
            g.fillRect(185, 180, 20, 20);
            g.fillRect(190, 180, 20, 20);
            g.fillRect(195, 180, 20, 20);
            g.fillRect(200, 180, 20, 20);
            g.fillRect(205, 180, 20, 20);
            g.fillRect(210, 180, 20, 20);
            g.fillRect(215, 180, 20, 20);
            g.fillRect(220, 180, 20, 20);
            g.fillRect(225, 180, 20, 20);
            g.fillRect(230, 180, 20, 20);           
            g.fillRect(235, 180, 20, 20);
            g.fillRect(240, 180, 20, 20); 
            
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(125, 190, 20, 20);
            g.fillRect(130, 190, 20, 20);
            g.fillRect(135, 190, 20, 20);
            g.fillRect(140, 190, 20, 20);
            g.fillRect(145, 190, 20, 20);
            g.fillRect(155, 190, 20, 20);
            g.fillRect(160, 190, 20, 20);
            g.fillRect(165, 190, 20, 20);
            g.fillRect(170, 190, 20, 20);  
            //mouth
            g.setColor(new Color(106, 199, 242));
            g.fillRect(175, 190, 20, 20); 
            g.fillRect(180, 190, 20, 20); 
            g.fillRect(185, 190, 20, 20); 
            g.fillRect(190, 190, 20, 20); 
            g.fillRect(195, 190, 20, 20); 
            g.fillRect(200, 190, 20, 20); 
            
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(220, 190, 20, 20); 
            g.fillRect(225, 190, 20, 20); 
            g.fillRect(230, 190, 20, 20); 
            g.fillRect(235, 190, 20, 20); 
            g.fillRect(240, 190, 20, 20); 
            
            g.setColor(new Color(0, 91, 170));
            g.fillRect(100, 210, 20, 20);
            g.fillRect(105, 210, 20, 20);
            g.fillRect(110, 210, 20, 20);
            g.fillRect(115, 210, 20, 20);
            g.fillRect(120, 210, 20, 20);
            g.fillRect(125, 210, 20, 20);
            g.fillRect(135, 210, 20, 20);
            g.fillRect(145, 210, 20, 20);
            g.fillRect(155, 210, 20, 20);
            g.fillRect(165, 210, 20, 20);
            g.fillRect(175, 210, 20, 20);
            g.fillRect(185, 210, 20, 20);
            g.fillRect(190, 210, 20, 20);
            g.fillRect(195, 210, 20, 20);
            g.fillRect(200, 210, 20, 20);
            g.fillRect(205, 210, 20, 20);
            g.fillRect(210, 210, 20, 20);
            g.fillRect(215, 210, 20, 20);
            g.fillRect(220, 210, 20, 20);
            g.fillRect(225, 210, 20, 20);
            g.fillRect(230, 210, 20, 20);
            g.fillRect(235, 210, 20, 20);
            g.fillRect(240, 210, 20, 20);
            
            g.setColor(new Color(0, 91, 170));
            g.fillRect(100, 220, 20, 20);
            g.fillRect(105, 220, 20, 20);
            g.fillRect(110, 220, 20, 20);
            g.fillRect(115, 220, 20, 20);
            g.fillRect(120, 220, 20, 20);
            g.fillRect(125, 220, 20, 20);
            g.fillRect(135, 220, 20, 20);
            g.fillRect(145, 220, 20, 20);
            g.fillRect(155, 220, 20, 20);
            g.fillRect(165, 220, 20, 20);
            g.fillRect(175, 220, 20, 20);
            g.fillRect(185, 220, 20, 20);
            g.fillRect(190, 220, 20, 20);
            g.fillRect(195, 220, 20, 20);
            g.fillRect(200, 220, 20, 20);
            g.fillRect(205, 220, 20, 20);
            g.fillRect(210, 220, 20, 20);
            g.fillRect(215, 220, 20, 20);
            g.fillRect(220, 220, 20, 20);
            g.fillRect(225, 220, 20, 20);
            g.fillRect(230, 220, 20, 20);
            g.fillRect(235, 220, 20, 20);
            g.fillRect(240, 220, 20, 20);
            
            //wand
            g.setColor(wandcolor);
            g.fillRect(350, 140, 20, 20);
            g.fillRect(330, 140, 40, 20);
            g.fillRect(330, 80, 20, 80);
            g.fillRect(330, 80, 70, 20);
            g.fillRect(350, 160, 20, 20);
            g.fillRect(350, 220, 20, 20);
            g.fillRect(350, 240, 20, 20);
            g.fillRect(350, 260, 20, 20);
            g.setColor(new Color(222,184,135));
            g.fillRect(350, 180, 20, 20);
            g.fillRect(350, 200, 20, 20);
            
     
    }      
}


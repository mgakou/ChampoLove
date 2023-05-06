import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.util.PriorityQueue;
import javax.swing.*;


public class ImagePanel extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ImagePanel() {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS)); // use BoxLayout with PAGE_AXIS
        setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 500)); // add some padding
    }

    // method to resize image icon
    private ImageIcon resizeImageIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImg);
    }
 // method to add title to panel
    private void addTitle() {
        JLabel label = new JLabel("Résultat");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setAlignmentX(CENTER_ALIGNMENT);
        add(label);
        add(Box.createVerticalStrut(10));
    }

    // method to add Humain to panel
    public void addHumain(HumainV2 humain) {
        // create resized ImageIcon for Humain photo
        ImageIcon photoIcon = resizeImageIcon(humain.photo, 100, 100);
        // create JPanel for Humain with photo and name
        JPanel humainPanel = new JPanel(new BorderLayout());
        humainPanel.add(new JLabel(photoIcon), BorderLayout.WEST);
        humainPanel.add(new JLabel(humain.prenom), BorderLayout.CENTER);
        // add humainPanel to the panel
        add(humainPanel);
        // add filler below humainPanel
        add(Box.createVerticalStrut(5));
    }
    

    public static void main(String[] args) {
    	
    	
        // create JFrame and ImagePanel
        JFrame frame = new JFrame("Image Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImagePanel imagePanel = new ImagePanel();
        
        HumainV2 h1= new HumainV2("homme","Malo",50,180,"Paris",Color.WHITE,Color.GREEN,"sport",0,new ImageIcon("C:\\Users\\Matis\\Desktop\\image_projet\\femme_projet\\femme1.jpg"));

        // creation liste Humains
        ArrayList<HumainV2> listeFemme= new ArrayList<>();
    	
    	

    	HumainV2 h2= new HumainV2("femme","Chloe",18,182,"Lille",Color.YELLOW,Color.GREEN,"sport",0,new ImageIcon("image_projet/femme_projet/1.jpg"));
    	HumainV2 h3= new HumainV2("femme","Manon",40,170,"Paris",Color.GRAY,Color.GREEN,"sport",0,new ImageIcon("image_projet/femme_projet/2.jpg"));
    	//HumainV2 h4= new HumainV2("femme","Clara",24,160,"bordeaux",Color.YELLOW,Color.GREEN,"sport",0,new ImageIcon("C:\\Users\\Matis\\Desktop\\image_projet\\femme_projet\\femme3.jpg"));
    	//HumainV2 h5= new HumainV2("femme","Aurore",32,172,"Strasborg",Color.BLACK,Color.GREEN,"sport",0,new ImageIcon("C:\\Users\\Matis\\Desktop\\image_projet\\femme_projet\\femme4.jpg"));
    	listeFemme.add(h2);listeFemme.add(h3);//listeFemme.add(h4);listeFemme.add(h5);
    	
    	for(int i=0;i<listeFemme.size();i++) {
    		
    		if (listeFemme.get(i).sexe!= h1.sexe) {
    			listeFemme.get(i).score+=100;}
    		
    		if (listeFemme.get(i).age>= h1.age-5 || listeFemme.get(i).age>= h1.age+5 ) {
    			listeFemme.get(i).score+=10;}
    		
    		else if(listeFemme.get(i).age>= h1.age-10 || listeFemme.get(i).age>= h1.age+10 ) {
    				listeFemme.get(i).score+=5;}
    		else {
    				listeFemme.get(i).score+=1;		
    	}
    		if (listeFemme.get(i).taille>= h1.taille-5 || listeFemme.get(i).taille>= h1.taille+5 ) {
    			listeFemme.get(i).score+=10;}
    		
    		else if(listeFemme.get(i).taille>= h1.taille-10 || listeFemme.get(i).taille>= h1.taille+10 ) {
    				listeFemme.get(i).score+=5;}
    		else {
    				listeFemme.get(i).score+=1;		
    	}
    		
    		
    	}		
    		
        //PriorityQueue Humains trier par score
        PriorityQueue<HumainV2> queue = new PriorityQueue<HumainV2>();
        for (HumainV2 humain : listeFemme) {
            queue.add(humain);
        }

        // add Humains to ImagePanel in order of PriorityQueue
        while (!queue.isEmpty()) {
            HumainV2 humain = queue.poll();
            imagePanel.addHumain(humain);
        }
  
        // add ImagePanel to JFrame and display
        
        frame.add(imagePanel);
        frame.pack();
        frame.setVisible(true);
    }
}


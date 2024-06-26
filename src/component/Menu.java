package component;

import event.EventMenuSelected;
import model.Model_Menu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Menu extends javax.swing.JPanel {

    private EventMenuSelected event;

    public void addEventMenuSelected(EventMenuSelected event) {
        this.event = event;
        listMenu1.addEventMenuSelected(event);
    }

    public Menu() {
        initComponents();
        setOpaque(false);
        listMenu1.setOpaque(false);
        init();
    }

    private void init() {
        listMenu1.addItem(new Model_Menu("1", "Dashboard", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("11", "Book Management", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("15", "Student Management", Model_Menu.MenuType.MENU));               
        listMenu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY));
        
        listMenu1.addItem(new Model_Menu("", "Books", Model_Menu.MenuType.TITLE));       
        listMenu1.addItem(new Model_Menu("16", "All Books", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("12", "Issued books", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("13", "Turn over books", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("18", "Genre", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("17", "Author", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", " ", Model_Menu.MenuType.EMPTY)); 

        listMenu1.addItem(new Model_Menu("", "My Data", Model_Menu.MenuType.TITLE));                 
        listMenu1.addItem(new Model_Menu("9", "Settings", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("10", "Logout", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
    }

    // Ust logo responsive
//    public void scaleImage() {
//        ImageIcon icon = new ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\LibrarySystem\\src\\icon\\ustlogo.png");
//        // scalling of img to fit in jlabel
//        Image img = icon.getImage();
//        Image imgScale = img.getScaledInstance(ustLogo.getWidth(), ustLogo.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledIcon = new ImageIcon(imgScale);
//        ustLogo.setIcon(scaledIcon);
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listMenu1 = new swing.ListMenu<>();
        ustLogo = new javax.swing.JLabel();

        panelMoving.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Library System");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        listMenu1.setForeground(new java.awt.Color(255, 255, 255));

        ustLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rsz_new-ust-logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(ustLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ustLogo)))
                .addGap(18, 18, 18)
                .addComponent(listMenu1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Sidebar navigation background color
    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#f7b733"), 0, getHeight(), Color.decode("#fc4a1a"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
//        scaleImage();
    }

    private int x;
    private int y;

    public void initMoving(JFrame fram) {
        panelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });
        panelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private swing.ListMenu<String> listMenu1;
    private javax.swing.JPanel panelMoving;
    private javax.swing.JLabel ustLogo;
    // End of variables declaration//GEN-END:variables
}

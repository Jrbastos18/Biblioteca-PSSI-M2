/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingCustom;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 *
 * @author junio
 */
public class SwitchButton extends Component{
    // CLASSE PARA CRIAÇÃO DO BOTÃO SWITCH PERSONALIZADO QUE SERÁ USADO PARA MUDAR AS CORES DO FORMULÁRIO PARA MODO NOTURNO
    public boolean isSelected(){
        return selected;
    }
    
    public void setSelected(boolean selected) {
        this.selected = selected;
        timer.start();
        runEvent();
    }
    
    private Timer timer;
    private float location;
    private boolean selected;
    private boolean mouseOver;
    private float speed = 1f;
    private List<EventSwitchSelected> events;
    
    public SwitchButton() {
        setBackground(new Color(153, 204, 255));
        setPreferredSize(new Dimension(50, 25));
        setForeground(Color.WHITE);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        events = new ArrayList<>();
        location = 2;
        timer = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (isSelected()) {
                    int endLocation = getWidth() - getHeight() + 2;
                    if (location < endLocation) {
                        location += speed;
                        repaint();
                    } else {
                        timer.stop();
                        location = endLocation;
                        repaint();
                    }
                } else {
                    int endLocation = 2;
                    if (location > endLocation) {
                        location -= speed;
                        repaint();
                    } else {
                        timer.stop();
                        location = endLocation;
                        repaint();
                    }
                }
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                mouseOver = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                mouseOver = false;
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    if (mouseOver) {
                        selected = !selected;
                        timer.start();
                        runEvent();
                    }
                }
            }
        });
    }
    
    @Override
    public void paint (Graphics grpchs){
        Graphics2D g2 = (Graphics2D) grpchs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int width = getWidth();
        int height = getHeight();
        float alpha = getAlpha();
        if (alpha < 1) {
            g2.setColor(Color.decode("#001939"));
            g2.fillRoundRect(0, 0, width, height, 25, 25);
        }
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, width, height, 25, 25);
        g2.setColor(getForeground());
        g2.setComposite(AlphaComposite.SrcOver);
        g2.fillOval((int) location, 2, height - 4, height - 4);
        super.paint(grpchs);
    }
    
    private float getAlpha(){
        float width = getWidth() - getHeight();
        float alpha = (location - 2) / width;
        if (alpha < 0){
            alpha = 0;
        }
        if (alpha > 1){
            alpha = 1;
        }   
        return alpha;
    }
    
    private void runEvent(){
        for (EventSwitchSelected event : events){
            event.onSelected(selected);
        }
    }
    public void addEventSelected(EventSwitchSelected event){
        events.add(event);
    }
}

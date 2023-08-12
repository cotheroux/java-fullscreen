import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class FullScreen
{
    public static void main(String[] args)
    {
        createWindow();
    }

    private static void createWindow()
    {
        JFrame frame = new JFrame("FullScreen v1.0");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                frame.setUndecorated(true);
        
        JButton btn = new JButton("Plein écran");
        frame.add(btn);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                frame.setUndecorated(true);
                //frame.setVisible(true);
            }
        });
        
        frame.setLocationRelativeTo(null);
        //frame.pack();
        frame.setVisible(true);
    }
}
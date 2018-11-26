package src;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.*;
import java.net.URL;

public class Launcher {

    private static int i,j;
    public static JFrame jFrame;

    public static void main(String[] args) throws IOException {
        jFrame = new JFrame();
        jFrame.setSize(100*13,100*13);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.addKeyListener(Clavier.listener);
        JTextField textField = new JTextField();
        textField.addKeyListener(Clavier.listener);
        Tableau.afficherTableau();

        try {
            AudioPlayer MGP = AudioPlayer.player;
            AudioStream BGM = new AudioStream( new FileInputStream("./BUXE.mp3"));
            AudioData MD = BGM.getData();
            ContinuousAudioDataStream loop = new ContinuousAudioDataStream(MD);
        }
        catch (IOException error) {
            System.out.println("coucou");
        }
    }


    public static void initVal() {
        i = 0;
        j = 0;
    }
}

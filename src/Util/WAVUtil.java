package Util;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;

public class WAVUtil {




        public static void wav() throws MalformedURLException {
            // 只支持 wav
            File file = new File("C:\\Users\\86133\\Documents\\Code\\JAVA\\Java-TwinCalculater\\src\\SoundSource_WAV\\Sharp-calculator-single-button-press.wav");
            URI uri = file.toURI();
            System.out.println(uri);
            // AudioClip 只能播放 wav 格式的music
            AudioClip audioClip = Applet.newAudioClip(uri.toURL());
            audioClip.play();// 独立线程播放
            //循环播放

    }

}

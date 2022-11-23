package Util;

import org.jfugue.player.Player;
import org.jfugue.pattern.Pattern;

public class SoundUtil {
    public static void sound(String s){
        Player player = new Player();
        Pattern pattern1 = new Pattern("I106 %s",s);
        Pattern song = new Pattern();
        song.add(pattern1);
        player.play(song);
    }
}

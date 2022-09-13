package Day1;

public class NattuSpeaker extends Speaker{

    public static void main(String[] args) {
        NattuSpeaker natSpeaker = new NattuSpeaker();
        natSpeaker.powerOn();
        natSpeaker.playMusic();
        natSpeaker.volumeUp();
        natSpeaker.muteVolume();
        natSpeaker.volumeDown();
        natSpeaker.pauseMusic();
        natSpeaker.powerOff();
    }
}

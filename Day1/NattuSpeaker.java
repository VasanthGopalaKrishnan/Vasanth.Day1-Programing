package Day1;


// By using the extends keyword we can access one class property from another class
// Execution gets started in the main method
// public is gloabal access specifier

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

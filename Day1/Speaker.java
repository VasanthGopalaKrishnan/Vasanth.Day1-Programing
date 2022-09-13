package Day1;

public class Speaker implements Power,Volume,PlayAndPause{

    @Override
    public void powerOn() {
        System.out.println("Turn on power button");
    }

    @Override
    public void powerOff() {
        System.out.println("Turn off power button");
    }

    @Override
    public void volumeUp() {
        System.out.println("Increase volume");
    }

    @Override
    public void volumeDown() {
        System.out.println("Decrease volume");
    }

    @Override
    public void muteVolume() {
        System.out.println("Mute volume");
    }

    @Override
    public void playMusic() {
        System.out.println("PlayTheMusic");
    }

    @Override
    public void pauseMusic() {
        System.out.println("PauseTheMusic");
    }
}

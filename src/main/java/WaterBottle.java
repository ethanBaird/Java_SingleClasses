public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void drink(){
        this.volume -= 10;
    }
}

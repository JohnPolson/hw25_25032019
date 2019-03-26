public class WaterBottle {
    private int volume;

    public WaterBottle (int volume) {
        this.volume = volume;
    }

    public int checkVolume() {
        return this.volume;
    }

    public int fillUp() {
        return this.volume = 100;
    }

    public int takeDrink() {
        return this.volume - 10;
    }

    public int emptyOut() {
        return this.volume = 0;
    }


}

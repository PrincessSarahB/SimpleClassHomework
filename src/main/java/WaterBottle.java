public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
//        preferred way would be this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }

//    command + n will let you auto create a getter/setter etc.

    public void drink(){
        this.volume -= 10;
    }

    public void empty(){
        this.volume -= this.volume;
    }

    public void fill(){
        this.volume = 100;

    }
}

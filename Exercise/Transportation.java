package Exercise;

public class Transportation {
    private final short MAX_FUEL;
    private final short MAX_SPEED;
    private final short MAX_MASSENGER;

    private  static int serialNum = 1000;
    private short number ;
    private short fuel ;
    private short speed = 0;
    private short passenger = 0;
    private String state = "";

    public Transportation(short MAX_FUEL, short MAX_SPEED, short MAX_MASSENGER,
                          short number, short fuel, short speed, short passenger, String state) {
        this.MAX_FUEL = MAX_FUEL;
        this.MAX_SPEED = MAX_SPEED;
        this.MAX_MASSENGER = MAX_MASSENGER;
        this.number = number;
        this.fuel = fuel;
        this.speed = speed;
        this.passenger = passenger;
        this.state = state;
    }

}

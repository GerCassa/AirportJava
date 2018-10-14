public enum PlaneType {
    Boeing777(4),
    AirbusA34(2);

    private final int value;

    PlaneType(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

}

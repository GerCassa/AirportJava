public enum PlaneType {
    Boeing777(400),
    AirbusA34(295);

    private final int value;

    PlaneType(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }

}

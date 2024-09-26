package cafe;

public enum SeasonType {
    봄("따뜻"), 여름("더움")
    , 가을("시원"), 겨울("추움")
    , 올("올");
    public String description;

    SeasonType(String description) {
        this.description = description;
    }
}

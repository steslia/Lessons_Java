package JavaRushNotPublished;

public enum Sex {
    MALE("м"), FEMALE("ж");

    private String sex;

    Sex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
}

package HomeTaskOOP.ThreeLessons;

public class Human {
    private String height;
    private String weight;
    private String sex;

    Human(String height, String weight, String sex) {
        this.height = height;
        this.weight = weight;
        this.sex = sex;
    }

    public void goString() {
        System.out.println("height: " + height);
        System.out.println("weight: " + weight);
        System.out.println("sex: " + sex);
    }


    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getSex() {
        return sex;
    }
}

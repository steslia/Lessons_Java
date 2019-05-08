package LessonsOOP.IntroductionOOP;


public enum Size {
    //Тип enum позволяет хранить набор констант, он по типу массива
    //Все эти перечесления являються отдельными элементами перечесления
    SMALL("XS"), AVERAGE("M"), BIG("L");

    private String size;

    Size(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

}

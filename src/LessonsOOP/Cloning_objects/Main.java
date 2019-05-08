package LessonsOOP.Cloning_objects;

public class Main {
    public static void main(String[] args) {
        DollySheet dollySheet = new DollySheet();
        DollySheet dollySheet2 = cloneSheet(dollySheet);

        dollySheet.setName("Dolly");
        dollySheet2.setName("Ann");

        System.out.println(dollySheet.getName());
        System.out.println(dollySheet2.getName());
    }


    //Метод для конирования объекта
    public static DollySheet cloneSheet(DollySheet sheet) {
        //Если обявить объект в блоке try\catch тогда мы не сможем методом вернуть результат,
        // и нужно его раньше инициализировать
        DollySheet dollySheet = null;
        try {
            //Используем приведения типов, для того чтобы привести новый клонированый объект в тип DollySheet
            dollySheet = (DollySheet) sheet.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        //Возвращаем склонированый объект
        return dollySheet;
    }


}

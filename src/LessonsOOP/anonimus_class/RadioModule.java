package LessonsOOP.anonimus_class;

public class RadioModule {

    public RadioModule() {
        System.out.println();
        System.out.println("Radio Module initialized");
    }

    public void call(String number) {

        //Переменая обозначает длину номера
        int length = 10;

        //Локальный класс(класс внутри метода)
        class GSMModule {
            private String phoneNumber;
            private int validNumber;


            //У него может быть конструктор
            public GSMModule(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            //Метод который выполняет валидацию и возвращает boolean
            public boolean isValid() {
                if (phoneNumber.length() != length) {
                    return false;
                } else {
                    try {
                        //Вызываем метод который розпасит строку и получаем числовое значение
                        //Тут мы видем Integer пример класса обертки для примитивных типов
                        validNumber = Integer.parseInt(phoneNumber);
                        return true;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                }
            }

            //Отвечает за вызов метода isValid и выполнения звонка если наш номер прошел успешно валидацию
            public void diaIn() {
                if (isValid()){
                    System.out.println("Calling phone " + validNumber);
                } else {
                    System.out.println("Phone number is invalid. Correct number");
                }
            }
        }

        //В конструктор передаем тот номер который мы передали нашему методу call
        GSMModule module = new GSMModule(number);
        module.diaIn();

    }
}

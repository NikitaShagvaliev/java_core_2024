package lr2;

public class Example2 {
    public static String getEncryptString(String encryptString, int shift) {
        // преобразуем переданную в метод строку в символьный массив
        char[] arrayChar = encryptString.toCharArray();
        // создаем массив с типом данных int, размер массива равен размеру символьного массива
        int[] arrayInt = new int[arrayChar.length];
        // создаем символьный массив в который будут записаны преобразованные символы
        char[] arrayCharNew = new char[arrayChar.length];
        // в цикле перебираем все символы из которых состоит переданная нам строка, преобразуем их к числу, прибавляем к ним число (сдвиг)
        for (int i = 0; i < arrayChar.length; i++) {
            // преобразуем к числу с символа и сдвигаем
            arrayInt[i] = arrayChar[i] + shift;
            // преобразовываем число в символ char и записываем на нужное место в новый массив
            arrayCharNew[i] = (char) arrayInt[i];
        }
        // преобразовываем новый массив символов в строку
        encryptString = new String(arrayCharNew);

        return encryptString; // возвращаем строку из метод из которого был вызван текущий метод
    }
}

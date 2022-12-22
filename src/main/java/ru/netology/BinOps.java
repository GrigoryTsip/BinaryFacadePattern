package ru.netology;

import java.util.concurrent.ExecutionException;

public class BinOps {

    public String sum(String a, String b) {
    /* Перевод чисел из двоичной записи в
       строках в int, их сложение и перевод
       обратно в двоичную запись */

        double result = 0;
        try {
            result = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Integer overflow");
        }
        return Integer.toBinaryString((int) result);
    }

    public String mult(String a, String b) {
    /* Перевод чисел из двоичной записи в
       строках в int, их перемножение и перевод
       обратно в двоичную запись */

        double result = 0;
        try {
            result = Integer.parseInt(a, 2) * Integer.parseInt(b, 2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Integer overflow");
        }
        return Integer.toBinaryString((int) result);
    }
}

        package Homeworks.ls3;
//        Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
//        sum(), multiply(), divide(), subtract(). Параметры этих методов – два
//        числа разного типа, над которыми должна быть произведена операция.
        public class Calculator {
            public static <T extends Number, U extends Number> double sum (T num1, U num2){
                return num1.doubleValue() + num2.doubleValue();
            }
            public static <T extends Number, U extends Number> double multi (T num1, U num2){
                return num1.doubleValue() * num2.doubleValue();
            }
            public static <T extends Number, U extends Number> double div (T num1, U num2){
                return num1.doubleValue() / num2.doubleValue();
            }
            public static <T extends Number, U extends Number> double sub (T num1, U num2){
                return num1.doubleValue() - num2.doubleValue();
            }
}

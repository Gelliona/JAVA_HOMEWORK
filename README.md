## Список задач по курсу "Java: знакомство и как пользоваться базовым API "
___
### Day_1
* __Task1__
  
    Вычислить сумму чисел от 1 до n, вычислить n! произведение чисел от 1 до n.


* __Task2__

    Вывести все простые числа от 1 до 1000


* __Task3__

    Реализовать простой калькулятор (операции + - / * )

### Day_2
* __Task1__

  Дана строка sql-запроса "select * from students where ".
  Сформируйте часть WHERE этого запроса, используя StringBuilder.
  Данные приведены ниже в виде json строки.
  Если значение null, то параметр не должен попадать в запрос.

  >Входная строка:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

  >Выходная строка:
select * from students where name = "Ivanov" and country = "Russia" and city = "Moscow"
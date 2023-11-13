### Math - функции округления:  
1. Math.round - возвращает целое число, ближайшее к вещественному числу. Имеет две реализации
``` java
static long round(double a)  
static int round(float a)  
```
2. Math.ceil - возвращает вещественное число, округлённое в большую сторону. 
``` java
static double ceil(double a)
```
3. Math.floor - возвращает вещественное число, округлённое в меньшую сторону.
``` java
static double floor(double a)
```
4. Math.rint - работает почти как *round*, только возвращает *double*. Также если два ближайщих *double* значения (целых числа), одинаково близки (при .5), результатом будет четное целое значение.
``` java
static double rint(double a)
```

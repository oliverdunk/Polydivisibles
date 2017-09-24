# Polydivisibles
A basic Java program to find polydivisible numbers, inspired by the "Totally addicted to base" section of Matt Parker's "Things to make and do in the fourth dimension".

What is a polydivisible number?
-
According to the source that is Wikipedia...
>a polydivisible number is a number with digits abcde... that has the following properties :

1) Its first digit a is not 0.

2) The number formed by its first two digits ab is a multiple of 2.

3) The number formed by its first three digits abc is a multiple of 3.

4) The number formed by its first four digits abcd is a multiple of 4.

5) etc.

For the book's puzzle, the digit zero is not included and we look for solutions in each of the [bases](https://en.wikipedia.org/wiki/Radix).

What this program does
-
It seems that this problem is currently not very well documented, and so this program was an attempt to create an open source solution in Java. It loops through each permutation of the digits avaliable in each base, and then checks them. Failures are added to a cache so that they can be instantly dismissed if they reappear as a sequence in another longer permutation.

How to help
-
The biggest challenge is finding solutions in a timely manner. With billions of permutations to check, the more shortcuts that can be found the better. If you've managed to make the program faster, I'll happily accept and PRs.

Sources
-
[Things to make and do in the fourth dimension](http://makeanddo4d.com/) - Matt Parker, 2014, Penguin Publishing

[A Conspiracy of digits](http://scienceblogs.com/builtonfacts/2010/08/18/a-conspiracy-of-digits/) - Matt Springer, 2014

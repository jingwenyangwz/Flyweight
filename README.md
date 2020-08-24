# Flyweight
Make a Flyweight out of Pixel – factor out the column information to an external state



- Set up a Factory that gives you the same flyweight when
you ask for a Pixel in the same row
- Iterating through your table, get the Pixel for the current
row and column, and call report, passing in the
externalised state (i.e. the column, and the color)

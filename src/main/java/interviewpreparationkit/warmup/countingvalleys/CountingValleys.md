# Counting Valleys

##### Input
- an integer n, the number of steps in Gary's hike
- a single s, of n characters that describe his path

##### Output
- number of valleys

## Definition
What is the definition of valleys?
   
    A valley is a sequence of consecutive steps below sea level, 
    starting with a step down from sea level and ending with a set up to level


## Abstraction
1. check validation
2. find valley
3. if find valley, increase valley's count
4. return valley's count


## find valleys
after start valley, a sequence met sea level.
1. retrieve each char of string
2. add or deduct altitude by 'U' or 'D'
3. is previous altitude minus and current altitude 0?

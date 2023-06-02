# RQCODE metrics expiriment

This is a project that contains 4 different requirements statements that suppouse to demonstrate the "Good" and "Bad" variant for requirements quality metrics. This metrics are: Reusability, Modifiability, Redundancy, and Conciseness of the requirements.

## Examples structure

in each directory with metrics representation you can find:

1. directories with RQCODE implementation of good and bad variation of requirements
2. the common files for both requirements (For example: Conciseness/Clock.java) that are required for laying out the structure of a "system" described by this requirement (it is nessesary to measure metrics properly)
3. README file that states the requirements used in an example, states which metrics are to evaluate and describes why "bad" metrics suppose to be bad

## The survey structure

The survey have the following structure:

1. Given both sets of the requirements
2. The survey asks to evaluate the properties of each requirement set
3. The code for each requirement is shown
4. The survey asks to evaluate the properties of code that represents the requirements

## Survey question example

### Screen 1

Given to sets of requirements:

set 1:

1. On clock tick second must increse by one untill 59
2. If second = 59 on tick it should be equial to 0
3. If on tick second became 0 minute must increase by one untill 59
4. Second must be between 0 and 59
5. Minute must be between 0 and 59

set 2:

1. On clock tick second must increse by one and increse minute if it was 59 initialy
2. if minute/second should increace when it is equal to 59 it should became 0
3. Second and Minute mast be between 0 and 59

Set the score for the following requirements features:

- Requirement atomisity 1-10 where 1 = Need decompose before work, 10 = there is no way to Decompose ferther:
  1. set1
  2. set2
- Requirement readability 1-10 where 1 = impossible to read, 10 = no effort to read:
  1. set1
  2. set2
- Requirement readability 1-10 where 1 = impossible to understand, 10 = no effort to understand:
  1. set1
  2. set2

### Screen 2

There is a code that represents metrics from the previous question

set 1:

```java
public class SecondIncrease extends Requirement {

    public SecondIncrease() {
        super("On clock tick second must increse by one untill 59");
    }

    public SecondIncrease(String statement) {
        super(statement);
    }

    @Override
    public CheckStatus check() {
        Clock clock = new Clock();
        int initSecond = clock.getSecond();
        if (clock.getSecond() > 59) {
            return CheckStatus.INCOMPLETE;
        }
        clock.tick();
        if (clock.getSecond() == initSecond + 1) {
            return CheckStatus.PASS;
        }
        return CheckStatus.FAIL;
    }
}

public class SecondLap extends Requirement {

    public SecondLap() {
        super("If second = 59 on tick it should be equial to 0");
    }

    public SecondLap(String statement) {
        super(statement);
    }

    @Override
    public CheckStatus check() {
        Clock clock = new Clock(59);
        clock.tick();
        if (clock.getSecond() == 0) {
            return CheckStatus.PASS;
        }
        return CheckStatus.FAIL;
    }
}

public class MinuteIncrease extends SecondLap {

    public MinuteIncrease(){
        super("If on tick second became 0 minute must increase by one untill 59");
    }

    public MinuteIncrease(String statement){
        super(statement);
    }

    @Override
    public CheckStatus check() {
        Clock clock = new Clock(59);
        clock.tick();
        int initMinute = clock.getMinute();
        if (clock.getSecond() == 0 && clock.getMinute() == initMinute + 1) {
            return super.check();
        }
        return CheckStatus.FAIL;
    }
}

public class SecondBoundary extends SecondIncrease {

    public SecondBoundary() {
        super("Second must be between 0 and 59");
    }

    @Override
    public CheckStatus check() {
        Clock clock = new Clock();
        for (int i = 0; i < 60; i++) {
            clock.tick();
            int currentSecond = clock.getSecond();
            if (currentSecond < 0 || currentSecond > 59) {
                return CheckStatus.FAIL;
            }
        }
        return super.check();
    }
}

public class MinuteBoundary extends MinuteIncrease {

    public MinuteBoundary(){
        super("Minute must be between 0 and 59");
    }

    @Override
    public CheckStatus check() {
        Clock clock = new Clock();
        for (int i = 0; i < (60 * 60); i++) {
            clock.tick();
            int currentMinute = clock.getMinute();
            if(currentMinute < 0 || currentMinute > 59){
                return CheckStatus.FAIL;
            }
        }
        return CheckStatus.PASS;
    }
}
```

set 2:

```java
public class Increase extends Requirement {

    public Increase() {
        super("On clock tick second must increse by one and increse minute if it was 59 initialy");
    }

    public Increase(String statement) {
        super(statement);
    }

    @Override
    public CheckStatus check() {
        Clock clock = new Clock(1);
        int initSecond = clock.getSecond();
        clock.tick();
        if (clock.getSecond() != initSecond + 1) {
            return CheckStatus.FAIL;
        }
        int initMinute = clock.getMinute();
        for (int i = 0; i < 60; i++) {
            if (clock.getSecond() == 59) {
                clock.tick();
                if (clock.getMinute() != initMinute + 1) {
                    return CheckStatus.FAIL;
                }
            }
            clock.tick();
        }
        return CheckStatus.PASS;
    }
}

public class Lap extends Increase {

    public Lap(){
        super("if minute/second should increace when it is equal to 59 it should became 0");
    }

    @Override
    public CheckStatus check() {
        Clock clock = new Clock(59);
        clock.tick();
        if (clock.getSecond() != 0) {
            return CheckStatus.FAIL;
        }
        clock = new Clock(3599); // 3599s == 59m 59s
        if (clock.getMinute() != 0) {
            return CheckStatus.FAIL;
        }
        return super.check();
    }
}

public class Boundary extends Increase {

    public Boundary(){
        super("Second and Minute mast be between 0 and 59");
    }

    @Override
    public CheckStatus check() {
        Clock clock = new Clock();
        for (int i = 0; i < (60 * 60); i++) {
            if (clock.getSecond() < 0 || clock.getSecond() > 59 || clock.getMinute() < 0 || clock.getMinute() > 59) {
                return CheckStatus.FAIL;
            }
        }
        return super.check();
    }
}
```

Set the score for the following requirements implementation features:

- Requirement atomisity 1-10 where 1 = Need decompose before work, 10 = there is no way to Decompose ferther:
  1. set1
  2. set2
- Requirement readability 1-10 where 1 = impossible to read, 10 = no effort to read:
  1. set1
  2. set2
- Requirement readability 1-10 where 1 = impossible to understand, 10 = no effort to understand:
  1. set1
  2. set2

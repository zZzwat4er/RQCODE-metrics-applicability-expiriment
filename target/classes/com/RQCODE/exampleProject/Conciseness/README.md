# Test for conciseness of requirement

In this example we want to find out whethere the size of check function and the amount of comparisons reflect the requirements size as well as its redability and probably undersandability

## Good atomic requirements

1. On clock tick second must increse by one untill 59
2. If second = 59 on tick it should be equial to 0
3. If on tick second became 0 minute must increase by one untill 59
4. Second must be between 0 and 59
5. Minute must be between 0 and 59

## Bad complecated requirements

1. On clock tick second must increse by one and increse minute if it was 59 initialy
2. if minute/second should increace when it is equal to 59 it should became 0
3. Second and Minute mast be between 0 and 59

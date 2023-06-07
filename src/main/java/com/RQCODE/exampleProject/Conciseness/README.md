# Test for conciseness of requirement

In this example, we want to find out whether the size of the check function and the number of comparisons reflect the requirements size as well as its readability and probably understandability

## Good atomic requirements

1. On the clock tick second must increase by one until 59
2. If second = 59 on tick it should be equal to 0
3. If on tick second became 0 minutes must increase by one until 59
4. Second must be between 0 and 59
5. Minute must be between 0 and 59

## Bad complicated requirements

1. On the clock tick second must increase by one and increase minute if it was 59 initially
2. if the minute/second should increase when it is equal to 59 it should become 0
3. Second and Minute must be between 0 and 59

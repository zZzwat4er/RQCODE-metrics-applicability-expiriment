# Test for redundancy of requirement

In this example we want to find out whethere we can detect redundancy with dublicated code

## Good Requirements

1. On clock tick second must increse by one
2. If second = 59 on tick it should be equial to 0
3. If on tick second became 0 minute must increase by one
4. Second must be between 0 and 59
5. Minute must be between 0 and 59

## Requirements that actually dublicates the clock behavior

1. On clock tick second must increse by one
2. If second = 59 on tick it should be equial to 0
3. If on tick second became 0 minute must increase by one
4. Second must be between 0 and 59
5. Minute must be between 0 and 59
6. The clock tracks the total number of seconds that increase on tick
7. The total number of seconds must be between 0 and 3599 (59m 59s)

the 6 and 7 requirement qould be removed or requirements 1-5 as this is a dublicated functionality

# RQCODE metrics experiment

This is a project that contains 4 different requirements statements that suppose to demonstrate the "Good" and "Bad" variants for requirements quality metrics. These metrics are: Reusability, Modifiability, Redundancy, and Conciseness of the requirements.

## Example’s structure

in each directory with metrics representation you can find:

1. directories with RQCODE implementation of good and bad variations of requirements
2. the common files for both requirements (For example Conciseness/Clock.java) that are required for laying out the structure of a "system" described by this requirement (it is necessary to measure metrics properly)
3. README file that states the requirements used in an example, states which metrics are to evaluate, and describes why "bad" metrics suppose to be bad

## The survey structure

The survey has the following structure:

1. Given both sets of the requirements
2. The survey asks to evaluate the properties of each requirement set
3. The survey shows how code metrics have changed between set 1 and set 2
4. Then we ask does the change of metrics coresponce with change of requirement quality

## Survey question example

### Screen 1

Given two sets of requirements:

set 1:

1. On the clock tick second must increase by one until 59
2. If second = 59 on tick it should be equal to 0
3. If on tick second became 0 minutes must increase by one until 59
4. Second must be between 0 and 59
5. Minute must be between 0 and 59

set 2:

1. On the clock tick second must increase by one and increase minute if it was 59 initially
2. if the minute/second should increase when it is equal to 59 it should become 0
3. Second and Minute must be between 0 and 59

Set the score for the following requirements features:

- Requirement atomicity 1-10 where 1 = Need decompose before work, 10 = there is no way to Decompose further:
  1. set1
  2. set2
- Requirement readability 1-10 where 1 = impossible to read, 10 = no effort to read:
  1. set1
  2. set2
- Requirement understandability 1-10 where 1 = impossible to understand, 10 = no effort to understand:
  1. set1
  2. set2

### Screen 2



Set the score for the following requirements implementation features:

- Requirement atomicity 1-10 where 1 = Need decompose before work, 10 = there is no way to Decompose further:
  1. set1
  2. set2
- Requirement readability 1-10 where 1 = impossible to read, 10 = no effort to read:
  1. set1
  2. set2
- Requirement understandability 1-10 where 1 = impossible to understand, 10 = no effort to understand:
  1. set1
  2. set2
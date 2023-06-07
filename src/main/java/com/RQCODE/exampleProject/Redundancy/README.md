# Test for redundancy of requirement

In this example, we want to find out whether we can detect redundancy with duplicated code. Additionally, we could check for the requirements maintainability as this metric is highly dependent on other metrics that are related to requirements representation and redundancy

## Good Requirements

1. There is a message that should be 100 symbols long or shorter
2. User can create a new message from R1
3. User could see a message from R1

## Bad requirements

1. User can create a new message
2. A message should be 100 symbols long or shorter
3. User can see a message
4. shown message should be 100 symbols long or shorter

## Note

In this case, message that is written everywhere is the same message thus an example of bad requirements R2 and R4 are redundant since they describe the boundary for the same model

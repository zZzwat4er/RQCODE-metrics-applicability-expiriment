# Test for conciseness of requirement

In this example we want to find out whethere the check function complexity (WMC), DIT, Number of children, Coupling, and Responses for a class of the defined requirement affect its Reusability

## Good reuse

1. User can make an payment with credid card by providing its:
   1. Number
   2. CVC
   3. Exporation date
   4. Owner
   5. Price of the item to buy

## Bad reuse

1. There is a list of items user can buy
2. The item has:
   1. title
   2. price
3. User can add a custom item to the list from R1 for theyself

## Note

The bad reuse example presents a requirements that a strongly connected with eachother and it sould be abopted to each case (for example R3 depends on extendability of list from R1 and on fields of R2)

And the Good requirement actualy could be used anywhere without any tweaks at all

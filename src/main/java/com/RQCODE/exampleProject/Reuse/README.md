# Test for conciseness of requirement

In this example, we want to find out whether the check function complexity (WMC), DIT, Number of children, Coupling, and Responses for a class of the defined requirement affect its Reusability

## Good reuse

1. User can make a payment with credit card by providing its:
   1. Number
   2. CVC
   3. Expiration date
   4. Owner
   5. Price of the item to buy

## Bad reuse

1. There is a list of items users can buy
2. The item has:
   1. title
   2. price
3. Users can add a custom item to the list from R1 for thyself

## Note

The bad reuse example presents requirements that a strongly connected with each other and it should be adapted to each case (for example R3 depends on the extendability of the list from R1 and on fields of R2)

And the Good requirement actually could be used anywhere without any tweaks at all

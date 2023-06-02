# Test for modifiability of requirement

In this example we want to find out whethere the check function complexity (WMC), DIT, Number of children, Code Smels, Coupling, and Responses for a class of the defined requirement affect its modifiability

## Good modifiabliluty

1. Resive DTO with server UTC datatime as long
2. Translate server's datetime to local
3. Use translated datetime to estemate time to an app update

## Bad modifiabliluty

1. Resive Server UTC datetime as long
2. Use server's datetime to estemate time to an app update

## Note

In this example modifiability is reached by adding "translation" step that sepparates DTO from application model allowing us to modify our DTO as we want without need to fix it everywhere we use it (example1: we desided that server now works in CET instead of UTC)(example2: we do request A and request B mostly in pair so lets merge them)

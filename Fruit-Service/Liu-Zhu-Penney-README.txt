Xuanwei Liu # 261063028
Michael Zhu # 261068736
Eric Penney # 261078777

We created 2 servers, one server acts as a client to another one. 

For the fruit-MP-service,  we converted the Excel file into a csv file for ease of accessibility under the resources folder, called "data.csv."

We've created a hashmap with String and FruitMonthPrice as key and value respectively.
Under loadDB() method, every month key is assigned with the price value (fields[i]).

For the FruitTotalPrice service, we have the annotation in @RequestMapping "/fruit-total-price/fruit/{fruit}/{month}/quantity/{quantity}"
to map web requests to the Controller methods.
The placeholders for fruit, month, and quantity to calculate the total price.


P.S. Unfortunately there's some issues with our code. But we have no time to debug. Besides, our group didn't have time to record a demo because of our tight schedules. Hopefully this text file is enough to do the job.
We apologize for any inconvenience.
This app is made as an assignment for Webtown.
I spent about 5 hours to solve it.

Features I had time for:
    * JSP page that lists products and receives user input
    * JSP page that lists quantities of choosen products
    * discounts are counted and displayed as expected in the description
    * csv file reader that converts data to product objects to prevent hard coded template
    * discounts are extendable easily by extending lists
    
    
Features I wanted to implement but didn't have the time for:
    * template should be rendered based on the data read by csv reader
    * response should be handled using: request.getParametersMap() to collect product data using a simple for loop, now unfourtunatelly servlet method has to be modified on each csv file change
    * products with 0 quantity shouldn't be rendered on the second page
    * csv file should be used like a db to render/receive data and to handle discounts like:
        - read products from the csv file -> list of products
        - render that list on index.jsp
        - user inputs quantities -> request of key: value pairs
        - iterate through the request data: each key is a product, value is a quantity
        - the received product's data is read from the csv file to manage discounts and prices
        - calculate prices -> respond with a list of Products and the price & discount details 
        - finally render them via the corresponding JSP
        
        
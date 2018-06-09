FORMAT: 1A
HOST: http://localhost:8081/api

# Mobile Order API


# Group orders

## Orders [/orders]

### Orders [GET]
lists all orders of a specific user
+ Attributes
    + userId (string, required)

        use to query all orders of a user

        + Sample: 1964401a-a8b3-40c1-b86e-d8b9f75b5842
    + size (number, optional)

        the amount of elements of each result page

        + Sample: 10
    + page (number, optional)

        the page number

        + Sample: 0

+ Response 200 (application/json)
    + Attributes (Orders)

    + Body

            {"orders":[{"order_id":"ORDER-437563756","creation_date":"2016-03-30","items":[{"product_id":"PRODUCT-1","quantity":5},{"product_id":"PRODUCT-2","quantity":2}]}]}




# Data Structures

## Orders (object)


### Properties
+ `orders` (array[Order], required) 


## Order (object)


### Properties
+ `order_id` (string, required) 
+ `creation_date` (string, required) 
+ `items` (array[ProductItem], required) 


## ProductItem (object)


### Properties
+ `product_id` (string, required) 
+ `quantity` (number, required) 




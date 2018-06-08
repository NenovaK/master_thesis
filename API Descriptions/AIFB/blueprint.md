FORMAT: 1A
HOST: http://km.aifb.kit.edu/services/bader4/step

# FLSVisitourRestAPI


# Group visitour

## Visitour [/visitour]

### Returns the fls visitour REST web service [GET]
notes

+ Response 200 



+ Response 404 

        resource not available




+ Response 500 

        internal server error





## Visitour Call [/visitour/call]

### read all Work Orders and some meta data [GET]

+ Response 200 



+ Response 404 

        resource not available




+ Response 500 

        internal server error




### create new work order [POST]
create new work order in the tour planning system

+ Request 
    + Attributes (object)


+ Response 201 



+ Response 404 

        resource not available




+ Response 500 

        internal server error





## Visitour Call By Child [/visitour/call/{child}]

+ Parameters
    + child (string, required)


### Returns the FLS Visitour planning for Work Order object in Linked Data [GET]

+ Response 200 



+ Response 404 

        resource not available




+ Response 500 

        internal server error




### Deletes this Work Order object [DELETE]

+ Response 200 



+ Response 404 

        resource not available




+ Response 500 

        internal server error




### Overwrites the FLS Visitour planning for a specific Work Order object state [PUT]

+ Request 
    + Attributes (object)


+ Response 200 



+ Response 404 

        resource not available




+ Response 500 

        internal server error





## Visitour Fieldmanager [/visitour/fieldmanager]

### Returns the fls visitour REST web service for fieldmanagers [GET]

+ Response 200 



+ Response 404 

        resource not available




+ Response 500 

        internal server error




### Creates a new fieldmanager [POST]

+ Request 
    + Attributes (object)


+ Response 200 



+ Response 501 

        method not yet implemented





## Visitour Fieldmanager By Child [/visitour/fieldmanager/{child}]

+ Parameters
    + child (string, required)


### Returns the field manager for this resource [GET]

+ Response 200 



+ Response 404 

        resource not available




+ Response 500 

        internal server error




### semantics of PATCH not fixed [PATCH]

+ Response 200 





# Data Structures

## RdfFieldmanager (object)


### Properties
+ `URI` (string, optional) - http://people.aifb.kit.edu/mu2771/step#Technician


## RdfWorkOrder (object)


### Properties
+ `URI` (string, optional) - http://people.aifb.kit.edu/mu2771/step/WorkOrder


## RDFgraph (object)


### Properties
+ `URI` (string, optional) - https://www.w3.org/TR/rdf11-primer/


FORMAT: 1A
HOST: http://{environment}.musicapi.com/{version}

# World Music API
This is a getting started guide for the World Music API.

See http://legal.musicapi.com

# Group api

## Api [/api]

### Api [GET]
+ Attributes
    + start (number, optional)

    + page-size (number, optional)


+ Response 200 



+ Response 401 

        Bad token.




+ Response 403 

        TODO: Add error message




### Api [POST]

+ Request (application/json)
    + Attributes (RamlDataType)


+ Response 200 



+ Response 401 

        Bad token.




+ Response 403 

        TODO: Add error message






# Group entry

## Entry [/entry]

### Entry [GET]
returns a list of entry

+ Response 200 (application/json)
    + Attributes (array[Entry response])


+ Response 401 

        Bad token.




+ Response 403 

        TODO: Add error message




### Entry [POST]

+ Response 200 (application/json)
    + Attributes (array[AnotherEntry])


+ Response 401 

        Bad token.




+ Response 403 

        TODO: Add error message






# Group songs

## Songs By SongId [/songs/{songId}]

+ Parameters
    + songId (string, required)


### SongsBySongId [GET]

+ Response 200 (application/json)
    + Attributes (Song)


+ Response 401 

        Bad token.




+ Response 403 

        TODO: Add error message





## Songs [/songs{?genre,access_token}]

### Songs [GET]
+ Parameters
    + genre (string, required)

        filter the songs by genre

    + access_token (string, required)


+ Response 200 



+ Response 401 

        Bad token.




+ Response 403 

        TODO: Add error message





## Songs [/songs{?access_token}]

### Songs [POST]
+ Parameters
    + access_token (string, required)


+ Response 200 



+ Response 401 

        Bad token.




+ Response 403 

        TODO: Add error message






# Data Structures

## Entry (object)


### Properties
+ `title` (string, optional) 
+ `artist` (string, optional) 


## AnotherEntry (object)


### Properties
+ `title` (string, optional) 
+ `artist` (string, optional) 


## User (object)


### Properties
+ `firstname` (string, required) 
+ `lastname`: `Doe` (string, optional) 


## RamlDataType (object)


### Properties
+ `propString` (string, required) 
+ `propStringArray1` (array[string], required) 
+ `ideas` (array[ideasItem], required) 
+ `extIdeas` (extIdeas, required) 
+ `feedback`: `very nice` (string, required) 
+ `propNumber` (number, required) 
+ `propInteger` (number, required) 
+ `propBoolean` (boolean, required) 
+ `propDate`: `2015-05-23` (string, required) 
+ `userPicture` (string, required) 
+ `NilValue` (NilValue, required) 
+ `CatOrDog` (object, required) 
+ `CatAndDog` (CatAndDog, required) 
+ `PossibleMeetingDate` (string, required) 


## ideasItem (object)


### Properties
+ `comment` (string, required) 


## extIdeas (extIdeasBaseType)


### Properties
+ `createdBy` (string, required) 


## extIdeasBaseType (object)


### Properties
+ `comment` (string, required) 


## NilValue (object)


### Properties
+ `name` (string, required) 
+ `comment` (string, optional, nullable) 


## CatAndDog (object)


### Properties
+ `name` (string, required) 
+ `color` (string, required) 
+ `fangs` (string, required) 


## Entry response (object)


### Properties
+ `title` (string, optional) 
+ `artist` (string, optional) 


## Song (object)


### Properties
+ `title` (string, required) 
+ `length` (number, required) 


FORMAT: 1A
HOST: https://api.wordassociations.net/associations/v1.0

# Word Associations API
The Word Associations Network API allows developers to embed the ability to find associations for a word or phrase into their mobile apps or web services. Words are grouped by semantics, meaning, and psychological perception. The Word Associations Network API currently supports English, French, Spanish, German, Italian, Portuguese, and Russian vocabulary. Please [register and subscribe](https://api.wordassociations.net/subscriptions/) to one of available tariff plans to get a valid API key.

## Authentication
This API uses Custom Query Parameter for its authentication.

The parameters that are needed to be sent for this type of authentication are as follows:
+ `apikey` - API key. Please register and subscribe to one of available tariff plans to get a valid API key https://api.wordassociations.net/subscriptions/.

# Json Search [/json/search]

## JsonSearch [GET]
Gets associations with the given word or phrase.
+ Attributes
    + text (string, required)

        Word or phrase to find associations with.
        
        Tip. You can use multiple parameters 'text' in a request (from 1 to 10 inclusive). This way you can get associations for several input words or phrases in one response.
        
        Restriction: regardless of the size of the text association lookup is always performed by the first 10 words of the text.{ARRAY}

    + lang (enum[string], required)

        Query language. Use language code for the language of the text:
        
        * de - German;
        
        * en - English;
        
        * es - Spanish;
        
        * fr - French;
        
        * it - Italian;
        
        * pt - Portuguese;
        
        * ru - Russian;

        + Members
            + `de` 
            + `en` 
            + `es` 
            + `fr` 
            + `it` 
            + `pt` 
            + `ru` 

    + type (enum[string], optional)

        Type of result.
        
        Possible values: 
        
        * stimulus - an input data (the text parameter) is considered as a response word. The service returns a list of stimuli words, which evoke a given response word;
        
        * response - an input data (the text parameter) is considered as a stimulus word. The service returns a list of response words, which come to mind for a given stimulus word.

        + Default: stimulus
        + Members
            + `stimulus` 
            + `response` 

    + limit (number, optional) -

        Maximum number of results to return.
        
        Allows to limit the number of results (associations) in response.
        
        The value of this parameter is an integer number from 1 to 300 inclusive.

        + Default: 50
    + pos (array, optional)

        Parts of speech to return.
        
        Allows to limit results by specified parts of speech. The value of this parameter is a list of parts of speech separated by comma.
        
        The following parts of speech codes are supported:
        
        * noun
        
        * adjective
        
        * verb
        
        * adverb{ARRAY}

        + (enum[string])
            + `noun` 
            + `adjective` 
            + `verb` 
            + `adverb` 

    + indent (enum[string], optional)

        Indentation switch for pretty printing of JSON response.
        
        Allows to either turn on or off space indentation for a response.
        
        The following values are allowed:
        
        * yes - turns indentation with spaces on;
        
        * no - turn indentation with spaces off;

        + Default: yes
        + Members
            + `yes` 
            + `no` 


+ Response 200 (application/json)

        Successful response

    + Attributes (Body)


+ Response 401 

        Invalid API key




+ Response 429 

        The monthly limit on the number of requests is exceeded




+ Response 501 

        The specified language is not supported




## JsonSearch [POST]
Gets associations with the given word or phrase.
+ Attributes
    + text (string, required)

        Word or phrase to find associations with.
        
        Tip. You can use multiple parameters 'text' in a request (from 1 to 10 inclusive). This way you can get associations for several input words or phrases in one response.
        
        Restriction: regardless of the size of the text association lookup is always performed by the first 10 words of the text.

    + lang (enum[string], required)

        Query language. Use language code for the language of the text:
        
        * de - German;
        
        * en - English;
        
        * es - Spanish;
        
        * fr - French;
        
        * it - Italian;
        
        * pt - Portuguese;
        
        * ru - Russian;

        + Members
            + `de` 
            + `en` 
            + `es` 
            + `fr` 
            + `it` 
            + `pt` 
            + `ru` 

    + type (enum[string], optional)

        Type of result.
        
        Possible values: 
        
        * stimulus - an input data (the text parameter) is considered as a response word. The service returns a list of stimuli words, which evoke a given response word;
        
        * response - an input data (the text parameter) is considered as a stimulus word. The service returns a list of response words, which come to mind for a given stimulus word.

        + Default: stimulus
        + Members
            + `stimulus` 
            + `response` 

    + limit (number, optional) -

        Maximum number of results to return.
        
        Allows to limit the number of results (associations) in response.
        
        The value of this parameter is an integer number from 1 to 300 inclusive.

        + Default: 50
    + pos (array, optional)

        Parts of speech to return.
        
        Allows to limit results by specified parts of speech. The value of this parameter is a list of parts of speech separated by comma.
        
        The following parts of speech codes are supported:
        
        * noun
        
        * adjective
        
        * verb
        
        * adverb

        + (enum[string])
            + `noun` 
            + `adjective` 
            + `verb` 
            + `adverb` 

    + indent (enum[string], optional)

        Indentation switch for pretty printing of JSON response.
        
        Allows to either turn on or off space indentation for a response.
        
        The following values are allowed:
        
        * yes - turns indentation with spaces on;
        
        * no - turn indentation with spaces off;

        + Default: yes
        + Members
            + `yes` 
            + `no` 


+ Request (application/x-www-form-urlencoded)



+ Response 200 (application/json)

        Successful response

    + Attributes (Body)


+ Response 401 

        Invalid API key




+ Response 429 

        The monthly limit on the number of requests is exceeded




+ Response 501 

        The specified language is not supported





# Data Structures

## Body (object)


### Properties
+ `version` (string, optional) 
+ `code` (number, optional) 
+ `request` (Request, optional) 
+ `response` (array[Response], optional) 


## Request (object)


### Properties
+ `text` (array[string], optional) 
+ `lang` (string, optional) 
+ `type` (string, optional) 
+ `limit` (number, optional) 
+ `pos` (string, optional) 
+ `indent` (string, optional) 


## Response (object)


### Properties
+ `text` (string, optional) 
+ `items` (array[Item], optional) 


## Item (object)


### Properties
+ `item` (string, optional) 
+ `weight` (number, optional) 
+ `pos` (string, optional) 



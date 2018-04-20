FORMAT: 1A
HOST: https://api.lufthansa.com/v1

# LH Public
## Authentication
This API uses OAuth v2 Authorization Code Grant for its authentication.

The properties required for this OAuth implentation are as follows:
+ Access Token Url - /oauth/token
+ Authorization Url - /oauth/token

# Group Cargo

## Cargo GetRoute FromDate ProductCode [/cargo/getRoute/{origin}-{destination}/{fromDate}/{productCode}]

+ Parameters
    + origin (string, required)

        Departure Airport : 3-letter IATA airport code, e.g. FRA.

    + destination (string, required)

        Arrival airport : 3-letter IATA airport code, e.g. HKG.

    + fromDate (string, required)

        Departure date in the local time of the departure airport. Based on LAT (Latest Acceptance Time). format : yyyy-MM-dd eg : 2017-07-15

    + productCode (enum[string], required)

        Product code for requested service and specials : 3-letter eg: YNZ

        + Members
            + `FAN` 
            + `FCO` 
            + `FCP` 
            + `FDG` 
            + `FTF` 
            + `FUN` 
            + `FWN` 
            + `YCO` 
            + `YCP` 
            + `YDG` 
            + `YNB` 
            + `YNZ` 
            + `YTF` 
            + `YUN` 
            + `ZXB` 
            + `ZXF` 
            + `ZXR` 


### CargoGetRouteFromDateProductCodeByOriginAndDestinationGet [GET]
Retrieve a list of all possible flights (both direct and connecting) between two airports on a given date. Routes are available for today and up to days in the future.

+ Response 200 
    + Attributes (object)



## Cargo ShipmentTracking By AWBPrefix [/cargo/shipmentTracking/{aWBPrefix}-{aWBNumber}]

+ Parameters
    + aWBPrefix (string, required)

        aWBPrefix : Represents the airline that is the owner of this AWB, i.e. "020" = Lufthansa Cargo, format : [0-9]{3} e.g. 020

    + aWBNumber (string, required)

        aWBNumber : The Air Waybill Number , format : [0-9]{8} e.g. 08002050


### CargoShipmentTrackingByAWBPrefixAndAWBNumberGet [GET]
With this tracking service you can easily retrieve your shipment or flight status information.

+ Response 200 
    + Attributes (object)




# Group Offers

## Offers Lounges By Location [/offers/lounges/{location}]

+ Parameters
    + location (string, required)

        3-leter IATA airport or city code (e.g. 'ZRH')


### OffersLoungesByLocationGet [GET]
Lounge information
+ Attributes
    + cabinClass (string, optional)

        Cabin class: 'M', 'E', 'C', 'F' (Acceptable values are: "", "M", "E", "C", "F")

    + tierCode (string, optional)

        Frequent flyer level ('FTL', 'SGC', 'SEN', 'HON') (Acceptable values are: "", "FTL", "SGC", "SEN", "HON")

    + lang (string, optional)

        Language code.


+ Response 200 
    + Attributes (object)



## Offers Seatmaps Destination Date CabinClass [/offers/seatmaps/{flightNumber}/{origin}/{destination}/{date}/{cabinClass}]

+ Parameters
    + flightNumber (string, required)

        Flight number including carrier code and any suffix (e.g. 'LH2037')

    + origin (string, required)

        Departure airport. 3-letter IATA airport code (e.g. 'TXL')

    + destination (string, required)

        Destination airport. 3-letter IATA airport code (e.g. 'MUC')

    + date (string, required)

        Departure date (YYYY-MM-DD)

    + cabinClass (string, required)

        Cabin class: 'M', 'E', 'C', 'F'. Some flights have fewer classes (Acceptable values are: "M", "E", "C", "F")


### OffersSeatmapsDestinationDateCabinClassByFlightNumberAndOriginGet [GET]
Cabin layout and seat characteristics.

+ Response 200 
    + Attributes (object)




# Group Operations

## Operations Flightstatus Arrivals [/operations/flightstatus/arrivals/{airportCode}/{fromDateTime}]

+ Parameters
    + airportCode (string, required)

        3-letter IATA aiport code (e.g. 'ZRH')

    + fromDateTime (string, required)

        Start of time range in local time of arrival airport (YYYY-MM-DDTHH:mm)


### OperationsFlightstatusArrivalsByAirportCodeAndFromDateTimeGet [GET]
Status of all arrivals at a given airport up to 4 hours from the provided date time.
+ Attributes
    + limit (string, optional)

        Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken)

    + offset (string, optional)

        Number of records skipped. Defaults to 0


+ Response 200 
    + Attributes (object)



## Operations Flightstatus Departures [/operations/flightstatus/departures/{airportCode}/{fromDateTime}{?limit,offset}]

+ Parameters
    + airportCode (string, required)

        Departure airport. 3-letter IATA airport code (e.g. 'HAM')

    + fromDateTime (string, required)

        Start of time range in local time of departure airport (YYYY-MM-DDTHH:mm)


### OperationsFlightstatusDeparturesByAirportCodeAndFromDateTimeGet [GET]
Status of all departures from a given airport up to 4 hours from the provided date time.
+ Parameters
    + limit (string, optional)

        Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken)

    + offset (string, optional)

        Number of records skipped. Defaults to 0


+ Response 200 
    + Attributes (object)



## Operations Flightstatus Route Date [/operations/flightstatus/route/{origin}/{destination}/{date}{?limit,offset}]

+ Parameters
    + origin (string, required)

        3-letter IATA airport (e.g. 'FRA')

    + destination (string, required)

        3-letter IATA airport code (e.g. 'JFK')

    + date (string, required)

        Departure date (YYYY-MM-DD) in local time of departure airport


### OperationsFlightstatusRouteDateByOriginAndDestinationGet [GET]
Status of flights between a given origin and destination on a given date.
+ Parameters
    + limit (string, optional)

        Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken)

    + offset (string, optional)

        Number of records skipped. Defaults to 0


+ Response 200 
    + Attributes (object)



## Operations Flightstatus By FlightNumber [/operations/flightstatus/{flightNumber}/{date}{?limit,offset}]

+ Parameters
    + flightNumber (string, required)

        Flight number including carrier code and any suffix (e.g. 'LH400')

    + date (string, required)

        The departure date (YYYY-MM-DD) in the local time of the departure airport


### OperationsFlightstatusByFlightNumberAndDateGet [GET]
Status of a particular flight (boarding, delayed, etc.).
+ Parameters
    + limit (string, optional)

        Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken)

    + offset (string, optional)

        Number of records skipped. Defaults to 0


+ Response 200 
    + Attributes (object)



## Operations Schedules FromDateTime [/operations/schedules/{origin}/{destination}/{fromDateTime}{?directFlights,limit,offset}]

+ Parameters
    + origin (string, required)

        Departure airport. 3-letter IATA airport code (e.g. 'ZRH')

    + destination (string, required)

        Destination airport. 3-letter IATA airport code (e.g. 'FRA')

    + fromDateTime (string, required)

        Local departure date and optionally departure time (YYYY-MM-DD or YYYY-MM-DDTHH:mm). When not provided, time is assumed to be 00:01


### OperationsSchedulesFromDateTimeByOriginAndDestinationGet [GET]
Scheduled flights between given airports on a given date.
+ Parameters
    + directFlights (boolean, optional)

        Show only direct flights (false=0, true=1). Default is false

    + limit (string, optional)

        Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken)

    + offset (string, optional)

        Number of records skipped. Defaults to 0


+ Response 200 
    + Attributes (object)




# Group Reference Data

## References Aircraft By AircraftCode [/references/aircraft/{aircraftCode}]

+ Parameters
    + aircraftCode (string, optional) -

        3-character IATA aircraft code

        + Default: 33P

### ReferencesAircraftByAircraftCodeGet [GET]
List all aircraft types or one specific aircraft type.
+ Attributes
    + limit (string, optional) -

        Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken)

        + Default: 20
    + offset (string, optional) -

        Number of records skipped. Defaults to 0

        + Default: 0

+ Response 200 
    + Attributes (object)



## References Airlines By AirlineCode [/references/airlines/{airlineCode}{?limit,offset}]

+ Parameters
    + airlineCode (string, optional) -

        2-character IATA airline/carrier code

        + Default: LH

### ReferencesAirlinesByAirlineCodeGet [GET]
List all airlines or one specific airline.
+ Parameters
    + limit (string, optional) -

        Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken)

        + Default: 20
    + offset (string, optional) -

        Number of records skipped. Defaults to 0

        + Default: 0

+ Response 200 
    + Attributes (object)



## References Airports Nearest By Latitude [/references/airports/nearest/{latitude},{longitude}{?lang}]

+ Parameters
    + latitude (number, required)

        Latitude in decimal format to at most 3 decimal places{INT}

    + longitude (number, required)

        Longitude in decimal format to at most 3 decimal places{INT}


### ReferencesAirportsNearestByLatitudeAndLongitudeGet [GET]
List the 5 closest airports to the given latitude and longitude, irrespective of the radius of the reference point.
+ Parameters
    + lang (string, optional)

        2 letter ISO 3166-1 language code


+ Response 200 
    + Attributes (object)



## References Airports By AirportCode [/references/airports/{airportCode}{?lang,limit,offset,LHoperated}]

+ Parameters
    + airportCode (string, optional) -

        3-letter IATA airport code

        + Default: TXL

### ReferencesAirportsByAirportCodeGet [GET]
List all airports or one specific airport. All airports response is very large. It is possible to request the response in a specific language.
+ Parameters
    + lang (string, optional)

        2-letter ISO 3166-1 language code

    + limit (string, optional) -

        Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken)

        + Default: 20
    + offset (string, optional) -

        Number of records skipped. Defaults to 0

        + Default: 0
    + LHoperated (boolean, optional)

        Restrict the results to locations with flights operated by LH (false=0, true=1)


+ Response 200 (application/json)
    + Attributes (AirportResponse)



## References Cities By CityCode [/references/cities/{cityCode}{?lang,limit,offset}]

+ Parameters
    + cityCode (string, optional) -

        3-letter IATA city code

        + Default: BER

### ReferencesCitiesByCityCodeGet [GET]
List all cities or one specific city. It is possible to request the response in a specific language.
+ Parameters
    + lang (string, optional)

        2 letter ISO 3166-1 language code

    + limit (string, optional) -

        Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken)

        + Default: 20
    + offset (string, optional) -

        Number of records skipped. Defaults to 0

        + Default: 0

+ Response 200 
    + Attributes (object)



## References Countries By CountryCode [/references/countries/{countryCode}{?lang,limit,offset}]

+ Parameters
    + countryCode (string, optional) -

        2-letter ISO 3166-1 country code

        + Default: DK

### ReferencesCountriesByCountryCodeGet [GET]
List all countries or one specific country. It is possible to request the response in a specific language.
+ Parameters
    + lang (string, optional)

        2 letter ISO 3166-1 language code

    + limit (string, optional) -

        Number of records returned per request. Defaults to 20, maximum is 100 (if a value bigger than 100 is given, 100 will be taken)

        + Default: 20
    + offset (string, optional) -

        Number of records skipped. Defaults to 0

        + Default: 0

+ Response 200 
    + Attributes (object)




# Data Structures

## Airport (object)
Array of all available airports or one airport matching the request.

### Properties
+ `AirportCode` (string, optional) - 3-letter IATA airport code, e.g. “TXL”.
+ `CityCode` (string, optional) - 3-letter IATA city code, e.g. “BER”.
+ `CountryCode` (string, optional) - 2-letter ISO 3166-1 country code, e.g. “DE”.
+ `LocationType` (string, optional) - “Airport”, “RailwayStation” or “BusStation”.
+ `Names` (Names, optional) - Container for airport names.
+ `Position` (Position, optional) - Physical location of an airport. This data section is optional and therefore not always present.
+ `TimeZoneId` (string, optional) - Time zone name airport is in
+ `UtcOffset` (number, optional) - Hour offset of airport to UTC time zone


## Names (object)


### Properties
+ `Name` (array[Name], optional) - Array: language specific full name of airport.


## Name (object)
2-letter ISO 639-1 language code for the corresponding item.

### Properties
+ `$` (string, optional) 
+ `@LanguageCode` (string, optional) 


## Position (object)


### Properties
+ `Coordinate` (Coordinate, optional) - Container for coordinates.


## Coordinate (object)
Container for coordinates.

### Properties
+ `Latitude` (number, optional) - Decimal latitude. Range: -90 (South Pole) to +90 (North Pole), e.g. “51.540”.
+ `Longitude` (number, optional) - Decimal longitude. Range: -180 (West of Prime Meridian) to +180 (East of Prime Meridian).


## AirportResource (object)
Root element of airport response.

### Properties
+ `Airports` (Airports, optional) - Container for airport elements.
+ `Meta` (Meta, optional) - Container for meta links.


## Airports (object)


### Properties
+ `Airport` (Airport, optional) - Array of all available airports or one airport matching the request.


## Meta (object)


### Properties
+ `@Version` (string, optional) 
+ `Link` (array[Link], optional) - Array: links to resource itself and other related resources.
+ `TotalCount` (number, optional) 


## Link (object)


### Properties
+ `@Href` (string, optional) - Link to actual a resource.
+ `@Rel` (string, optional) - Specifying kind of link such as ‘self’ (link that returned this response), ‘alternate’ (link that points to another resource) or ‘related’ (link that points to related resource).


## AirportResponse (object)


### Properties
+ `AirportResource` (AirportResource, optional) - Root element of airport response.


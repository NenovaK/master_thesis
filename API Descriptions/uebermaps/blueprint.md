FORMAT: 1A
HOST: https://uebermaps.com/api/v2

# uebermaps API endpoints
Enable people to store spots on public and private maps

# Group Account

## Account [/account]

### Update account [PATCH]
Update account. Wrap map parameters in [user].

+ Request (application/json)
    + Attributes (UserEditable)


+ Response 200 (application/json)

        Contains user data.

    + Attributes (User)




# Group Attachments

## Attachments By Id [/attachments/{id}]

+ Parameters
    + id (number, required)

        Attachment id{INT}


### Delete attachment [DELETE]
Delete attachment.

+ Response 200 (application/json)

        Contains deleted attachment.

    + Attributes (Attachment)



## Maps Attachments By Id [/maps/{id}/attachments]

+ Parameters
    + id (number, required)

        Map id{INT}


### List attachments for a given map [GET]
List attachments for a given map.

+ Response 200 (application/json)

        Contains list of attachments.

    + Attributes (array[Attachment])


### Upload map attachment [POST]
Upload map attachment. Wrap attachment parameters in [attachment]

+ Request 
    + Attributes (string)


+ Response 200 (application/json)

        Contains attachment data

    + Attributes (Attachment)



## Spots Attachments By Id [/spots/{id}/attachments]

+ Parameters
    + id (number, required)

        Spot id{INT}


### List attachments for a given spot [GET]
List attachments for a given spot.

+ Response 200 (application/json)

        Contains list of attachments.

    + Attributes (array[Attachment])


### Upload spot attachment [POST]
Upload spot attachment. Wrap attachment parameters in [attachment]

+ Request 
    + Attributes (string)


+ Response 200 (application/json)

        Contains attachment data

    + Attributes (Attachment)




# Group Authentication

## Authentication [/authentication]

### Sign in user [POST]
Sign in user. Wrap authentication parameters in [user].

+ Request (application/json)
    + Attributes (UserAuthentication)


+ Response 200 (application/json)

        Contains user data including authentication token for subsequent requests

    + Attributes (UserFullProfile)




# Group CollaboratorInvitations

## Collaborator Invitations [/collaborator_invitations]

### List your collaborator invitations [GET]
List your collaborator invitations.

+ Response 200 (application/json)

        Contains list of collaborator invitations.

    + Attributes (array[CollaboratorInvitation])


### Invite user to collaborate on map [POST]
Invite user to collaborate on map.

+ Request (application/json)
    + Attributes (CollaboratorInvitationCreate)


+ Response 200 (application/json)

        Contains collaborator invitation data.

    + Attributes (CollaboratorInvitation)



## Collaborator Invitations By Id [/collaborator_invitations/{id}]

+ Parameters
    + id (number, required)

        Collaborator invitation id{INT}


### Show collaborator invitation [GET]
Show collaborator invitation

+ Response 200 (application/json)

        Contains collaborator invitation data.

    + Attributes (CollaboratorInvitation)


### Delete collaborator invitation [DELETE]
Delete collaborator invitation.

+ Response 200 (application/json)

        Contains deleted collaborator invitation.

    + Attributes (CollaboratorInvitation)


### Accept collaborator invitation. [PATCH]
Accept collaborator invitation.

+ Response 200 (application/json)

        Contains collaborator invitation data.

    + Attributes (CollaboratorInvitation)




# Group Comments

## Comments By Id [/comments/{id}]

+ Parameters
    + id (number, required)

        Comment id{INT}


### Delete comment [DELETE]
Delete comment.

+ Response 200 (application/json)

        Contains deleted comment.

    + Attributes (Comment)


### Update comment [PATCH]
Update comment. Wrap comment parameters in [comment].

+ Request (application/json)
    + Attributes (CommentEditable)


+ Response 200 (application/json)

        Contains comment data

    + Attributes (Comment)



## Maps Comments By Id [/maps/{id}/comments]

+ Parameters
    + id (number, required)

        Id of map{INT}


### List comments for a given map [GET]
List comments for a given map.

+ Response 200 (application/json)

        Contains list of comments.

    + Attributes (array[Comment])


### Create map comment [POST]
Create map comment. Wrap comment parameters in [comment].

+ Request (application/json)
    + Attributes (CommentEditable)


+ Response 200 (application/json)

        Contains comment data

    + Attributes (Comment)



## Spots Comments By Id [/spots/{id}/comments]

+ Parameters
    + id (number, required)

        Id of spot{INT}


### List comments for a given spot [GET]
List comments for a given spot.

+ Response 200 (application/json)

        Contains list of comments.

    + Attributes (array[Comment])


### Create spot comment [POST]
Create spot comment. Wrap comment parameters in [comment].

+ Request (application/json)
    + Attributes (CommentEditable)


+ Response 200 (application/json)

        Contains comment data

    + Attributes (Comment)




# Group Events

## Events [/events]

### List your own events [GET]
List your own events.
+ Attributes
    + timeframe_start (string, optional)

        Begin of time range of event (ISO 8601 date format).

    + timeframe_end (string, optional)

        End of time range of event (ISO 8601 date format).

    + bounds (string, optional)

        To refine your event index request to contain only events within                                                             a geographical box pass the followng bounds parameters.                                                             F. e. to get events within 'Hamburg, St. Pauli':                                                             bounds[sw_lat]=53.54831449741324                                                             bounds[sw_lon]=9.943227767944336                                                             bounds[ne_lat]=53.5571103674878                                                             bounds[ne_lon]=9.9776029586792


+ Response 200 (application/json)

        Contains list of events.

    + Attributes (array[Event])



## Events By Id [/events/{id}]

+ Parameters
    + id (number, required)

        Id of event{INT}


### Get event [GET]
Get basic information about an event

+ Response 200 (application/json)

        Contains event data.

    + Attributes (Event)


### Delete event [DELETE]
Delete event.

+ Response 200 (application/json)

        Contains deleted event.

    + Attributes (Event)


### Update event [PATCH]
Update event. Wrap event parameters in [event].

+ Request (application/json)
    + Attributes (EventEditable)


+ Response 200 (application/json)

        Contains map data, map settings and your relation to this map

    + Attributes (Map)



## Spots Events By Id [/spots/{id}/events{?timeframe_start,timeframe_end,bounds}]

+ Parameters
    + id (number, required)

        Id of spot{INT}


### List events for a given spot [GET]
List maps for a given spot.
+ Parameters
    + timeframe_start (string, optional)

        Begin of time range of event (ISO 8601 date format).

    + timeframe_end (string, optional)

        End of time range of event (ISO 8601 date format).

    + bounds (string, optional)

        To refine your event index request to contain only events within                                                             a geographical box pass the followng bounds parameters.                                                             F. e. to get events within 'Hamburg, St. Pauli':                                                             bounds[sw_lat]=53.54831449741324                                                             bounds[sw_lon]=9.943227767944336                                                             bounds[ne_lat]=53.5571103674878                                                             bounds[ne_lon]=9.9776029586792


+ Response 200 (application/json)

        Contains list of events.

    + Attributes (array[Event])



## Spots Events By Id [/spots/{id}/events]

+ Parameters
    + id (number, required)

        Spot id{INT}


### Create event [POST]
Create event. Wrap map parameters in [event].

+ Request (application/json)
    + Attributes (EventEditable)


+ Response 200 (application/json)

        Contains event data

    + Attributes (Event)




# Group Maps

## Maps [/maps]

### List your own maps [GET]
List your own maps.

+ Response 200 (application/json)

        Contains list of maps.

    + Attributes (array[Map])


### Create map [POST]
Create map. Wrap map parameters in [map]. To add a map header picture pass a base64 encoded string to [map][picture].

+ Request (application/json)
    + Attributes (MapEditable)


+ Response 200 (application/json)

        Contains map data, map settings and your relation to this map

    + Attributes (Map)



## Maps By Id [/maps/{id}]

+ Parameters
    + id (number, required)

        Id of map{INT}


### Get map [GET]
Get basic information about a map

+ Response 200 (application/json)

        Contains map data, map settings and your relation to this map

    + Attributes (MapWithRelation)


### Delete map [DELETE]
Delete map.

+ Response 200 (application/json)

        Contains deleted map.

    + Attributes (Map)


### Update map [PATCH]
Update map. Wrap map parameters in [map]. To update the map header picture pass a base64 encoded string to [map][picture].

+ Request (application/json)
    + Attributes (MapEditable)


+ Response 200 (application/json)

        Contains map data, map settings and your relation to this map

    + Attributes (Map)



## Users Maps By User Id [/users/{user_id}/maps]

+ Parameters
    + user_id (number, required)

        Id of user{INT}


### List maps for a given user [GET]
List maps for a given user.

+ Response 200 (application/json)

        Contains list of maps.

    + Attributes (array[Map])




# Group Search

## Maps Search [/maps/search]

### Search maps [GET]
Search maps
+ Attributes
    + q (string, optional)

        Query

    + d (number, optional)

        Distance. Diameter of search radius in meter (default: 2000 meter)

    + lat (number, optional)

        Latitude for search radius (default distance: 2000 meter)

    + lon (number, optional)

        Longitude for search radius (default distance: 2000 meter)


+ Response 200 (application/json)

        Contains map data.

    + Attributes (Map)



## Spots Search [/spots/search{?q,d,lat,lon}]

### Search spots [GET]
Search spots
+ Parameters
    + q (string, optional)

        Query

    + d (number, optional)

        Distance. Diameter of search radius in meter (default: 2000 meter)

    + lat (number, optional)

        Latitude for search radius (2 km)

    + lon (number, optional)

        Longitude for search radius (2 km)


+ Response 200 (application/json)

        Contains spot data.

    + Attributes (Spot)



## Users Search [/users/search{?q}]

### Search users [GET]
Search users
+ Parameters
    + q (string, optional)

        Query


+ Response 200 (application/json)

        Contains users data.

    + Attributes (User)




# Group Collaborators

## Maps Collaborators By Id [/maps/{id}/collaborators/]

+ Parameters
    + id (number, required)

        Map id{INT}


### List collaborators of a map [GET]
List collaborators of a map.

+ Response 200 (application/json)

        Contains list of collaborators.

    + Attributes (array[Collaborator])



## Maps Collaborators By Id And User Id [/maps/{id}/collaborators/{user_id}]

+ Parameters
    + id (number, required)

        map id{INT}

    + user_id (number, required)

        user id{INT}


### Delete collaboration [DELETE]
Delete collaboration.

+ Response 200 (application/json)

        Contains deleted collaborator.

    + Attributes (Collaborator)


### Update collaborator [PATCH]
Update collaborator. Wrap collaborator parameters in [collaborator]

+ Request (application/json)
    + Attributes (CollaboratorEditable)


+ Response 200 (application/json)

        Contains collaborator data

    + Attributes (Collaborator)




# Group Respots

## Maps Respots By Id [/maps/{id}/respots]

+ Parameters
    + id (number, required)

        Map Id{INT}


### List respots of a map [GET]
List respots of a map.

+ Response 200 (application/json)

        Contains list of respots.

    + Attributes (array[Respot])



## Maps Spots Respot By Map Id And Spot Id [/maps/{map_id}/spots/{spot_id}/respot]

+ Parameters
    + map_id (number, required)

        Map Id{INT}

    + spot_id (number, required)

        Spot Id{INT}


### Delete respot from map by spot id [DELETE]
Delete respot from map by spot id.

+ Response 200 (application/json)

        Contains deleted respot.

    + Attributes (Respot)



## Respot Maps [/respot_maps]

### List maps that user can respot to [GET]
List maps that user can respot to.

+ Response 200 (application/json)

        Contains list of maps.

    + Attributes (array[Map])



## Respots By Id [/respots/{id}]

+ Parameters
    + id (number, required)

        Id of respot{INT}


### Get respot [GET]
Get basic information about a respot

+ Response 200 (application/json)

        Contains respot data.

    + Attributes (Respot)


### Delete respot [DELETE]
Delete respot.

+ Response 200 (application/json)

        Contains deleted respot.

    + Attributes (Respot)



## Spots Respots By Id [/spots/{id}/respots]

+ Parameters
    + id (number, required)

        Spot Id{INT}


### Respot a spot onto a map [POST]
Respot a spot onto a map.

+ Request 
    + Attributes (number)


+ Response 200 (application/json)

        Contains respot data.

    + Attributes (Respot)




# Group Spots

## Maps Spots By Id [/maps/{id}/spots]

+ Parameters
    + id (number, required)

        Id of map{INT}


### List spots for a given map [GET]
List spots for a given map.
+ Attributes
    + order (enum[string], optional)

        Order of spots

        + Members
            + `created_at_asc` 
            + `created_at_desc` 
            + `updated_at_asc` 
            + `updated_at_desc` 
            + `title_asc` 
            + `title_desc` 


+ Response 200 (application/json)

        Contains list of spots.

    + Attributes (array[Spot])


### Create spot [POST]
Create spot. Wrap parameters in [spot]. To add a spot picture pass a base64 encoded string to [spot][picture].

+ Request (application/json)
    + Attributes (SpotEditable)


+ Response 200 (application/json)

        Contains spot data

    + Attributes (Spot)



## Maps Spots By Map Id And Id [/maps/{map_id}/spots/{id}]

+ Parameters
    + id (number, required)

        Id of spot{INT}

    + map_id (number, required)

        Id of map{INT}


### Get spot [GET]
Get basic information about a spot

+ Response 200 (application/json)

        Contains spot data

    + Attributes (Spot)



## Spots [/spots{?order}]

### List your own spots [GET]
List your own spots.
+ Parameters
    + order (enum[string], optional)

        Order of spots

        + Members
            + `created_at_asc` 
            + `created_at_desc` 
            + `updated_at_asc` 
            + `updated_at_desc` 
            + `title_asc` 
            + `title_desc` 


+ Response 200 (application/json)

        Contains list of spots.

    + Attributes (array[Spot])



## Spots By Id [/spots/{id}]

+ Parameters
    + id (number, required)

        spot id{INT}


### Delete spot [DELETE]
Delete spot.

+ Response 200 (application/json)

        Contains deleted spot.

    + Attributes (Spot)


### Update spot [PATCH]
Update spot. Wrap parameters in [spot]. To update the spot picture pass a base64 encoded string to [spot][picture].

+ Request (application/json)
    + Attributes (SpotEditable)


+ Response 200 (application/json)

        Contains spot data

    + Attributes (Spot)




# Group Subscriptions

## Maps Subscriptions By Id [/maps/{id}/subscriptions]

+ Parameters
    + id (number, required)

        Id of map{INT}


### List subscriptions for a given map [GET]
List subscriptions for a given map.

+ Response 200 (application/json)

        Contains list of subscriptions.

    + Attributes (array[Subscription])


### Unsubscribe from map [DELETE]
Unsubscribe from map.

+ Response 200 (application/json)

        Contains deleted subscription.

    + Attributes (Subscription)



## Subscriptions [/subscriptions{?user_id,map_id}]

### List subscriptions. Pass no parameters to get own subscriptions [GET]
List subscriptions.
+ Parameters
    + user_id (number, optional)

        Id of user

    + map_id (number, optional)

        Id of map


+ Response 200 (application/json)

        Contains list of subscriptions.

    + Attributes (array[Subscription])



## Subscriptions [/subscriptions]

### Create map subscription [POST]
Create map subscription.

+ Request 
    + Attributes (number)


+ Response 200 (application/json)

        Contains subscription data.

    + Attributes (Subscription)




# Group Share

## Share Map By Id [/share/map/{id}]

+ Parameters
    + id (number, required)

        Id of map{INT}


### Get secret access token to share map [GET]
Get secret access token of an uebermap with access set to 'Secret link'. Pass the 'token' on every request you make to access this uebermap and its resources. F.e. token=1-x_gqu7eLBe3uKoAGAGXy

+ Response 200 (application/json)

        Contains map data and a secret token to access this map.

    + Attributes (MapWithAuthToken)




# Group Trends

## Trends Latest [/trends/latest]

### List latest maps [GET]
List latest maps.

+ Response 200 (application/json)

        Contains list of maps.

    + Attributes (array[Map])



## Trends Recommended [/trends/recommended]

### List recommended maps [GET]
List recommended maps.

+ Response 200 (application/json)

        Contains list of maps.

    + Attributes (array[Map])




# Group Users

## Users By Id [/users/{id}]

+ Parameters
    + id (number, required)

        Id of user{INT}


### Get user profile [GET]
Get profile a user

+ Response 200 (application/json)

        Contains user data

    + Attributes (User)




# Data Structures

## Attachment (object)


### Properties
+ `attachable_id`: `7543829` (number, optional) 
+ `attachable_type`: `Spot` (string, optional) 
+ `created_at` (string, optional) 
+ `description`: `This photo was taken in front of the restaurant` (string, optional) 
+ `file_url`: `https://...` (string, optional) 
+ `id`: `34939432` (number, optional) 
+ `map_id`: `985732` (number, optional) 
+ `sizes`: `{
  "large": {
    "h": 860,
    "w": 1024
  }
}` (object, optional) 
+ `spot`: `{
  "large": {
    "h": 860,
    "w": 1024
  }
}` (Spot, optional) 
+ `status`: `{
  "large": {
    "h": 860,
    "w": 1024
  }
}` (enum[string], optional) 
    + `approved`
    + `unapproved`
+ `user`: `{
  "large": {
    "h": 860,
    "w": 1024
  }
}` (User, optional) 


## Spot (object)


### Properties
+ `counts` (SpotCounts, optional) 
+ `created_at` (string, optional) 
+ `description`: `Landed here by accident but look how wonderful this place is in the photos attached` (string, optional) 
+ `id`: `5932234` (number, optional) 
+ `lat`: `53.112385` (number, optional) 
+ `lon`: `10.58349` (number, optional) 
+ `map_id`: `394805` (number, optional) 
+ `picture_url`: `https://...` (string, optional) 
+ `status`: `https://...` (enum[string], optional) 
    + `approved`
    + `unapproved`
+ `time_zone`: `Berlin` (string, optional) 
+ `title`: `Beautiful place out in the country` (string, optional) 
+ `updated_at` (string, optional) 
+ `user` (User, optional) 


## SpotCounts (object)


### Properties
+ `attachments`: `4` (number, optional) 
+ `comments`: `24` (number, optional) 
+ `respot`: `34` (number, optional) 


## User (object)


### Properties
+ `about`: `The comedian` (string, optional) 
+ `counts`: `The comedian` (Counts, optional) 
+ `header_picture`: `https://...` (string, optional) 
+ `id`: `5829035` (number, optional) 
+ `location`: `Little Rock, Arkansas` (string, optional) 
+ `name`: `Bill Hicks` (string, optional) 
+ `picture_url`: `https://...` (string, optional) 
+ `screen_name`: `billhicks` (string, optional) 
+ `url`: `http://www.billhicks.com` (string, optional) 


## Counts (object)


### Properties
+ `maps`: `24` (number, optional) 


## Collaborator (object)


### Properties
+ `created_at` (string, optional) 
+ `group` (enum[string], optional) 
    + `admin`
    + `editor`
+ `id`: `4829504` (number, optional) 
+ `is_admin`: `false` (boolean, optional) 
+ `map`: `false` (Map, optional) 
+ `map_id`: `324894` (number, optional) 
+ `updated_at` (string, optional) 
+ `user` (User, optional) 
+ `user_id`: `649302` (number, optional) 


## Map (object)


### Properties
+ `counts` (MapCounts, optional) 
+ `created_at` (string, optional) 
+ `description`: `A collection of restaurants, cafes, clubs and random spots that I recommend in Berlin` (string, optional) 
+ `id`: `18234843` (number, optional) 
+ `map_settings`: `18234843` (MapSettings, optional) 
+ `owner_id`: `9829358` (number, optional) 
+ `picture_url`: `https://...` (string, optional) 
+ `title`: `My favourite places in Berlin` (string, optional) 
+ `updated_at` (string, optional) 
+ `visibility` (enum[string], optional) 
    + `public`
    + `link`
    + `private`


## MapCounts (object)


### Properties
+ `attachments`: `31` (number, optional) 
+ `comments`: `234` (number, optional) 
+ `impressions`: `234332` (number, optional) 
+ `respots`: `24` (number, optional) 
+ `spots`: `67` (number, optional) 
+ `subscriptions`: `3892` (number, optional) 


## MapSettings (object)


### Properties
+ `editor_access`: `[
  "can_administer.map",
  "can_administer.spots",
  "can_administer.events",
  "can_administer.comments",
  "can_administer.attachments",
  "can_administer.collaborators"
]` (string, optional) 
+ `respotting_to_this_map`: `true` (boolean, optional) 
+ `visitor_access`: `[
  "can_administer.map",
  "can_administer.spots",
  "can_administer.events",
  "can_administer.comments",
  "can_administer.attachments",
  "can_administer.collaborators"
]` (string, optional) 


## CollaboratorEditable (object)


### Properties
+ `group` (enum[string], optional) 
    + `admin`
    + `editor`


## CollaboratorInvitation (object)


### Properties
+ `accepted`: `true` (boolean, optional) 
+ `created_at` (string, optional) 
+ `email`: `a@b.com` (string, optional) 
+ `group`: `a@b.com` (enum[string], optional) 
    + `admin`
    + `editor`
+ `id`: `8696493` (number, optional) 
+ `invited_by_user`: `8696493` (User, optional) 
+ `map`: `8696493` (Map, optional) 
+ `sent`: `true` (boolean, optional) 
+ `updated_at` (string, optional) 
+ `user` (User, optional) 


## CollaboratorInvitationCreate (object)


### Properties
+ `emails`: `a@b.com, c@d.com, e@f.com` (string, optional) 
+ `is_admin`: `true` (boolean, optional) 
+ `map_id`: `34925783` (number, optional) 
+ `user_ids`: `5839459, 389423, 89494, 686950` (string, optional) 


## Comment (object)


### Properties
+ `body`: `Nice photo` (string, optional) 
+ `created_at` (string, optional) 
+ `id`: `29628358` (number, optional) 
+ `status`: `29628358` (enum[string], optional) 
    + `approved`
    + `unapproved`
+ `updated_at` (string, optional) 
+ `user` (User, optional) 


## CommentEditable (object)


### Properties
+ `body`: `Nice photo` (string, optional) 


## Event (object)


### Properties
+ `counts` (EventCounts, optional) 
+ `created_at` (string, optional) 
+ `description`: `Very special event` (string, optional) 
+ `ends_at` (string, optional) 
+ `id`: `482959` (number, optional) 
+ `lat`: `53.293493` (number, optional) 
+ `lon`: `12.394328` (number, optional) 
+ `owner_id`: `82389429` (number, optional) 
+ `picture_url`: `https://...` (string, optional) 
+ `spot`: `https://...` (Spot, optional) 
+ `starts_at` (string, optional) 
+ `time_zone`: `Berlin` (string, optional) 
+ `title`: `20th anniversary event` (string, optional) 
+ `updated_at` (string, optional) 
+ `user` (User, optional) 


## EventCounts (object)


### Properties
+ `attachments`: `27` (number, optional) 
+ `comments`: `284` (number, optional) 


## EventEditable (object)


### Properties
+ `description`: `Very special event` (string, optional) 
+ `ends_at` (string, optional) 
+ `lat`: `53.293493` (number, optional) 
+ `lon`: `12.394328` (number, optional) 
+ `picture`: `<BASE_64_ENCODED_STRING>` (string, optional) 
+ `starts_at` (string, optional) 
+ `time_zone`: `Berlin` (string, optional) 
+ `title`: `20th anniversary event` (string, optional) 
+ `user_id`: `703943` (number, optional) 


## MapEditable (object)


### Properties
+ `description`: `A collection of restaurants, cafes, clubs and random spots that I recommend in Berlin` (string, optional) 
+ `map_settings`: `A collection of restaurants, cafes, clubs and random spots that I recommend in Berlin` (MapSettings, optional) 
+ `picture`: `<BASE_64_ENCODED_STRING>` (string, optional) 
+ `title`: `My favourite places in Berlin` (string, optional) 
+ `visibility`: `My favourite places in Berlin` (enum[string], optional) 
    + `public`
    + `link`
    + `private`


## MapRelation (object)


### Properties
+ `access`: `[
  "can_administer.map",
  "can_administer.spots",
  "can_administer.events",
  "can_administer.comments",
  "can_administer.attachments",
  "can_administer.collaborators"
]` (string, optional) 
+ `access_group`: `[
  "can_administer.map",
  "can_administer.spots",
  "can_administer.events",
  "can_administer.comments",
  "can_administer.attachments",
  "can_administer.collaborators"
]` (enum[string], optional) 
    + `visitor`
    + `editor`
    + `admin`
+ `subscribed`: `true` (boolean, optional) 


## MapWithAuthToken (object)


### Properties
+ `counts` (MapCounts, optional) 
+ `created_at` (string, optional) 
+ `description`: `A collection of restaurants, cafes, clubs and random spots that I recommend in Berlin` (string, optional) 
+ `id`: `18234843` (number, optional) 
+ `owner_id`: `9829358` (number, optional) 
+ `picture_url`: `https://...` (string, optional) 
+ `title`: `My favourite places in Berlin` (string, optional) 
+ `token`: `1-x_gqu7eLBe3uKoAGAGXy` (string, optional) 
+ `updated_at` (string, optional) 
+ `visibility` (enum[string], optional) 
    + `public`
    + `link`
    + `private`


## MapWithRelation (object)


### Properties
+ `counts` (MapCounts, optional) 
+ `created_at` (string, optional) 
+ `description`: `A collection of restaurants, cafes, clubs and random spots that I recommend in Berlin` (string, optional) 
+ `id`: `18234843` (number, optional) 
+ `map_settings`: `18234843` (MapSettings, optional) 
+ `owner_id`: `9829358` (number, optional) 
+ `picture_url`: `https://...` (string, optional) 
+ `relation`: `https://...` (MapRelation, optional) 
+ `title`: `My favourite places in Berlin` (string, optional) 
+ `updated_at` (string, optional) 
+ `visibility` (enum[string], optional) 
    + `public`
    + `link`
    + `private`


## Respot (object)


### Properties
+ `created_at` (string, optional) 
+ `id`: `589032` (number, optional) 
+ `map`: `589032` (Map, optional) 
+ `map_id`: `8393450` (number, optional) 
+ `spot`: `8393450` (Spot, optional) 
+ `updated_at` (string, optional) 
+ `user` (User, optional) 


## SpotEditable (object)


### Properties
+ `description`: `Landed here by accident but look how wonderful this place is in the photos attached` (string, optional) 
+ `lat`: `53.112385` (number, optional) 
+ `lon`: `10.58349` (number, optional) 
+ `picture`: `<BASE_64_ENCODED_STRING>` (string, optional) 
+ `time_zone`: `Berlin` (string, optional) 
+ `title`: `Beautiful place out in the country` (string, optional) 


## Subscription (object)


### Properties
+ `created_at` (string, optional) 
+ `id`: `23950552` (number, optional) 
+ `map`: `23950552` (Map, optional) 
+ `updated_at` (string, optional) 
+ `user` (User, optional) 
+ `user_id`: `852002` (number, optional) 


## UserAuthentication (object)


### Properties
+ `email`: `a@b.com` (string, optional) 
+ `password`: `••••••••` (string, optional) 


## UserEditable (object)


### Properties
+ `about`: `The comedian` (string, optional) 
+ `header`: `<BASE_64_ENCODED_STRING>` (string, optional) 
+ `language`: `en` (string, optional) 
+ `location`: `Little Rock, Arkansas` (string, optional) 
+ `name`: `Bill Hicks` (string, optional) 
+ `picture`: `<BASE_64_ENCODED_STRING>` (string, optional) 
+ `screen_name`: `billhicks` (string, optional) 
+ `time_zone`: `Pacific Time (US & Canada)` (string, optional) 
+ `url`: `http://www.billhicks.com` (string, optional) 


## UserFullProfile (User)


### Properties
+ `auth_token`: `6g8as82h3kj23h2` (string, optional) 
+ `language`: `en` (string, optional) 
+ `time_zone`: `Pacific Time (US & Canada)` (string, optional) 


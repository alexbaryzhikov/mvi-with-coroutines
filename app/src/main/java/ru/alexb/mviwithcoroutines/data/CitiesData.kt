package ru.alexb.mviwithcoroutines.data

val cities: Set<String> = """
  Abbeville
  Abbeville
  Aberdeen
  Aberdeen
  Aberdeen
  Abilene
  Abilene
  Abingdon
  Abington
  Abington
  Acoma
  Ada
  Adams
  Adrian
  Aiken
  Ajo
  Akron
  Alameda
  Alamogordo
  Alamosa
  Albany
  Albany
  Albany
  Albert Lea
  Albuquerque
  Alcoa
  Alexander City
  Alexandria
  Alexandria
  Alexandria
  Alhambra
  Aliquippa
  Allentown
  Alliance
  Alma
  Alpine
  Alta
  Alton
  Altoona
  Altus
  Alva
  Amana Colonies
  Amarillo
  Ambridge
  American Fork
  Americus
  Ames
  Amesbury
  Amherst
  Amsterdam
  Anaconda
  Anacortes
  Anadarko
  Anaheim
  Anchorage
  Andalusia
  Anderson
  Anderson
  Andersonville
  Andover
  Ann Arbor
  Annapolis
  Anniston
  Ansonia
  Antioch
  Apalachicola
  Appleton
  Arcadia
  Ardmore
  Arkadelphia
  Arkansas City
  Arkansas Post
  Arlington
  Arlington
  Arlington Heights
  Artesia
  Arthur
  Asbury Park
  Asheboro
  Asheville
  Ashland
  Ashland
  Ashland
  Ashtabula
  Aspen
  Astoria
  Atchison
  Athens
  Athens
  Athens
  Athens
  Athol
  Atlanta
  Atlantic City
  Atmore
  Attleboro
  Auburn
  Auburn
  Auburn
  Auburn
  Augusta
  Augusta
  Aurora
  Aurora
  Austin
  Austin
  Avondale
  Babylon
  Bainbridge
  Baker City
  Bakersfield
  Baltimore
  Bangor
  Bar Harbor
  Baraboo
  Barberton
  Barbourville
  Bardstown
  Barnstable
  Barre
  Barrington
  Barstow
  Bartlesville
  Bartow
  Bastrop
  Batavia
  Batesville
  Bath
  Bath
  Bath
  Baton Rouge
  Battle Creek
  Bay City
  Bay Saint Louis
  Bayonne
  Baytown
  Beacon
  Beatrice
  Beaufort
  Beaufort
  Beaumont
  Beaverton
  Beckley
  Bedford
  Bedford
  Bedford
  Bedford
  Bedford
  Belen
  Belfast
  Belle Fourche
  Belle Glade
  Bellefontaine
  Belleville
  Bellevue
  Bellevue
  Bellingham
  Bellows Falls
  Belmont
  Belmont
  Beloit
  Belvidere
  Bemidji
  Bend
  Bennington
  Benton
  Benton Harbor
  Berea
  Berkeley
  Berlin
  Berlin
  Bessemer
  Bethany
  Bethesda-Chevy Chase
  Bethlehem
  Beverly
  Beverly Hills
  Biddeford
  Big Spring
  Billings
  Biloxi
  Binghamton
  Birmingham
  Bisbee
  Bismarck
  Blackfoot
  Blairsville
  Bloomfield
  Bloomfield
  Bloomfield Hills
  Bloomington
  Bloomington
  Bloomington
  Bloomsburg
  Bluefield
  Blytheville
  Boca Raton
  Bogalusa
  Boise
  Bonners Ferry
  Boone
  Boone
  Boonesborough
  Boonville
  Boothbay Harbor
  Bordentown
  Borger
  Bossier City
  Boston
  Boulder
  Boulder City
  Bound Brook
  Bountiful
  Bourne
  Bowie
  Bowling Green
  Bowling Green
  Boys Town
  Bozeman
  Bradenton
  Bradford
  Brainerd
  Braintree
  Branford
  Branson
  Brattleboro
  Brea
  Breckenridge
  Bremerton
  Bridgeport
  Bridgeton
  Brigham City
  Brighton
  Bristol
  Bristol
  Bristol
  Bristol
  Brockton
  Bronx
  Brookfield
  Brookings
  Brookings
  Brookline
  Brooklyn
  Brownsville
  Brunswick
  Brunswick
  Bryan
  Buckhannon
  Buena Park
  Buffalo
  Buffalo
  Burbank
  Burlington
  Burlington
  Burlington
  Burlington
  Burns
  Butte
  Cadillac
  Cahokia
  Cairo
  Calais
  Caldwell
  Caldwell
  Calexico
  Calhoun
  Calistoga
  Calumet City
  Cambridge
  Cambridge
  Camden
  Camden
  Camden
  Campbellsville
  Canon City
  Canton
  Canton
  Canton
  Canton
  Canton
  Canyon
  Cape Coral
  Cape Girardeau
  Cape May
  Carbondale
  Carbondale
  Caribou
  Carlinville
  Carlisle
  Carlsbad
  Carlsbad
  Carmel
  Carrollton
  Carson City
  Carthage
  Carthage
  Casa Grande
  Casper
  Castine
  Catonsville
  Cedar City
  Cedar Falls
  Cedar Rapids
  Central City
  Central Falls
  Centralia
  Centralia
  Chadron
  Chambersburg
  Champaign
  Chandler
  Chanute
  Chapel Hill
  Charles City
  Charles Town
  Charleston
  Charleston
  Charleston
  Charlestown
  Charlevoix
  Charlotte
  Charlottesville
  Chattanooga
  Chautauqua
  Cheboygan
  Cheektowaga
  Chelmsford
  Chelsea
  Cherokee
  Chesapeake
  Chester
  Chester
  Cheyenne
  Chicago
  Chicago Heights
  Chickasaw
  Chickasha
  Chico
  Chicopee
  Chillicothe
  Chillicothe
  Chula Vista
  Cicero
  Cincinnati
  Clanton
  Claremont
  Claremont
  Claremore
  Clarksburg
  Clarksdale
  Clarksville
  Clayton
  Clearfield
  Clearwater
  Cleburne
  Cleveland
  Cleveland
  Cleveland Heights
  Clifton
  Clifton
  Climax
  Clinton
  Clinton
  Clinton
  Clinton
  Clovis
  Cocoa Beach
  Cocoa-Rockledge
  Cody
  Coeur d’Alene
  Coffeyville
  Cohasset
  Cohoes
  College Park
  College Station
  Collinsville
  Colorado Springs
  Columbia
  Columbia
  Columbia
  Columbia
  Columbia
  Columbia
  Columbus
  Columbus
  Columbus
  Columbus
  Columbus
  Compton
  Concord
  Concord
  Concord
  Concord
  Coney Island
  Conneaut
  Connersville
  Conway
  Cookeville
  Cooperstown
  Coos Bay
  Coral Gables
  Cordova
  Corinth
  Corning
  Corona
  Coronado
  Corpus Christi
  Cortez
  Cortland
  Corvallis
  Corydon
  Costa Mesa
  Coulee Dam
  Council Bluffs
  Council Grove
  Coupeville
  Coventry
  Covington
  Cranford
  Cranston
  Crawfordsville
  Cripple Creek
  Crookston
  Crossett
  Crown Point
  Crystal City
  Cullman
  Culver City
  Cumberland
  Cushing
  Custer
  Cuyahoga Falls
  Dahlonega
  Dallas
  Dalton
  Daly City
  Danbury
  Danvers
  Danville
  Danville
  Danville
  Darien
  Darien
  Darlington
  Dartmouth
  Davenport
  Davis
  Dayton
  Dayton
  Daytona Beach
  De Land
  De Smet
  Deadwood
  Dearborn
  Decatur
  Decatur
  Decatur
  Dedham
  Deerfield Beach
  Defiance
  DeKalb
  Del Rio
  Delaware
  Delray Beach
  Delta
  Deming
  Demopolis
  Denison
  Dennis
  Denton
  Denver
  Derby
  Derry
  Des Moines
  Des Plaines
  Detroit
  Devils Lake
  Dickinson
  Dillon
  Dixon
  Dodge City
  Dothan
  Douglas
  Douglas
  Douglas
  Dover
  Dover
  Downey
  Dubuque
  Duluth
  Duncan
  Dunkirk
  Durango
  Durant
  Durham
  Durham
  Duxbury
  Eagle Pass
  East Aurora
  East Chicago
  East Cleveland
  East Greenwich
  East Hampton
  East Hartford
  East Haven
  East Lansing
  East Liverpool
  East Moline
  East Orange
  East Point
  East Providence
  East Saint Louis
  Eastchester
  Eastham
  Easton
  Easton
  Eastpointe
  Eastport
  Eau Claire
  Ecorse
  Edenton
  Edgartown
  Edinburg
  Edison
  Edmond
  Effingham
  El Centro
  El Cerrito
  El Dorado
  El Monte
  El Paso
  El Reno
  Elgin
  Elizabeth
  Elizabeth City
  Elizabethton
  Elizabethtown
  Elk City
  Elkhart
  Elkins
  Elko
  Elkton
  Ellensburg
  Ellsworth
  Elmhurst
  Elmira
  Elwood
  Ely
  Ely
  Elyria
  Emmitsburg
  Emporia
  Enfield
  Englewood
  Englewood
  Enid
  Enterprise
  Ephrata
  Erie
  Escanaba
  Escondido
  Essex
  Estes Park
  Estherville
  Euclid
  Eufaula
  Eufaula
  Eugene
  Eureka
  Evanston
  Evanston
  Evansville
  Eveleth
  Everett
  Everett
  Excelsior Springs
  Exeter
  Fairbanks
  Fairfax
  Fairfield
  Fairfield
  Fairfield
  Fairhaven
  Fairmont
  Fall River
  Fallon
  Falls Church
  Falmouth
  Fargo
  Faribault
  Farmington
  Farmington
  Farmington
  Fayetteville
  Fayetteville
  Fergus Falls
  Ferguson
  Fernandina Beach
  Fillmore
  Findlay
  Fitchburg
  Fitzgerald
  Flagstaff
  Flint
  Florence
  Florence
  Florence
  Florissant
  Flushing
  Fond du Lac
  Fontana
  Forest Hills
  Forrest City
  Fort Benton
  Fort Collins
  Fort Dodge
  Fort Kent
  Fort Lauderdale
  Fort Lee
  Fort Morgan
  Fort Myers
  Fort Payne
  Fort Pierce
  Fort Scott
  Fort Smith
  Fort Valley
  Fort Walton Beach
  Fort Wayne
  Fort Worth
  Framingham
  Frankfort
  Franklin
  Franklin
  Franklin
  Frederick
  Frederick
  Fredericksburg
  Fredonia
  Freeport
  Freeport
  Fremont
  Fremont
  French Lick
  Fresno
  Fullerton
  Fulton
  Gadsden
  Gaffney
  Gainesville
  Gainesville
  Galena
  Galesburg
  Gallatin
  Gallipolis
  Gallup
  Galveston
  Garden City
  Garden City
  Garden Grove
  Gardiner
  Garland
  Gary
  Gastonia
  Gatlinburg
  Geneva
  Geneva
  Genoa
  Georgetown
  Georgetown
  Germantown
  Gettysburg
  Gila Bend
  Gillette
  Glassboro
  Glen Ellyn
  Glendale
  Glendale
  Glendive
  Glens Falls
  Glenview
  Glenwood Springs
  Globe
  Gloucester
  Gloversville
  Golden
  Goldfield
  Goldsboro
  Goliad
  Goshen
  Grafton
  Grand Forks
  Grand Haven
  Grand Island
  Grand Junction
  Grand Rapids
  Granite City
  Grants
  Grants Pass
  Grayling
  Great Barrington
  Great Bend
  Great Falls
  Great Neck
  Greeley
  Green Bay
  Green River
  Green River
  Greenbelt
  Greeneville
  Greenfield
  Greenfield
  Greensboro
  Greensburg
  Greenville
  Greenville
  Greenville
  Greenville
  Greenville
  Greenville
  Greenwich
  Greenwood
  Greenwood
  Grenada
  Gretna
  Grinnell
  Grosse Pointe
  Groton
  Groton
  Guilford
  Gulfport
  Gunnison
  Guntersville
  Guthrie
  Guymon
  Hackensack
  Haddonfield
  Hagerstown
  Haines
  Halifax
  Hallandale Beach
  Hamden
  Hamilton
  Hammond
  Hammondsport
  Hampton
  Hanalei
  Hancock
  Hannibal
  Hanover
  Hanover
  Hanover
  Harlan
  Harlem
  Harlingen
  Harmony
  Harpers Ferry
  Harrisburg
  Harrisburg
  Harrison
  Harrodsburg
  Hartford
  Hartsville
  Harwich
  Hastings
  Hastings
  Hattiesburg
  Haverhill
  Havre
  Hays
  Hayward
  Hayward
  Hazard
  Hazleton
  Heber City
  Helena
  Helena
  Hempstead
  Henderson
  Henderson
  Henderson
  Herkimer
  Herrin
  Hershey
  Hialeah
  Hibbing
  Hickory
  High Point
  Highland Park
  Highland Park
  Hillsboro
  Hillsboro
  Hillsborough
  Hillsborough
  Hilo
  Hingham
  Hinton
  Hobart
  Hobart
  Hobbs
  Hoboken
  Hodgenville
  Holdenville
  Holland
  Holly Springs
  Hollywood
  Hollywood
  Holyoke
  Homer
  Homestead
  Homestead
  Honaunau
  Honesdale
  Honolulu
  Hood River
  Hope
  Hopewell
  Hopkinsville
  Hoquiam
  Hot Springs
  Hot Springs
  Houghton
  Houlton
  Houma
  Houston
  Hudson
  Hugo
  Huntington
  Huntington
  Huntington
  Huntington Beach
  Huntsville
  Huntsville
  Huron
  Hutchinson
  Hyannis
  Hyattsville
  Hyde Park
  Idaho City
  Idaho Falls
  Ilion
  Independence
  Independence
  Indiana
  Indianapolis
  Indianola
  Indio
  Inglewood
  Interlochen
  International Falls
  Iowa City
  Ipswich
  Iron Mountain
  Ironwood
  Irvine
  Irving
  Irvington
  Ishpeming
  Ithaca
  Jackson
  Jackson
  Jackson
  Jackson
  Jacksonville
  Jacksonville
  Jacksonville
  Jacksonville
  Jacksonville
  Jamestown
  Jamestown
  Janesville
  Jasper
  Jeannette
  Jefferson City
  Jeffersonville
  Jersey City
  Jim Thorpe
  John Day
  Johnson City
  Johnson City
  Johnstown
  Johnstown
  Joliet
  Jonesboro
  Jonesborough
  Joplin
  Junction City
  Juneau
  Kahului
  Kalamazoo
  Kalispell
  Kanab
  Kaneohe
  Kankakee
  Kansas City
  Kansas City
  Kapaa
  Kaskaskia
  Kawaihae
  Kearney
  Keene
  Kellogg
  Kelso
  Kennebunkport
  Kennewick
  Kenosha
  Kent
  Keokuk
  Ketchikan
  Kettering
  Kewanee
  Key West
  Keyser
  Kilgore
  Killeen
  Kingman
  Kingsport
  Kingston
  Kingston
  Kingsville
  Kinston
  Kirksville
  Kittery
  Kitty Hawk
  Klamath Falls
  Knoxville
  Kodiak
  Kokomo
  Kotzebue
  La Crosse
  La Grande
  La Grange
  La Habra
  La Junta
  La Salle
  Lackawanna
  Laconia
  Lafayette
  Lafayette
  Laguna Beach
  Lahaina
  Laie
  Lake Charles
  Lake City
  Lake Forest
  Lake Geneva
  Lake Havasu City
  Lake Oswego
  Lake Placid
  Lake Wales
  Lakehurst
  Lakeland
  Lakeview
  Lakewood
  Lakewood
  Lamar
  Lancaster
  Lancaster
  Lancaster
  Lancaster
  Lander
  Lansing
  Laramie
  Laredo
  Largo
  Las Cruces
  Las Vegas
  Las Vegas
  Laurel
  Laurel
  Lawrence
  Lawrence
  Lawton
  Layton
  Lead
  Leadville
  Leavenworth
  Lebanon
  Lebanon
  Lebanon
  Lebanon
  Lebanon
  Lehi
  Lenox
  Leominster
  Levittown
  Levittown
  Lewes
  Lewisburg
  Lewiston
  Lewiston
  Lewistown
  Lewistown
  Lexington
  Lexington
  Lexington
  Lexington
  Liberal
  Libertyville
  Lima
  Lincoln
  Lincoln
  Lisle
  Litchfield
  Little Falls
  Little Rock
  Littleton
  Livermore
  Livingston
  Livonia
  Lock Haven
  Lockport
  Lodi
  Logan
  Logan
  Lombard
  Lompoc
  Long Beach
  Long Beach
  Long Branch
  Longmont
  Longview
  Longview
  Lorain
  Los Alamos
  Los Angeles
  Louisville
  Loveland
  Lovington
  Lowell
  Lower Southampton
  Lubbock
  Lubec
  Ludington
  Ludlow
  Lufkin
  Lumberton
  Lynchburg
  Lynn
  Machias
  Mackinaw City
  Macomb
  Macon
  Madison
  Madison
  Madison
  Madison
  Magnolia
  Malden
  Malibu
  Mamaroneck
  Manassas
  Manchester
  Manchester
  Manchester
  Mandan
  Manhattan
  Manhattan
  Manistee
  Manitowoc
  Mankato
  Mansfield
  Mansfield
  Manti
  Marblehead
  Marietta
  Marietta
  Marinette
  Marion
  Marion
  Marion
  Marlborough
  Marquette
  Marshall
  Martinez
  Martins Ferry
  Martinsburg
  Martinsville
  Marysville
  Maryville
  Maryville
  Mason City
  Massena
  Massillon
  Mattoon
  Mayfield
  Maysville
  McAlester
  McAllen
  McCook
  McKeesport
  McKinney
  McMinnville
  McPherson
  Meadville
  Medford
  Medford
  Medicine Lodge
  Melbourne
  Memphis
  Menasha
  Menlo Park
  Menlo Park
  Menominee
  Mentor
  Merced
  Meriden
  Meridian
  Mesa
  Mesquite
  Mexico
  Miami
  Miami
  Miami Beach
  Michigan City
  Middlebury
  Middlesboro
  Middletown
  Middletown
  Middletown
  Middletown
  Middletown
  Midland
  Midland
  Midwest City
  Milan
  Milbank
  Miles City
  Milford
  Milford
  Millburn
  Milledgeville
  Millville
  Milton
  Milwaukee
  Minden
  Mineola
  Minneapolis
  Minot
  Mishawaka
  Mission
  Missoula
  Mitchell
  Moab
  Mobile
  Mobridge
  Modesto
  Moline
  Monett
  Monmouth
  Monroe
  Monroe
  Monroeville
  Montclair
  Monterey
  Montgomery
  Monticello
  Montpelier
  Montrose
  Moore
  Moorhead
  Morehead City
  Morgan City
  Morganton
  Morgantown
  Morrilton
  Morristown
  Morristown
  Moscow
  Moses Lake
  Moundsville
  Mount Clemens
  Mount Holly
  Mount Pleasant
  Mount Pleasant
  Mount Pleasant
  Mount Vernon
  Mount Vernon
  Mount Vernon
  Mountain View
  Muncie
  Mundelein
  Murfreesboro
  Murray
  Muscatine
  Muskegon
  Muskogee
  Myrtle Beach
  Mystic
  Nacogdoches
  Nags Head
  Nahant
  Nampa
  Nanticoke
  Napa
  Naperville
  Naples
  Nappanee
  Narragansett
  Nashua
  Nashville
  Nashville
  Natchez
  Natchitoches
  Natick
  Naugatuck
  Nauvoo
  Nebraska City
  Needles
  Neenah
  Neosho
  Nephi
  New Albany
  New Bedford
  New Bern
  New Braunfels
  New Britain
  New Brunswick
  New Castle
  New Castle
  New Castle
  New Glarus
  New Harmony
  New Haven
  New Hope
  New Iberia
  New Kensington
  New London
  New Madrid
  New Market
  New Martinsville
  New Milford
  New Orleans
  New Paltz
  New Philadelphia
  New Rochelle
  New Smyrna Beach
  New Ulm
  New Windsor
  New York City
  Newark
  Newark
  Newark
  Newberg
  Newburgh
  Newburyport
  Newcastle
  Newport
  Newport
  Newport
  Newport
  Newport
  Newport Beach
  Newport News
  Newton
  Newton
  Newton
  Niagara Falls
  Niles
  Niles
  Nogales
  Nome
  Norfolk
  Norfolk
  Normal
  Norman
  Norris
  Norristown
  North Adams
  North Chicago
  North College Hill
  North Haven
  North Hempstead
  North Kingstown
  North Las Vegas
  North Little Rock
  North Platte
  Northampton
  Northfield
  Norton
  Norwalk
  Norwalk
  Norwalk
  Norwich
  Norwood
  Novato
  Nyack
  Oak Harbor
  Oak Park
  Oak Ridge
  Oakland
  Oakland
  Oberlin
  Ocala
  Ocean City
  Ocean City
  Ocean Springs
  Oceanside
  Oconto
  Odessa
  Ogden
  Ogdensburg
  Oil City
  Ojai
  Oklahoma City
  Okmulgee
  Olathe
  Old Saybrook
  Olean
  Olympia
  Omaha
  Oneida
  Oneonta
  Ontario
  Ontario
  Opelika
  Opelousas
  Oraibi
  Orange
  Orange
  Orange
  Orange
  Orangeburg
  Orderville
  Oregon
  Oregon City
  Orem
  Orlando
  Ormond Beach
  Orono
  Oroville
  Osawatomie
  Osceola
  Oshkosh
  Oskaloosa
  Ossining
  Oswego
  Ottawa
  Ottawa
  Ottumwa
  Ouray
  Overland Park
  Owatonna
  Owensboro
  Oxford
  Oxnard
  Oyster Bay
  Ozark
  Pacific Grove
  Paducah
  Pagosa Springs
  Painesville
  Palatine
  Palatka
  Palm Bay
  Palm Beach
  Palm Springs
  Palmdale
  Palmer
  Palmyra
  Palo Alto
  Pampa
  Panama City
  Panguitch
  Paris
  Paris
  Park City
  Park Forest
  Park Ridge
  Parkersburg
  Parma
  Parsippany–Troy Hills
  Pasadena
  Pasadena
  Pascagoula
  Pasco
  Pass Christian
  Passaic
  Paterson
  Pauls Valley
  Pawhuska
  Pawtucket
  Payson
  Peabody
  Pecos
  Peekskill
  Pekin
  Pendleton
  Pensacola
  Peoria
  Perry
  Perth Amboy
  Peru
  Peshtigo
  Petaluma
  Peterborough
  Petersburg
  Petersburg
  Petoskey
  Pharr
  Phenix City
  Philadelphia
  Philadelphia
  Philippi
  Phoenix
  Phoenixville
  Pierre
  Pine Bluff
  Pinehurst
  Pipestone
  Piqua
  Pittsburg
  Pittsburgh
  Pittsfield
  Plainfield
  Plains
  Plainview
  Plano
  Plattsburgh
  Plattsmouth
  Plymouth
  Plymouth
  Plymouth
  Plymouth
  Pocatello
  Point Pleasant
  Point Roberts
  Pomona
  Pompano Beach
  Ponca City
  Pontiac
  Pontiac
  Port Angeles
  Port Arthur
  Port Gibson
  Port Hueneme
  Port Huron
  Port Lavaca
  Port Orford
  Port Washington
  Portage
  Portales
  Portland
  Portland
  Portsmouth
  Portsmouth
  Portsmouth
  Portsmouth
  Potsdam
  Pottstown
  Pottsville
  Poughkeepsie
  Powell
  Prairie du Chien
  Prescott
  Presque Isle
  Price
  Prichard
  Priest River
  Princeton
  Princeton
  Prineville
  Providence
  Provincetown
  Provo
  Pryor
  Pueblo
  Pullman
  Put-in-Bay
  Puyallup
  Queens
  Quincy
  Quincy
  Racine
  Raleigh
  Rancho Cucamonga
  Randolph
  Rantoul
  Rapid City
  Raton
  Rawlins
  Reading
  Red Bluff
  Red Cloud
  Red Wing
  Redding
  Redlands
  Redmond
  Redmond
  Redondo Beach
  Redwood City
  Reedsport
  Reno
  Rensselaer
  Renton
  Reston
  Revere
  Rexburg
  Rhinelander
  Richardson
  Richland
  Richmond
  Richmond
  Richmond
  Richmond
  Ridgewood
  Ripon
  River Forest
  Riverside
  Riverton
  Roanoke
  Rochester
  Rochester
  Rochester
  Rock Hill
  Rock Island
  Rock Springs
  Rockford
  Rockland
  Rockville
  Rocky Mount
  Rogers
  Rolla
  Rome
  Rome
  Romney
  Roseburg
  Roselle
  Roseville
  Roswell
  Rotterdam
  Royal Oak
  Rugby
  Rumford
  Ruston
  Rutherford
  Rutland
  Rye
  Saco
  Sacramento
  Sag Harbor
  Saginaw
  Saint Albans
  Saint Augustine
  Saint Charles
  Saint Cloud
  Saint George
  Saint Ignace
  Saint Johnsbury
  Saint Joseph
  Saint Joseph
  Saint Louis
  Saint Martinville
  Saint Marys City
  Saint Paul
  Saint Petersburg
  Sainte Genevieve
  Salem
  Salem
  Salem
  Salem
  Salem
  Salem
  Salem
  Salina
  Salinas
  Salisbury
  Salisbury
  Sallisaw
  Salt Lake City
  San Angelo
  San Antonio
  San Bernardino
  San Clemente
  San Diego
  San Felipe
  San Fernando
  San Francisco
  San Gabriel
  San Jose
  San Juan Capistrano
  San Leandro
  San Luis Obispo
  San Marcos
  San Marino
  San Mateo
  San Pedro
  San Rafael
  San Simeon
  Sand Springs
  Sandusky
  Sandwich
  Sanford
  Santa Ana
  Santa Barbara
  Santa Clara
  Santa Clarita
  Santa Claus
  Santa Cruz
  Santa Fe
  Santa Monica
  Santa Rosa
  Sapulpa
  Saranac Lake
  Sarasota
  Saratoga Springs
  Saugus
  Sauk Centre
  Sault Sainte Marie
  Sausalito
  Savannah
  Scarborough
  Scarsdale
  Schenectady
  Scottsboro
  Scottsdale
  Scranton
  Searcy
  Seaside
  Seattle
  Sebring
  Sedalia
  Selma
  Seminole
  Seneca Falls
  Seward
  Seymour
  Shaker Heights
  Shamokin
  Sharon
  Sharon
  Shawnee
  Shawnee
  Shawneetown
  Sheboygan
  Sheffield
  Shelby
  Shelbyville
  Shelbyville
  Shelton
  Shepherdstown
  Sheridan
  Sherman
  Shiprock
  Shreveport
  Sidney
  Sierra Vista
  Silver City
  Silver Spring
  Silverton
  Simi Valley
  Simsbury
  Sioux City
  Sioux Falls
  Sitka
  Skagway
  Skokie
  Smith Center
  Smyrna
  Socorro
  Somersworth
  Somerville
  Somerville
  Sonoma
  South Bend
  South Charleston
  South Hadley
  South Holland
  South Kingstown
  South Orange Village
  South Saint Paul
  South San Francisco
  Southampton
  Southington
  Spanish Fork
  Sparks
  Spartanburg
  Spearfish
  Spokane
  Spring Green
  Springfield
  Springfield
  Springfield
  Springfield
  Springfield
  Springville
  Stamford
  Starkville
  State College
  Staten Island
  Staunton
  Steamboat Springs
  Sterling
  Steubenville
  Stevens Point
  Stillwater
  Stillwater
  Stockbridge
  Stockton
  Stonington
  Stony Brook
  Stony Point
  Stoughton
  Stratford
  Streator
  Stroudsburg
  Sturbridge
  Sturgeon Bay
  Sturgis
  Stuttgart
  Sudbury
  Suffolk
  Summersville
  Summit
  Sumter
  Sun Valley
  Sunbury
  Sunnyvale
  Superior
  Susanville
  Swarthmore
  Sweetwater
  Sylacauga
  Syracuse
  Tacoma
  Tahlequah
  Takoma Park
  Talladega
  Tallahassee
  Tamaqua
  Tampa
  Taos
  Tarpon Springs
  Tarrytown
  Taunton
  Telluride
  Tempe
  Temple
  Ten Sleep
  Terre Haute
  Tewksbury
  Texarkana
  Texas City
  The Dalles
  The Village
  Thermopolis
  Thibodaux
  Thousand Oaks
  Ticonderoga
  Tiffin
  Tillamook
  Titusville
  Titusville
  Tiverton
  Toccoa
  Toledo
  Tombstone
  Tonawanda
  Tooele
  Topeka
  Torrance
  Torrington
  Torrington
  Totowa
  Towson
  Traverse City
  Trenton
  Trenton
  Trinidad
  Troy
  Troy
  Truro
  Truth or Consequences
  Tucson
  Tucumcari
  Tullahoma
  Tulsa
  Tupelo
  Turlock
  Tuscaloosa
  Tuscumbia
  Tuskegee
  Twin Falls
  Tyler
  Ukiah
  Union
  Union
  Union City
  Uniontown
  Urbana
  Urbana
  Utica
  Uvalde
  Vail
  Valdez
  Valdosta
  Vallejo
  Valley City
  Valparaiso
  Van Buren
  Vancouver
  Vandalia
  Venice
  Ventura
  Vermillion
  Vernal
  Vicksburg
  Victoria
  Victorville
  Vincennes
  Vineland
  Vinita
  Virden
  Virginia
  Virginia Beach
  Virginia City
  Virginia City
  Visalia
  Wabash
  Waco
  Wahiawa
  Wahpeton
  Wailuku
  Waimea
  Walla Walla
  Wallingford
  Walnut Creek
  Walpi
  Walsenburg
  Warm Springs
  Warner Robins
  Warren
  Warren
  Warren
  Warren
  Warrensburg
  Warwick
  Washington
  Washington
  Washington
  Waterbury
  Waterford
  Waterloo
  Watertown
  Watertown
  Watertown
  Watertown
  Waterville
  Watervliet
  Watkins Glen
  Watts
  Waukegan
  Waukesha
  Wausau
  Wauwatosa
  Waycross
  Wayne
  Waynesboro
  Weatherford
  Webster
  Webster City
  Weehawken
  Weirton
  Welch
  Wellesley
  Wellfleet
  Wellsburg
  Wenatchee
  West Allis
  West Bend
  West Bridgewater
  West Chester
  West Covina
  West Des Moines
  West Hartford
  West Haven
  West Lafayette
  West Memphis
  West New York
  West Orange
  West Palm Beach
  West Plains
  West Point
  West Seneca
  West Springfield
  Westerly
  Westfield
  Westminster
  Westminster
  Weston
  Westport
  Wethersfield
  Wewoka
  Weymouth
  Wheaton
  Wheeling
  White Plains
  White Springs
  White Sulphur Springs
  Whitman
  Whittier
  Wichita
  Wichita Falls
  Wickford
  Wilkes-Barre
  Williamsburg
  Williamson
  Williamsport
  Williamstown
  Willimantic
  Willingboro
  Williston
  Willmar
  Wilmette
  Wilmington
  Wilmington
  Wilson
  Winchester
  Windham
  Window Rock
  Windsor
  Windsor Locks
  Winnemucca
  Winnetka
  Winona
  Winooski
  Winslow
  Winsted
  Winston-Salem
  Winter Haven
  Winter Park
  Wisconsin Dells
  Woburn
  Wood River
  Woodbridge
  Woodland
  Woods Hole
  Woodstock
  Woodward
  Woonsocket
  Wooster
  Worcester
  Worland
  Worthington
  Wyandotte
  Xenia
  Yakima
  Yankton
  Yazoo City
  Yellow Springs
  Yonkers
  Yorba Linda
  York
  York
  Youngstown
  Ypsilanti
  Ysleta
  Yuba City
  Yuma
  Zanesville
  Zion
""".trimIndent().split("\n").toSortedSet()

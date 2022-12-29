# JPACRUDProject

### Description
This week's project had me building out my very own database with MySQLWorkbench and building a front-end to allow the user to perform CRUD operations in the database. My database is based on the top 50 or so highest rated PlayStation 5 games on Metacritic. I used fields such as: title, description, image_url, metascore, userscore, developer, publisher, etc. Through the front-end, the user is able to access and manipulate the database using forms on each java server page. The user can create, retrieve, update, and delete existing database entries by using these forms whose methods and logic exist in the DaoImpl. The user starts on a home page, where they are presented all database entries in the form of a list which reflects existing database entries as well as those added and altered by the user. The user may also search for specific games via their numeric id.  

### Technologies Used
Java, Eclipse, SQL, Git, GitHub, Atom, MAMP, Maven, Spring Boot, Gradle, AWS, MySQLWorkbench

### Lessons Learned
From this project, I learned the importance of reading the stacktrace because 9 times out of 10 it will point you in the right direction for debugging purposes. I also gained a better understanding of the relationship between each piece of a full-stack project. From database creation, to the use of a database accessor object for performing crud operations in the database, to the controller for mapping DAO methods to a model and view, and creating forms on java server pages that can be used on the front-end by the user to allow them access to data. Last but not least, I got a bit more practice with bootstrap and applied some general styling to each jsp which added much needed visual flair.

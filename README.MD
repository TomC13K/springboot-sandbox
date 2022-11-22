
# INFO
- server port `8081`
- User controller `localhost:8081/api/`
- swagger `http://localhost:8081/swagger-ui/index.html`


# Tasks

- [x] Api path /**name** prints the uppercase path name on screen  
   - eg. **/onetwo** prints ONETWO
- [x] add tests
   - [x] services tests (test uppercaase logic)
   - [x] controllers tests HTTP status code
- [x] POST endpoint, http receives body of an object
- [x] HTTP status codes
- [x] add swagger
- [x] controller->service->orm to create DB  (use my MySQL)
- [x] store the user model.. in DB  do all CRUD ops
- [x] endpoint Hi - brings full object but full name and you are x years old
- [x] Hi {firstname}, {surname}, you are {age} year old
- [x] Maven CI pipeline


# TODO
- [ ] test url full path
- [ ] mocks
- [ ] logging (except `file output`, doesnt create file in any working or Linux dir)
- [ ] exceptions


### ORM
not an ORM
JDBI is better look into - control over SQL but dont need create mappers (typeOrm)
https://jdbi.org/#_introduction_to_jdbi_3
https://mybatis.org/mybatis-3/
terrible
https://hibernate.org/orm/


### logging
set logging xml file to keep error logs
https://docs.spring.io/spring-boot/docs/2.1.8.RELEASE/reference/html/howto-logging.html

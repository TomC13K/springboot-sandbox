
# Tasks

- [ ] Api path /**name** prints the uppercase path name on screen  
   - eg. **/onetwo** prints ONETWO
- [ ] add tests
   - services tests (test uppercaase logic)
   - controllers tests HTTP status code
   - test url full path
- [ ] POST endpoint, http receives body of an object



# TODO

- [ ] add swagger
- [ ] logging
- [ ] exceptions
- [ ] HTTP status codes


controller->service->orm to create DB  (use my MySQL)
store the user model.. in DB  do all CRUD ops
endpoint Hi - brings all object but full name and you are x years old
Hi {firstname}, {surname}, you are {age} year old


# Notes
factory pattern then adapter
### ORM
not an ORM
JDBI is better look into - control over SQL but dont need create mappers (typeOrm)
https://jdbi.org/#_introduction_to_jdbi_3
https://mybatis.org/mybatis-3/
terrible
https://hibernate.org/orm/

path to show string on screeen
hi/{id}  -so we have unique

### logging
set logging xml file to keep error logs
https://docs.spring.io/spring-boot/docs/2.1.8.RELEASE/reference/html/howto-logging.html

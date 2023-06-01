spring gateway with jwt security

https://www.youtube.com/watch?v=MWvnmyLRUik&t=2671s

https://www.javainuse.com/spring/boot-jwt


do a post to
http://localhost:8082/authenticate

with

{
"username":"rob",
"password":"password"
}

this will get you a token 

do a get to 

http://localhost:8082/hello

with header Authorization and above token
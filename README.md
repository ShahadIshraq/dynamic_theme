# Dynamic Theme Module
The project uses a basic skeleton of a kanban to demonstrate the color changing functionality. The kanban board has no usable functionality of it's self.
The theme changing module can be understood by going throug the models,controllers and the view. We will discuss them in the following sections.

The first thing that needs to be mentioned is the representation of the theme variables that needs to be changed dynamically.
For this project it has been assumed that **we are only changing the color** attribute of some html elements. The name of the elements or the classes is to be kept in a list at first. This list will be used by the **client side scripts** to render the appropriate colors.
The list can be found in 

> src/main/webapp/assests/jquery/dynamic_loading.js

The array `fields` contains the id or class names that will have dynamic color.
There is a naming convention to be followed.
> `id` name of an html element must have `#` at the beginning.
>   `class` name of an html element must have `.` at the beginning.

There is a nother field named `maxAgeOfCookie` that holds the maximum allowable age (seconds) of the cookie to be stored. There is a copy of this value in the server side.  `src/main/java/com/Theme/Util.java` holds the constant `cookieMaxAgeMinute` that is used by the server side for controlling the cookie age.

## Model
The user entity has been used to store the color preferences of each user. It can be found here :

>src/main/java/com/user/User.java

This entity is backed by `UserRepository.java` and `UserService.java`.
The database connection credentials are specified in 
>src/main/resources/application.properties

file.

## View, Javascript, jQuery and Ajax
The views that are of interest in this case can be found in this directory: 
> src/main/webapp/WEB-INF/jsp

In this directory, we can find `auth/login.jsp` and `dynamic_loading.jsp`. This are the two main files to be explored first. The other necessary files have been included from these two files.
Some important files are mentioned below.

1. `components/header.jsp` holds the button that opens the modal with the theme selection options. It also hosts the logout option which can be found by clicking the user name on the upper right corner.
2. `components/kanban_base.jsp` holds most of the elements that have the dynamic color.
3. `components/kanban_base_includes_body_bottom.jsp` includes the `dynamic_loading.js` file that holds most of the important js, jQuery and Ajax scripts. It also has an jsp if else block that calls appropriate js functions.


The file
> src/main/webapp/assests/jquery/dynamic_loading.js

hold the most important scripts. The functions have appropriate comments to describe what they do, if it's not apparent from the simple codes.

## Controllers
The important controllers are

1. `src/main/java/com/Theme/ThemeRestController.java` :  facilitates the Ajax call made when the user wants the change in theme to persist.
2. `src/main/java/com/misc/AuthController.java` : takes care of the logging and out.
3. `src/main/java/com/misc/WelcomeController.java` : takes care of the other request mappings.

## Repository and Service
The `UserRepository.java` and `UserService.java` files handle the database related functionalities. Both can be found in this directory :
>src/main/java/com/user

## Conclusion
These are the basic things of this project. In case of any query, please drop a mail at 
>shahad.nowhere@gmail.com

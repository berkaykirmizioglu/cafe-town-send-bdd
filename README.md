## How to run tests ?


1. First of all, clone https://github.com/berkaykirmizioglu/cafe-town-send-bdd repository and follow
the **README.md** commands.
2. Go into project directoy (cafe-town-send-bdd)
3. In terminal, just type
````
mvn clean install verify
````

**Note:**
If you want to run with tags just type
````
mvn clean install verify -Dtags='operations'
````

## How to control test results ?

1. Go to '_target/site/serenity_' directory.
2. Open the **index.html** file


**Test Results At:**
cafe-town-send-bdd/target/site/serenity/index.html

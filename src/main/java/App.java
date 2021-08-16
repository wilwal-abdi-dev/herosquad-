import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.*;

public class App {


    public static void main(String[] args) {


        port(getHerokuAssignedPort());
        staticFileLocation("/public");





        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");

        }, new HandlebarsTemplateEngine());



        get("/heroes/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "hero-form.hbs");
        }, new HandlebarsTemplateEngine());



        post("/heroes/new", (request,response)-> {
            Map<String, Object> model = new HashMap<>();


            String name = request.queryParams("name");
            String age = request.queryParams("age");
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            Heros heroes = new Heros(name,age,power,weakness);
            model.put("heroes", heroes);

            return new ModelAndView(model, "successForm.hbs");
        }, new HandlebarsTemplateEngine());


        //get: show all posts
        get("/heroes", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<Heros> heroes = Heros.all();
            model.put("heroes", heroes);

            return new ModelAndView(model, "heroList.hbs");
        }, new HandlebarsTemplateEngine());



//squads
        get("/squad", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Squad> squad = Squad.all();
            model.put("squad", squad);

            return new ModelAndView(model, "squadList.hbs");
        },new HandlebarsTemplateEngine());



        get("/squad/new", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "SquadForm.hbs");
        }, new HandlebarsTemplateEngine());


        post("/squad/new", (request, response) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<>();

            String name = request.queryParams("name");
            String size = request.queryParams("size");
            String cause = request.queryParams("cause");

            Squad newSquad = new Squad(name,cause,size);
            model.put("squad", newSquad);
            return new ModelAndView(model, "successSquad.hbs");
        }, new HandlebarsTemplateEngine());


    }



    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }


}



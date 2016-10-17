package controllers;

/**
 * Created by DongCatchay on 10/17/2016.
 */

import models.Word;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import views.html.*;

import static play.libs.Json.toJson;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    // create new Word model
    Word wordModel = new Word();

    /**
     * render to index page
     */
    public Result index(){
        return ok(index.render("Word Scramble Game", wordModel.randomWord()));
    }

    /**
     * get the word user typed and check if it is in database
     */
    public Result checkWord() {
        DynamicForm dynamicForm = Form.form().bindFromRequest();
        return ok(wordModel.checkWordInDatabase(dynamicForm.get("word"))+"");
    }

}

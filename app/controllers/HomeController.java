package controllers;

import play.mvc.*;

import views.html.*;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import models.Libro;

import javax.inject.Inject;



/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
    
    @Inject
    private FormFactory formFactory;

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Home"));
    }
    
    public Result agregado() {
        Form<Libro> userForm = formFactory.form(Libro.class);
        Libro book = userForm.bindFromRequest().get();
        book.save();
        return redirect(routes.HomeController.index());
    }
    
    public Result eliminado() {
        return ok(delete.render("Home"));
    }

}

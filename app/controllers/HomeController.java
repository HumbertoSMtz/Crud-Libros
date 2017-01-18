package controllers;

import play.mvc.*;

import views.html.*;
import play.data.Form;
import play.data.FormFactory;
import models.Libro;

import java.util.*;
import javax.inject.Inject;
import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;



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
    
    public Result crear() {
        return ok(creado.render("Agregar"));
    }
    
    public Result agregado() {
        Form<Libro> userForm = formFactory.form(Libro.class);
        Libro book = userForm.bindFromRequest().get();
        book.save();
        return redirect(routes.HomeController.index());
    }
    
    public Result borrar() {
        Form<Libro> userForm = formFactory.form(Libro.class);
        Libro book = userForm.bindFromRequest().get();
       List<Libro> bars = Libro.find.where().eq("titulo", book.getTitulo()).findList();
for (Bar bar : bars) {
    bar.delete();
}
    }
    
   public Result Consultar() throws IOException {
       String aux="";
        Model.Finder<Integer, Libro> finder = new Model.Finder<>(Libro.class);
        List<Libro> libros = finder.all();
        List<String> books=new ArrayList<String>();
        for (int i = 0; i < libros.size(); i++) {
          books.add(libros.get(i).toString());  
       }
        
        
        return ok(mostrar.render(libros));
    }

}
package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render());
    }
	
    public Result contact(){
	return ok(contact.render());
    }

    public Result action(){
	return ok(action.render());
    }

    public Result comedy(){
	return ok(comedy.render());
    }

    public Result romance(){
	return ok(romance.render());
    }

    public Result scifi(){
	return ok(scifi.render());
    }

    public Result CaptainAmericaCivilWar(){
	return ok(CaptainAmericaCivilWar.render());
    }

    public Result CentralIntelligence(){
	return ok(CentralIntelligence.render());
    }

    public Result JasonBourne(){
	return ok(JasonBourne.render());
    }

    public Result LondonHasFallen(){
	return ok(LondonHasFallen.render());
    }

    public Result SausageParty(){
	return ok(SausageParty.render());
    }

    public Result TheBrothersGrimsby(){
	return ok(TheBrothersGrimsby.render());
    }

    public Result TheNiceGuys(){
	return ok(TheNiceGuys.render());
    }

    public Result WarCraft(){
	return ok(WarCraft.render());
    }

    public Result BridgetJonesBaby(){
	return ok(BridgetJonesBaby.render());
    }

    public Result MeBeforeYou(){
	return ok(MeBeforeYou.render());
    }

    public Result MyBigFatGreekWedding2(){
	return ok(MyBigFatGreekWedding2.render());
    }

    public Result SingStreet(){
	return ok(SingStreet.render());
    }

    public Result Arrival(){
	return ok(Arrival.render());
    }

    public Result Ghostbusters(){
	return ok(Ghostbusters.render());
    }

    public Result IndepDayResur(){
	return ok(IndepDayResur.render());
    }

    public Result DocStrange(){
	return ok(DocStrange.render());
    }
}

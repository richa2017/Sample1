package steps;

import cucumber.api.java8.En;
import pages.Page;

public class StepDefs extends Page implements En  {

    public StepDefs() {
        Given("I go to url (.*)$", (final String url) ->  getUrl(url));
        When ("i enter username (.*)$",(String Uname) ->  enterUname(Uname));
        And ("password (.*)$",(String pwd) ->  enterPwd(pwd));
        Then ("i am logged in", () -> signin());
        
     
        
    }

	
	
	

}

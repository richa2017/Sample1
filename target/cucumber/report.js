$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/TestFeature.feature");
formatter.feature({
  "name": "Visit a page and click on a link",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Visit a page and check the page title",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I go to url https://www.bbc.co.uk/",
  "keyword": "Given "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i enter username kerry-anne.kane@opencastsoftware.com",
  "keyword": "When "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "password mypassword1",
  "keyword": "And "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i am logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "NativeConstructorAccessorImpl.java:-2"
});
formatter.result({
  "status": "passed"
});
});
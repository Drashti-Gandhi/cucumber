$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/cucumberdemo/demo/src/test/java/Feature/datatablemap.feature");
formatter.feature({
  "line": 1,
  "name": "Create new deals",
  "description": "",
  "id": "create-new-deals",
  "keyword": "Feature"
});
formatter.before({
  "duration": 22582305600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Create new deal",
  "description": "",
  "id": "create-new-deals;create-new-deal",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on CRM login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters email and passoword",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "dj190493@gmail.com",
        "Ahmedabad@1904"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on deals menu",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Clicks on Create new deal",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "Title",
        "Amount",
        "Commision",
        "Probability"
      ],
      "line": 13
    },
    {
      "cells": [
        "test",
        "1000",
        "40",
        "30"
      ],
      "line": 14
    },
    {
      "cells": [
        "Test1",
        "3000",
        "50",
        "60"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "datatablemap.user_is_on_CRM_login_page()"
});
formatter.result({
  "duration": 15265021500,
  "status": "passed"
});
formatter.match({
  "location": "datatablemap.user_enters_email_and_passoword(DataTable)"
});
formatter.result({
  "duration": 687538300,
  "status": "passed"
});
formatter.match({
  "location": "datatablemap.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 149745700,
  "status": "passed"
});
formatter.match({
  "location": "datatablemap.user_clicks_on_deals_menu()"
});
formatter.result({
  "duration": 2975460700,
  "status": "passed"
});
formatter.match({
  "location": "datatablemap.clicks_on_Create_new_deal()"
});
formatter.result({
  "duration": 770252400,
  "status": "passed"
});
formatter.match({
  "location": "datatablemap.user_enters_deal_details(DataTable)"
});
formatter.result({
  "duration": 4149926200,
  "status": "passed"
});
formatter.after({
  "duration": 1668442500,
  "status": "passed"
});
});
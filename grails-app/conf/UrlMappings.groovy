class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

    "/service/$operation?/$service?" {
        controller = "action"
        action = [GET:"changeServiceState"]
        constraints {
          operation(inList:["in","out", "forceout"])
        }
     }

    "/service/read/$service?"{
          controller = "action"
          action = [GET:"showServiceState"]
     }

    "/service/port/$service?"{
          controller = "action"
          action = [GET:"port"]
     }

     "/service/list"{
          controller = "action"
          action = [GET:"listServices"]
     }

     "/lbvserver/list/$lbvserver?"{
          controller = "action"
          action = [GET:"showLbvservers"]
     }

     "/lbserver/list/$lbvserver?"{
          controller = "action"
          action = [GET:"showLbvservers"]
     }

	 "/lbvserver/read/$lbvserver?"{
          controller = "action"
          action = [GET:"showLbvserverBindings"]
     }

    "/lbserver/read/$lbvserver?"{
          controller = "action"
          action = [GET:"showLbvserverBindings"]
     }

    "/stats/$lbname?"{
          controller = "loadBalancerStatistic"
          action = [GET:"stats"]
      }

    // "/"(view:"/index")
    "/"(controller:"action")
    "500"(view:'/error')
	}
}

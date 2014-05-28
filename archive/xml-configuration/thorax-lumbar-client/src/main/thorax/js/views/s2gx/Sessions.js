S2GX.View.extend({
  name: 's2gx/Sessions',
  events: {
	  "click .listitem" : "sessionClicked"
  },
  
  sessionClicked : function(e) {
	  sessionId = e.currentTarget.attributes[0].value;
	  S2GX.Routers.s2gx.navigate('/session/' + sessionId, { trigger: true }) 
  }

});
 
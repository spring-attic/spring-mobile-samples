S2GX.View.extend({
  name: 's2gx/Sessions',
  events: {
	  "click .listitem" : "sessionClicked"
  },
  
  sessionClicked : function(e) {
	  sessionid = e.currentTarget.attributes[0].value;
  }

});
 
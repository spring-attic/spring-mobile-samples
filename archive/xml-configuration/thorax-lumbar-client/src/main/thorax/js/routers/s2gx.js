// setup the local cache
var cache = {
    sessions: new S2GX.Collections.Sessions()
};

S2GX.Router.create(module, {
  sessions: function() {
    var view = this.view('s2gx/Sessions');
    cache.sessions.load(function() {
			view.setModel(cache.sessions);
			S2GX.layout.setView(view);
		});
  }, 
  sessionDetail: function(sessionId) {
	  // TODO: Remove comments after demo
//	  matchingSessions = cache.sessions.where({'id':''+sessionId});
//	  if (matchingSessions.length > 0) {
//		  session = matchingSessions[0];
//	  }
//	  var view = this.view('s2gx/Session');
//	  view.setModel(session);
//	  S2GX.layout.setView(view);
  }
});

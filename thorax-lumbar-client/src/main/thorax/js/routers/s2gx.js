S2GX.Router.create(module, {
  sessions: function() {
    var view = this.view('s2gx/Sessions');
    var sessions = new S2GX.Collections.Sessions();
    sessions.load(function() {
			view.setCollection(sessions);
			S2GX.layout.setView(view);
		});
  }
});

S2GX.Router.create(module, {
  sessions: function() {
    alert("X: " + cache.sessions.length);
    var view = this.view('s2gx/Sessions');
    view.setCollection(cache.sessions);
    this.setView(view);
  }
});

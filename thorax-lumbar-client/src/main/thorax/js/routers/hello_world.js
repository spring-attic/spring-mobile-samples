Application.Router.create(module, {
  index: function() {
    var view = this.view('hello_world/index');
    this.setView(view);
  }
});

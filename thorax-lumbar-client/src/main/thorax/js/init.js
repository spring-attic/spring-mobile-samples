Thorax.configure({
  scope: exports,
  layout: '.layout',
  templatePathPrefix: 'templates/'
});

$(document).ready(function() {
  if (exports && exports.initBackboneLoader) {
    exports.initBackboneLoader();
  }
  Backbone.history.start();
});

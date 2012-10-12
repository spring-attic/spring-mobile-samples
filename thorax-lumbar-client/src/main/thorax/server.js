var express = require('express'),
  portscanner = require('portscanner'),
  argv = require('optimist').argv,
  path = require('path'),
  port = argv._[0] || 8000,
  spawn = require('child_process').spawn;

if (argv.watch) {
  var lumbar = spawn('lumbar', ['watch', path.join(__dirname, 'lumbar.json'), path.join(__dirname, 'public')]);
  lumbar.stdout.on('data', function(data) {
    process.stdout.write(data.toString());
  });
  lumbar.stderr.on('data', function(data) {
    process.stdout.write(data.toString());
  });
}

var server = express.createServer();
server.use(express.logger());
server.use(express.static(path.join(__dirname, 'public')));

portscanner.findAPortNotInUse(port, port + 25, 'localhost', function(error, foundPort) {
  console.log('Express server listening on port ' + foundPort);
  server.listen(foundPort);
});


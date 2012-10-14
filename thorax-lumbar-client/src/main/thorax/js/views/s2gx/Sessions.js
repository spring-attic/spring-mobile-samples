// setup the local session cache
var cache = {
    sessions: new S2GX.Collections.Sessions()
};
cache.sessions.fetch();

S2GX.View.extend({
  name: 's2gx/Sessions'
});
 
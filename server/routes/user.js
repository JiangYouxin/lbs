
/*
 * GET users listing.
 */

exports.list = function(req, res){
  res.send("respond with a resource");
};

exports.update = function(req, res){
  var obj = new Object();
  obj.x = "Hello World";
  obj.y = "Hello Sb";
  var json = JSON.stringify(obj);
  res.send(json);
}

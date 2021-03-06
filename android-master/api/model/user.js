var mongoose = require('mongoose');


var userSchema = mongoose.Schema({
    email:{
        type: String,
        required: true
    },
    password:{
        type: String,
        required: true
    }
});

var User = module.exports = mongoose.model('User', userSchema);

module.exports.getAllUsers = function(callback, limit){
    User.find(callback).limit(limit);
}

module.exports.getUserById = function(id, callback){
    User.findById(id, callback);
}
module.exports.addUser = function(user, callback) {
    User.create(user, callback);
}
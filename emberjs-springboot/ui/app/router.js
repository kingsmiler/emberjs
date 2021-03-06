import Ember from 'ember';
import config from './config/environment';

var Router = Ember.Router.extend({
  location: config.locationType
});

Router.map(function() {
  this.resource('albums');
  this.resource('album', { path: 'album/:id'});
});

export default Router;

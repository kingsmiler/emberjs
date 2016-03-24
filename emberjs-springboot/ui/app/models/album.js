import DS from 'ember-data';

export default DS.Model.extend({

  artist: DS.belongsTo('artist', {async: true}),
  
  title: DS.attr('string'),

  year: DS.attr('number'),

  tracks: DS.hasMany('track')

});

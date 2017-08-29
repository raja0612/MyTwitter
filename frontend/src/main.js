import Vue from 'vue';
import VueResource from 'vue-resource';


Vue.use(VueResource);



Vue.http.options.root = 'http://localhost:9080/mytwitter/';

//Vue.http.options.root  = "http://mytwitter.us-east-2.elasticbeanstalk.com/";

import router from './router';



import App from './App.vue';

new Vue({
  router,
  el: '#app',
  render: h => h(App)
})

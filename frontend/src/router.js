import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

import TwitterPanel from './components/TwitterPanel.vue';
import SignUp from './components/SignUp.vue';
//import Login from './components/Login.vue';




// ==================== Router registration ====================
export default new Router({
mode: 'history',
routes: [
  { path: '/', component: TwitterPanel },
  { path: '/signup', component: SignUp },
  //{ path: '/login', component: Login },
]
})

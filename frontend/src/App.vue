<template>
<div class="container">
<app-navbar></app-navbar>
<router-view></router-view>
</div>
</template>

<script>

import Navbar from './components/Navbar.vue';
import SignUp from './components/SignUp.vue';
import Login from './components/Login.vue';
export default {


components:{
    appNavbar: Navbar,
    appSignUp: SignUp,
    appLogin: Login
}

}
</script>

<style>


</style>

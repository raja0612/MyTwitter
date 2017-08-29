<template>
<div>
<nav class="navbar navbar-inverse">
<div class="container-fluid">
<div class="navbar-header">
  <a class="navbar-brand" href="#">Ravens</a>
</div>
<ul class="nav navbar-nav">
  <li><router-link to="/" class="nav-item nav-link">Home</router-link></li>
  <li><a href="#">Page 1</a></li>
  <li><a href="#">Page 2</a></li>
</ul>
<ul class="nav navbar-nav navbar-right">
  <li><router-link to="/signup" class="nav-item nav-link">Sign Up</router-link></li>
  <li><router-link to="/login" class="nav-item nav-link ">Login</router-link></li>
</ul>
</div>
</nav>
  <img id="banner" src="../assets/banner_pigeon.jpg" class="img-responsive" alt="Responsive image">
  </div>
</template>

<script>
export default {
}
</script>

<style scoped>
#banner {
  margin-top: 70px;
  width: 100%;
  height: 25%;
}
</style>

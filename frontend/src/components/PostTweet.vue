<template>
  <form>
    <div class="form-group">
      <label for="message"><h3>Tweet Here:</h3></label>
      <textarea v-model='tweet' rows="5" class="form-control"
      id="tweet" placeholder="What's on your mind?"></textarea>
    </div>
    <a @click="post" class="btn btn-lg btn-primary">Tweet</a>
  </form>
</template>
<script>

export default {
  data () {
    return {
      tweet : '',
      username : ''
    }
  },
  methods : {
    post () {
      console.log('post tweet',this.info);
      let info = {
        username : localStorage.getItem('username'),
        description : this.tweet,
      }
  console.log('post tweet',info);
      this.$http.post("tweet", info).then((res) => {
        location.reload();
      }, (err) => {
        console.log(err);
      });
    }
  }
}
</script>
<style>
</style>

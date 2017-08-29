<template>
<div>
<div class="row">
   <div class="col-md-4">
     <app-login></app-login> <!--Google SSO Login -->
   </div>  <!-- left side of Panel -->
   <div class="col-md-8">

     <table id="tweetsTable" width='100%'>
       <thead>
          <tr>
             <th>Tweets List</th>
          </tr>
       </thead>
       <tbody>
          <tr v-for="tweet in tweets">
             <td>
                <div class="panel panel-default">
                  <div class="panel-heading">
                    <h3 class=" panel-title"> {{ tweet.username }} @ {{ tweet.date  }}
                    </h3>
                  </div>
                  <div class="panel-body">
                    {{tweet.description}}
                  </div>
                </div>
             </td>
          </tr>
       </tbody>
     </table>


   </div>  <!-- right side of Panel -->
</div>
<!-- <div id="bottom"></div> -->
</div>
</template>
<script>
import Login from './Login.vue';
  export default{
       data(){
         return {
          tweets: []
         }
       },
       methods:{
         //http://mytwitter.us-east-2.elasticbeanstalk.com/
         getTweets(){
           this.$http.get('tweets').then(response => {
              return response.json(); //It Returns promise.
           }).then(data => {
            const resultArray = [];
            for(let key in data){

              resultArray.push(data[key]);
            }
            this.tweets = resultArray;
            console.log(this.tweets);
           });
         }
       },
       components:{
           appLogin: Login
       },
       created(){
         this.getTweets();
       }
      }

</script>
<style>
<style>

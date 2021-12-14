<template>
<div>
    <head-bar class="headbar"></head-bar>
    <router-view />
    <footer-bar class="footer"></footer-bar>

</div>
  
</template>

<script> 
import FooterBar from './components/FooterBar.vue'  
import HeadBar from './components/HeadBar.vue'
export default {
  name: 'App',
  components: {
   HeadBar,
   FooterBar
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}
</style>

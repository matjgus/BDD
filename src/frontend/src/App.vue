<template>
<div>
  <div @wheel.passive="disa">
    <transition name="slide" v-if="show">
    <head-bar class="headbar"></head-bar>
    </transition>
    <router-view />
    <footer-bar class="footer"></footer-bar>
  </div>
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
  },
  data(){
    return{
      show:true
    }
  },
  methods:{
    disa(event){
      if(event.deltaY>0){
        this.show=false;
      }else if(event.deltaY<0){
        this.show=true;
      }
      console.log(event.deltaY);
    }
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
.slide-fade-enter-active {
  animation: slide-in 1s ease-out forwards;
  transition: opacity .5s;
}
.slide-fade-leave-active {
  animation: slide-out 1s ease-out forwards;
  transition: opacity .5s;
  opacity: 0;
}
/* .slide-fade-enter, .slide-fade-leave-to{
  transform: translateX(10px);
  opacity: 0;
} */
</style>

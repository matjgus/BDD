<template>
    
    <div class="swiper" >
        <hooper :infiniteScroll="true" :wheelControl="false" :mouseDrag="true" :progress="true" :autoPlay="true" :playSpeed="2000">
            <slide v-for="banner in subbanners" v-bind:key="banner">
                <div class="swiper-slide banner">
                    <img :src="require(`@/assets/img/${banner}`)">
                </div>
            </slide>
        </hooper>
        <hooper-navigation slot="hooper-addons"></hooper-navigation>
    </div>      
</template>

<script>
import { Hooper, Slide,
  Navigation as HooperNavigation } from 'hooper';
import 'hooper/dist/hooper.css';

export default{
    components: {
        Hooper,
        Slide,
        HooperNavigation
    },
    data(){
        return{
            subbanners:["banner2.jpg",
                 "banner1.jpg",
                "banner4.jpg",
            ],
        }
    },
}
</script>

<style scoped>
/* 모바일용 화면 */
@media(max-width: 480px) {
    
}
/* 컴퓨터용 화면 */
@media(min-width: 1400px) {
.hooper{
    height:40vh;
    width: 100vw;
}
.slide{
    height:400px;
    line-height: 40vh;
}
.banner{
    object-fit: cover;
    overflow: hidden;
    background-repeat: no-repeat;
    background-size:100% 100%;
}
.banner img{
    width:100vw;
    position: absolute;
}
}
</style>
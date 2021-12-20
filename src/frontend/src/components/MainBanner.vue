<template>
    
    <div>
        <hooper :infiniteScroll="true" :wheelControl="false" :mouseDrag="true" :progress="true" :autoPlay="true" :playSpeed="2000">
            <slide v-for="banner in mainbanners" v-bind:key="banner">
                <div class="swiper-slide banner">
                    <img :src="require(`@/assets/img/${banner.imgurl}`)">
                    <div>
                        <h1> {{banner.mant1}} </h1>
                        <p>  {{banner.mant2}}  </p>
                        <p>  {{banner.mant3}}  </p>
                    </div>
                </div>
            </slide>
        </hooper>
    </div>      
</template>

<script>
import { Hooper, Slide } from 'hooper';
import 'hooper/dist/hooper.css';

export default{
    components: {
        Hooper,
        Slide
    },
    data(){
        return{
            mainbanners:[
                {
                    imgurl: "banner2.jpg",
                    mant1: "[ 베 : 풀다]",
                    mant2: "힘듬에 상처받지 않도록",
                    mant3: "나누어서 행복하도록",
                },
                {
                    imgurl: "banner1.jpg",
                    mant1:" [ Wake _ up ] ", 
                    mant2:" 잠들어 있는 헌혈증 " ,
                    mant3:" 깨울 시간 "
                },
                {
                    imgurl: "banner4.jpg",
                    mant1:" [느: 루]",
                    mant2:"몰아치지 아니하고",
                    mant3:" 오래도록 늘",
                }
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
    height:60vh;
    min-height: 400px;
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
.banner div{
    z-index: 10;
}
.banner p{
    font-size : 35px;
    color: white;
}
.banner h1{
    font-size : 60px;
    color: white;
    text-align: center;
}
}
</style>
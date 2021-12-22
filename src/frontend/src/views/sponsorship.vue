<template>
<div>
<sub-banner/>

    
    <p class="title">사연목록</p>
    <!-- <p>{{dates}}</p> -->
    <div class="sort-box">
      <div class="wrap">
     <sponsorship-list/>
    </div>

</div>  
</div>
</template>

    
<script>
import subBanner from '../components/SubBanner.vue';
import sponsorshipList from './sponsorshipList.vue';

export default {
    components:{subBanner, sponsorshipList},
   
    
}
</script>


<style scoped>
/* 모바일용 화면 */
@media(min-width: 300px) and (max-width: 599px) {
    .title {
    font-size: 30px;
    font-weight: 600;
    margin: 50px auto;
    text-align: center;
}
}
/* 컴퓨터용 화면 */
@media(min-width: 1400px ) {
body {
    text-align: center;
}
.story-wrap {
    width: 80%;
    max-width: 1800px;
    display: flex;
    flex-direction: column;
    align-items: center;
    margin: 0 auto;
}

.story-box {
    display: none;
    width: 800px;
    height: 250px;
    margin-bottom: 70px;
}

.story-box a {
    display: block;
}

.img-box {
    width: 400px;
    height: 250px;
    float: left;

}

.img-box img{
    width: 100%;
    height: 100%;
    border-radius: 5%;
}

.content-box {
    height: 250px;
    width: 50%;
    float: left;
    display: flex;
    flex-direction: column;
    justify-content: center;
}


.story-p {
    text-align: center;
    font-size: 20px;
    max-height: 300px;
}

.title {
    font-size: 40px;
    font-weight: 600;   
    margin: 50px auto;
    text-align: center;
}


.up-scroll {
    text-align: center;
    margin-bottom: 50px;
}

.load-more {
    font-size: 20px;
    font-weight: 600;
    margin : 0 auto -70px auto;
    height: 150px;

    
}
.load{
    width: 100px;
    
    margin : 0 auto;
    text-align: center;
}
.btn-cover{
  display : flex;
  margin : 0 auto;
  justify-content: center;
  font-size: 20px;
  margin : 20px 0;
}
.sort-box{
  margin : 0 auto 100px auto;
}
}
</style>
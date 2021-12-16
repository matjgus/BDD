<template>
<div>


    
    <p class="title">사연목록</p>

    <div class="sort-box">
      

    </div>

    <div class="story-wrap">

      
      <div class="story-box">
        <a href="story">
          <div class="img-box">
           <img src="../assets/img/story2.jpg">
         </div>
          <div class="content-box">
            <p class="story-p">타지에서 고통받는 돈치치...<br>
              22개월 돈치치는 피가 필요해요. </p>
          </div>
        </a>
      </div>
    
      <div class="story-box">
        <a href="story">
          <div class="img-box">
           <img src="../assets/img/blood.png">
         </div>
          <div class="content-box">
            <p class="story-p">아기 돈치치는 지금 피가 필요해요.</p>
          </div>
        </a>
      </div>
      
      <div class="story-box">
        <a href="story">
          <div class="img-box">
           <img src="../assets/img/baby2.jpg">
         </div>
          <div class="content-box">
            <p class="story-p">아기 돈치치는 지금 피가 필요해요.</p>
          </div>
        </a>
      </div>

      <div class="story-box">
        <a href="story">
          <div class="img-box">
           <img src="../assets/img/baby3.jpg">
         </div>
          <div class="content-box">
            <p class="story-p">아기 돈치치는 지금 피가 필요해요.</p>
          </div>
        </a>
      </div>

      <div class="story-box">
        <a href="story">
          <div class="img-box">
           <img src="../assets/img/house.png">
         </div>
          <div class="content-box">
            <p class="story-p">아기 돈치치는 지금 피가 필요해요.</p>
          </div>
        </a>
      </div>

      <div class="story-box">
        <a href="story">
          <div class="img-box">
           <img src="../assets/img/story2.jpg">
         </div>
          <div class="content-box">
            <p class="story-p">아기 돈치치는 지금 피가 필요해요.</p>
          </div>
        </a>
      </div>

      <div class="story-box">
        <a href="story">
          <div class="img-box">
           <img src="../assets/img/story2.jpg">
         </div>
          <div class="content-box">
            <p class="story-p">아기 돈치치는 지금 피가 필요해요.</p>
          </div>
        </a>
      </div>

      <div class="story-box">
        <a href="story">
          <div class="img-box">
           <img src="../assets/img/story2.jpg">
         </div>
          <div class="content-box">
            <p class="story-p">아기 돈치치는 지금 피가 필요해요.</p>
          </div>
        </a>
      </div>

    </div>
    <div class="wrap">
    <a href="#" id="load" class="load"><p class="load-more">더보기</p></a>
    </div>
</div>
</template>
<script>
export default {
  name: 'Sponsorship',
}
</script>
<script>
//  $(function(){
//             $(".story-box").slice(0, 4).show(); // 최초 10개 선택
//             $("#load").click(function(e){ // Load More를 위한 클릭 이벤트e
//             e.preventDefault();
//             $("div:hidden").slice(0, 4).show(); // 숨김 설정된 다음 10개를 선택하여 표시
//             if($("div:hidden").length == 0){ // 숨겨진 DIV가 있는지 체크
//             //alert("더 이상 항목이 없습니다"); // 더 이상 로드할 항목이 없는 경우 경고
//             }
//             });
//             });
</script>

<style scoped>
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

</style>
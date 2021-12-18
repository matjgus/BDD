<template>
<div>
<sub-banner/>

    
    <p class="title">사연목록</p>
    <!-- <p>{{dates}}</p> -->
    <div class="sort-box">
      <div class="wrap">
      <table class="table table-striped table-horizontal table-bordered mt-3">
        <thead class="thead-strong">
            <tr>
                <th width="10%">게시글번호</th>
                <th width="">제목</th>
                <th width="10%">필요 후원 수</th>
                <th width="10%">작성일</th>
                <th width="10%">마감일</th>
                <th width="10%">작성자</th>
            </tr>
        </thead>
        <tbody id="tbody">
            <tr  v-for="(list,index) in lists" :key = "index" >
                <th  scope="row">{{ index + 1 }} </th>
                    <td @click="goStory(list.story_idx)">{{ list.story_title }}</td>
                    <td>{{ list.num_donation }}</td>
                    <td>{{ list.reg_date }}</td>
                    <td>{{ list.fin_date }}</td>
                    <td>{{ list.story_id }}</td>
            </tr>
        </tbody>
      </table>
                         

    </div>
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
      
    
    </div>
    
</div>
</template>

    
<script>
import subBanner from '../components/SubBanner.vue';
import axios from 'axios'
export default {
    components:{subBanner},
    data() {
        
      return {
        baseUrl : 'http://localhost:9999',
        lists : [],
        dates:"",
        story_title: '',
        story_content: '',
        story_id: '',
        num_donation: 0,
        story_file : '',
        fin_date : '',
        reg_date : '',
        pageNum: 0
      }
      
    },
    props: {
      pageSize: {
        type: Number,
        required: false,
        default: 10
      }
    },
    methods:
    {
    nextPage(){
      this.pageNum+=1;
      this.lists=this.listslice();
    },
    goStory(idx){
            this.$router.push('/storydetail/'+idx);
    },
    prevPage(){
      this.pageNum-=1;
      this.lists=this.listslice();
    },
    getlist(){
        axios.get('http://localhost:9999/storylist')
            .then(res =>{ 
                this.lists = res.data;
                this.page = this.pageCount();
            })
            
            .catch(error => 
            console.log(error))
        },
    
    gettime(){
    var date = new Date();
    this.dates = date.getFullYear() + "-"
    + (date.getMonth()+1) + "-" +
    date.getDate();
    },
  },
  
    mounted(){
        this.getlist();
        this.gettime();
    },
}
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
</style>
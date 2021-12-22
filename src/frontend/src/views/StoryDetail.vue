<template>
<div>
      <sub-banner/>
      <div class="story-wrap">
        <p class="story-title">{{lists.story_title}}</p>

        <div class="story-main-box">
            <div class="story-img-box">
                <img src="../assets/img/story2.jpg">
            </div>
            <div class="story-content-box">
                <p class="content-small">목표</p>
                <p class="content-big"><b>1000</b>장</p>
                <p class="content-small">현황</p>
                <p class="content-big"><b>{{lists.num_donation}}</b>장</p>
                 <!-- <p class="content-big"><b>{{total_deed}}</b>장</p> -->
                <p class="content-small">남은시간</p>
                <p class="content-big"><b>{{remaining_days}}</b>일</p>
                <div class="content-info-box">
                <div v-if="remaining_days!= 0">
                    <p class="content-tiny"><b>{{lists.fin_date}}</b>까지 목표를 <br>
                        채우지 못하면 마감일까지 <br>
                        모인 헌혈증 수만큼 후원합니다.</p>
                </div>
                <div v-if="remaining_days== 0">
                    <p class="content-tiny"><b>{{lists.fin_date}}</b>까지 후원하고 <br>
                        마감된 후원입니다.<br></p>
                </div>
                </div>
                <div v-if="remaining_days!= 0">
                <button @click="donationclick" type="button" class="terms-info">후원하기</button>
                </div>
            </div>
        </div>
        <div class="story-info">
            <p class="story-info-content">{{lists.story_content}}</p>
             <div v-if="remaining_days!= 0">
            <button @click="donationclick" type="button" class="terms-info">후원하기</button>
        </div>
        </div>
            
        </div>
    

    <div id="layer">
        <div id="bg-layer" class="bg-layer"></div>
        <div id="pop-layer" class="pop-layer">
            <div class="layer-title">
                <td class="title">헌혈증 기증</td><button @click="X_button_click" type="button" class="X-btn"><img
                        src="data:image/png;base64,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"
                        style="height: 35px; width: 35px; top: 10px; right: 10px; position: absolute;"></button>
            </div>
            <div class="layer-main">
                <div class="text-box">
                   <input  v-model="donation_count" type="number" min="1"
                   placeholder="기증할 헌혈증 수 입력" class="membership-info"/>
                   <p v-if="login" class="content-tiny"><span>( {{ userlists[0].my_deednum }}</span>개 보유중 )</p>
                   <p v-if="!login" class="content-tiny"><span>( 0</span>개 보유중 )</p>
                   <button @click="Postdonation" type="button" class="send-info-btn">후원하기</button>
                </div>
            </div>
        </div>
    </div>
  </div>
</template>

<script>
import subBanner from '../components/SubBanner.vue';
import axios from 'axios'

export default{
    components:{subBanner},
    data() {
        return{
            login : this.$session.get('islogin'),
            story_idx : this.$route.params.idx,
            lists : [],
            donationinfo : [],
            dates:"",
            remaining_days : "",
            idx : 3,
            donor_uid : this.$session.get('UserId'),
            donee_uid : "",
            donation_count : 1,
            id : this.$session.get('UserId'),
            userlists:[],
            detail_list:[],
            total_deed:0,
            //login_id:this.$session.get('id'),
            
        }
    },
    methods:{
    donationclick(){
        var loging = this.$session.get('islogin')
        if (!loging){
            alert("로그인이 필요합니다")
            this.$router.push('/login');
        }
        var layerstyle = document.getElementById("pop-layer")
        var layerstyle2 = document.getElementById("bg-layer")
        layerstyle.style.display = "block";
        layerstyle2.style.display = "block";
    },
    X_button_click(){
      var layerstyle = document.getElementById("pop-layer")
      var layerstyle2 = document.getElementById("bg-layer")
      layerstyle.style.display = "none";
      layerstyle2.style.display = "none";
    },
    getstory(){
        axios.get('http://localhost:9999/storydetail?idx='+this.story_idx)
        .then(res =>{ 
            //console.log(res);
            this.lists = res.data;
            this.gettime();
            this.count_date();
            this.get_donationdetail();
            //console.log(this.lists);
        })
        .catch(error => 
            console.log(error))
    },
    //       var DateDay =   now() -   2021-12-22   
    //       if( DateDay < 1){}
    count_date(){
        var endDate = new Date(this.dates);
        var startDate = new Date(this.lists.fin_date);
        var btMs = startDate.getTime() - endDate.getTime();
        this.remaining_days = btMs / (1000*60*60*24);
        if (this.remaining_days <= 0){
            this.remaining_days = 0
        }
    },
    Postdonation(){
        var Params ={
            'story_idx' : this.story_idx,
            'donorUid' : this.donor_uid,
            'doneeUid' : this.lists.story_id,
            'donation_count' : this.donation_count,
            }
        console.log(this.donor_uid);
        if(this.donation_count > this.userlists[0].my_deednum){
            alert("보유한 증서 수를 넘을 수 없습니다");
        }
        else{
            axios.post('http://localhost:9999/d_detail',Params)
            .then(res =>{ 
                console.log(res);
                alert("후원에 감사합니다.")
                this.$router.go("");

        })
            .catch(error => 
                console.log(error))

            axios.post('http://localhost:9999/d_count',Params)
        }
    },
    gettime(){
    var date = new Date();
    this.dates = date.getFullYear() + "-"
    + (date.getMonth()+1) + "-" +
    date.getDate();
    //console.log(this.dates);
    },
    get_user(){
        axios.get('http://localhost:9999/userlist', {
            params : {
                id : this.id,
            }
        })
        .then(res =>{ 
            console.log(res);
            this.userlists = res.data;
            //console.log(this.userlists);
        })
        .catch(error => 
            console.log(error))
    },
    get_donationdetail(){
        axios.get('http://localhost:9999/d_detaillist')
        .then(res =>{ 
            console.log("----------------donationdetail")
            console.log(res);
            this.detail_list = res.data;
            this.count_deed();
            //console.log(this.userlists);
        })
        .catch(error => 
            console.log(error))
    },
    count_deed(){
        for(var i=0; i<this.detail_list.length; i++){
            if (this.detail_list[i].story_idx == this.story_idx){
                this.total_deed += this.detail_list[i].donationCount;
            }
        }
        console.log("test==========")
        //console.log(this.story_idx);
        console.log(this.total_deed);
    }
  },
    mounted(){
        
    },
    created(){
        this.getstory();
        this.get_user();
        
        
    }
}
</script>


<style scoped>
/* 모바일용 화면 */
@media(max-width: 480px) {
    
}
/* 컴퓨터용 화면 */
@media(min-width: 1400px) {
.story-wrap {
    margin: 40px;
    text-align: center;
    display: flex;
    flex-direction: column;
    align-items: center;
    
}

.story-title {
    font-size: 30px;
    font-weight: 700;
}

.story-main-box {
    margin-top: 50px;
    display: flex;
    width: 1000px;
    border-bottom: 3px solid rgb(223, 223, 223);
    padding-bottom: 100px;
}

.story-img-box {
    width: 600px;
    height: 400px;
}

.story-content-box {
    width: 250px;
    height: 400px;
    display: flex;
    flex-direction: column;
    align-items: flex-start;
    margin-left: 50px;
    line-height: 46px;
}

.story-img-box img {
    width: 600px;
    height: 450px;
}

.content-small {
    font-size: 20px;
    font-weight: 300;
}

.content-tiny {
    font-size: 17px;
    font-weight: 460;
}

.content-big {
    font-size: 25px;
    font-weight: 500;
}

.content-info-box {
    margin-top: 20px;
    width: 350px;
    height: 100px;
    background-color: rgb(238, 238, 238);
    border-radius: 10px;
    line-height: 25px;
    display: flex;
    flex-direction: column;
    justify-content: center;
    text-align: center;
}

.content-select-box {
    margin-top: 20px;
    width: 350px;
    height: 100px;
    background-color: rgb(255, 128, 128);
    border-radius: 10px;
    border: none;
    font-size: 40px;
    font-weight: 600;
    color: white;
    cursor: pointer;
}

.story-info {
    margin: 0 auto;
    width: 1000px;
    text-align: center;
    padding-bottom: 50px;
}

.story-info img {
    margin: 50px 0 50px 0;
    width: 1000px;
    height: 500px;
}

.terms-info {
    margin-top: 20px;
    width: 350px;
    height: 80px;
    background-color: rgb(255, 128, 128);
    border-radius: 10px;
    border: none;
    font-size: 40px;
    font-weight: 600;
    color: white;
    cursor: pointer;
}

.terms-check-box {
    display: flex;
    align-items: flex-end;
    justify-content: space-between;
    margin-top: 10px;
}

.membership-btn {
    margin-top: 20px;
    width: 600px;
    height: 56px;
    background: black;
    border: none;
    color:white;
    font-size: 18px;
}

.h {
    font-size: 32px;
    margin-bottom: 10px;
}



.bg-layer {
    position: fixed;
    background: none;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    z-index: 1098;
    display: none;
}

.pop-layer {
    position: fixed;
    width: 30%;
    height: 20%;
    background: #ccc;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    z-index: 1099;
    display: flex;
    flex-direction: column;
    display: none;
}

.layer-title {
    height: 60px;
    background: black;
    margin-bottom: 0;
    font-size: 30px;
    color: white;
    text-align: center;
    line-height: 60px;
}

.layer-main {
    margin-top: 0;
    height: 150%;
    background: white;
}

.text-box {
height: 92%;
width: 92%;
border: 1px solid silver;
overflow-y: auto;
padding: 10px;
text-align: center;
color: #222;
margin-top: 2%;
margin-left: 4%;
margin-bottom: 4%;
margin-right: 4%;
}

.membership-info {
    height: 50px; 
    width: 190px; 
    margin-bottom: 5px; 
    font-size: 20px;
    border-radius: 10px;
    border: 2px solid rgb(201, 201, 201);
    margin-top: 5px;
    text-align: center;
}

.send-info-btn {
    margin-top: 30px;
    height: 40px;
    width: 150px;
    border: none;
    color: white;
    background-color: black;
    font-size: 20px;
    border-radius: 10px;
}
.story-info-content{
    font-size:20px;
}}
</style>
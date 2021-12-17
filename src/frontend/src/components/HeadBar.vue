<template>
    <div class="">
    <div class="header" id="navbar">
        <h1 class="logo">
            <router-link to="/" style="width:100%; height:86px; size:80px">
                <span style="color:#a81431; "><i class="fas fa-socks"> 빨간양말후원</i></span>
            </router-link>
        </h1>
        <div class="nav">
            <ul>
                <li>
                    <router-link to="/intro">소개</router-link>
                </li>
                <li>
                     <router-link to="/sponsorship">사연</router-link>
                </li>
                <li>
                    <router-link to="/service">고객센터</router-link>
                </li>
            </ul>
        </div>
        <div class="right-header">
            <div class="donationbill">
                <router-link to="/donationbill">기부금영수증</router-link>
            </div>
            <div class="donation">
                <a href="/donation">후원하기</a>
            </div>
            <div v-if="!loginStatus" class="login">
                <a href="/login">로그인</a>
            </div>
            <div v-if="loginStatus" class="login">

                <div class="mypage">
                    <a style="font-size:30px;cursor:pointer"
                    @click="shownav()">&#9776; </a>
                </div>
            </div>
        </div>
        <div id="mySidenav" class="sidenav">
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
            <a href="/profile">회원 정보 수정</a>
            <a href="/mydeed">내 후원증</a>
            <!--<a href="/page/mydeed.html">내 후원증</a>-->
            <a href="/donationhistory">후원 내역</a>
            <a href="/benefit">기념 상품</a>
            <a @click="logoutEnt">로그아웃</a>
        </div>
    </div>
    </div>
</template>
<script>
export default{
    name : 'headbar',
    data(){
        return{
            loginStatus:this.$session.get('islogin'),
            downnav: false,
        }
    },
    methods :{
        
        donationbill(){
            this.$router.push('/donationbill')
        },
        checkS(){
            // var tmp = this.$session.get('islogin')
            console.log(this.loginStatus)
        },
        logoutEnt(){
            this.$session.destroy();
            this.$router.go('/')
        },
        shownav(){
            var navstyle = document.getElementById("mySidenav");
            if(!this.downnav){
                navstyle.style.display="table";
                this.downnav = !this.downnav;
                return;
            }
            navstyle.style.display="none";
            this.downnav = !this.downnav;
        },
    },
    mounted(){
        var navstyle = document.getElementById("mySidenav");
        navstyle.style.display="none";
    }
}
</script>

<style scoped>
.swiper-wrapper .banner1{
    background:url("../assets/img/banner2.jpg");
    object-fit: cover;
    overflow: hidden;
    background-repeat: no-repeat;
    background-size:100% 100%;
}
.swiper-wrapper .banner1 p{
    font-size : 35px;
    color: white;
}
.swiper-wrapper .banner1 h1{
    font-size : 60px;
    color: white;
    text-align: center;
}
.swiper-wrapper .banner2{
    background:url("../assets/img/banner1.jpg");
    object-fit: cover;
    overflow: hidden;
    background-repeat: no-repeat;
    background-size:100% 100%;
}

.swiper-wrapper .banner2 h1{
    font-size : 60px;
    color: white;
    text-align: center;
}
.swiper-wrapper .banner2 > div> p{
    font-size : 35px;
    color: white;
}

.swiper-wrapper .banner3{
    background:url("../assets/img/banner4.jpg");
    object-fit: cover;
    overflow: hidden;
    background-repeat: no-repeat;
    background-size:100% 100%;
}

.swiper-wrapper .banner3 h1{
    font-size : 60px;
    color: white;
    text-align: center;
}
.swiper-wrapper .banner3 > div> p{
    font-size : 35px;
    color: white;
}
.header {
    display:flex;
    font-size:25px;
    font-weight: bolder;
    color : white;
    z-index: 100;
    position: fixed;
    left: 50%;
    transform: translateX(-50%);
    top: 0;
    width: 100%;
    display: flex;
    align-items: center;
    justify-content: center;
    transition: all 0.3s;
    margin : 0 auto;
    width:100%;
    font-family: "jua";
}

.wrap {
    margin : 0 auto;
    max-width: 1800px;
    width:100%;
    
}
.header{
    max-width: 1600px;
    position:fixed;
    left:50%;width:100%;
    padding:10px 0;
    text-align:center;
    transform:translate(-50%);
    transition:all .3s;
    
}


.header .logo {
    width : 15%;
    height: 100%;
}
.header .logo >a{
    font-family: 'MaruBuriLight';
    
}
.header .nav {
    width : 40%;
    margin : 0 auto;
}
.header .nav >ul {
    width: 100%;
    display : flex;
    margin : 10px 0;
}

.header .nav > ul > li {
    width: 100%;
    height: 50px;
    margin : 8px 20px;
    line-height: 50px;
    text-align: center;
    
}
.header .nav > ul > li > a {
    color : silver;
    font-size: 30px;
    font-weight: 550;
}
.header .nav > ul > li > a:hover{
    color: white;
    font-size: larger;
}
.header .right-header {
    width : 40%;
    display: flex;
    font-size:20px;
    margin : 5px 0;
    line-height: 30px;
    text-align: center;
    justify-content: center;
}
.header .right-header .donation{
    height : 50px;
    margin : 5px 20px;
    text-align: center;
    width: 20%;
}
.header .right-header .donationbill{
    height : 50px;
    margin : 5px 20px;
    text-align: center;
    width: 30%;
    
}
.sidenav {
    height: 30vh;
    width: 0;
    position: fixed;
    z-index: 2000;
    top: 80px;
    right: 0;
    background-color: #a81431;;
    overflow-x: hidden;
    transition: 0.5s;
    padding-top: 60px;
    border-radius: 20px;
}

@media screen and (min-width: 799px){
    .sidenav{
        width: 250px;
    }
}

@media only screen and (max-width: 798px) {
    .sidenav{
        width: 100vw;
    }
}

.sidenav a {
    padding: 8px 8px 8px 32px;
    text-decoration: none;
    font-size: 25px;
    color: rgb(255, 255, 255);
    display: block;
    transition: 0.3s;
    padding : 8px;
    margin : 10px 10px;
}

.sidenav a:hover {
    color: silver;
    font-size: larger;
}

.sidenav .closebtn {
    position: absolute;
    top:0px;
    right: 0;
    font-size: 36px;
    margin-left: 50px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
}
.donationbill >a {
	background:linear-gradient(to bottom, white 5%, white 100%);
	display:inline-block;
	cursor:pointer;
	font-family:Arial;
    margin: 6px;
	padding:5px 5px;
    border-radius: 15px;
    font-size : 20px;
    font-weight: bolder;
}
.donationbill >a:hover {
	background:linear-gradient(to bottom, silver 5%, silver 100%);
	background-color:#bab1ba;
    font-size: larger;
}
.donationbill >a:active {
	position:relative;
	top:1px;
}

.donation >a {
	background:linear-gradient(to bottom, wihte 5%, wihte 100%);
	background-color:#cfcece;
	border-radius:15px;
	display:inline-block;
	cursor:pointer;
	font-family:Arial;
    margin: 6px;
	padding:5px 5px;

}
.donation >a:hover {
	background:linear-gradient(to bottom, silver 5%, silver 100%);
	background-color:#bab1ba;
    font-size: larger;
}
.donation >a:active {
	position:relative;
	top:1px;
}
.header .right-header .login{
    height : 50px;
    margin : 5px 20px;
    line-height: 40px;
    text-align: center;
    width: 15%;
}
.login >a {
	background:linear-gradient;
	
	border-radius:5px;
	display:inline-block;
	cursor:pointer;
	font-family:Arial;
    margin: 3px;
	padding:2px 2px;
    color : silver;

}
.login >a:hover{
    color:white;
    font-size: larger;
}
.mypage{
    position:absolute;
    top : 32px;
    right: 50px;
}
.mypage >a {
	background:linear-gradient;
	border-radius:5px;
	display:inline-block;
	cursor:pointer;
	font-family:Arial;
    margin: 3px;
	padding:2px 2px;
    color : silver;
}
.mypage >a:hover{
    color:white;
    font-size: larger;
}
.bottom_box div{
    padding-top: 10px;
    margin-left :30px;
}
.bottom_box{
    width: 100%;
    height: 20vh;
    background-color: #a81431;
    color: silver;
    margin-bottom: 50px;
}
.bottom_box div{
    
    max-width: 1400px;
    margin : 0 auto;
}
.bottom_box h3{
    margin-top: 5px;
    font-size : 30px;
}
.bottom_box p{
    font-size: 20px;
    margin: 5px 0 10px 0;
}
.inquary{
    width:100%;
    max-width: 1400px;
    margin : 0 auto;
    display : flex;
    background-color: silver;
    align-items: center;
    
}
.inquary div{
    max-width: 1400px;
    margin: 0 auto;
}
.inquary a{
    display: inline-block;
    line-height: 50px;
    padding : 0 30px;
    margin-right : 10px;
    font-size: 20px;
}
.bottom_info{
    width: 100%;
    display:flex;
    max-width: 1400px;
    background-color: none;
    color: #1e1f21;
    justify-content: space-between;
    margin:0 auto;
    background-color: #f4f4f4;
    padding : 0 11vw;
}
.bottom_info{
    height: 20vh;
}
.bottom_info .footer-l{
    width: 50%;
    height: 100%;
}
.bottom_info .footer-r{
    width: 50%;
    height: 100%;
    
    
}
.bottom_info .footer-l h3 {
    margin : 30px 0 30px 0;
    font-size: 30px;
    text-align: left;
}
.bottom_info .footer-l p{
    font-size: 20px;
    font-weight:500;
    text-align: left;
}
.bottom_info .footer-r p{
    font-size: 20px;
    margin : 20px;
    font-weight:500;
    text-align: right;
}
.intro-icon2{
    display : flex;
    justify-content: center;
}
.intro-icon2 > i{
    font-size: 40px;
    padding : 20px;
    text-align: center;
}

.goupbtn{ 
    top: 70%; 
    left: 90%; 
    width: 50px; 
    height: 50px; 
    border-radius: 80%; 
    font-size: 15px;
    font-weight: 700;
    background-color: silver;; 
    border: none;
    position: fixed; z-index: 2; 
    cursor: pointer;
}

.gobackbtn{ 
    top: 63%; 
    left: 90%; 
    width: 50px; 
    height: 50px; 
    border-radius: 80%; 
    font-size: 15px;
    font-weight: 700;
    background-color: silver; 
    border: none;
    position: fixed; z-index: 2; 
    cursor: pointer;
}

.footer-box{
    background-color: silver;
}
.bottom-info-box{
    background-color: #f4f4f4;
}
</style>

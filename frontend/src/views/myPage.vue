<template>
    <div>
        <nav class="main-nav">
             <router-link to="/main"> <img src="../assets/logo.png"> </router-link>
            <ul class="nav">
                <li><router-link to="/main">홈</router-link></li>
                <li><router-link to="#">TV프로그램</router-link></li>
                <li><router-link to="#">영화</router-link></li>
                <li><router-link to="/subscriptionpage">이용권</router-link></li>
                <li><router-link to="/mypage">MY</router-link></li>
                <li><router-link to="/faq">FAQ</router-link></li>
            </ul>
            <div class="nav-1">
              <form class="nav-search">
                    <input type="text" placeholder="검색어를 입력해주세요." name="search">
              </form>
            </div>

        </nav>
        <header>
            <div class="header-img">
                <!-- <img src="../assets/profile/1.png" alt="my_profile_img" class="profile-image"> -->
                <img :src="profile.img" alt="my_profile_img" class="profile-image">
            </div>
            <div class="profile-content">
                <h2 class="profile-name">{{profile.name}}&nbsp;&nbsp;&nbsp;</h2>
                <router-link to="/profile" class="profile-btn">프로필 전환</router-link>
                <br>
                <p>나의 이용권&nbsp;&nbsp;|&nbsp;&nbsp;<router-link to="/subscriptionpage">스탠다드 정기권</router-link></p>
            </div>
        </header>
        <main class="main">
            <h3>전체 시청 내역</h3>
            <hr color="grey" size="0.5px" width="80%">
            <div class="content-history">
                <div class="content0">
                    <router-link to="/movie"><img src="../assets/spiderman.png"></router-link>
                    <p>스파이더맨:노 웨이 홈</p>
                    <br>
                </div>
                <div class="content1">
                    <img src="../assets/content1.jpg">
                    <p>옷소매 붉은 끝동</p>
                    <p>10회</p>
                </div>
                <div class="content2">
                    <router-link to="/tvpro"><img src="../assets/content2.jpg"></router-link>
                    <p>그 해 우리는</p>
                    <p>8회</p>
                </div>
                <div class="content3">
                    <img src="../assets/content3.jpg">
                    <p>왕자의 게임 시즌8</p>
                    <p>4회</p>
                </div>
                </div>
                <h3>구독한 프로그램</h3>
                <hr color="grey" size="0.5px" width="80%">
                <div class="content-program">
                    <div class="content3">
                        <img src="../assets/content3.jpg">
                        <p>왕좌의 게임 시즌8</p>
                </div>
            </div>
        <h3>찜한 영화</h3>
        <hr color="grey" size="0.5px" width="80%">
        <div class="content-movie">
            <div class="content4">
            <img src="../assets/content4.jpg">
            <p>모가디슈</p>
            </div>
            <div class="content5">
            <router-link to="/movie"><img src="../assets/spiderman.png"></router-link>
            <p>스파이더맨 : 노 웨이 홈</p>
            </div>
        </div>
        <h3>문의 내역</h3>
        <hr color="grey" size="0.5px" width="80%">
        <div class="qna-history">
            <p>문의하신 내역이 없습니다.</p>
        </div>
        </main>

        <footer>
            <hr color="grey" size=0.1px;>
            <ul>
                <li><a href="">회사소개</a></li>
                <li><a href="">서비스 소개</a></li>
                <li><a href="">이용약관</a></li>
                <li><a href="">개인정보 처리방침</a></li>
                <li><a href="">고객센터</a></li>
            </ul>
            <p>7조 주식회사 | 대표이사 ooo | 고객센터 1234-5678 (평일 9:00~18:00) / 점심시간 12:00~13:00 / 주말 및 공휴일 휴무 </p>
            <p>사업자등록번호 123-45-67890 | 호스팅서비스제공자: 마이크로소프트 유한회사</p>
            <p>통신판매업 신고번호: 제 2021-서울강남구-1234호 | 통신판매업 정보 공개 : <a href="https://www.multicampus.com">https://www.multicampus.com</a></p>
            <p>서울특별시 강남구 언주로 508 14층(역삼동, 서울상록빌딩)</p>
            <p class="copyright">Copyright&#169; (주)풀스택개발-7조 All rights reserved.</p>
        </footer>

    </div>
</template>

<script>
export default {
    data(){
        return{
            profile:{}
        }
    },
    mounted(){
        this.profile = this.$store.state.profile;
    }
}
</script>

<style scoped>
   * {
    box-sizing: border-box;
    color: white;
    }

    body {
    margin: 0;
    padding: 0;
    text-align: center;
    font-family: 'Roboto', sans-serif;
    color: #222;
    background:  rgb(6, 3, 37);
    }

    a {
    text-decoration: none;
    color: white;
    }

    .main-nav {
    width: 100%;
    background: rgb(6, 3, 37);
    min-height: 30px;
    padding:10px;
    padding-left: 250px;
    position: fixed;
    overflow: hidden;
    display: block;
    text-align: left;
    }
    .main-nav img{
    display: inline-block;
    width:150px;
    height:40px;
    margin: 10px;
    }
    .nav {
    font-weight: 700;
    list-style-type: none;
    margin: 10px 0 0 0;
    padding: 0;
    overflow: hidden;
    margin-left: 50px;
    display: inline-block;
    position: fixed;
    }
    .nav ul{
    font-size: 0;
    margin:0;
    padding:0;
    display: block;
    }
    .nav li {
    padding: 5px 10px 10px 10px;
    display: inline-block;
    }
    .nav a:hover {
    color: rgb(240, 207, 23);
    }
    .nav-1{
      padding: 10px;
      position: inherit;
      display: inline-block;
      margin-left: 600px;
    }
    .nav-search{
        width: 300px;
    }
    .nav-search>input[type=text]{
    width:100%;
    padding:10px 20px;
    margin:0;
    border: 0.1px solid white;
    background-color: rgb(6, 3, 37);
    border-radius: 30px;
    }
    .header-wrap{
    padding-left: 150px;
    display: block;
    }
    header {
    text-align: center;
    background-color:rgb(27, 24, 63);
    padding-top: 60px;
    padding-left: 100px;
    padding-right: 100px;
    display: flex;
    line-height: 1;
    text-align: left;
    }
    header .profile-image {
    display: inline-block;
    margin-top: 70px;
    margin-bottom: 70px;
    margin-left: 250px;
    width: 100px;
    height: 100px;
    border-radius: 15px;
    border: 4px solid white;
    transition: all .5s;
    }
    header .profile-image:hover {
    transform: scale(1.2) rotate(5deg);
    }
    .profile-content{
    margin-top: 70px;
    margin-left: 30px;
    display: inline-block;
    }
    .profile-content p>a{
    color: #ccc;
    font-weight: bold;
    }
    .profile-name{
    display: inline-block;
    color: white;
    }
    .profile-btn{
    background-color: rgb(255,232,18);
    border:none;
    border-radius: 5px;
    color: black;
    padding: 7px 7px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 12px;
    cursor: pointer;
    }
    .my-plan{
    display: inline-block;
    }
    .main{
    padding-left:70px;
    padding-right:70px;
    padding-top: 70px;
    }
    .main h3{
    text-align: left;
    padding-left: 190px;
    color: white;
    }
    .content-history{
    display: block;
    text-align: left;
    padding-left: 200px;
    }
    .content-history p{
    line-height: 0.5em;
    text-align: center;
    }
    .content-history img{
    border: 2px solid white;
    border-radius: 50%;
    height: 150px;
    width: 150px;
    }
    .content1, .content2, .content3, .content4, .content5, .content0{
    display: inline-block;
    margin: 20px;

    }
    .content2 img:hover, .content5 img:hover, .content0 img:hover {
        transform:scale(1.1);
        transition: all 0.3s ease-in-out;
    }
    .content-program{
    display: block;
    text-align: left;
    padding-left: 200px;
    }
    .content-program img{
    height: 300px;
    width: 270px;
    }
    .content-movie{
    display: block;
    text-align: left;
    padding-left: 200px;
    }
    .content-movie img{
    height: 300px;
    width: 270px;
    }

    .qna-history{
    height: 400px;
    text-align: center;
    }

    footer {
    width: 100%;
    min-height: 30px;
    padding: 20px 0 40px 20px;
    text-align: center;
    }

    footer .copyright {
    font-size: .75em;
    }

    footer ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    }

    footer ul li {
    display: inline-block;
    margin: 7px;
    font-size: .85em;
    }
    footer p{
    color:#ccc;
    font-size: .75em;
    }


</style>
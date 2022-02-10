<template>

<div id="app">
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

  <body>
    <div id="container">
    <section id="body1">

      <br><br><br>
     <p align="middle"><iframe src="https://www.youtube.com/embed/W7edvITC9g4"
     width="1400px" height="700px" frameborder="0"></iframe></p>

    <h1>스파이더맨: 노 웨이 홈</h1>
     <h4>영화정보</h4>
     <p>상영시간 : 2시간 28분</p>
     <h4>줄거리</h4>
     <p class="story">‘미스테리오’의 계략으로 세상에 정체가 탄로난
 스파이더맨 ‘피터 파커’는 하루 아침에 평범한 일상을 잃게 된다.<br>
 문제를 해결하기 위해 ‘닥터 스트레인지’를 찾아가 도움을 청하지만
 뜻하지 않게 멀티버스가 열리면서 각기 다른 차원의 불청객들이 나타난다.<br>
 ‘닥터 옥토퍼스’를 비롯해 스파이더맨에게 깊은 원한을 가진 숙적들의 강력한 공격에
 ‘피터 파커’는 사상 최악의 위기를 맞게 되는데…</p>

    </section>

<section>
<hr>
    <h4>관련 영화 추천</h4>
                <div class="content-program">
                    <div class="content3">
                        <a href="#"><img src="../assets/action/avengers.jpg"></a>
                        <p>어벤져스</p>
                    </div>
                    <div class="content3">
                        <a href="#"><img src="../assets/action/doctor.png"></a>
                        <p>닥터 스트레인지</p>
                    </div>
                    <div class="content3">
                        <a href="#"><img src="../assets/action/ironman3.png"></a>
                        <p>아이언맨3</p>
                    </div>
                    <div class="content3">
                        <a href="#"><img src="../assets/action/black.png"></a>
                        <p>블랙위도우</p>
                    </div>
                    <div class="content3">
                        <a href="#"><img src="../assets/action/thor.png"></a>
                        <p>토르:라그나로크</p>
                    </div>
                </div>
  </section>
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
  </body>
  </div>
</template>




<script>

export default {
  name: 'app',
  data () {
    return {
     

    }
  },
  components: {

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
    padding: 10px;
    text-align: center;
    font-family: 'Roboto', sans-serif;
    color: #222;
    background: rgb(27, 24, 63);
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

h1 {
  font-weight:bold;
  font-size: 40px;
  letter-spacing: 0.5em;
  line-height: 1;
  color: white;
}
h4{
   font-size: 20px;
}
 .header-wrap{
    padding-left: 150px;
    display: block;
    }
    header {
    text-align: center;
    background-color:black;
    padding-top: 60px;
    padding-left: 100px;
    padding-right: 100px;
    display: block;
    line-height: 1;
    text-align: left;
    }
    header h2{
      text-align: left;
      opacity: 0.5;
    }

    iframe{
      padding-top:40px;

    }




 .content3{
    display: inline-block;
    margin: 20px;
    }
  .content-program{
    display: block;
    text-align: center;
    padding-left: 100px;
    }
    .content-program img{
    height: 200px;
    width: 150px;
    }


 footer {
    width: 100%;
    min-height: 30px;
    padding: 20px 0 40px 20px;
    text-align: center;
    background-color: rgb(6, 3, 37);
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
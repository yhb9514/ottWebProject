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
     <p align="middle"><iframe src="https://www.youtube.com/embed/QaxgdVsyzmg"
     width="1400px" height="700px" frameborder="0"></iframe></p>

    <h1>그 해 우리는 8회</h1>
     <h4>드라마정보</h4>
     <p>상영시간 : 60분</p>
     <h4>줄거리</h4>
     <p class="story">얼떨결에 오게 된 새로운 여행지에서,

각자 지난 과거의 여행을 회상하는 웅과 연수.<br>

그 기억은 지난 과거 주제에 지나치게 선명하다.</p>

    </section>

<section>
  <hr>
    <h4>지난 회차</h4>

                <div class="content-program">
                    <div class="content">
                        <a href="#"><img src="../assets/content2.jpg"></a>
                        <p>그 해 우리는 1회</p>
                    </div>
                    <div class="content">
                       <a href="#"><img src="../assets/content2.jpg"></a>
                        <p>그 해 우리는 2회</p>
                    </div>
                    <div class="content">
                        <a href="#"><img src="../assets/content2.jpg"></a>
                        <p>그 해 우리는 3회</p>
                    </div>
                    <div class="content">
                        <a href="#"><img src="../assets/content2.jpg"></a>
                        <p>그 해 우리는 4회</p>
                    </div>
                    <div class="content">
                        <a href="#"><img src="../assets/content2.jpg"></a>
                        <p>그 해 우리는 5회</p>
                    </div>
                    <div class="content">
                        <a href="#"><img src="../assets/content2.jpg"></a>
                        <p>그 해 우리는 6회</p>
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




 .content{
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
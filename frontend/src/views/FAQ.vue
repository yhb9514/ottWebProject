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
            <div class ="bgimg">
            <br><br>
            <h1> FAQ</h1>
            <hr>
            <form class="help-search">
                <input type="text" placeholder="도움이 필요하신가요???" name="search">
            </form>
            <br><br><br>
            </div>
        </header>

        <main class="main">
            <h3>자주 묻는 질문</h3>
            <hr>

            <ul class="qna">
            <li>
                <input type="checkbox" id="qna-1">
                <label for="qna-1">타인의 내 계정 사용을 중단시키는 방법</label>
                <div>
                    <p>누군가가 동의 없이 내 계정을 사용하고 잇는 경우 다음의 작업을 수행하여 더이상 사용하지 못하도록 해주세요</p>
                    <p> 다음과 같은 비밀번호 사용을 권장합니다.</p>
                    <p>1. 다른 웹사이트나 앱에서는 사용하지 않는 한정된 비밀번호를 사용합니다.</p>
                    <p>2. 8자 이상의 비밀번호</p>
                    <p>3. 대문자와 소문자를 모두 사용한 문자, 숫자 및 기호의 조합</p>
                </div>
            </li>
            <li>
                <input type="checkbox" id="qna-2">
                <label for="qna-2">등록한 환불계좌를 등록/변경하고 싶어요.</label>
                <div>
                    <p>마이페이지에서 환불계좌 등록 및 수정이 가능합니다. 환불계좌는 주문자 명의의 본인 계좌만 등록할 수 있습니다.</p>
                    <p>주문 진행 상태가 '환불진행중' 또는 '환불완료' 에서는 환불계좌를 변경할 수 없습니다.</p>
                </div>
            </li>
            <li>
                <input type="checkbox" id="qna-3">
                <label for="qna-3">'최근 결제에 문제가 있어 계정이 보류 중입니다.'라는 메시지가 표시됩니다.</label>
                <div>
                    <p>결제가 이루어지지 않았음을 나타냅니다. 다음과 같은 몇가지 이유 때문일 수 있습니다.</p>
                    <p>1. 결제 수단의 자금이 부족합니다.</p>
                    <p>다른 미결된 요금 또는 인증으로 인해 카드로 사용할 수 있는 잔액에 영향이 있을 수 있습니다.</p>
                    <p>결제 수단이 만료되거나 더이상 유효하지 않습니다.</p>
                    <p>금융 기관에서 월별 청구를 승인하지 않았습니다.</p>
                    <p>미국만 해당: 계정에 등록된 신용카드 우편번호가 은행에 기록된 것과 다릅니다.</p>
                </div>
            </li>
            <li>
                <input type="checkbox" id="qna-4">
                <label for="qna-4">멤버십 변경 방법</label>
                <div>
                    <p>DEEPSEA 계정에 로그인합니다.</p>
                    <p> 이용권 상세 정보에서 멤버십 변경을 선택합니다. (멤버십 변경이 표시되지 않는 경우, DEEPSEE에 문의하세요.)</p>
                    <p> 참고) 계정이 보류 상태인 경우 보류 상태가 해제되어야 멤버십을 변경할 수 있습니다.</p>
                    <p> 원하는 멤버십을 선택하고 다음 또는 업데이트를 선택합니다.</p>
                    <p> 변경 사항 확인 또는 확인을 선택합니다.</p>
                </div>
            </li>
            <li>
                <input type="checkbox" id="qna-5">
                <label for="qna-5">이용권에 대해서 문의하려면 어떻게 해야 하나요?</label>
                <div>
                    <p>상품에 관한 내용은 상품상세 화면에 자세히 안내되어 있습니다. 마이페이지 > 결제부분에서 상세페이지로 이동합니다.</p>
                    <p>이용권 상세 내용에 표시되어 있지 않은 내용은 판매자에게 문의해 주십시오.</p>
                    <p>> 판매자에게 문의</p>
                    <p>홈페이지 내 최하단에 표기된 판매자 연락처로 문의</p>
                </div>
            </li>
        </ul>



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
    .help-search{
    text-align: center;
    margin-top: 100px;
    }
    .help-search>input[type=text]{
    width:70%;
    height:50%;
    padding:10px 20px;
    margin:0;
    border: 0.5px solid white;
    background-color: rgb(6, 3, 37);
    border-radius: 50px;
    }
    .header-wrap{
    padding-left: 150px;
    display: block;
    }
    header {
    text-align: center;
    background-color:rgb(27, 24, 63);
    padding-top: 60px;
    display: block;
    line-height: 1;
    text-align: left;

    }
    header h2{
      text-align: left;
      opacity: 0.5;
    }
    .bgimg{
    width:100%;
    background-image: url(../assets/bg-img/bg-img2.png);
    opacity: 20%;

    }


    hr{
      color: gray;
      size: 0.5px;
      width: 90%;
    }
    h1{
        font-size: 50px;
        text-align: center;

    }
    .main{
    padding-left:70px;
    padding-right:70px;
    padding-top: 70px;
    background-color: rgb(6, 3, 37);
    }
    .main h3{
    text-align: center;
    padding-left: 0px;
    color: white;
    }
    .layout{
    max-width: 600px;
    margin: 0 auto;
}

.qna{
    list-style: none;
    margin: 0;
    padding: 0;
}
.qna > li{
  padding: 10px 0;
  box-sizing: border-box;
}
.qna > li:nth-child(n+2){ /* 아이템 구분 점선 */
  border-top: 1px dashed #aaa;
}
.qna input {
  display: none;
}

.qna label { /* 제목 - 클릭 영역 */
  font-weight: bold;
  color: white;
  margin: 20px 0 0;
  cursor: pointer;
}
.qna label::before { /* 제목 앞 화살표 */
  display: block;
  content: "";
  width: 0;
  height: 0;
  border: 8px solid transparent;
  border-left: 8px solid rgb(240, 207, 23);
  margin: 2px 0 0 8px;
  float: left;
}
.qna input:checked + label::before { /* 내용 펼침 상태 제목 앞 화살표 */
  border: 8px solid transparent;
  border-top: 8px solid rgb(240, 207, 23);
  border-bottom: 0;
  margin: 8px 4px 0;
}

.qna div { /* 내용 영역 - 기본 감춤 상태 */
  display: none;
  color: #666;
  font-size: 0.9375em;
  overflow: hidden;
  padding: 10px 0 10px 30px;
  box-sizing: border-box;
  transition: max-height 0.4s;
}
.qna input:checked + label + div { /* 내용 영역 펼침 */
  display: block;
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
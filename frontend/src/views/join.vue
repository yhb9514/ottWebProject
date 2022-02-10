<template>
    <div id="app">
    
    
    
    
    
    
    
        <div>
    
    
    
            <router-link to="/"><img src="@/assets/logo.png"></router-link>
    
    
    
        </div>
    
    
    
    
    
    
    
        <form border="1" class="join" action="POST" id="join">
    
    
    
            <h2>회원 가입</h2>
    
    
    
            <hr>
    
    
    
            <label>이메일</label><br>
    
    
    
            <input type="text" name="email" id="email" placeholder="이메일을 입력하세요">
    
            <input type="button" name="emailCheck" id="emailCheck" @click="emailCheck()" value="중복 확인"><br><br>
    
    
    
            <label>비밀번호</label><br>
    
    
    
            <input type="password" name="pwd" id="pwd" placeholder="비밀번호를 입력하세요"><br><br>
    
    
    
            <label>비밀번호 확인</label><br>
    
    
    
            <input type="password" name="ck_pwd" id="ck_pwd" placeholder="비밀번호를 입력하세요"><br><br>
    
    
    
            <label>이름</label><br>
    
    
    
            <input type="text" name="name" id="name" placeholder="이름을 입력하세요"><br><br>
    
    
    
            <label>핸드폰 번호</label><br>
    
    
    
            <input type="text" name="phoneNumber" id="phoneNumber" placeholder="-빼고 입력하세요"><br><br>
    
    
    
            <label>생년월일</label><br>
    
    
    
            <input type="date" name="birthDate" id="birthDate"><br><br><br>
    
    
    
            <label>*약관 동의</label>
    
    
    
            <p>예, 저는 개인정보에 따른 처리방에 따른<br> 개인정보 수집 및 활용에 동의합니다.<br>
    
    
    
                <input type="checkbox" value="Y" name="agree" id="agree"></p>
    
    
    
            <input type="button" class="joinBtn" @click="join()" value="회원가입">
    
    
    
    
    
    
    
        </form>
    
    
    
    
    
    
    
    
    
    
    
    </div>
</template>

<script>
import axios from 'axios';

export default {
    data() {
        return {}
    },
    methods: {
        async join() {
            var email = document.getElementById("email").value;
            var pwd = document.getElementById("pwd").value;
            let name = document.getElementById('name').value;
            var ck_pwd = document.getElementById("ck_pwd").value;
            var phoneNumber = document.getElementById("phoneNumber").value;
            var birthDate = document.getElementById("birthDate").value;
            var agree = document.getElementById("agree").checked;

            //비밀번호 제약
            var pwdRe = /^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,24}$/;


            //비밀번호
            if (pwd == '') {
                alert('비밀번호를 입력해 주세요');
                pwd.focus();
                return false;
            }

            if (!pwdRe.test(pwd)) {
                alert("비밀번호는 영문자+숫자+특수문자(8자~24자)의 조합입니다. ");
                pwd.focus();
                return false;
            }
            //비밀번호 확인
            if (ck_pwd == '') {
                alert('비밀번호 확인을 입력해 주세요');
                ck_pwd.focus();
                return false;
            }
            //비밀번호, 비밀번호 확인 같은지 검사
            if (pwd !== ck_pwd) {
                alert("비밀번호가 다릅니다. 다시 확인해 주세요.");
                ck_pwd.focus();
                return false;
            }

            //핸드폰
            if (phoneNumber == '') {
                alert('핸드폰 번호를 입력해 주세요');
                phoneNumber.focus();
                return false;
            }
            if (name == '') {
                alert('이름을 입력해 주세요');
                name.focus();
                return false;
            }

            //생년월일
            if (birthDate == '') {
                alert('생년월일을 입력해 주세요');
                birthDate.focus();
                return false;
            }

            //약관 동의
            if (!agree) {
                alert('약관동의를 체크해 주세요');
                agree.focus();
                return false;
            }


            axios.post('/api/join', {
                    email: email,
                    pwd: pwd,
                    name: name,
                    phoneNumber: phoneNumber,
                    birthDate: birthDate
                })
                .then(res => {
                    console.log(res);
                    alert("회원가입되었습니다.")
                    window.location.href = '/';
                })
                .catch(err => {
                    console.log(err);
                })
        },
        async emailCheck() {
            var emailRe = /^[A-Za-z0-9_\\.\\-]+@[A-Za-z0-9\\-]+\.[A-Za-z0-9\\-]+/;
            var email = document.getElementById("email").value;

            if (email == "") {
                alert('이메일을 입력해 주세요');
            } else {
                await axios.get('/api/emailCheck', { params: { email : email } }).
                then(res => {
                    console.log(res);
                    if (res.data == true)
                        alert("사용가능한 이메일 입니다.");
                    else{
                        alert("중복된 이메일 입니다.");
                        document.getElementById("email").focus();
                    }
                }).catch(err => {
                    console.log(err);
                })
            }
            if (!emailRe.test(email)) {
                alert("올바른 메일 형식이 아닙니다.");
                document.getElementById("email").focus();
                return false;
            }
        }
    },

}
</script>

<style scoped>
body {
    background-color: rgb(6, 3, 37);
    color: white;
    margin: 0px;
    padding: 0px;
    font-family: 'Roboto', sans-serif;
}

img {
    display: inline-block;
    width: 300px;
    height: 100px;
    margin: 10px;
}

.joinBtn {
    color: black;
    background: rgb(255, 232, 18);
    font-size: 1.1rem;
    font-weight: bold;
    text-align: center;
    display: inline-block;
    width: 150px;
    height: 30px;
    border-radius: 5px;
    margin: 10px;
}

.joinBtn:hover {
    background: white;
    color: black;
}

form {
    text-align: center;
    border: 1px ridge red;
    width: 500px;
    height: 700px;
    background: black;
    border-radius: 8px;
    padding: 20px;
    position: absolute;
    left: 50%;
    top: 50%;
    transform: translate(-50%, -50%);
    border: 3px solid white;
    opacity: 0.9;
}

#email,
#pwd,
#ck_pwd,
#phoneNumber,
#birthDate,
#name {
    height: 25px;
    width: 200px;
}

#email{
    margin-left: 90px;
}

#emailCheck{
    color: black;
    background: rgb(255, 232, 18);
    text-align: center;
    width: 80px;
    height: 30px;
    border-radius: 5px;
    margin: 10px;
}

#emailCheck:hover{
    background: white;
    color: black;
}

.next {
    text-decoration: none;
    color: white;
    background-color: red;
    font-size: 1.0rem;
    font-weight: 400;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    width: 150px;
    height: 30px;
    border: 2px;
    border-radius: 5px;
    margin: 10px;
}
</style>
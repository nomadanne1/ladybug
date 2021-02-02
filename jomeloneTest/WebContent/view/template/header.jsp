<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <div class="jb-box">
            <video muted autoplay loop>
                <source src="${pageContext.request.contextPath}/images/JoMelone.mp4" type="video/mp4">
                <strong>Your browser does not support the video tag.</strong>
              </video>
        <header>
            <p class="jomel"><a href="main.do">Jo Melone</a></p>
        </header>
        <nav>
            <ul class="topnav">
                <li class="dropdown">
                    <a href="brandintro.do" class="dropbtn">브랜드소개</a>
                    <ul class="dropdown-content">
                        <li><a href="brandintro.do">JoMelone 소개</a></li>
                        <li><a href="#">Gallay</a></li>
                        <li><a href="#">Jo Melone 소식</a></li>
                        <li><a href="#">사용자 팁</a></li>
                      </ul>
                </li>
                <li class="dropdown">
                    <a href="#news" class="dropbtn">제품구매</a>
                    <ul class="dropdown-content">
                        <li><a href="#">향수</a></li>
                        <li><a href="#">헤어/바디</a></li>
                        <li><a href="#">페이셜</a></li>
                        <li><a href="#">이벤트</a></li>
                        <li><a href="#">향수추천</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#contact" class="dropbtn">고객센터</a>
                    <ul class="dropdown-content">
                        <li><a href="#">프로모션</a></li>
                        <li><a href="#">공지사항</a></li>
                        <li><a href="#">Q&A</a></li>
                        <li><a href="#">FAQ</a></li>
                      </ul>
                </li>
                <li class="dropdown">
                    <a href="textReview.do" class="dropbtn">사용후기</a>
                    <ul class="dropdown-content">
                        <li><a href="textReview.do">텍스트리뷰</a></li>
                        <li><a href="photoReview.do">포토리뷰</a></li>
                        <li><a href="#">소셜리뷰</a></li>
                      </ul>
                </li>
 	<c:if test="${login}">
                <li class="right"><a href="myinfo.do">나의정보</a></li>
                <li class="right"><a href="logout.do">로그아웃</a></li>
    </c:if>
    <c:if test="${empty login}">
     			<li class="right"><a href="join.do">회원가입</a></li>
                <li class="right"><a href="login.do">로그인</a></li>
    </c:if>
              </ul>
        </nav>
        </div>
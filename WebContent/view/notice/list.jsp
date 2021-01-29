<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>

<head>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <!-- Icon -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
        integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">

    <style>
        .notice {
            text-align: center;
        }
        .search_select {
            height: 30px;
        }

        .search_box{
            margin-left: auto;
            margin-right: auto;
        }
        .pagination{
            justify-content: center;
        }


       
    </style>

</head>

<body>
    <br><br>
    <h2 class="notice">공지사항</h2>
    <br><br>

    <div class="container">

        <main class="main">

            <!-- 검색 -->
            <form>
            <table class="search_box">
                <tr>
                    <td>
                        <select class="search_select" name="f">
                            <option value="title">제목</option>
                            <option value="writer_id">작성자</option>
                        </select>
                    </td>
                    <td>
                       <!-- <form action="/action_page.php" method=""> -->
                            <input type="text" name="q">
                            <button type="submit">검색</button>
                       <!-- </form> -->
                    </td>
                </tr>
            </table><br>
            </form>

            <!-- 목록 -->
            <table class="table">
                <thead>
                    <tr>
                        <th>번호</th>
                        <th>제목</th>
                        <th>작성자</th>
                        <th>작성일</th>
                        <th>조회수</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>조멜론 상담시간 및 휴무 안내 </td>
                        <td>조멜론</td>
                        <td>2011-01-02</td>
                        <td>200</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>조멜론 카카오 알림톡 서비스</td>
                        <td>조멜론</td>
                        <td>2011-01-02</td>
                        <td>202</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>조멜론 Seoul Award 2년 연속 수상!</td>
                        <td>조멜론</td>
                        <td>2011-01-02</td>
                        <td>1100</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>조멜론 Seoul Award 2년 연속 수상!</td>
                        <td>조멜론</td>
                        <td>2011-01-02</td>
                        <td>1100</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>조멜론 Seoul Award 2년 연속 수상!</td>
                        <td>조멜론</td>
                        <td>2011-01-02</td>
                        <td>1100</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>조멜론 Seoul Award 2년 연속 수상!</td>
                        <td>조멜론</td>
                        <td>2011-01-02</td>
                        <td>1100</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>조멜론 Seoul Award 2년 연속 수상!</td>
                        <td>조멜론</td>
                        <td>2011-01-02</td>
                        <td>1100</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>조멜론 Seoul Award 2년 연속 수상!</td>
                        <td>조멜론</td>
                        <td>2011-01-02</td>
                        <td>1100</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>조멜론 Seoul Award 2년 연속 수상!</td>
                        <td>조멜론</td>
                        <td>2011-01-02</td>
                        <td>1100</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>조멜론 Seoul Award 2년 연속 수상!</td>
                        <td>조멜론</td>
                        <td>2011-01-02</td>
                        <td>1100</td>
                    </tr>
                </tbody>
            </table>
    </div><br>

    <!-- 페이지 -->
    <ul class="pagination">
        <li class="page-item">
            <a class="page-link" href="#" aria-label="Previous">
                <span aria-hidden="true">&laquo;</span>
                <span class="sr-only">Previous</span>
            </a>
             <a class="page-link" href="#" aria-label="Previous">
                <span aria-hidden="true">&laquo;</span>
                <span class="sr-only">Previous</span>
            </a>
        </li>
        
        <li class="page-item"><a class="page-link" href="#">1</a></li>
        <li class="page-item"><a class="page-link" href="#">2</a></li>
        <li class="page-item"><a class="page-link" href="#">3</a></li>
      
        <li class="page-item">
            <a class="page-link" href="#" aria-label="Next">
                <span aria-hidden="true">&raquo;</span>
                <span class="sr-only">Next</span>
            </a>
            
             <a class="page-link" href="#" aria-label="Next">
                <span aria-hidden="true">&raquo;</span>
                <span class="sr-only">Next</span>
            </a>
            
        </li>
    </ul>

    </main>

    
</body>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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
        .btn-list {
            text-align: center;
        }
       
    </style>

</head>

<body>
    <br><br>
    <h2 class="notice">공지사항</h2>
    <br><br>
    <main>
        <table class="table">
            <thead>
                <tr>
                    <th>제목</th>
                    <th colspan="3">조멜론 Seoul Award 2년 연속 수상!</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th>작성일</th>
                    <td  colspan="3"> 2011-01-02</td>
                </tr>
                <tr>
                    <th> 작성자</th>
                    <td> 조멜론</td>
                    <th> 조회수</th>
                    <td> 1000</td>
                </tr>
                <tr class="content">
                    <td colspan="4">냉무</td>
                </tr>
            </tbody>
        </table>
        <div class="btn-list">
            <button type="button" class="btn btn-light" href="#">목록</button>
        </div><br>        
        <div class="margin-top">
            <table class="table border-top-default">
                <tbody>
                    
                    <tr>
                        <th>다음글</th>
                        <td colspan="3"  class="text-align-left text-indent">다음글이 없습니다.</td>
                    </tr>                    
                    <tr>
                        <th>이전글</th>
                        <td colspan="3"  class="text-align-left text-indent"><a class="text-blue text-strong" href="">조멜론 상담시간 및 휴무 안내 </a></td>
                    </tr>
                    
                </tbody>
            </table>
        </div>			
    </main>

    
</body>

</html>
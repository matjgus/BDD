<template>
<div>
    <div id="headers"></div>
    <div class="service-wrap">
        <div class="board">
            <h1>1:1 문의</h1>
            <form id="frm" action="/page/service_view/action" method="post">
                <input type="hidden" name="id" th:value="${info.id}">
                    <div class="write-form">
                        <ul>
                            <li class="board-ctg">
                                <div class="board-name"><h4>제목</h4></div>
                                <div class="board-data">
                                    <input type="text" class="form-control" name="title" th:value="${info.title}">
                                </div>
                            </li>
                            <li class="board-ctg">
                                <div class="board-name"><h4>내용</h4></div>
                                <div class="board-data">
                                    <textarea class="form-control" rows="5" cols="" name="content" th:text="${info.content}"></textarea>
                                </div>
                            </li>
                            <li class="board-ctg">
                                <div class="board-name"><h4>작성자</h4></div>
                                <div class="board-data">
                                    <input type="text" class="form-control" name="registerId" th:value="${info.registerId}">
                                </div>
                            </li>
                            <li class="board-ctg">
                                <div class="board-name"><h4>첨부파일</h4></div>
                                <div class="board-data" style="font-size: 20px;"><input type="file">
                                </div>
                            </li>
                        </ul>
                    </div>
                    <button type="button" class="btn btn-success" onclick="javascript:location.href='/page/service'">Previous</button>
                    <button type="submit" class="btn btn-primary">Edit</button>
                    <div class="float-right">
                    <button type="button" class="btn btn-danger" th:onclick="fnViewDelete()">Delete</button>
                </div>
            </form>
        </div>
    </div>
</div>
</template>

<style scoped>
.board{
    width: 100%;
    max-width: 1500px;
    margin: 0 auto;
    align-items: center;
    font-size: 25px;
    padding: 80px 50px;
}
.board > h1{
    text-align: center;
    font-size: 40px;
    letter-spacing: 7px;
    margin: 40px 0px;
}
.write-form{
    padding-right: 10%;
}
.board-ctg{
    display: flex;
    padding: 10px 0px;
    text-align: center;
}
.board-ctg .board-name{width: 20%;}
.board-ctg .board-data {width: 80%;}
.board-ctg .board-data input{width: 100%;}
.board-ctg .board-data textarea{width: 100%;height: 500px;}

.board-btn{margin-top:30px; text-align: center;}
.board-btn a{ border: 1.5px solid rgb(160, 156, 156); padding: 10px 20px; margin: 0px 20px;}

</style>
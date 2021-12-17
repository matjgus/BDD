<template>
    <div class="service-wrap">
		<sub-banner/>
        <div class="board">
            <h1>문의 수정</h1>
			<form id="frm" action="/page/service_view/action" method="post">
				<input type="hidden" name="id" th:value="${info.id}">
	            <div class="write-form">
	                <ul>
	                    <li class="board-ctg">
	                        <div class="board-name"><h4>제목</h4></div>
	                        <div class="board-data">
			    			<input type="text" class="form-control" name="title" th:value="${info.title}"></div>
	                    </li>
	                    <li class="board-ctg">
	                        <div class="board-name"><h4>내용</h4></div>
	                        <div class="board-data">
		    				<textarea class="form-control" rows="5" cols="" name="content" th:text="${info.content}"></textarea></div>
	                    </li>
	                    <li class="board-ctg">
	                        <div class="board-name"><h4>작성자</h4></div>
	                        <div class="board-data">
			    			<input type="text" class="form-control" name="registerId" th:value="${info.registerId}"></div>
	                    </li>
	                    <li class="board-ctg">
	                        <div class="board-name"><h4>첨부파일</h4></div>
	                        <div class="board-data" style="font-size: 20px;"><input type="file"></div>
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
</template>

<script>
import subBanner from '../components/SubBanner.vue';
export default {
    components:{subBanner},
  name: 'ServiceView',
}
</script>

<style scoped>

</style>

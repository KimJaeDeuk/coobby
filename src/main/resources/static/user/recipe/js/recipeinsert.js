$("#ingrplusbtn").click(() => {
	$("#ingrinputcontainer").append('<div id="ingrinputcontainer" class="row"><div class="col-sm-4"><input type="text" min="10" max="50" name="fitness-form-age" id="fitness-form-age" class="form-control required" value="" placeholder="예) 고추장"></div><div class="col-sm-4"><input type="text" min="10" max="50" name="fitness-form-age" id="fitness-form-age" class="form-control required" value="" placeholder="예) 2스푼"></div></div>')
})

$("#recipeplusbtn").click(() => {
	$(".list-preparation").append('<li><div class="recipeinsertcontainer"><textarea class="recipeinsert" rows="7"></textarea><img id="preview-image" class="recipeimg" src="/resources/user/images/about/1.jpg" alt="" /></div><div class="mb-3"><label for="formFile" class="form-label">Default file input example</label><input id="input-image" class="form-control" type="file" id="formFile"></div></li>')
})

function readImage(input) {
  // 인풋 태그에 파일이 있는 경우
  if(input.files && input.files[0]) {
      // 이미지 파일인지 검사 (생략)
      // FileReader 인스턴스 생성
      const reader = new FileReader()
      // 이미지가 로드가 된 경우
      reader.onload = e => {
          const previewImage = document.getElementById("preview-image")
          previewImage.src = e.target.result
      }
      // reader가 이미지 읽도록 하기
      reader.readAsDataURL(input.files[0])
  }
}
// input file에 change 이벤트 부여
const inputImage = document.getElementById("input-image")
inputImage.addEventListener("change", e => {
  readImage(e.target)
})


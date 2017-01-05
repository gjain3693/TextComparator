<Html>
<Title>Compare Text</Title>
<H1 style="text-align:center;">This is a Comparator</H1>

<input type="file" id="file-inputOfFileOne" />
<h3>Contents of the file one is:</h3>
<textarea id="file-contentOfFileOne" rows="27" cols="27" style="overflow:scroll;"></textarea>
<br></br>

<input type="file" id="file-inputOfFileTwo"/>
<h3>Contents of the file two is:</h3>
<textarea id="file-contentOfFileTwo" rows="27" cols="27" style="overflow:scroll;"></textarea>
<br></br>
<button type="button">Compare</button>
<script>

function readFileOne(e) {
  var fileOne = e.target.files[0];
  if (!fileOne) {
    return;
  }
  var readerOfFileOne = new FileReader();
  readerOfFileOne.onload = function(e) {
    var contentsFileOne = e.target.result;
    displayContentsOfFileOne(contentsFileOne);
  };
  readerOfFileOne.readAsText(fileOne);
}

function displayContentsOfFileOne(contentsFileOne) {
  var elementOfFileOne = document.getElementById('file-contentOfFileOne');
  elementOfFileOne.innerHTML = contentsFileOne;
}

function readFileTwo(e1) {
  var fileTwo = e1.target.files[0];
  if (!fileTwo) {
    return;
  }
  var readerOfFileTwo = new FileReader();
  readerOfFileTwo.onload = function(e1) {
    var contentsFileTwo = e1.target.result;
    displayContentsOfFileTwo(contentsFileTwo);
  };
  readerOfFileTwo.readAsText(fileTwo);
}

function displayContentsOfFileTwo(contentsFileTwo) {
  var elementOfFileTwo = document.getElementById('file-contentOfFileTwo');
  elementOfFileTwo.innerHTML = contentsFileTwo;
}


document.getElementById('file-inputOfFileOne')
  .addEventListener('change', readFileOne, false);

document.getElementById('file-inputOfFileTwo')
  .addEventListener('change', readFileTwo, false);

</script>
</html>




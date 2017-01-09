<html>
<head>
<Title>Compare Text</Title>
</head>
<body>
<H1 style="text-align:center;">This is a Comparator</H1>

<input type="file" id="file-inputOfFileOne" accept=".txt"/>
<h3>Contents of the file one is:</h3>
<textarea id="file-contentOfFileOne" rows="27" cols="27" style="overflow:scroll;"></textarea>
<br></br>

<input type="file" id="file-inputOfFileTwo" accept=".txt"/>
<h3>Contents of the file two is:</h3>
<textarea id="file-contentOfFileTwo" rows="27" cols="27" style="overflow:scroll;"></textarea>
<br></br>
<button type="button" id="compare">Compare</button>
</body>
<script type="text/javascript">

var elementIdForFileOne=document.getElementById("file-inputOfFileOne");
var elementIdForFileTwo=document.getElementById("file-inputOfFileTwo");

var elementOfFileOne = document.getElementById('file-contentOfFileOne');
var elementOfFileTwo = document.getElementById('file-contentOfFileTwo');

var compareButton= document.getElementById('compare');

compareButton.disabled=true;

elementIdForFileOne.addEventListener('change', function(e){readFileOne(e,elementOfFileOne)}, false);
elementIdForFileTwo.addEventListener('change', function(e){readFileOne(e,elementOfFileTwo)}, false);



function CheckFileName(fileName) {
        if (fileName == "") {
            console.log("Browse to upload a valid File with txt extension");
            return false;
        }
        else if (fileName.split(".")[1].toLowerCase() == "txt")
            return true;
        else {
            console.log("File with " + fileName.split(".")[1] + " is invalid. Upload a validfile with txt extensions");
            return false;
        }
        return true;
    }


function readFileOne(e,fileContent) {
  

  var fileOne = e.target.files[0];

if (!fileOne) {
    return;
  }
if(CheckFileName(fileOne.name)==true){
  
  var readerOfFileOne = new FileReader();
  readerOfFileOne.onload = function(e) {
  var contentsFileOne = e.target.result;

  fileContent.innerHTML = contentsFileOne;

if(elementOfFileOne.innerHTML !=="" && elementOfFileTwo.innerHTML !==""){
compareButton.disabled=false;
}

  };
readerOfFileOne.readAsText(fileOne);

}
else {
console.log('EXIT');
fileContent.innerHTML = "";
compareButton.disabled=true;


}
}


</script>
</html>



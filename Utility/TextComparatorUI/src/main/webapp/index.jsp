<html>
<head>
<Title>Compare Text</Title>
</head>
<body>
<H1 style="text-align:center;">This is a Comparator</H1>

<input type="file" id="file-inputOfFileOne" accept=".txt"/>
<h3>Contents of the file one is:</h3>
<div style="float:left;">
<textarea id="file-contentOfFileOne" rows="27" cols="27" style="overflow:scroll;"></textarea>
<br></br>

<input type="file" id="file-inputOfFileTwo" accept=".txt"/>
<h3>Contents of the file two is:</h3>
<textarea id="file-contentOfFileTwo" rows="27" cols="27" style="overflow:scroll;"></textarea>
<br></br>
</div>
<button type="button" id="compare" onclick="callService();">Compare</button>
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
console.log(fileContent.innerHTML);
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

function callService() {
 elementOfFileOne.value= elementOfFileOne.value.replace(/\\n/g,"\\n");
 elementOfFileTwo.value=elementOfFileTwo.value.replace(/\\n/g,"\\n");
 console.log("TextArea1     "+elementOfFileOne.value);
 console.log("TextArea2     "+elementOfFileTwo.value);
  var xmlhttp=new XMLHttpRequest();
  var url="http://localhost:8080/TextComparatorServer-0.0.1-SNAPSHOT/CompareText";
  var parameter={ "FileOneData":elementOfFileOne.value,"FileTwoData":elementOfFileTwo.value};
   
  xmlhttp.open("POST",url,true);
  xmlhttp.setRequestHeader("Content-type","application/json");
  xmlhttp.onreadystatechange=function() {
  if(xmlhttp.readyState==4 && xmlhttp.status==200) {
 
  var result=JSON.parse(xmlhttp.responseText);
  elementOfFileOne.value=result.FileOneData.replace(/\\n/g,String.fromCharCode(13, 10));
 
  elementOfFileTwo.value=result.FileTwoData.replace(/\\n/g,String.fromCharCode(13, 10));
  
  
  }
  }
  xmlhttp.send(JSON.stringify(parameter));
  
  
  }

</script>
</html>



/**
 * 
 */

document.getElementById("myForm").style.display="none";
document.getElementById("display").style.display="none";
document.getElementById("preview").style.display="none";
document.getElementById("download-btn").style.display="none";

const template = document.getElementById("display");

//This function is used to create inputFields dynamically
function inputSelector(fieldNames){
	   for(var i = 0;i <fieldNames.length;i++){
		   const inputDis = document.getElementById("myForm");
		   const inputDiv = document.createElement("div");
		   const errorMsg = document.createElement("div");
		   const labelName = document.createElement("label");
		   const createInput = document.createElement("input");
		   inputDiv.classList.add("inputDiv1");
		   errorMsg.classList.add("errorMsg");
		   createInput.type="text";
		   createInput.classList.add("inputdata");
		   createInput.id=fieldNames[i];
		   errorMsg.id = fieldNames[i]+"msg";
		   createInput.setAttribute("onblur",(fieldNames[i]+"validation()"));
		   labelName.innerHTML=fieldNames[i]+":";
		   inputDis.appendChild(inputDiv);
		   createInput.placeholder = fieldNames[i];
		   inputDiv.append(labelName);
		   inputDiv.appendChild(createInput);
		   inputDiv.appendChild(errorMsg);
	   }
	   document.getElementById("preview").style.display = "block";
}



 function changeTemplate(){
    const dropdown = document.getElementById("templateselector");
    const selector = dropdown.options[dropdown.selectedIndex].value; 
    if(selector=="Select"){
    	document.getElementById("myForm").style.display="none";
    	document.getElementById("display").innerHTML="";
    }else{
    	document.getElementById("myForm").innerHTML="";
    	if(selector=="template1"||selector=="template2"){
    		fieldNames= ["name","designation","email","MobileNo","Appointment","Image"];
    	}else if(selector=="template3"){
    		 fieldNames = ["name","email","ImageLink"];
    	}else{
    		fieldNames=[];
    	}
    	inputSelector(fieldNames);
    fetch('/templateselector',{
        method:'post',
        headers:{
            'Content-Type':'application/json; charset=UTF-8'
        },
        body:JSON.stringify({
           template:selector
        })
    }).then(response=>response.text())
      .then(html=>{
    	  const div = document.createElement('div');
    	  div.innerHTML = html;    	 
    	    const container = document.getElementById("display");
    	    container.innerHTML="";
    	    container.appendChild(div); 
    	    document.getElementById("myForm").style.display="block";
    	    document.getElementById("display").style.display="none";
    	    document.getElementById("download-btn").style.display="none";
      });
}
 }
 
 function namevalidation(){
	 const name = document.getElementById("name").value;
	 const namemsg = document.getElementById("namemsg");
	 
	 var regName = /^[a-zA-Z- ]+$/;
	 
	  if (name == "" || name == null) {
	      namemsg.textContent = "Username is required";
	      template.style.display="none";
			 document.getElementById("download-btn").style.display="none";
	      return false;
	    } else if (!name.match(regName)) {
	      namemsg.textContent = "Name must be alphabets";
	      template.style.display="none";
			 document.getElementById("download-btn").style.display="none";
	      return false;
	    } else {
	        //count++;
	      namemsg.textContent = "";
	    }
	  template.querySelector("#nameResult").innerHTML = name;
	  return true;
 }
 
 function designationvalidation(){
	 const designation = document.getElementById("designation").value;
	 const designationmsg = document.getElementById("designationmsg");
	 var regName = /^[a-zA-Z- ]+$/;
	 
	 if (designation == "") {
	      designationmsg.textContent = "Designation is required";
	      template.style.display="none";
			 document.getElementById("download-btn").style.display="none";
	      return false;
	    } else if (!designation.match(regName)) {
	      designationmsg.textContent = "Designation must be alphabets";
	      template.style.display="none";
			 document.getElementById("download-btn").style.display="none";
	      return false;
	    } else {
	     //   count++;
	      designationmsg.textContent = "";
	    }
	 template.querySelector("#designationResult").innerHTML = designation;
	 return true;
 }
 
 function emailvalidation(){
	 const email = document.getElementById("email").value;
	 const emailmsg = document.getElementById("emailmsg");
	 
	  if (email == "" || email == null) {
	      emailmsg.textContent = "Email is required";
	      template.style.display="none";
			 document.getElementById("download-btn").style.display="none";
	      return false;
	    } else if (
	      !email.match((/^([A-Za-z\-\.])+([A-Za-z0-9_]{0,4})+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/))
	    ) {
	      emailmsg.textContent = "Please provide a valid email";
	      template.style.display="none";
			 document.getElementById("download-btn").style.display="none";
	      return false;
	    } else {
	     // count++;
	      emailmsg.textContent = "";
	    }
	  template.querySelector("#emailResult").innerHTML = email;
	  const emaillink = template.querySelector("#emailLink");
	  emaillink.setAttribute("href", "mailto:" + email);
 }
 
 function MobileNovalidation(){
	 const mobile = document.getElementById("MobileNo").value;
	 const mobilemsg = document.getElementById("MobileNomsg");
	 
	    if (mobile == "") {
		      mobilemsg.textContent = "Mobile No is required";
		      template.style.display="none";
				 document.getElementById("download-btn").style.display="none";
		      return false;
		    } else if (mobile.length != 10) {
		      mobilemsg.textContent = "Your mobile number should be of 10 digits";
		      template.style.display="none";
				 document.getElementById("download-btn").style.display="none";
		      return false;
		    } else if (isNaN(mobile)) {
		      mobilemsg.textContent = "Mobile Number must be numeric";
		      template.style.display="none";
				 document.getElementById("download-btn").style.display="none";
		      return false;
		    } else if (
		      mobile.charAt(0) != 9 &&
		      mobile.charAt(0) != 8 &&
		      mobile.charAt(0) != 7 &&
		      mobile.charAt(0) != 6
		    ) {
		      mobilemsg.textContent = "Mobile Number should start from 9,8,7,6";
		      template.style.display="none";
				 document.getElementById("download-btn").style.display="none";
		      return false;
		    } else {
		    //   count++;
		      mobilemsg.textContent = "";

		    }
	    template.querySelector("#mobileResult").innerHTML = mobile;
	    const mobilelink = template.querySelector("#mobileLink");
	    mobilelink.setAttribute("href", "tel:" + mobile);
 }
 
 function Appointmentvalidation(){
	 const appointmentvalidation = document.getElementById("Appointment").value;
	 const appointmentmsg = document.getElementById("Appointmentmsg");
	 
	  if (appointmentvalidation == "" || appointmentvalidation == null) {
	      appointmentmsg.textContent = "URL is required";
	      template.style.display="none";
			 document.getElementById("download-btn").style.display="none";
	      return false;
	    } else {
	        //count++;
	      appointmentmsg.textContent = "";
	    }
	  const bookappointmentlink = template.querySelector("#bookappointmentlink");
	  bookappointmentlink.setAttribute("href", appointmentvalidation);
 }
 
 function Imagevalidation(){
	 const imagevalidation = document.getElementById("Image").value;
	 const imgurl = isImgUrl(imagevalidation);
	 const imagemsg = document.getElementById("Imagemsg");
	 
	    if (imagevalidation == "" || imagevalidation == null) {
		      imagemsg.textContent = "Image URL is required";
		      template.style.display="none";
				 document.getElementById("download-btn").style.display="none";
		      return false;
		    } else {
		     //    count++;
		      imagemsg.textContent = "";
		    }

		    if(imgurl){
		    //	count++;
		      imagemsg.textContent = "";
		    }else{
		      imagemsg.textContent = "The URL provided isn't an Image";
		      template.style.display="none";
				 document.getElementById("download-btn").style.display="none";
		      return false;
		    }
		    template.querySelector("#imagesetup").src = imagevalidation;
 }
 
 function isImgUrl(imagevalidation) {
	    const img = new Image();
	    img.src = imagevalidation;
	    return new Promise((resolve) => {
	        img.onerror = () => resolve(false);
	        img.onload = () => resolve(true);
	      })
	      .then(value => value)
	      .catch(value => value);    
	 }

 
 //Function working only once. When any field is empty then the display isn't going to invisible.Need to check fully.
 function preview(fieldNames){
	 const div = document.getElementById("myForm");
	const view = document.querySelectorAll('input');
	const isEveryFieldFilled = Array.from(view).every(input=>input.value.trim()!=='');
	 
	// console.log(isEveryFieldFilled);
	 
	 if(!isEveryFieldFilled){
		 template.style.display="none";
		 document.getElementById("download-btn").style.display="none";
	 }if(isEveryFieldFilled){
		 template.style.display="block";
		 document.getElementById("download-btn").style.display="block";
	 }
 }
 

	/*	  function sendInput(){
		  const name = document.getElementById("username").value;
		    const designation = document.getElementById("designation").value;
		    const email = document.getElementById("email").value;
		    const mobile = document.getElementById("mobile").value;
		    const image = document.getElementById("image_input").value;
		    const appointment = document.getElementById("appointment").value;
	        
		    Template.querySelector("#usernameResult").innerHTML = name;
		    Template.querySelector("#designationResult").innerHTML = designation;
		    Template.querySelector("#emailResult").innerHTML = email;
		    Template.querySelector("#mobileResult").innerHTML = mobile;

		    const mobilelink = Template.querySelector("#mobileLink");
		    const emaillink = Template.querySelector("#emailLink");
		    Template.querySelector("#image").src = image;
		    const bookappointmentlink = Template.querySelector(
		      "#bookappointmentlink"
		    );
		    mobilelink.setAttribute("href", "tel:" + mobile);
		    emaillink.setAttribute("href", "mailto:" + email);
		    bookappointmentlink.setAttribute("href", appointment);
	  
		  document.getElementById("display").style.display = "block";
		  document.getElementById("download-btn").style.display = "block";
	  }*/
	  
 function downloadTemplate() {
	    const name = document.getElementById("name").value;
	    const template = document.getElementById("Template");
	    const downloadBtn = document.getElementById("download-btn");
	    const downloadContent = template.innerHTML;
	    const fileName = `${name}.html`;
	    const file = new Blob([downloadContent], {
	      type: "text/html"
	    });
	    const url = URL.createObjectURL(file);
	    const a = document.createElement("a");
	    a.href = url;
	    a.download = fileName;
	    document.body.appendChild(a);
	    a.click();
	    a.remove();
	    URL.revokeObjectURL(url);
	  }
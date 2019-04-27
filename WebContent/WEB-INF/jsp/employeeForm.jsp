<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <script>  
function validateform(){  
var name=document.myform.name.value; 
var mobile=document.myform.mobile.value;
var dob=document.myform.dob.value;
var designation=document.myform.designation.value;
var AddressLine1=document.myform.AddressLine1.value;
var AddressLine2=document.myform.AddressLine2.value;
var city=document.myform.city.value;
var state=document.myform.state.value;
var pincode=document.myform.pincode.value;
var gender=document.myform.gender.value;
/* var skill=document.myform.skill.value; */
var description=document.myform.description.value;
var x=document.myform.email.value;  
var atposition=x.indexOf("@");  
var dotposition=x.lastIndexOf(".");  

if (name==null || name==""){  
  alert("Name can't be blank");  
  return false;  
}

if (dob==null || dob==""){  
	  alert("dob can't be blank");  
	  return false;  
	}
if (designation==null || designation==""){  
	  alert("designation can't be blank");  
	  return false;  
	}

if (AddressLine1==null || AddressLine1==""){  
	  alert("addressline1 can't be blank");  
	  return false;  
	}
	
if (AddressLine2==null || AddressLine2==""){  
	  alert("addressline2 can't be blank");  
	  return false;  
	}
	
if (city==null || city==""){  
	  alert("city can't be blank");  
	  return false;  
	}
	
if (state==null || state==""){  
	  alert("state can't be blank");  
	  return false;  
	}

if (pincode==null || pincode==""){  
	  alert("pincode can't be blank");  
	  return false;  
	}
if (gender==null || gender==""){  
	  alert("gender can't be blank");  
	  return false;  
	}
/* if (skill==null || skill==""){  
	  alert("skill can't be blank");  
	  return false;  
	}
 */

if (mobile==null || mobile==""){  
	  alert("mobile can't be blank");  
	  return false;  
	}
	
if (description==null || description==""){  
	  alert("description can't be blank");  
	  return false;  
	}
	
	if (atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length){  
	  alert("Please enter a valid e-mail address \n atpostion:"+atposition+"\n dotposition:"+dotposition);  
	  return false;  
	  }    
	
return true;
}  
</script> 
<script type="text/javascript">
    function Check() {
        var chkPassport = document.getElementById("chkPassport");
        if (chkPassport.checked) {
            alert("CheckBox checked.");
        } else {
            alert("CheckBox not checked.");
        }
    }
</script>
</head>
<body>
	<h1>Employee Form</h1>
	<form method="post" name="myform" action="save" onsubmit="return validateform()" >
		<table>
			<tr>
				<td>Employee Name:</td>
				<td><input name="name" value="" id="name" /></td>
			</tr>
			
			 <tr>
				<td>Employee Dob:</td>
				<td><input type="date" value="" name="dob" id="dob" /></td>
			</tr> 

              <tr>
			<td>Employee Joining Date</td>
			<td><input type="date" name="joiningDate" id="joiningDate" value=""></td>
			</tr>
			
			<tr>
			<td>Employee Relieving Date</td>
			<td><input type="date" name="relievingDate"  id="relievingDate" value=""></td>
			</tr>

			<tr>
				<td>Designation :</td>
				<td><select name="designation" id="designation">
						<option value="Java">Java</option>
						<option value="php">PHP</option>
						<option value="C">C</option>
				</select></td> 
			</tr>
			
			<tr>
				<td>AddressLine1</td>
				<td><input name="AddressLine1" value="" id="AddressLine1" /></td>
			</tr>
			
			<tr>
				<td>AddressLine2</td>
				<td><input name="AddressLine2" value="" /></td>
			</tr>
			<tr>
				<td>city</td>
				<td><input name="city" value=""/></td>
			</tr>
			<tr>
				<td>state</td>
				<td><input name="state" value="" /></td>
			</tr>
			<tr>
				<td>pincode</td>
				<td><input name="pincode" value="" /></td>
			</tr>
			<tr>
				<td><label>Gender</label></td>
				<td><input type="radio" name="gender" value="MALE" />Male</td>
				<td><input type="radio" name="gender" value="FEMALE" />Female</td>
			</tr>
			
			
			<tr>
				<td><label>Skill</label></td>

				<td><input type="checkbox" name="skill" value="c">C</td>
				<td><input type="checkbox" name="skill" value="C++">C++</td>
				<td><input type="checkbox" name="skill" value="c#">C#</td>
				<td><input type="checkbox" name="skill" value="java">Java</td>
				<td><input type="checkbox" name="skill" value="php">PHP</td>
			<tr>
			
			<tr>
				<td>Phone Number</td>
				<td><input type="text" name="mobile" value=""></td>
			</tr>
			
			<tr>
			<td>Email</td>
			<td><input type="text" name="email" value=""></td>
			</tr>
			
			<tr>
			<td>Password</td>
			<td><input type="password" name="password" value=""></td>
			</tr>
			
			<tr>
			<td>description</td>
			<td><textarea rows="5" cols="5" name="description" ></textarea></td>
			</tr>
			<tr>
			<td><input type="submit" value="save" /></td>
			</tr>
		</table>
		<!-- <table >    
         <tr>    
          <td>Name :<input type="text" name="name"> </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>Salary :<input type="text" name="salary"> </td>    
          <td><form:input path="salary" /></td>  
         </tr>   
         <tr>    
          <td>Designation : <input type="text" name="designation"> </td>    
          <td><form:input path="designation" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    -->

	</form>
</body>
</html>
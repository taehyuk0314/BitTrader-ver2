function People(name,age,gender,job){
	this.name = name;
	this.age = age;
	this.gender = gender;	
	this.job = job;
}

People.prototype.setName = name=>{this.name =name;};
People.prototype.setAge = age=>{this.age = age;};
People.prototype.setGender = gender=>{this.gender = gender;};
People.prototype.setJob = job=>{this.job = job;};
People.prototype.getName = ()=>{return this.name;};
People.prototype.getAge = ()=>{return this.age;};
People.prototype.getGender = ()=>{return this.gender;};
People.prototype.getJob = ()=>{return this.job;};




function Customer(name,age,gender,job,grade,custNo){
	People.apply(this,arguments);
	this.grade =grade;
	this.custNo =custNo;
}
Customer.prototype = new People();
Customer.prototype .setName = name=>{
//	this.name = '[닉네임]'+name 이건 자바 문법
	Object.getPrototypeOf(Customer.prototype).setName('[닉네임]'+name);
	};
Customer.prototype.setGrade = grade=>{this.grade =grade;};
Customer.prototype.setCustNo = custNo=>{this.custNo = custNo;};
Customer.prototype.getGrade = ()=>{return this.grade;};
Customer.prototype.getCustNo = ()=>{return this.custNo;};
var cust = (()=>{
	let main =()=>{
		let cus = new Customer();
		cus.setName('홍길동');
		cus.setAge('25세');
		cus.setGender('남');
		cus.setJob('개발자');
		cus.setGrade('3급');
		cus.setCustNo('123');
		alert('고객정보 :'+cus.getName()+','+cus.getAge()+','+cus.getGender()+','+cus.getJob()+','+cus.getGrade()+','+cus.getCustNo());
	}
	return {main : main};
})();


function Product(name,price){
	this.name =name;
	this.price = price;
}

function Food(name, price){
	Product.call(this,name,price);
	this.category = 'food';
}


var test=(()=>{
	let main =()=>{
		let food = new Food('cheese',5);
		alert(food.name);
		alert(food.price);		
	}
	return {main : main};
})();




var person =(()=>{
//	var _= this;
	let _name,_age ,_gender,_job;
	return{
		setName : (name)=>{this._name = name;},
		setAge : (age)=>{this._age = age;},
		setGender : (gender)=>{this._gender = gender;},
		setJob : (job)=>{this._job = job;},
		getName : ()=>{return this._name;},
		getAge : ()=>{return this._age;},
		getGender : ()=>{return this._gender;},
		getJob : ()=>{return this._job;},
		toString : ()=>{
			return this._name +','+this._age+','+this._gender+','+this._job;
		}
	}
})();


//var inherit =(()=>{
//	return{
//	main: ()=>{
//		let emp1 = new Employee();
//		emp1.setSalary("100");
//		emp1.setPosition("대리");
//		alert("직급,급여: "+emp1.getSalary()+','+emp1.getPosition());
//		
//		let cust1 = new Customer();
//		cust1.setCustNo('1234');
//		cust1.setGrade('실버등급');
//		alert("고객 번호, 등급 : "+cust1.getCustNo()+' , '+cust1.getGrade());
//		}
//	};
//})();
//
//function Employee(){
//	let _salary, _position;
//	return {
//		setSalary : (salary)=>{this._salary = salary;},
//		setPosition : (position)=>{this._position = position;},
//		getSalary : ()=>{return this._salary;},
//		getPosition : ()=>{return this._position;}
//	}
//}


//function Customer(){
//	let _custNo, _grade;
//	return {
//		setCustNo :(custNo)=>{this._custNo =custNo;},
//		setGrade :(grade)=>{this._grade =grade;},
//		getCustNo :()=>{return this._custNo;},
//		getGrade :()=>{return this._grade;}
//	}
//}


//var encap=(()=>{
//	var main =()=>{
//		person.setName('도날드 트럼프');
//		person.setAge('75');
//		person.setGender('남');
//		person.setJob('미국대통령');
//		alert('스펙: '+person.toString());
//	}
//	return {main : main};
//})();
//


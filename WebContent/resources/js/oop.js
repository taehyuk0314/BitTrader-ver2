var inherit =(()=>{
	return{
	main: ()=>{
		let emp1 = new Employee();
		emp1.setSalary("100");
		emp1.setPosition("대리");
		alert("직급,급여: "+emp1.getSalary()+','+emp1.getPosition());
		
		let cust1 = new Customer();
		cust1.setCustNo('1234');
		cust1.setGrade('실버등급');
		alert("고객 번호, 등급 : "+cust1.getCustNo()+' , '+cust1.getGrade());
		}
	};
})();

function Employee(){
	let _salary, _position;
	return {
		setSalary : (salary)=>{this._salary = salary;},
		setPosition : (position)=>{this._position = position;},
		getSalary : ()=>{return this._salary;},
		getPosition : ()=>{return this._position;}
	};
};



function Customer(){
	let _custNo, _grade;
	return {
		setCustNo :(custNo)=>{this._custNo =custNo;},
		setGrade :(grade)=>{this._grade =grade;},
		getCustNo :()=>{return this._custNo;},
		getGrade :()=>{return this._grade;}
	};
};


var encap=(()=>{
	var main =()=>{
		person.setName('도날드 트럼프');
		person.setAge('75');
		person.setGender('남');
		person.setJob('미국대통령');
		alert('스펙: '+person.toString());
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

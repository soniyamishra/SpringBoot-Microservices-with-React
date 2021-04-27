import axios from 'axios'; 

const EMPLOYEE_API_BASE_URL = "http://localhost:8080/employee"; 

class EmployeeService { 
    getEmployees(){ 
        return axios.get("http://localhost:8080/employee/findAll"); 
    } 

    createEmployee(employee){ 
        return axios.post("http://localhost:8080/addEmployee", employee); 
    } 

    getEmployeeById(employeeId){ 
       // console.log("url"+ EMPLOYEE_API_BASE_URL + '/' + employeeId); 
        return axios.get('http://localhost:8080/employee/find/' + employeeId); 
    } 

    updateEmployee(employee, employeeId){ 
        return axios.put('http://localhost:8080/updateEmployee/' + employeeId, employee); 
    } 

    deleteEmployee(employeeId){ 
        return axios.delete('http://localhost:8080/employee/delete/' + employeeId); 
    } 
} 

export default new EmployeeService() 
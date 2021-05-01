import axios from 'axios'; 

const EMPLOYEE_API_BASE_URL = "http://localhost:8080/employee"; 

class EmployeeService { 
    getEmployees(){ 
        return axios.get("http://localhost:8084/employeeUI/employee/findAll"); 
    } 

    createEmployee(employee){ 
        return axios.post("http://localhost:8084/employeeUI/addEmployee", employee); 
    } 

    getEmployeeById(employeeId){ 
       // console.log("url"+ EMPLOYEE_API_BASE_URL + '/' + employeeId); 
        return axios.get('http://localhost:8084/employeeUI/' + employeeId); 
    } 

    updateEmployee(employee, employeeId){ 
        return axios.put('http://localhost:8084/employeeUI/updateEmployee', employee); 
    } 

    deleteEmployee(employeeId){ 
        return axios.delete('http://localhost:8084/employeeUI/employee/delete/' + employeeId); 
    } 
} 

export default new EmployeeService() 
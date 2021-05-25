import axios from 'axios'; 

class EmployeeService { 
    getEmployees(){ 
        return axios.get("http://localhost:8080/employee/findAll"); 
    } 

    createEmployee(employee){ 
        return axios.post("http://localhost:8080/addEmployee", employee); 
    } 

    getEmployeeById(employeeId){ 
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
import React from 'react'; 
import './App.css';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom' 
import ListEmployeeComponent from './components/ListEmployeesComponent'; 
import HeaderComponent from './components/HeaderComponent'; 
import FooterComponent from './components/FooterComponent'; 
import CreateEmployeeComponent from './components/CreateEmployeeComponent'; 
import ViewEmployeeComponent from './components/ViewEmployeeComponent'; 

function App() { 
  return ( 
    <div> 
        <Router> 
          <HeaderComponent /> 
            <div className="container"> 
              <Switch>  
                <Route path = "/" exact component = {ListEmployeeComponent}></Route> 
                <Route path = "/employees" component = {ListEmployeeComponent}></Route> 
                <Route path = "/add-employee/:id" component = {CreateEmployeeComponent}></Route> 
                <Route path = "/employee/find/:id" component = {ViewEmployeeComponent}></Route> 
                        {/* <Route path = "/update-employee/:id" component = {UpdateEmployeeComponent}></Route> */} 
              </Switch> 

              </div> 
              <div className="footer fixed-bottom text-center"> 
                    <FooterComponent /> 
              </div> 
      </Router> 
  </div> 
  ); 
} 
export default App; 

 
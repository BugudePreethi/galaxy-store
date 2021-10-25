import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient} from '@angular/common/http';
import { Customer } from '../model/customer';


@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  signupUrl: string = "http://localhost:8080/customers";
  loginUrl : string = "http://localhost:8080/authenticate";//postman url

  constructor(private httpClient : HttpClient) { }

  signup(customer: Customer): Observable<any> {
    const headers = { 'content-type': 'application/json'};
    console.log("Signup Service");
    return this.httpClient.post<any>(
      this.signupUrl , customer, {'headers':headers}
      );
  }

  login(customer : Customer) : Observable<any> { 
    const headers = {'content-type':'application/json'};
    return this.httpClient.post<any>(
      this.loginUrl,customer,{'headers':headers}
    );
    

  }
  customer: Customer = {  
    id: 0,
    name: '',
    email: '',
    password: '',
    address: '',
    mobileNumber: ''
  }
}


import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from '../model/customer';
import { HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  signupUrl: string = "http://localhost:8080/customers";

  constructor(private httpClient: HttpClient) { }

  signup(customer: Customer): Observable<any> {
    const headers = { 'content-type': 'application/json'};
    console.log("Signup Service");
    return this.httpClient.post<any>(
      this.signupUrl , customer, {'headers':headers}
      );
    
  }

}
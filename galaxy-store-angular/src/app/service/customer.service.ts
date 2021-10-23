import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from '../model/customer';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  signupUrl: string = "http://localhost:8080/customers";

  constructor(private httpClient: HttpClient) { }

  signup(customer: Customer): Observable<any> {
    console.log("Signup Service");
    let header : HttpHeaders = new HttpHeaders();
    header = header.set('Content-Type', 'application/json');
    return this.httpClient.post<any>(
      this.signupUrl, JSON.stringify(customer), {headers: header});
  }

}
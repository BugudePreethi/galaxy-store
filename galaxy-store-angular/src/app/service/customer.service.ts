import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient} from '@angular/common/http';
import { Customer } from '../model/customer';


@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  loginUrl : string = "http://localhost:8080/authenticate";//postman url

  constructor(private httpClient : HttpClient) { }

  login(customer : Customer) : Observable<any> { 
    const headers = {'content-type':'application/json'};
    return this.httpClient.post<any>(
      this.loginUrl,customer,{'headers':headers}
    );
    

  }


}

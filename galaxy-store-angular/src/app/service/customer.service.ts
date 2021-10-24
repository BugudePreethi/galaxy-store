import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient} from '@angular/common/http';
import { Customer } from '../model/customer';


@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  usersUrl : string = "";//postman url

  constructor(private httpClient : HttpClient) { }

  login() : void {
    const headers = { 'content-type': 'application/json'};
    console.log("service start");
    // return this.httpClient.get<any>(
      // this.usersUrl, customer, {'headers' : headers}
    // );

  }


}

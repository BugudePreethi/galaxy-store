import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from '../model/customer';
import { CustomerService } from '../service/customer.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  customer : Customer = {
    id : 0,
    name : "",
    email : "",
    password : "",
    address : "",
    mobileNumber : ""
  }

  success : boolean = false;

  constructor(private customerService:CustomerService) { }

  ngOnInit(): void {
  }

  login(): void {

    //console.log("login starts");
    let observable : Observable<any> = this.customerService.login(this.customer);
    observable.subscribe( 
      response => {
        console.log("in login response");
        this.success = true;

      }
    ) 
  }

}

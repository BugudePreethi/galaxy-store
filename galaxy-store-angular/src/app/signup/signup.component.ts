import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from '../model/customer';
import { CustomerService } from '../service/customer.service';
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  customer : Customer ={
    id: 0,
    name: "",
    email: "",
    password: "",
    address: "",
    mobileNumber: ""
  }

  success: boolean = false;
  constructor(private customerService: CustomerService) { }

  ngOnInit(): void {
  }

  signup(): void {
    console.log(this.customer);
    let observable : Observable<any> = this.customerService.signup(this.customer);
    observable.subscribe(
      response => {
        this.success = true;
      },
      error => {
        //this.error = error;
      }
    );

  }

}

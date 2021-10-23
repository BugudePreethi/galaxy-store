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
    name: "Smith",
    email: "smith@gmail.com",
    password: "1234",
    address: "D4,LA",
    mobileNumber: "8765432190"
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

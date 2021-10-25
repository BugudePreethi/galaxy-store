import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private httpClient: HttpClient) { }
  
  getProduct(): Observable<any> {
    let observable: Observable<any> = this.httpClient.get<any>("http://localhost:8080/products");
    return observable;
  }

  
}

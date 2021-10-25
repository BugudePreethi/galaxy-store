import { Component, OnInit } from '@angular/core';
import { products } from '../data';
import { Product } from '../model/product';
import { ProductService } from '../service/product.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  // products: Product[] = products;
  // searchKey: string = "";

  // findProduct(){
  //   console.log("Search: "+ this.searchKey);
  // }
  public productList: any;
  constructor(private service: ProductService) { }

  ngOnInit(): void {
    this.service.getProduct().subscribe(response=>{
      this.productList = response;
    })
  }

}

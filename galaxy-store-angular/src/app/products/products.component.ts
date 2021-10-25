import { Component, OnInit } from '@angular/core';
import { products } from '../data';
import { Product } from '../model/product';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  products: Product[] = products;
  searchKey: string = "";

  findProduct(){
    console.log("Search: "+ this.searchKey);
  }
  constructor() { }

  ngOnInit(): void {
  }

}

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

  public productList: any;
  constructor(private service: ProductService) { }

  ngOnInit(): void {
    this.service.getProduct().subscribe(response=>{
      this.productList = response;
    })
  }
}


//   findProduct() {
//     //console.log("Search: "+this.searchKey);
//     if(this.searchKey == "") {
//       this.product = this.product;
//       return;
//     }
//     this.product = [];
//     for(let i=0;i<this.product.length; i++) {
//       let name = this.product[i].name.toUpperCase();
//       let searchKeyUpper = this.searchKey.toUpperCase();
//       if(name.includes(searchKeyUpper)) {
//         this.product.push(this.product[i]);
//       }
//     }
  
//   }

// }

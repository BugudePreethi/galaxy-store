import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< HEAD
=======
import { SignupComponent } from './signup/signup.component';
import { NavigationComponent } from './navigation/navigation.component';
import { HomeComponent } from './home/home.component';
import { ProductsComponent } from './products/products.component';
import { CartComponent } from './cart/cart.component';
>>>>>>> signup
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
<<<<<<< HEAD
=======
    SignupComponent,
    NavigationComponent,
    HomeComponent,
    ProductsComponent,
    CartComponent,
>>>>>>> signup
    LoginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

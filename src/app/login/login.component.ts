import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { RegisterLogin } from '../RegisterandLogin';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  login: RegisterLogin = new RegisterLogin();

  constructor(private _loginService: LoginService, private _route: Router){}

  check: any;

  loginForm(log: NgForm){
    this._loginService.signin(this.login).subscribe({
      next: (data: any) => {
        this.check = data.status;
        if(this.check == true){
          this.check="Successfull";
          console.log(data);
        }else{
          this.check = "UnSuccessfull"
        }
        console.log(data);
        //this._route.navigate(["/status"]);
      },
      error: (error: any) => {
        console.log("Error in authentication: "+  error)
      }
    });

  }

}

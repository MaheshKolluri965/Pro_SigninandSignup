import { Component } from '@angular/core';
import { RegisterLogin } from '../RegisterandLogin';
import { RegistrationService } from '../registration.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent {

  registration: RegisterLogin = new RegisterLogin();

  constructor(private _registerService: RegistrationService){}

  signup:any

  register(reg: NgForm){
    this._registerService.registerUser(this.registration).subscribe({
      next: (data: any) => {
        this.signup = "Sign Up Successfull";
        console.log(data);
      },
      error: (error: any) => {
        console.error("Error in Registration: ", error);
      }
    });
  }

}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { RegisterLogin } from './RegisterandLogin';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  httpBaseUrl:string="http://localhost:9098/rest/api";

  constructor(private _registerhttp: HttpClient) { }

  registerUser(register: RegisterLogin){
    return this._registerhttp.post(this.httpBaseUrl+"/register", register, { responseType: 'text' });
  }
}

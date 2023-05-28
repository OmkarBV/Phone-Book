import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class UserService {
  baseUrl = 'http://localhost:8080/auth';
  constructor(private http: HttpClient) {}

  userLogin(user: any) {
    return this.http.post(this.baseUrl + '/login', user);
  }

  registerUser(user: any) {
    return this.http.post(this.baseUrl + '/register', user);
  }
}

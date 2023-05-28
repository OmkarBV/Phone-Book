import { Component, OnInit } from '@angular/core';
import { UserService } from '../utility/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
})
export class RegisterComponent implements OnInit {
  pass = '';
  cpass = '';
  
  user = {
    email: '',
    password: '',
    number: '',
    name: '',
  };
  responce = {
    success: null,
    message: '',
  };
  constructor(private service: UserService, private router: Router) {}

  ngOnInit(): void {}
  registerUser(name: any, email: any, number: any, password: any) {
    this.user = {
      name: name,
      email: email,
      number: number,
      password: password,
    };
    this.service.registerUser(this.user).subscribe(
      (responce: any) => {
        this.responce = responce;
        if (this.responce.success === true) {
          this.router.navigate(['/']);
          alert(this.responce.message);
        }
      },
      (error) => {
        console.log(error);
        alert(this.responce.message);
      }
    );
  }
}

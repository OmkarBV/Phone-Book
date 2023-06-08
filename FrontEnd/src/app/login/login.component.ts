import { Component, OnInit } from '@angular/core';
import { UserService } from '../utility/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  user = {
    email: '',
    password: '',
  };
  responce = {
    success: null,
    message: '',
  };
  constructor(private service: UserService, private router: Router) {}

  ngOnInit(): void {}
  userLogin(email: any, pass: any) {
    this.user = {
      email: email,
      password: pass,
    };

    this.service.userLogin(this.user).subscribe(
      (responce: any) => {
        this.responce = responce;
        console.log(this.responce);
        if (this.responce.success === true) {
          this.router.navigate(['/home', this.user.email]);
        }
      },
      (error) => {
        console.log(error);
      }
    );
  }
}

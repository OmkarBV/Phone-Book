import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HomeService } from '../utility/home.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  email = '';
  user = {
    name: '',
    email: '',
    number: '',
    contact: [
      {
        name: '',
        number: '',
        email: '',
      },
    ],
  };
  constructor(private aroute: ActivatedRoute, private service: HomeService) {}

  ngOnInit(): void {
    this.getUser();
    this.getAllContact();
  }
  getUser() {
    this.aroute.paramMap.subscribe((param: any) => {
      this.email = param.get('email');
    });
  }

  getAllContact() {
    this.service.getAllConatact(this.email).subscribe(
      (responce: any) => {
        this.user = responce;
        console.log(this.user);
      },
      (error) => {
        console.log(error);
      }
    );
  }

  searchByName(name: any) {
    this.service.searchByName(this.email, name).subscribe(
      (responce: any) => {
        this.user = responce;
      },
      (error) => {
        console.log(error);
      }
    );
  }

  searchByNumber(number: any) {
    this.service.searchByNumber(this.email, number).subscribe(
      (responce: any) => {
        this.user = responce;
      },
      (error) => {
        console.log(error);
      }
    );
  }
}
